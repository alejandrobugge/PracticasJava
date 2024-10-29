package com.educacionit.proyectoescuela;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TiempoCompleto t1 = new TiempoCompleto(1,"pepe", 
//				"perez","1992-03-03", "BSAS", "Masculino", 5, "tecnologia", 
//				"programador", "programacion", "fijo", 10, 900000);
//		
//		System.out.println(t1.toString());

        // Crear una variable con una fecha específica
        LocalDate fechaEspecifica = LocalDate.of(2005, 2, 26); // Año, Mes, Día

		Planta p1 = new Planta(2, "pepe", "perez", "1994-03-03", "BSAS", 
				"Masculino", 5, "tecnologia", "programador",
				fechaEspecifica);

		p1.mostrarDatosAdminPlanta();
	}

}
