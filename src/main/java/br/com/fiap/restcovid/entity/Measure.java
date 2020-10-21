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

@Table(name = "tbl_measure")
@Entity
@Data
public class Measure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date date;

    @Column
    private String measure;

    @Column
    private String responsible;

    @Column(name = "result_observation")
    private String resultObservation;

    @Column
    private String status;

    @ManyToOne(cascade = {CascadeType.REMOVE})
    @JoinColumn(name = "associate_id")
    private Associate associate;
}
