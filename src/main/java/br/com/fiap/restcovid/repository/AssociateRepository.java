package br.com.fiap.restcovid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.restcovid.entity.Associate;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssociateRepository extends JpaRepository<Associate, Long> {

    List<Associate> findByNameContaining(@Param("name") String name);

}
