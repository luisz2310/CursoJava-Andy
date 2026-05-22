package ejercicios.parte1;
/**
 * Programa que imprime los números desde 0 hasta N
 * mostrando cómo se construye un ciclo FOR en 5 pasos.
 */
public class SumaPrimerosNnumeros {

    public static void main(String[] args) {

        /*
        =====================================================
        PASO 0: IDEA INICIAL (SIN CICLOS)
        =====================================================
        int n = 4;
        int e = 0;
        System.out.println(e); // ← queremos regresar aquí
        e = e + 1;
        if (e <= n) {
            // repetir
        } else {
            // terminar
        }
        */

        /*
        =====================================================
        PASO 1: IF → FOR
        =====================================================
        int n = 4;
        int e = 0;
        System.out.println(e);
        e = e + 1;
        for ( ; e <= n ; ) {
            // regresar arriba
        }
        */

        /*
        =====================================================
        PASO 2: contador dentro del FOR
        =====================================================
        int n = 4;
        for (int e = 0; e <= n ; ) {
            System.out.println(e);
            e = e + 1;
        }
        */

        /*
        =====================================================
        PASO 3: incremento al FOR
        =====================================================
        int n = 4;
        for (int e = 0; e <= n ; e = e + 1) {
            System.out.println(e);
        }
        */

        /*
        =====================================================
        PASO 4: código limpio
        =====================================================
        int n = 4;
        for (int e = 0; e <= n ; e = e + 1) {
            System.out.println(e);
        }
        */

        // =====================================================
        // PASO 5: FINAL (EJECUTABLE)
        // =====================================================
        int n = 4;
        for (int e = 0; e <= n; e++) {
            System.out.println(e);
        }
    }
}