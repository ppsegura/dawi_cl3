package com.cibertec.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "mascota")
@Data
public class Mascota {
	
	@Id
	@Column(name = "idmascota")
	private int id_mascota;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "codtipo")
	private int id_tipo;
	
	@Column(name = "peso")
	private double peso;
	
	@Column(name = "fechanac")
	private Date fechanac;

}
