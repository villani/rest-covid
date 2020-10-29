package br.com.fiap.restcovid.service;

import java.util.List;
import java.util.Optional;

import br.com.fiap.restcovid.dto.CreateMappingDTO;
import br.com.fiap.restcovid.entity.Mapping;

public interface MappingService {

    Mapping saveMapping(CreateMappingDTO createMappingDTO);
    Mapping updateMapping(Long id ,CreateMappingDTO createMappingDTO);
    Iterable<Mapping> findAll();
    Optional<Mapping> findById(Long id);
    String deleteMapping(Long id);
    List<Mapping> findMappingByAssociate(Long id);
    
}
