package apiRestComRailway.controller;

import apiRestComRailway.domain.model.User;
import apiRestComRailway.servise.User_Servise;
import org.hibernate.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {
    private final User_Servise service;
    public UserController(User_Servise service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        var user = service.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        var userToCreate = service.create(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userToCreate.getId())
                .toUri();
        return ResponseEntity.created(location).body(userToCreate);
    }
}
