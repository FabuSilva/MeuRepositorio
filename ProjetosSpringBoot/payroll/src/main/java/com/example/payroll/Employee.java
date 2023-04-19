package com.example.payroll;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee extends RepresentationModel<Employee> implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String role;
	
	public Employee() {
		
	}
	
	public Employee(String nome, String role) {
		this.nome = nome;
		this.role = role;
	}
	
	
	public Long getId() {
		return id;
	}
	

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(role, other.role);
	}

	@Override
	public String toString() {
		return "Id: " + id + ", Nome: " + nome + ", Role: " + role;
	}
}
