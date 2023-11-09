package model;

public class Jogo {
	private int tempoLimite;
	private int tempoPorCelula;
	private Grid grid;
	
	public Jogo() {
		tempoLimite = 0;
		tempoPorCelula = 0;
	}
	
	public Jogo(int tempoLimite, int tempoPorCelula) {
		this.tempoLimite = tempoLimite;
		this.tempoPorCelula = tempoPorCelula;
	}
	
	public void exibirGrid(int tamanho) {
		
	}
	
	public void exibirCronometro(int tempoLimite, int tempoPorCelula) {
		
	}
	
	public Celula revelarCelula(int posicao) {
		return grid.buscaCelula(posicao);
	}
	
	public void bloquearCelula(int posicao) {
		
	}

	public int getTempoLimite() {
		return tempoLimite;
	}

	public void setTempoLimite(int tempoLimite) {
		this.tempoLimite = tempoLimite;
	}

	public int getTempoPorCelula() {
		return tempoPorCelula;
	}

	public void setTempoPorCelula(int tempoPorCelula) {
		this.tempoPorCelula = tempoPorCelula;
	}

	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	
}
