package ejercicioBanco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static int tokens[] = { 0, 0, 0 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String usuario, clave;
		final String USU = "jose";
		final String CLA = "jose123";
		int tokenAleatorio, tokenIngresado = 0;
		char opcion;
		boolean estado = true;
		int cantLogin = 0;
		boolean tokenValido = false;
		int cantTokens = 0;

		do {

			System.out.println("Ingrese su nombre de usuario");
			usuario = sc.next();

			System.out.println("Ingrese su contraseña");
			clave = sc.next();

			do {
				tokenAleatorio = generaToken();
				tokenValido = validaToken(tokenAleatorio);
				if (tokenValido) {
					guardaToken(cantTokens, tokenAleatorio);
					cantTokens++;
				}
			} while (!tokenValido);

			System.out.println(tokenAleatorio);

			System.out.println("Ingrese su token");

			try {
				tokenIngresado = sc.nextInt();
				if (usuario.equalsIgnoreCase(USU) && clave.equals(CLA) && tokenAleatorio == tokenIngresado) {
					System.out.println("Bienvenido");
					estado = false;
				} else {
					System.out.println("Usuario o contraseña incorrecto, desea reintentar? S/N");
					opcion = sc.next().toUpperCase().charAt(0);
					if (opcion == 'N') {
						System.out.println("Gracias por utilizar la aplicacion");
						estado = false;
					} else {
						estado = true;
					}

				}
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println("El token ingresado debe ser numerico");
				System.out.println("Desea reintentar? S/N");
				sc.nextLine();
				opcion = sc.nextLine().toUpperCase().charAt(0);
				if (opcion == 'N') {
					System.out.println("Gracias por utilizar la aplicacion");
					estado = false;
				} else {
					estado = true;
				}

			}

			cantLogin++;
			if (cantLogin == 3 & estado == true) {
				System.out.println("Usuario bloqueado");
				estado = false;
			}
		} while (estado);
		sc.close();
	}

	static int generaToken() {
		return (int) (Math.random() * (999999 - 100000)) + 100000;
	}

	static boolean validaToken(int nuevoToken) {
		for (int i = 0; i < tokens.length; i++) {
			if (nuevoToken == tokens[i]) {
				return false;
			}
		}
		return true;
	}

	static void guardaToken(int id, int token) {
		tokens[id] = token;
	}
}
