package br.com.fiap.restcovid.service;

import java.util.Optional;

import br.com.fiap.restcovid.entity.Measure;

public interface MeasureService {

    Measure saveMeasure(Measure measure);
    Iterable<Measure> findAll();
    Optional<Measure> findById(Long id);
    String deleteMeasure(Long id);
    
}
