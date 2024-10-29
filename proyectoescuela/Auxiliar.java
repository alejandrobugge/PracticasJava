package com.educacionit.proyectoescuela;

import java.time.LocalDate;

public class Auxiliar extends Planta {
	public int nivel;
	public int salario;

	public void calcularSueldo() {
		System.out.println("Calculo sueldo auxiliar");
	}

	public void liquidarAux() {

	}

	public void mostrarLiqAux() {

	}

	public Auxiliar(int idPersona, String nomPersona, String apePersona, String fechaNacimiento,
			String ciudadNacimiento, String genero, int estrato, String dependencia, String titulo,
			LocalDate fechaVinculacion, int nivel, int salario) {
		super(idPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, dependencia,
				titulo, fechaVinculacion);
		this.nivel = nivel;
		this.salario = salario;
	}
	
	public Auxiliar() {

	}

	@Override
	public String toString() {
		return "Auxiliar [nivel=" + nivel + ", salario=" + salario + ", fechaVinculacion=" + fechaVinculacion
				+ ", dependencia=" + dependencia + ", titulo=" + titulo + ", idPersona=" + idPersona + ", nomPersona="
				+ nomPersona + ", apePersona=" + apePersona + ", fechaNacimiento=" + fechaNacimiento
				+ ", ciudadNacimiento=" + ciudadNacimiento + ", genero=" + genero + ", estrato=" + estrato + "]";
	}
	
	
	
}
