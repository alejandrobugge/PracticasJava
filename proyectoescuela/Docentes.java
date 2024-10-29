package com.educacionit.proyectoescuela;

public class Docentes extends Persona {
	public String areaFormacion;
	public String tituloProfesional;
	public String unidadAcademica;

	public String MostrarDatosDocente() {
		return "Docentes [areaFormacion=" + areaFormacion + ", tituloProfesional=" + tituloProfesional
				+ ", unidadAcademica=" + unidadAcademica + ", toString()=" + super.toString() + "]";
	}

	public Docentes(int idPersona, String nomPersona, String apePersona, String fechaNacimiento,
			String ciudadNacimiento, String genero, int estrato, String areaFormacion, String tituloProfesional,
			String unidadAcademica) {
		super(idPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato);
		this.areaFormacion = areaFormacion;
		this.tituloProfesional = tituloProfesional;
		this.unidadAcademica = unidadAcademica;
	}

	public Docentes() {
		
	}
	
}
