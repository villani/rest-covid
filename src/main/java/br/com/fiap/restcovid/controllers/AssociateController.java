package br.com.fiap.restcovid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.restcovid.entity.Associate;
import br.com.fiap.restcovid.service.AssociateService;

@RestController
@RequestMapping("associates")
public class AssociateController {

    @Autowired
    AssociateService associateService;

    @GetMapping
    public @ResponseBody ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(associateService.findAll());
    }

    @GetMapping("{id}")
    public @ResponseBody ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(associateService.findById(id));
    }

    @PostMapping
    public @ResponseBody ResponseEntity<?> create(@RequestBody Associate associate) {
        return ResponseEntity.ok().body(associateService.saveAssociate(associate));
    }

    @PutMapping
    public @ResponseBody ResponseEntity<?> update(@RequestBody Associate associate) {
        return ResponseEntity.ok().body(associateService.saveAssociate(associate));
    }

    @DeleteMapping("{id}")
    public @ResponseBody ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.ok().body(associateService.deleteAssociate(id));
    }
    
}
