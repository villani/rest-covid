package br.com.fiap.restcovid.service;

import java.util.Optional;

import br.com.fiap.restcovid.entity.Mapping;

public interface MappingService {

    Mapping saveMapping(Mapping mapping);
    Iterable<Mapping> findAll();
    Optional<Mapping> findById(Long id);
    String deleteMapping(Long id);
    
}
