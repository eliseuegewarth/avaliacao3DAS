package Cadastros;

public class ViagemDuracaoHoras {
	private int duracaoHoras;

	public ViagemDuracaoHoras(int horaTermino, int horaInicio, ViagemDuracaoMinutos duracaoMinutos) {
		if (horaTermino == horaInicio) {
			duracaoHoras = 0;
		} else if (horaTermino > horaInicio) { //varias possibilidades... 
			duracaoHoras = horaTermino - horaInicio;
			if (duracaoMinutos.TerminoMaiorQueInicio()) {
				duracaoHoras = duracaoHoras -1;
			}
		} else {
			duracaoHoras = -1; //para casos em que a hora de termino nao foi registrada
		}
	}
	public int getDuracaoHoras() {
		return duracaoHoras;
	}
}