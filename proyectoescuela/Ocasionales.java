package com.educacionit.proyectoescuela;

public class Ocasionales extends Docentes {
	public String ultimoTitulo;
	public int numMeses;
	public int salario;
	
	public void calculaSueldo() {
		System.out.println("calcula el sueldo OC");
	}

	public void liquidarOC() {
		System.out.println("liquidarOC");
	}

	public void mostrarLiqOC() {
		System.out.println("mostrarLiqOC");
	}

	public Ocasionales(int idPersona, String nomPersona, String apePersona, String fechaNacimiento,
			String ciudadNacimiento, String genero, int estrato, String areaFormacion, String tituloProfesional,
			String unidadAcademica, String ultimoTitulo, int numMeses, int salario) {
		super(idPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, areaFormacion,
				tituloProfesional, unidadAcademica);
		this.ultimoTitulo = ultimoTitulo;
		this.numMeses = numMeses;
		this.salario = salario;
	}
	
	
}
