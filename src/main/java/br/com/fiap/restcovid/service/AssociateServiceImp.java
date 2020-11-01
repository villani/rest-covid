package br.com.fiap.restcovid.service;

import java.util.List;
import java.util.Optional;

import br.com.fiap.restcovid.entity.Mapping;
import br.com.fiap.restcovid.entity.Measure;
import br.com.fiap.restcovid.repository.MappingRepository;
import br.com.fiap.restcovid.repository.MeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.fiap.restcovid.entity.Associate;
import br.com.fiap.restcovid.repository.AssociateRepository;
import org.springframework.web.server.ResponseStatusException;

import javax.swing.text.html.Option;

@Service
public class AssociateServiceImp implements AssociateService {

    @Autowired
    AssociateRepository associateRepository;

    @Autowired
    MeasureRepository measureRepository;

    @Autowired
    MappingRepository mappingRepository;

    @Override
    public Associate saveAssociate(Associate associate) {
        return associateRepository.save(associate);
    }

    @Override
    public Associate updateAssociate(Associate associate) {

        Associate associateDB = associateRepository
                .findById(associate.getId())
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));

        associateDB.setAddress(associate.getAddress());
        associateDB.setArea(associate.getArea());
        associateDB.setBirthday(associate.getBirthday());
        associateDB.setCity(associate.getCity());
        associateDB.setCompany(associate.getCompany());
        associateDB.setGender(associate.getGender());
        associateDB.setIdManager(associate.getIdManager());
        associateDB.setLocality(associate.getLocality());
        associateDB.setMaritalStatus(associate.getMaritalStatus());
        associateDB.setName(associate.getName());
        associateDB.setOccupation(associate.getOccupation());
        associateDB.setPatientRecord(associate.getPatientRecord());
        associateDB.setPhone(associate.getPhone());
        associateDB.setRemoteWork(associate.getRemoteWork());
        associateDB.setStore(associate.getStore());
        associateDB.setTurn(associate.getTurn());
        associateDB.setWorkGoup(associate.getWorkGoup());
        associateDB.setZipCode(associate.getZipCode());

        return associateRepository.save(associateDB);
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
            List<Measure> measureList = measureRepository.findByAssociateId(result.get().getId());
            List<Mapping> mappingList = mappingRepository.findByAssociateId(result.get().getId());
            if(measureList != null && !measureList.isEmpty()){
                measureRepository.deleteAll(measureList);
            }
            if(mappingList != null && !mappingList.isEmpty()){
                mappingRepository.deleteAll(mappingList);
            }
            associateRepository.delete(result.get());
            response = "The associate was deleted.";
        } else {
            response = "The associate not found.";
        }
        return response;
    }

    @Override
    public List<Associate> findByName(String name) {
        return associateRepository.findByNameContaining(name);
    }

}
