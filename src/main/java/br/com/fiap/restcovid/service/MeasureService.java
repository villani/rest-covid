package br.com.fiap.restcovid.service;

import java.util.List;
import java.util.Optional;

import br.com.fiap.restcovid.dto.CreateMeasureDTO;
import br.com.fiap.restcovid.entity.Measure;

public interface MeasureService {

    Measure saveMeasure(CreateMeasureDTO createMeasureDTO);
    Measure updateMeasure(Long id,CreateMeasureDTO createMeasureDTO);
    Iterable<Measure> findAll();
    Optional<Measure> findById(Long id);
    String deleteMeasure(Long id);
    List<Measure> findMeasuresByAssociate(Long id);
    
}
