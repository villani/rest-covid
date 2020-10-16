package br.com.fiap.restcovid.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_associate")
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
    private String occupation;
    private String company;
    private String store;
    private String phone;
    private String area;
    private String remoteWork;
    private String turn;
    private String group;
    private String locality;
    private String address;
    private String city;
    private String zipCode;
    private String patientRecord;
    
}
