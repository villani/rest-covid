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

import br.com.fiap.restcovid.entity.Mapping;
import br.com.fiap.restcovid.service.MappingService;

@RestController
@RequestMapping("mappings")
public class MappingController {

    @Autowired
    MappingService mappingService;

    @GetMapping
    public @ResponseBody ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(mappingService.findAll());
    }

    @GetMapping("{id}")
    public @ResponseBody ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(mappingService.findById(id));
    }

    @PostMapping
    public @ResponseBody ResponseEntity<?> create(@RequestBody Mapping Mapping) {
        return ResponseEntity.ok().body(mappingService.saveMapping(Mapping));
    }

    @PutMapping
    public @ResponseBody ResponseEntity<?> update(@RequestBody Mapping Mapping) {
        return ResponseEntity.ok().body(mappingService.saveMapping(Mapping));
    }

    @DeleteMapping("{id}")
    public @ResponseBody ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.ok().body(mappingService.deleteMapping(id));
    }
    
}
