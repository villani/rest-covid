package br.com.fiap.restcovid.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "tbl_associate")
@Entity
@Data
public class Associate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String name;

    @Column
    private Date birthday;

    @Column
    private String gender;

    @Column(name = "marital_status")
    private String maritalStatus;   

    @Column(name = "id_manager")
    private Long idManager;

    @Column
    private String occupation;

    @Column
    private String company;

    @Column
    private String store;

    @Column
    private String phone;

    @Column
    private String area;

    @Column(name = "remote_work")
    private String remoteWork;

    @Column
    private String turn;

    @Column(name = "work_group")
    private String workGoup;

    @Column
    private String locality;

    @Column
    private String address;

    @Column
    private String city;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "patient_record")
    private String patientRecord;
    
}
