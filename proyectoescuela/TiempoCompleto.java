package com.educacionit.proyectoescuela;

public class TiempoCompleto extends Docentes {
	public String categoria;
	public int puntos;
	public int salario;
	
	public void calculaSueldo() {
		System.out.println("calcula el sueldo TC");
	}

	public void liquidarTC() {
		System.out.println("liquidarTC");
	}

	public void mostrarLiqTC() {
		System.out.println("mostrarLiqTC");
	}

	public TiempoCompleto(int idPersona, String nomPersona, String apePersona, String fechaNacimiento,
			String ciudadNacimiento, String genero, int estrato, String areaFormacion, String tituloProfesional,
			String unidadAcademica, String categoria, int puntos, int salario) {
		super(idPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, areaFormacion,
				tituloProfesional, unidadAcademica);
		this.categoria = categoria;
		this.puntos = puntos;
		this.salario = salario;
	}
	
	public TiempoCompleto() {
		
	}

	@Override
	public String toString() {
		return "TiempoCompleto [categoria=" + categoria + ", puntos=" + puntos + ", salario=" + salario
				+ ", toString()=" + super.toString() + "]";
	}
	
}
