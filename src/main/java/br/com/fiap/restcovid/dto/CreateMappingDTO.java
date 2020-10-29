package br.com.fiap.restcovid.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CreateMappingDTO {

    private Long associateId;
    private String symptoms;
    private String earlySymptoms;
    private Boolean contactedDoctor;
    private Date dateMedicalContact;
    private Date dateExam;
    private String examStatus;
    private String contactedContaminated;
    private String riskGroup;
    private String WhoDoYouLiveWith;
    private Boolean hospitalizationHistory;
    private Boolean admittedToday;
    private String hospital;
    private Date dateHospitalizationStart;
    private Date  dateHospitalizationEnd;
    private Date dateRegistration;
    private String healthPlan;
    private String centralResponsible;
    private String medicalOfficer;
    private String technicalManager;
    private Date lastDayWorked;
    private Date dateReturnForecast;

}
