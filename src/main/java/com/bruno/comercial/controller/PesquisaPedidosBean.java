package com.bruno.comercial.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaPedidosBean {

	private List<Integer> pedidosFiltrados;

	public PesquisaPedidosBean() {
		pedidosFiltrados = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			pedidosFiltrados.add(i);
		}
	}

	public List<Integer> getpedidosFiltrados() {
		return pedidosFiltrados;
	}
	
	
}
