package model;

public class Cronometro {
	private int segundos;
	private boolean regressivo;
	
	public Cronometro() {
		
	}
	
	public Cronometro(int segundos, boolean regressivo) {
		super();
		this.segundos = segundos;
		this.regressivo = regressivo;
	}
	
	public int getSegundos() {
		return segundos;
	}
	
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public boolean isRegressivo() {
		return regressivo;
	}
	
	public void setRegressivo(boolean regressivo) {
		this.regressivo = regressivo;
	}
	
}
