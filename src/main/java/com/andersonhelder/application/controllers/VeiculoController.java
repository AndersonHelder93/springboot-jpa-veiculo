package com.andersonhelder.application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andersonhelder.application.entities.Veiculo;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoController {

	@GetMapping
	public ResponseEntity<Veiculo> findAll() {
		Veiculo veiculo = new Veiculo("KLM1010", "Carro", "Azul", "01/01/1997");
		return ResponseEntity.ok().body(veiculo);
	}

}
