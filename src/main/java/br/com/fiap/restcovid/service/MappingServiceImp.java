package br.com.fiap.restcovid.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.restcovid.entity.Mapping;
import br.com.fiap.restcovid.repository.MappingRepository;

@Service
public class MappingServiceImp implements MappingService {

    @Autowired
    MappingRepository mappingRepository;

    @Override
    public Mapping saveMapping(Mapping mapping) {
        return mappingRepository.save(mapping);
    }

    @Override
    public Iterable<Mapping> findAll() {
        return mappingRepository.findAll();
    }

    @Override
    public Optional<Mapping> findById(Long id) {
        Optional<Mapping> result = mappingRepository.findById(id);
        return result;
    }

    @Override
    public String deleteMapping(Long id) {
        Optional<Mapping> result = mappingRepository.findById(id);
        String response = "";
        if (result.isPresent()) {
            mappingRepository.delete(result.get());
            response = "The Mapping was deleted.";
        } else {
            response = "The Mapping not found.";
        }
        return response;
    }
    
}
