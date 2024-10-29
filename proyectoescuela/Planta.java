package com.educacionit.proyectoescuela;

import java.time.LocalDate;

public class Planta extends Administrativos{
	public LocalDate fechaVinculacion;
	
	public void mostrarDatosAdminPlanta() {

		System.out.println("Planta [fechaVinculacion=" + fechaVinculacion + ", dependencia=" + dependencia + ", titulo=" + titulo
				+ ", idPersona=" + idPersona + ", nomPersona=" + nomPersona + ", apePersona=" + apePersona
				+ ", fechaNacimiento=" + fechaNacimiento + ", ciudadNacimiento=" + ciudadNacimiento + ", genero="
				+ genero + ", estrato=" + estrato + "]");
	}

	public Planta(int idPersona, String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento,
			String genero, int estrato, String dependencia, String titulo, LocalDate fechaVinculacion) {
		super(idPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, dependencia,
				titulo);
		this.fechaVinculacion = fechaVinculacion;
	}

	public Planta() {

	}
	
}
