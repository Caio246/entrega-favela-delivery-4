package com.squad11.faveladeliveryapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.squad11.faveladeliveryapi.entities.Notaentregadora;

@Repository
public interface NotaentregadoraRepository extends JpaRepository<Notaentregadora, Long> {

}
