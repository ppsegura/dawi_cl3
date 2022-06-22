package com.cibertec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name= "tipo")
@Data
public class Tipo {

	@Id
	@Column(name = "codtipo")
	private int id_tipo;
	
	@Column(name = "descripcion")
	private String descripcion;
}
