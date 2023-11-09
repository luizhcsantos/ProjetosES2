package model;

public class Modo {
	private boolean classico;
	private boolean contraRelogio;
	private boolean blitz;
	
	public Modo(boolean classico, boolean contraRelogio, boolean blitz) {
		super();
		this.classico = classico;
		this.contraRelogio = contraRelogio;
		this.blitz = blitz;
	}

	public boolean isClassico() {
		return classico;
	}

	public void setClassico(boolean classico) {
		this.classico = classico;
	}

	public boolean isContraRelogio() {
		return contraRelogio;
	}

	public void setContraRelogio(boolean contraRelogio) {
		this.contraRelogio = contraRelogio;
	}

	public boolean isBlitz() {
		return blitz;
	}

	public void setBlitz(boolean blitz) {
		this.blitz = blitz;
	}
	
}
