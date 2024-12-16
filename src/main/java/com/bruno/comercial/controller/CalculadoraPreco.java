package com.bruno.comercial.controller;

import javax.annotation.PostConstruct;

public class CalculadoraPreco {
	
	@PostConstruct
	public void init() {
		System.out.println("Init CalculadoraPrecoBean");
	}

	public double calcularPreco(int quantidade, double precoUnitario) {
		return quantidade * precoUnitario;
	}

}
