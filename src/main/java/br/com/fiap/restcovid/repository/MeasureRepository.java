package br.com.fiap.restcovid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.restcovid.entity.Measure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MeasureRepository extends JpaRepository<Measure, Long> {

    List<Measure> findByAssociateId(@Param("id") Long id);
    
}
