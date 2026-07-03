/**
 * =========================================================
 * 📘 CLASE: Invertir un arreglo
 * =========================================================
 *
 * Objetivo:
 * Crear un segundo arreglo con los valores del primero,
 * pero en orden inverso.
 *
 * Original:  {8, 4, 9, 5, 7}
 * Invertido: {7, 5, 9, 4, 8}
 * =========================================================
 */
public class InvertirArreglo {

    public static void main(String[] args) {

        int[] arr = {8, 4, 9, 5, 7};

        /**
         * =====================================================
         * 🔁 FORMA 1
         * =====================================================
         *
         * i recorre arr de derecha a izquierda.
         * cont recorre arr2 de izquierda a derecha.
         */

        int cont = 0;
        int[] arr2 = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[cont] = arr[i];
            cont++;
        }

        // Imprimir arreglo invertido
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("*****************************");

        /**
         * =====================================================
         * 🔁 FORMA 2
         * =====================================================
         *
         * i recorre arr2 normalmente.
         * cont recorre arr de derecha a izquierda.
         */

        cont = arr.length - 1;
        arr2 = new int[arr.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[cont];
            cont--;
        }

        // Imprimir segundo resultado
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}