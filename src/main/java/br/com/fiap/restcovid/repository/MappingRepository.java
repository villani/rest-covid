package br.com.fiap.restcovid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.restcovid.entity.Mapping;

public interface MappingRepository extends JpaRepository<Mapping, Long> {
    
}
