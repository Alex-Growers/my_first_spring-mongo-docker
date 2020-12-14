package com.example.firstdockerproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gremlins/")
public class SimpleController {

    GremlinsRepository gremlinsRepository;

    @Autowired
    public SimpleController(GremlinsRepository gremlinsRepository) {
        this.gremlinsRepository = gremlinsRepository;
    }

    @GetMapping("new")
    ResponseEntity<GremlinEntity> getNewGremlin() {

        GremlinEntity gremlin = new GremlinEntity();
        System.out.println("Gremlin created.");
        gremlinsRepository.save(gremlin);
        return ResponseEntity.ok().body(gremlin);
    }

    @GetMapping("all")
    ResponseEntity<List<GremlinEntity>> getAllGremlins() {
        System.out.println("Get all gremlins.");
        return ResponseEntity.ok().body(gremlinsRepository.findAll());
    }

}


