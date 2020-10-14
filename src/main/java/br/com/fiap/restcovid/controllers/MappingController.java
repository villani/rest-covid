package br.com.fiap.restcovid.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mappings")
public class MappingController {

    @GetMapping
    public String listAll() {
        return "Show the list of mappings";
    }

    @GetMapping("{id}")
    public String listById(@PathVariable Long id) {
        return "Show the associete with id " + id;
    }

    @PostMapping
    public String create() {
        return "mapping included";
    }

    @PutMapping("{id}")
    public String update(@PathVariable Long id) {
        return "The mapping with id " + id + " was updated";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable Long id) {
        return "The mapping with id " + id + " was removed";
    }
    
}
