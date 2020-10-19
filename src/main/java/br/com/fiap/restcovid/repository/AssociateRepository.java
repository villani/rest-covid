package br.com.fiap.restcovid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.restcovid.entity.Associate;

public interface AssociateRepository extends JpaRepository<Associate, Long> {
    
}
