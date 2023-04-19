package com.example.payroll;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.List;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	private final EmployeeRepository repository;
	
	public Controller(EmployeeRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/employees")
	public List<Employee>all(){
		return repository.findAll();
	}
	
	@PostMapping("/employees")
	public Employee newEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}
	
	@GetMapping("/employees/{id}")
	public EntityModel<Employee> findId(@PathVariable Long id) {
		
		Employee employee = repository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException(id));
		
		return EntityModel.of(employee, 
				linkTo(methodOn(Controller.class).findId(id)).withSelfRel(),
				linkTo(methodOn(Controller.class).all()).withRel("employees"));
		
		
	}
	
	@PostMapping("/employees/{id}")
	public Employee update(@RequestBody Employee newEmployee, @PathVariable Long id) {
		return repository.findById(id).map(employee -> {
	        employee.setNome(newEmployee.getNome());
	        employee.setRole(newEmployee.getRole());
	        return repository.save(employee);
	      }).orElseGet(() -> {
	          newEmployee.setId(id);
	          return repository.save(newEmployee);
	        });
	}
	
	@DeleteMapping("/employees/{id}")
	void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	 

}
