package com.idat.AlumnoPruebaIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.AlumnoPruebaIIE.model.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {

}
