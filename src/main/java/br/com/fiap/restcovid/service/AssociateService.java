package br.com.fiap.restcovid.service;

import java.util.List;
import java.util.Optional;

import br.com.fiap.restcovid.entity.Associate;

public interface AssociateService {

    Associate saveAssociate(Associate associate);
    Associate updateAssociate(Associate associate);
    Iterable<Associate> findAll();
    Optional<Associate> findById(Long id);
    String deleteAssociate(Long id);
    List<Associate> findByName(String name);
    
}
