import java.util.Random;

/**
 * 📘 CLASE: Estructuras de Control - Repetición
 *
 * Esta clase explica las principales estructuras de repetición en Java:
 * - while
 * - do-while
 * - for
 *
 * También incluye:
 * - operadores de incremento/decremento (++, --)
 * - operadores compuestos (+=, -=, *=, /=)
 *
 */
public class Clase2_EstructurasdeControl_Repeticion {

	public static void main(String[] args) {

		/*
		====================================================
		🔁 WHILE
		====================================================
		- Repite mientras la condición sea TRUE
		- Se usa cuando NO sabes cuántas veces se repetirá
		*/

		int i = 0;
		boolean x = true;

		while (x) {
			System.out.println("SE REPITE: " + i);
			i = i + 1;

			if (i == 5) {
				x = false; // detener ciclo
			}
		}

		System.out.println("Fin del while");

		/*
		✔ Forma más común usando condición directa
		*/

		i = 0;
		while (i <= 4) {
			System.out.println("SE REPITE: " + i);
			i = i + 1;
		}

		System.out.println("Fin del while");

		/*
		🎲 Ejemplo: números aleatorios hasta que salga 999
		*/

		boolean flag = true;
		i = 0;

		while (flag) {
			Random r = new Random();
			int a = r.nextInt(1000); // 0 - 999
			i++;

			if (a == 999) {
				flag = false;
			}
		}

		System.out.println("Intentos: " + i);
		System.out.println("Fin del while");

		/*
		====================================================
		🔁 DO - WHILE
		====================================================
		- Primero ejecuta y luego evalúa
		- SIEMPRE se ejecuta al menos 1 vez
		*/

		i = 5;

		do {
			System.out.println("DO-WHILE: " + i);
			i++;
		} while (i <= 4);

		/*
		❗ Comparación con while (no entra)
		*/

		i = 5;
		while (i <= 4) {
			System.out.println("WHILE: " + i);
			i++;
		}

		/*
		====================================================
		🔁 FOR
		====================================================
		Estructura:
		for (inicio; condición; incremento)

		- inicio: se ejecuta una vez
		- condición: controla el ciclo
		- incremento: se ejecuta cada vuelta
		*/

		int j = 0;

		// Forma manual
		for (; j < 10;) {
			System.out.println("j: " + j);
			j = j + 1;
		}

		// Agregando incremento
		j = 0;
		for (; j < 10; j = j + 1) {
			System.out.println("j: " + j);
		}

		// Forma completa
		for (j = 0; j < 10; j = j + 1) {
			System.out.println("j: " + j);
		}

		// Declarando variable dentro del for
		for (int z = 0; z < 10; z = z + 1) {
			System.out.println("z: " + z);
		}

		/*
		====================================================
		➕ OPERADORES DE INCREMENTO / DECREMENTO
		====================================================
		*/

		int p = 0;

		// Post-incremento (usa valor y luego incrementa)
		System.out.println(p++); // imprime 0
		System.out.println(p);   // ahora vale 1

		// Pre-incremento (incrementa y luego usa valor)
		p = 0;
		System.out.println(++p); // imprime 1

		/*
		====================================================
		➕ OPERADORES COMPUESTOS
		====================================================
		*/

		p = 0;

		System.out.println(p += 2); // suma 2
		System.out.println(p -= 1); // resta 1
		System.out.println(p *= 3); // multiplica
		System.out.println(p /= 2); // divide

		/*
		✔ Usando otra variable
		*/

		int a = 10;
		p = 10;

		System.out.println(p += a);
		System.out.println(p -= a);
		System.out.println(p *= a);
		System.out.println(p /= a);

		/*
		====================================================
		🚀 EJEMPLOS COMUNES DE FOR
		====================================================
		*/

		// Contar hacia arriba
		for (int z = 0; z < 10; z++) {
			System.out.println("z: " + z);
		}

		// Contar hacia abajo
		for (int z = 10; z > 0; z--) {
			System.out.println("z: " + z);
		}

		// Incrementar de 2 en 2
		for (int z = 0; z < 100; z += 2) {
			System.out.println("z: " + z);
		}
	}
}