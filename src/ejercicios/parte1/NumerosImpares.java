package ejercicios.parte1;
/**
 * Programa que determina si un número es par o impar.
 */
public class NumerosImpares {

    public static void main(String[] args) {

        // ENTRADA:
        // Número entero que queremos evaluar
        int numero = 4;

        // PROCESO:
        // Calculamos el residuo de dividir entre 2
        // Si el residuo es 0 → es par
        int residuo = numero % 2;

        // SALIDA:
        // Mostramos el resultado en consola
        if (residuo == 0) {
            System.out.println("El número " + numero + " es PAR");
        } else {
            System.out.println("El número " + numero + " es IMPAR");
        }

        // FIN DEL PROGRAMA
    }
}