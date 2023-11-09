package model;

public class Sistema {
	private Dificuldade dificuldade;
	private Modo modo;
	private Jogo jogo;

	public void abrirMenu() {
		
	}
	
	public void inicarPartida(Modo modo, Dificuldade dificuldade) {
		
	}
	
	public Modo selecionarModo() {
		return modo;
	}
	
	public Dificuldade selecionarDificuldade() {
		return dificuldade;
	}
	
	public Celula obterCelula(int posicao) {
		return jogo.revelarCelula(posicao);
	}
	
	public void exibirBandeira(int posicao) {
		
	}
	
	public void perdePartida() {
		
	}
	
	public void vencePartida() {
		
	}
}
