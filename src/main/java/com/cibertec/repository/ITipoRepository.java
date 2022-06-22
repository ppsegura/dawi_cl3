package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Tipo;

@Repository
public interface ITipoRepository extends JpaRepository<Tipo, Integer> {

}
