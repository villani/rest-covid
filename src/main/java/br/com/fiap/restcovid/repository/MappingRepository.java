package br.com.fiap.restcovid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.restcovid.entity.Mapping;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface MappingRepository extends JpaRepository<Mapping, Long> {

    List<Mapping> findByAssociateId(@Param("id") Long id);
    
}
