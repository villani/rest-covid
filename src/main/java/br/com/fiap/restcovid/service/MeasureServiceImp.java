package br.com.fiap.restcovid.service;

import java.util.List;
import java.util.Optional;

import br.com.fiap.restcovid.dto.CreateMeasureDTO;
import br.com.fiap.restcovid.entity.Associate;
import br.com.fiap.restcovid.repository.AssociateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.fiap.restcovid.entity.Measure;
import br.com.fiap.restcovid.repository.MeasureRepository;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MeasureServiceImp implements MeasureService {

    @Autowired
    MeasureRepository measureRepository;

    @Autowired
    AssociateRepository associateRepository;

    @Override
    public Measure saveMeasure(CreateMeasureDTO createMeasureDTO) {

        Associate associate = associateRepository.findById(createMeasureDTO.getIdAssociate())
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));

        Measure measure = new Measure();
        measure.setAssociate(associate);
        measure.setDate(createMeasureDTO.getDate());
        measure.setMeasure(createMeasureDTO.getMeasure());
        measure.setResponsible(createMeasureDTO.getResponsible());
        measure.setResultObservation(createMeasureDTO.getResultObservation());

        return measureRepository.save(measure);
    }

    @Override
    public Measure updateMeasure(Long id,CreateMeasureDTO createMeasureDTO) {

        Associate associate = associateRepository.findById(createMeasureDTO.getIdAssociate())
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));

        Measure measure = measureRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
        measure.setAssociate(associate);
        measure.setDate(createMeasureDTO.getDate());
        measure.setMeasure(createMeasureDTO.getMeasure());
        measure.setResponsible(createMeasureDTO.getResponsible());
        measure.setResultObservation(createMeasureDTO.getResultObservation());
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

    @Override
    public List<Measure> findMeasuresByAssociate(Long id) {
        return measureRepository.findByAssociateId(id);
    }

}
