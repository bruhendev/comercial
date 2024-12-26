package com.bruno.comercial.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.bruno.comercial.model.Categoria;
import com.bruno.comercial.model.Produto;
import com.bruno.comercial.repository.Categorias;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Categorias categorias;

	private Produto produto;

	private List<Categoria> categoriasRaizes;

	public CadastroProdutoBean() {
		produto = new Produto();
	}

	@PostConstruct
	public void inicializar() {
		categoriasRaizes = categorias.raizes();
	}

	public void salvar() {
		System.out.println("Salvar");
	}

	public Produto getProduto() {
		return produto;
	}

	public List<Categoria> getCategoriasRaizes() {
		return categoriasRaizes;
	}

}
