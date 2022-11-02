package com.andersonhelder.application.entities;

import java.io.Serializable;
import java.util.Objects;

public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String placa;
	private String tipo;
	private String cor;
	private String data_fabricacao;

	public Veiculo() {
	}

	public Veiculo(String placa, String tipo, String cor, String data_fabricacao) {
		super();
		this.placa = placa;
		this.tipo = tipo;
		this.cor = cor;
		this.data_fabricacao = data_fabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getData_fabricacao() {
		return data_fabricacao;
	}

	public void setData_fabricacao(String data_fabricacao) {
		this.data_fabricacao = data_fabricacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(placa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(placa, other.placa);
	}

}
