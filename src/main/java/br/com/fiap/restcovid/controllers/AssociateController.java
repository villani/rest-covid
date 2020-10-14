package br.com.fiap.restcovid.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("associates")
public class AssociateController {

    @GetMapping
    public String listAll() {
        return "Show the list of associates";
    }

    @GetMapping("{id}")
    public String listById(@PathVariable Long id) {
        return "Show the associete with id " + id;
    }

    @PostMapping
    public String create() {
        return "Associate included";
    }

    @PutMapping("{id}")
    public String update(@PathVariable Long id) {
        return "The associate with id " + id + " was updated";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable Long id) {
        return "The associate with id " + id + " was removed";
    }
    
}
