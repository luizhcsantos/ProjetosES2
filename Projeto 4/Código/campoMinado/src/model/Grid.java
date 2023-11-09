package model;

import java.util.ArrayList;

public class Grid {
	private int numeroCelulas;
	private ArrayList<Celula> celulas;
	
	public Grid() {
		numeroCelulas = 0;
		celulas = new ArrayList<>();
	}
	
	public Grid(int numeroCelulas, ArrayList<Celula> celulas) {
		super();
		this.numeroCelulas = numeroCelulas;
		this.celulas = celulas;
	}

	public int getNumeroCelulas() {
		return numeroCelulas;
	}

	public void setNumeroCelulas(int numeroCelulas) {
		this.numeroCelulas = numeroCelulas;
	}

	public ArrayList<Celula> getCelulas() {
		return celulas;
	}

	public void setCelulas(ArrayList<Celula> celulas) {
		this.celulas = celulas;
	}
	
	public Celula buscaCelula(int posicao) {
		for(Celula c: celulas) {
			if(c.getPosicao() == posicao)
				return c;
		}
		return null;
	}
	
}
