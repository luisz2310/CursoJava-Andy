package ejercicios.parte1;
/**
 * Programa que compara dos números (n y m)
 * y muestra cuál es mayor o si son iguales.
 */
public class NumeroMayor {

    public static void main(String[] args) {

        // =========================
        // ENTRADA
        // =========================
        int n = 9;
        int m = 1;

        // =========================
        // CASO 1: USANDO SOLO IF
        // =========================
        // Todas las condiciones se evalúan, aunque solo una sea verdadera
        System.out.println("USANDO IF SEPARADOS:");

        if (n > m) {
            System.out.println("N ES MAYOR");
        }
        if (n < m) {
            System.out.println("M ES MAYOR");
        }
        if (n == m) {
            System.out.println("SON IGUALES");
        }

        // =========================
        // CASO 2: USANDO IF - ELSE IF
        // =========================
        // Se evalúa de arriba hacia abajo
        // Solo se ejecuta la PRIMERA condición verdadera
        System.out.println("\nUSANDO IF - ELSE IF:");

        if (n > m) {
            System.out.println("N ES MAYOR");
        } else if (n < m) {
            System.out.println("M ES MAYOR");
        } else {
            System.out.println("SON IGUALES");
        }

        // =========================
        // EJEMPLO IMPORTANTE (BUG)
        // =========================
        // Queremos SOLO UN resultado
        int z = 1;

        System.out.println("\nUSANDO IF (puede dar múltiples resultados):");

        if (z < n) {
            System.out.println("N");
        }
        if (z < m) {
            System.out.println("M");
        }
        if (z == m) {
            System.out.println("ZM");
        }
        if (z == n) {
            System.out.println("ZN");
        }

        // =========================
        // SOLUCIÓN CORRECTA
        // =========================
        // Solo queremos UN resultado → usamos else if
        System.out.println("\nUSANDO IF - ELSE IF (solo un resultado):");

        if (z < n) {
            System.out.println("N");
        } else if (z < m) {
            System.out.println("M");
        } else if (z == m) {
            System.out.println("ZM");
        } else if (z == n) {
            System.out.println("ZN");
        }

        // FIN DEL PROGRAMA
    }
}