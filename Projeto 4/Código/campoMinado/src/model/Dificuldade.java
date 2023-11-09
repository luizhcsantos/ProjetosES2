package model;

public class Dificuldade {
	private boolean iniciante;
	private boolean intermediario;
	private boolean avancado;
	
	public Dificuldade(boolean iniciante, boolean intermediario, boolean avancado) {
		super();
		this.iniciante = iniciante;
		this.intermediario = intermediario;
		this.avancado = avancado;
	}

	public boolean isIniciante() {
		return iniciante;
	}

	public void setIniciante(boolean iniciante) {
		this.iniciante = iniciante;
	}

	public boolean isIntermediario() {
		return intermediario;
	}

	public void setIntermediario(boolean intermediario) {
		this.intermediario = intermediario;
	}

	public boolean isAvancado() {
		return avancado;
	}

	public void setAvancado(boolean avancado) {
		this.avancado = avancado;
	}
	
	
}
