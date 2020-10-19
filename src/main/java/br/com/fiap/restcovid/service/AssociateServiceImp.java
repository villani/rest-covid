package br.com.fiap.restcovid.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.restcovid.entity.Associate;
import br.com.fiap.restcovid.repository.AssociateRepository;

@Service
public class AssociateServiceImp implements AssociateService {

    @Autowired
    AssociateRepository associateRepository;

    @Override
    public Associate saveAssociate(Associate associate) {
        return associateRepository.save(associate);
    }

    @Override
    public Iterable<Associate> findAll() {
        return associateRepository.findAll();
    }

    @Override
    public Optional<Associate> findById(Long id) {
        Optional<Associate> result = associateRepository.findById(id);
        return result;
    }

    @Override
    public String deleteAssociate(Long id) {
        Optional<Associate> result = associateRepository.findById(id);
        String response = "";
        if (result.isPresent()) {
            associateRepository.delete(result.get());
            response = "The associate was deleted.";
        } else {
            response = "The associate not found.";
        }
        return response;
    }
    
}
