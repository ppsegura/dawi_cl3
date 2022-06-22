package com.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.repository.IMascotaRepository;
import com.cibertec.repository.ITipoRepository;

import com.cibertec.model.Mascota;

@Controller
public class MascotaController {
	
	@Autowired
	private IMascotaRepository repoc;
	
	@Autowired
	private ITipoRepository repoc1;
	
	@GetMapping("mascota/cargar")
	public String abrirPag(Model model) {
		model.addAttribute("mascota", new Mascota());
		
		model.addAttribute("lstTipo", repoc1.findAll());
		
		return "registroPSegura";
	}
	
	@GetMapping("mascota/listar")
	public String listarMascota(Model model) {
		model.addAttribute("lstMascota", repoc.findAll());
		return "registroPSegura";
	}
	
	@GetMapping("mascota/tipo/listar")
	public String listarTipo(Model model) {
		model.addAttribute("lstMascota", repoc1.findAll());
		return "registroPSegura";
	}
	
	
	@PostMapping("mascota/grabar")
	public String grabarPag(@ModelAttribute Mascota mascota, Model model) {
		System.out.println(mascota);
		
		try {
			repoc.save(mascota);
			model.addAttribute("mensaje","Mascota Registrada");
		} catch (Exception e) {
			model.addAttribute("mensaje","Mascota no se registró");
		}
			
		model.addAttribute("lstTipo", repoc1.findAll());
		//model.addAttribute("lstMascota", repoc.findAll());
		return "registroPSegura";
	}

}
