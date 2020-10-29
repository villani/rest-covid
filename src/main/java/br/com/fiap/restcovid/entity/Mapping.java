package br.com.fiap.restcovid.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "tbl_mapping")
@Entity
@Data
public class Mapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "associate_id")
    private Associate associate;

    @Column
    private String symptoms;

    @Column(name = "early_symptoms")
    private String earlySymptoms;

    @Column(name = "contacted_doctor")
    private Boolean contactedDoctor;
    
    @Column(name = "date_medical_contact")
    private Date dateMedicalContact;

    @Column(name = "date_exame")
    private Date dateExam;

    @Column(name = "exam_status")
    private String examStatus;

    @Column(name = "contacted_contaminated")
    private String contactedContaminated;
    
    @Column(name = "risk_group")
    private String riskGroup;

    @Column(name = "who_do_you_live_with")
    private String WhoDoYouLiveWith;

    @Column(name = "hospitalization_history")
    private Boolean hospitalizationHistory;

    @Column(name = "admittedToday")
    private Boolean admittedToday;
    
    @Column
    private String hospital;

    @Column(name = "date_hospitalization_start")
    private Date dateHospitalizationStart;

    @Column(name = "date_hospitalization_end")
    private Date  dateHospitalizationEnd;
    
    @Column(name = "date_registration")
    private Date dateRegistration;
    
    @Column(name = "health_plan")
    private String healthPlan;

    @Column(name = "central_responsible")
    private String centralResponsible;

    @Column(name = "medical_officer")
    private String medicalOfficer;
    
    @Column(name = "technical_manager")
    private String technicalManager;

    @Column(name = "last_day_worked")
    private Date lastDayWorked;

    @Column(name = "date_return_forecast")
    private Date dateReturnForecast;

}
