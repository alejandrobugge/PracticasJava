package com.educacionit.proyectoescuela;

import java.time.LocalDate;

public class OPS extends Administrativos {
	public LocalDate fechaVinculacion;
	public int numMeses;
	public int valorContrato;
	public int salario;

	public void liquidarValorContrato() {
		System.out.println("se liquida el contrato");
	}

	public void mostrarLiqOPS() {
		System.out.println("muestra liq ops");
	}

	@Override
	public String toString() {
		return "OPS [fechaVinculacion=" + fechaVinculacion + ", numMeses=" + numMeses + ", valorContrato="
				+ valorContrato + ", salario=" + salario + ", dependencia=" + dependencia + ", titulo=" + titulo
				+ ", idPersona=" + idPersona + ", nomPersona=" + nomPersona + ", apePersona=" + apePersona
				+ ", fechaNacimiento=" + fechaNacimiento + ", ciudadNacimiento=" + ciudadNacimiento + ", genero="
				+ genero + ", estrato=" + estrato + "]";
	}

	public OPS(int idPersona, String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento,
			String genero, int estrato, String dependencia, String titulo, LocalDate fechaVinculacion, int numMeses,
			int valorContrato, int salario) {
		super(idPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, dependencia,
				titulo);
		this.fechaVinculacion = fechaVinculacion;
		this.numMeses = numMeses;
		this.valorContrato = valorContrato;
		this.salario = salario;
	}

	public OPS() {
	}
 
}
