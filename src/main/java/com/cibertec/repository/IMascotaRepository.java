package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Mascota;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Integer> {

}
