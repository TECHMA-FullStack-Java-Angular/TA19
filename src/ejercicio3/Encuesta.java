package ejercicio3;

import java.util.List;

public class Encuesta {

	// Creamos el objeto encuesta con los datos recibidos

	private String sistemaOperativo;
	private List<String> especialidades; // lista porque puede recibir mas de un valor
	private int horasDedicadas;

	public Encuesta(String sistemaOperativo, List<String> especialidades, int horasDedicadas) {
		this.sistemaOperativo = sistemaOperativo;
		this.especialidades = especialidades;
		this.horasDedicadas = horasDedicadas;
	}

	// Creamos los getters para llamarlos desde Ej3Result

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public List<String> getEspecialidades() {
		return especialidades;
	}

	public int getHorasDedicadas() {
		return horasDedicadas;
	}

}
