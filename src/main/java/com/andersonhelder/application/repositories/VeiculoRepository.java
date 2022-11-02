package com.andersonhelder.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersonhelder.application.entities.Veiculo;

public interface VeiculoRepository  extends JpaRepository<Veiculo, String>{

}
