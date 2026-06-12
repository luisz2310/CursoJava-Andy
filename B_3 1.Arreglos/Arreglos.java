/**
 * =========================================================
 * 📘 CLASE: Arreglos (Arrays) en Java
 * =========================================================
 *
 * 🧠 Temas:
 * - Declaración de arreglos
 * - Inicialización
 * - Tamaño (length)
 * - Acceso a posiciones (índices)
 * - Modificación de valores
 * - Recorrido con for
 *
 * 💡 Objetivo:
 * Entender cómo trabajar con arreglos (arrays) en Java,
 * cómo se almacenan, acceden y recorren sus elementos.
 * =========================================================
 */
public class Arreglos {

    public static void main(String[] args) {

        /**
         * =====================================================
         * 🔢 VARIABLES BÁSICAS
         * =====================================================
         */

        int b = 0;
        int a = 10;

        /**
         * =====================================================
         * 📦 DECLARACIÓN DE ARREGLOS
         * =====================================================
         *
         * Un arreglo es una estructura que almacena múltiples
         * valores del mismo tipo en posiciones (índices).
         *
         * 📌 Se declara así:
         * tipo[] nombre;
         */

        int arr[]; // solo declarado, aún no inicializado

        // ❌ Error: no se puede asignar directamente un valor
        // arr = 10;

        /**
         * =====================================================
         * 🧱 INICIALIZACIÓN DE ARREGLOS
         * =====================================================
         */

        // Inicialización con valores
        int arr2[] = {1, 2, 12, 7, 99, 3, 4, 5};

        // Inicialización con tamaño fijo (valores por defecto = 0)
        int arr3[] = new int[8]; // {0,0,0,0,0,0,0,0}

        System.out.println("arr2: " + arr2);
        System.out.println("arr3: " + arr3);

        /**
         * =====================================================
         * 📏 TAMAÑO DEL ARREGLO (length)
         * =====================================================
         *
         * 📌 Un arreglo tiene tamaño fijo.
         * ❗ No se puede cambiar directamente su tamaño.
         * ✔ Solo se puede reasignar un nuevo arreglo.
         */

        arr2 = new int[10]; // ahora tamaño 10
        System.out.println("Tamaño arr2: " + arr2.length);

        arr2 = new int[2]; // ahora tamaño 2
        System.out.println("Tamaño arr2: " + arr2.length);

        /**
         * =====================================================
         * 🎯 ÍNDICES DE UN ARREGLO
         * =====================================================
         *
         * 📌 Los índices empiezan en 0
         * 📌 Último índice = length - 1
         */

        int arr4[] = {1, 2, 12, 7, 99, 3, 4, 5};

        int r0 = arr4[0]; // primer elemento
        int r5 = arr4[5]; // sexto elemento

        System.out.println("Último elemento: " + arr4[7]);

        // ❌ Error en tiempo de ejecución (IndexOutOfBounds)
        // System.out.println(arr4[10]);

        /**
         * =====================================================
         * ✏️ MODIFICAR VALORES DEL ARREGLO
         * =====================================================
         */

        System.out.println("Antes: " + arr4[0]);
        arr4[0] = 100;
        System.out.println("Después: " + arr4[0]);

        arr4[6] = 999;
        arr4[7] = a;

        int z = 3;
        System.out.println("arr4[z]: " + arr4[z]);

        /**
         * =====================================================
         * 🔁 RECORRER ARREGLOS CON FOR
         * =====================================================
         *
         * 📌 Es la forma más común de trabajar con arrays
         */

        for (int i = 0; i < arr4.length; i++) {
            System.out.println("Elemento [" + i + "]: " + arr4[i]);
        }

        /**
         * =====================================================
         * 🔁 MODIFICAR ARREGLO CON FOR
         * =====================================================
         */

        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = i; // guarda el índice como valor
        }

        System.out.println("Fin de modificaciones");

        /**
         * =====================================================
         * 🧠 TAREA (PRACTICA)
         * =====================================================
         *
         * 📌 Encontrar el valor mayor en un arreglo
         */

        int arr6[] = {1, 2, 12, 7, 99, 3, 4, 5};
        // 👉 el mayor es 99

        int arr7[] = {1, 2, 121, 6, 78, 4, 2, 323, 7, 99, 3, 4, 5};
        // 👉 el mayor es 323

        System.out.println("Fin del programa");
    }
}