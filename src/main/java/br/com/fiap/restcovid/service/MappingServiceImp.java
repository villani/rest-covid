package br.com.fiap.restcovid.service;

import java.util.List;
import java.util.Optional;

import br.com.fiap.restcovid.dto.CreateMappingDTO;
import br.com.fiap.restcovid.entity.Associate;
import br.com.fiap.restcovid.repository.AssociateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.fiap.restcovid.entity.Mapping;
import br.com.fiap.restcovid.repository.MappingRepository;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MappingServiceImp implements MappingService {

    @Autowired
    MappingRepository mappingRepository;

    @Autowired
    AssociateRepository associateRepository;

    @Override
    public Mapping saveMapping(CreateMappingDTO createMappingDTO)
    {

        Associate associate = associateRepository.findById(createMappingDTO.getAssociateId())
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));

        Mapping mapping = new Mapping();
        mapping.setAssociate(associate);
        mapping.setAdmittedToday(createMappingDTO.getAdmittedToday());
        mapping.setCentralResponsible(createMappingDTO.getCentralResponsible());
        mapping.setContactedContaminated(createMappingDTO.getContactedContaminated());
        mapping.setContactedDoctor(createMappingDTO.getContactedDoctor());
        mapping.setDateExam(createMappingDTO.getDateExam());
        mapping.setDateHospitalizationEnd(createMappingDTO.getDateHospitalizationEnd());
        mapping.setDateHospitalizationStart(createMappingDTO.getDateHospitalizationStart());
        mapping.setDateMedicalContact(createMappingDTO.getDateMedicalContact());
        mapping.setDateRegistration(createMappingDTO.getDateRegistration());
        mapping.setDateReturnForecast(createMappingDTO.getDateReturnForecast());
        mapping.setEarlySymptoms(createMappingDTO.getEarlySymptoms());
        mapping.setExamStatus(createMappingDTO.getExamStatus());
        mapping.setHealthPlan(createMappingDTO.getHealthPlan());
        mapping.setHospital(createMappingDTO.getHospital());
        mapping.setHospitalizationHistory(createMappingDTO.getHospitalizationHistory());
        mapping.setLastDayWorked(createMappingDTO.getLastDayWorked());
        mapping.setMedicalOfficer(createMappingDTO.getMedicalOfficer());
        mapping.setRiskGroup(createMappingDTO.getRiskGroup());
        mapping.setSymptoms(createMappingDTO.getSymptoms());
        mapping.setTechnicalManager(createMappingDTO.getTechnicalManager());
        mapping.setWhoDoYouLiveWith(createMappingDTO.getWhoDoYouLiveWith());

        return mappingRepository.save(mapping);
    }

    @Override
    public Mapping updateMapping(Long id, CreateMappingDTO createMappingDTO) {

        Mapping mapping = mappingRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));

        Associate associate = associateRepository.findById(createMappingDTO.getAssociateId())
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));

        mapping.setAssociate(associate);
        mapping.setAdmittedToday(createMappingDTO.getAdmittedToday());
        mapping.setCentralResponsible(createMappingDTO.getCentralResponsible());
        mapping.setContactedContaminated(createMappingDTO.getContactedContaminated());
        mapping.setContactedDoctor(createMappingDTO.getContactedDoctor());
        mapping.setDateExam(createMappingDTO.getDateExam());
        mapping.setDateHospitalizationEnd(createMappingDTO.getDateHospitalizationEnd());
        mapping.setDateHospitalizationStart(createMappingDTO.getDateHospitalizationStart());
        mapping.setDateMedicalContact(createMappingDTO.getDateMedicalContact());
        mapping.setDateRegistration(createMappingDTO.getDateRegistration());
        mapping.setDateReturnForecast(createMappingDTO.getDateReturnForecast());
        mapping.setEarlySymptoms(createMappingDTO.getEarlySymptoms());
        mapping.setExamStatus(createMappingDTO.getExamStatus());
        mapping.setHealthPlan(createMappingDTO.getHealthPlan());
        mapping.setHospital(createMappingDTO.getHospital());
        mapping.setHospitalizationHistory(createMappingDTO.getHospitalizationHistory());
        mapping.setLastDayWorked(createMappingDTO.getLastDayWorked());
        mapping.setMedicalOfficer(createMappingDTO.getMedicalOfficer());
        mapping.setRiskGroup(createMappingDTO.getRiskGroup());
        mapping.setSymptoms(createMappingDTO.getSymptoms());
        mapping.setTechnicalManager(createMappingDTO.getTechnicalManager());
        mapping.setWhoDoYouLiveWith(createMappingDTO.getWhoDoYouLiveWith());

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
            response = "The mapping was deleted.";
        } else {
            response = "The mapping not found.";
        }
        return response;
    }

    @Override
    public List<Mapping> findMappingByAssociate(Long id) {
        return mappingRepository.findByAssociateId(id);
    }

}
