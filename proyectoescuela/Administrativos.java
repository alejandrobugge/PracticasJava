package com.educacionit.proyectoescuela;

public class Administrativos extends Persona {
	public String dependencia;
	public String titulo;

	public void mostrarDatosAdmin() {
		System.out.println("Administrativos [dependencia=" + dependencia + ", titulo=" + titulo + ", idPersona=" + idPersona
				+ ", nomPersona=" + nomPersona + ", apePersona=" + apePersona + ", fechaNacimiento=" + fechaNacimiento
				+ ", ciudadNacimiento=" + ciudadNacimiento + ", genero=" + genero + ", estrato=" + estrato + "]");
		
	}

	public Administrativos(int idPersona, String nomPersona, String apePersona, String fechaNacimiento,
			String ciudadNacimiento, String genero, int estrato, String dependencia, String titulo) {
		super(idPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato);
		this.dependencia = dependencia;
		this.titulo = titulo;
	}

	public Administrativos() {
		
	}
	
}
