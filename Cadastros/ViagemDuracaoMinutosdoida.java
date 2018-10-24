package Cadastros;

public class ViagemDuracaoMinutos {
	private int duracaoMinutos;
	private int minutosTermino;
	private int minutosInicio;

	public ViagemDuracaoMinutos(int minutosTermino, int minutosInicio) {
		this.minutosInicio = minutosInicio;
		this.minutosTermino = minutosTermino;
		if (minutosTermino > minutosInicio) 
			duracaoMinutos = minutosTermino - minutosInicio;
		else if (minutosInicio > minutosTermino) {
			duracaoMinutos = (60 - minutosInicio) + minutosTermino;
		} else {
			duracaoMinutos = 0;
		}
	}
	public int getDuracaoMinutos() {
		return duracaoMinutos;
	}
	
	public boolean TerminoMaiorQueInicio() {
		return minutosTermino > minutosInicio;
	}
}