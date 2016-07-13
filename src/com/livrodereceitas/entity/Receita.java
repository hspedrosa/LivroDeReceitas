package com.livrodereceitas.entity;

public class Receita {
	private Integer codReceita;
	private String nomeReceita;
	private Ingredientes ingrediente;
	private String preparo;
	
	public Receita() {
		// TODO Auto-generated constructor stub
	}

	public Receita(Integer codReceita, String nomeReceita, Ingredientes ingrediente, String preparo) {
		super();
		this.codReceita = codReceita;
		this.nomeReceita = nomeReceita;
		this.ingrediente = ingrediente;
		this.preparo = preparo;
	}

	@Override
	public String toString() {
		return "Receita [codReceita=" + codReceita + ", nomeReceita=" + nomeReceita + ", ingrediente=" + ingrediente
				+ ", preparo=" + preparo + "]";
	}

	public Integer getCodReceita() {
		return codReceita;
	}

	public void setCodReceita(Integer codReceita) {
		this.codReceita = codReceita;
	}

	public String getNomeReceita() {
		return nomeReceita;
	}

	public void setNomeReceita(String nomeReceita) {
		this.nomeReceita = nomeReceita;
	}

	public Ingredientes getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingredientes ingrediente) {
		this.ingrediente = ingrediente;
	}

	public String getPreparo() {
		return preparo;
	}

	public void setPreparo(String preparo) {
		this.preparo = preparo;
	}
	

}
