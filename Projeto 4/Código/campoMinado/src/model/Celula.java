package model;

public class Celula {
	private boolean bomba;
	private boolean vazio;
	private int numeroDeBombas;
	private int posicao;
	
	public Celula() {
		
	}

	public Celula(boolean bomba, boolean vazio, int numeroDeBombas, int posicao) {
		super();
		this.bomba = bomba;
		this.vazio = vazio;
		this.numeroDeBombas = numeroDeBombas;
		this.posicao = posicao;
	}

	public boolean isBomba() {
		return bomba;
	}

	public void setBomba(boolean bomba) {
		this.bomba = bomba;
	}

	public boolean isVazio() {
		return vazio;
	}

	public void setVazio(boolean vazio) {
		this.vazio = vazio;
	}

	public int getNumeroDeBombas() {
		return numeroDeBombas;
	}

	public void setNumeroDeBombas(int numeroDeBombas) {
		this.numeroDeBombas = numeroDeBombas;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	
}
