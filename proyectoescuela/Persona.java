package com.educacionit.proyectoescuela;

public class Persona {
	public int idPersona;
	public String nomPersona;
	public String apePersona;
	public String fechaNacimiento;
	public String ciudadNacimiento;
	public String genero;
	public int estrato;

	public void mostrarDG() {
		System.out.println("muesrta DG");
	}

	public void calculaEPS() {
		System.out.println("calculaEPS");
	}

	public void calculaPension() {
		System.out.println("calculaPension");
	}

	public void calculaARL() {
		System.out.println("calculaARL");
	}

	public void calculaSENA() {
		System.out.println("calculaSENA");
	}

	public void calculaCajas() {
		System.out.println("calculaCajas");
	}

	public void calculaICBF() {
		System.out.println("calculaICBF");
	}

	public void calculaAuxilio() {
		System.out.println("calculaAuxilio");
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nomPersona=" + nomPersona + ", apePersona=" + apePersona
				+ ", fechaNacimiento=" + fechaNacimiento + ", ciudadNacimiento=" + ciudadNacimiento + ", genero="
				+ genero + ", estrato=" + estrato + "]";
	}

	public Persona(int idPersona, String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento,
			String genero, int estrato) {
		this.idPersona = idPersona;
		this.nomPersona = nomPersona;
		this.apePersona = apePersona;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudadNacimiento = ciudadNacimiento;
		this.genero = genero;
		this.estrato = estrato;
	}

	public Persona() {

	}
	
}
