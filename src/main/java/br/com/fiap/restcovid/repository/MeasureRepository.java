package br.com.fiap.restcovid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.restcovid.entity.Measure;

public interface MeasureRepository extends JpaRepository<Measure, Long> {
    
}
