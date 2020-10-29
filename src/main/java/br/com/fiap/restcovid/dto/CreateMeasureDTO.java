package br.com.fiap.restcovid.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CreateMeasureDTO {

    private Long idAssociate;
    private Date date;
    private String measure;
    private String responsible;
    private String resultObservation;
    private String status;

}
