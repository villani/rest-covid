package br.com.fiap.restcovid.controllers;

import br.com.fiap.restcovid.dto.CreateMeasureDTO;
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

import br.com.fiap.restcovid.entity.Measure;
import br.com.fiap.restcovid.service.MeasureService;

@RestController
@RequestMapping("measures")
public class MeasureController {

    @Autowired
    MeasureService measureService;

    @GetMapping
    public @ResponseBody ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(measureService.findAll());
    }

    @GetMapping("{id}")
    public @ResponseBody ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(measureService.findById(id));
    }

    @PostMapping
    public @ResponseBody ResponseEntity<?> create(@RequestBody CreateMeasureDTO createMeasureDTO) {
        return ResponseEntity.ok().body(measureService.saveMeasure(createMeasureDTO));
    }

    @PutMapping("{id}")
    public @ResponseBody ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody CreateMeasureDTO createMeasureDTO) {
        return ResponseEntity.ok().body(measureService.updateMeasure(id,createMeasureDTO));
    }

    @DeleteMapping("{id}")
    public @ResponseBody ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.ok().body(measureService.deleteMeasure(id));
    }
    
}
