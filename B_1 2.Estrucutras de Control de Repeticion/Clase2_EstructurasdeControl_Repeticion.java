import java.util.Random;

/**
 * =========================================================
 * 📘 CLASE 2: Estructuras de Control - Repetición
 * =========================================================
 *
 * 🧠 Temas:
 * - while
 * - do-while
 * - for
 * - incrementos y decrementos
 * - operadores +=, -=, *=, /=
 *
 * 💡 Objetivo:
 * Entender cómo repetir acciones en Java usando ciclos
 * =========================================================
 */
public class Clase2_EstructurasdeControl_Repeticion {

    public static void main(String[] args) {

        /**
         * =====================================================
         * 🔁 WHILE
         * =====================================================
         *
         * Repite una acción mientras la condición sea TRUE
         *
         * while (CONDICIÓN) {
         *     // código que se repite
         * }
         *
         * 📌 La condición SIEMPRE es un booleano
         *
         * 💡 Se usa cuando NO sabes cuántas veces se repetirá
         */

        int i = 0;
        boolean x = true;

        while (x) {
            System.out.println("SE REPITE!: " + i);
            i = i + 1;

            if (i == 5) {
                x = false;
            }
        }

        System.out.println("Fin del while");

        // -----------------------------------------------------

        i = 0;
        while (i <= 4) {
            System.out.println("SE REPITE!: " + i);
            i = i + 1;
        }

        System.out.println("Fin del while");

        // -----------------------------------------------------
        // 🎲 WHILE CON RANDOM

        // imprimir números aleatorios entre 1 y 1000 hasta que salga 999

        boolean flag = true;
        i = 0;

        while (flag) {
            Random r = new Random();
            int a = r.nextInt(1000);

            i = i + 1;

            if (a == 999) {
                flag = false;
            }
        }

        System.out.println("i: " + i);
        System.out.println("Fin del while");

        /**
         * =====================================================
         * 🔁 DO - WHILE
         * =====================================================
         *
         * 📌 Primero ejecuta y luego evalúa la condición
         *
         * ✔ Se ejecuta AL MENOS 1 vez siempre
         *
         * 💡 Se usa cuando necesitas una ejecución obligatoria
         */

        i = 5;

        do {
            System.out.println("SE REPITE en do-while!: " + i);
            i = i + 1;
        } while (i <= 4);

        i = 5;

        while (i <= 4) {
            System.out.println("SE REPITE en while!: " + i);
            i = i + 1;
        }

        /**
         * =====================================================
         * 🔁 FOR
         * =====================================================
         *
         * 📌 Estructura:
         *
         * for (inicio; condición; actualización) {
         *     // código
         * }
         *
         * 1. inicio → se ejecuta una sola vez
         * 2. condición → controla el ciclo
         * 3. actualización → se ejecuta al final de cada vuelta
         *
         * 💡 Se usa cuando sabes cuántas veces repetir
         */

        int j = 0;

        for (; j < 10; ) {
            System.out.println("imprime j: " + j);
            j = j + 1;
        }

        j = 0;

        for (; j < 10; j = j + 1) {
            System.out.println("imprime j: " + j);
        }

        for (j = 0; j < 10; j = j + 1) {
            System.out.println("imprime j: " + j);
        }

        for (int z = 0; z < 10; z = z + 1) {
            System.out.println("imprime z: " + z);
        }

        /**
         * =====================================================
         * ➕➖ INCREMENTO Y DECREMENTO
         * =====================================================
         *
         * ✔ Reducir código al modificar variables
         *
         * i = i + 1   → i++
         * i = i - 1   → i--
         *
         * ++ → incrementa en 1
         * -- → decrementa en 1
         */

        int p = 0;

        // POST-INCREMENTO / POST-DECREMENTO
        // primero usa el valor, luego modifica
        p++;
        p--;
        p = 0;

        System.out.println(p++);

        // PRE-INCREMENTO / PRE-DECREMENTO
        // primero modifica, luego usa el valor
        ++p;
        --p;
        p = 0;

        System.out.println(++p);

        /**
         * =====================================================
         * ⚡ OPERADORES COMPUESTOS
         * =====================================================
         *
         * ✔ Simplifican operaciones matemáticas
         *
         * p = p + 2  → p += 2
         * p = p - 2  → p -= 2
         * p = p * 3  → p *= 3
         * p = p / 3  → p /= 3
         *
         * 📌 Primero se calcula, luego se asigna
         */

        p = 0;

        System.out.println(p += 2);
        System.out.println(p += 2);
        System.out.println(p += 2);
        System.out.println(p += 3);
        System.out.println(p -= 5);
        System.out.println(p *= 5);
        System.out.println(p /= 5);

        /**
         * =====================================================
         * 🔗 OPERADORES CON VARIABLES
         * =====================================================
         *
         * a = 10
         * p = 0
         *
         * p += a  → suma a p
         * p -= a  → resta a p
         * p *= a  → multiplica
         * p /= a  → divide
         */

        int a = 10;
        p = 10;

        System.out.println(p += a);
        System.out.println(p -= a);
        System.out.println(p /= a);
        System.out.println(p *= a);

        /**
         * =====================================================
         * 🔁 FOR (CASOS REALES)
         * =====================================================
         */

        // incremento normal
        for (int z = 0; z < 10; z++) {
            System.out.println("imprime z: " + z);
        }

        // decremento
        for (int z = 10; z > 0; z--) {
            System.out.println("imprime z: " + z);
        }

        // incremento de 2 en 2
        for (int z = 0; z < 100; z += 2) {
            System.out.println("imprime z: " + z);
        }
    }
}