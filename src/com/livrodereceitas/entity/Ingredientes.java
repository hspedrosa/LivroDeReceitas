package com.livrodereceitas.entity;

public class Ingredientes {
	private Double quantidade;
	private String unidade;
	private String item;
	
	public Ingredientes() {
		// TODO Auto-generated constructor stub
	}

	public Ingredientes(Double quantidade, String unidade, String item) {
		super();
		this.quantidade = quantidade;
		this.unidade = unidade;
		this.item = item;
	}

	@Override
	public String toString() {
		return "Ingredientes [quantidade=" + quantidade + ", unidade=" + unidade + ", item=" + item + "]";
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	

}
