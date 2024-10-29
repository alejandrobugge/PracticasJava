package com.educacionit.proyectoescuela;

public class HoraCatedra extends Docentes {
	public String ultimoTitulo;
	public int numHoras;
	public int valorContrato;
	public int salario;
	
	public void calculaSueldo() {
		System.out.println("calcula el sueldo HC");
	}

	public void liquidarHC() {
		System.out.println("liquidarHC");
	}

	public void mostrarLiqHC() {
		System.out.println("mostrarLiqHC");
	}

	public HoraCatedra(int idPersona, String nomPersona, String apePersona, String fechaNacimiento,
			String ciudadNacimiento, String genero, int estrato, String areaFormacion, String tituloProfesional,
			String unidadAcademica, String ultimoTitulo, int numHoras, int valorContrato, int salario) {
		super(idPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, areaFormacion,
				tituloProfesional, unidadAcademica);
		this.ultimoTitulo = ultimoTitulo;
		this.numHoras = numHoras;
		this.valorContrato = valorContrato;
		this.salario = salario;
	}
	
	
}
