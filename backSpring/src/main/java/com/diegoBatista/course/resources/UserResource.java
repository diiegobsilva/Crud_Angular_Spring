package com.diegoBatista.course.resources;

import com.diegoBatista.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> FindAll(){
        User u = new User(1L, "Maria", "maria@gmail.com", "99889898", "3232323");
        return ResponseEntity.ok().body(u);
    }

}
