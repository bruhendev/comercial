package com.bruno.comercial.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("meuBean")
@RequestScoped
public class PrecoProdutoBean {
	
	@Inject
	private CalculadoraPreco calculadora;
	
	@PostConstruct
	public void init() {
		System.out.println("Init PrecoProdutoBean");
	}
	
	public double getPreco() {
		return calculadora.calcularPreco(4, 2.5);
	}
}
