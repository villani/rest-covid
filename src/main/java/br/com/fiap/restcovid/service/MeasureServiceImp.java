package br.com.fiap.restcovid.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.restcovid.entity.Measure;
import br.com.fiap.restcovid.repository.MeasureRepository;

@Service
public class MeasureServiceImp implements MeasureService {

    @Autowired
    MeasureRepository measureRepository;

    @Override
    public Measure saveMeasure(Measure measure) {
        return measureRepository.save(measure);
    }

    @Override
    public Iterable<Measure> findAll() {
        return measureRepository.findAll();
    }

    @Override
    public Optional<Measure> findById(Long id) {
        Optional<Measure> result = measureRepository.findById(id);
        return result;
    }

    @Override
    public String deleteMeasure(Long id) {
        Optional<Measure> result = measureRepository.findById(id);
        String response = "";
        if (result.isPresent()) {
            measureRepository.delete(result.get());
            response = "The measure was deleted.";
        } else {
            response = "The measure not found.";
        }
        return response;
    }
    
}
