package com.idat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.Model.Turista;
import com.idat.Service.TuristaService;

@Controller
@RequestMapping("/api/turista/v1")
public class TuristaController {
	
		
		@Autowired
		private TuristaService service;
		
		@PostMapping("/guardar")
		public @ResponseBody void guardar(@RequestBody Turista turista) {
			
			service.guardarTurista(turista);
		}
		
		@GetMapping("/listar")
		public @ResponseBody void asignar() {
			service.listarTurista();
		}
}
