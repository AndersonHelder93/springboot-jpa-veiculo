package com.andersonhelder.application.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andersonhelder.application.entities.Veiculo;
import com.andersonhelder.application.repositories.VeiculoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private VeiculoRepository veiculoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Veiculo veiculo1 = new Veiculo("KLT3030", "Moto", "Preta", "01/01/2002");
		Veiculo veiculo2 = new Veiculo("JKL5050", "Caminhao", "Verde", "01/01/2007");
		
		veiculoRepository.saveAll(Arrays.asList(veiculo1, veiculo2));
	}
		
}
