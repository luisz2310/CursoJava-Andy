import java.util.Arrays;

public class ArreglosParte2 {

    public static void main(String[] args) {

        // ============================================
        // 🔹 1. VARIABLES PRIMITIVAS (COPIA POR VALOR)
        // ============================================

        int x = 10;
        int y = x;

        // MEMORIA:
        // [x=10] [y=10]

        System.out.println(y); // 10

        x = 100;

        // MEMORIA:
        // [x=100] [y=10]

        System.out.println(y); // sigue siendo 10

        System.out.println("*****************");


        // ============================================
        // 🔹 2. ARREGLOS (REFERENCIA)
        // ============================================

        int[] r1 = {1, 2, 3, 4};
        int[] r2 = r1; // ❌ NO copia, apunta al mismo arreglo

        // MEMORIA:
        // {r1 → [1][2][3][4]}
        // {r2 → r1}

        for (int i = 0; i < r2.length; i++) {
            System.out.println(r2[i]);
        }

        System.out.println("*****************");


        // ============================================
        // 🔹 3. MODIFICAR r1 AFECTA r2
        // ============================================

        r1[0] = 100;

        // MEMORIA:
        // {r1 → [100][2][3][4]}
        // {r2 → r1}

        for (int i = 0; i < r2.length; i++) {
            System.out.println(r2[i]);
        }

        System.out.println("*****************");


        // ============================================
        // 🔹 4. MODIFICAR r2 AFECTA r1
        // ============================================

        r2[0] = 999;

        // MEMORIA:
        // {r1 → [999][2][3][4]}
        // {r2 → r1}

        for (int i = 0; i < r1.length; i++) {
            System.out.println(r1[i]);
        }

        System.out.println("*****************");


        // ============================================
        // 🔹 5. COPIA REAL CON FOR
        // ============================================

        int[] r3 = new int[r1.length];

        // MEMORIA:
        // {r3 → [ ][ ][ ][ ]}

        for (int i = 0; i < r1.length; i++) {
            r3[i] = r1[i];
        }

        // MEMORIA:
        // {r1 → [999][2][3][4]}
        // {r3 → [999][2][3][4]}

        r1[0] = 20;

        // MEMORIA:
        // {r1 → [20][2][3][4]}
        // {r3 → [999][2][3][4]}

        for (int i = 0; i < r3.length; i++) {
            System.out.println(r3[i]); // NO cambia
        }

        System.out.println("*****************");


        // ============================================
        // 🔹 6. COPIAS CON MÉTODOS
        // ============================================

        int[] r4 = Arrays.copyOf(r1, r1.length);
        int[] r5 = r1.clone();

        // MEMORIA:
        // {r4 → [20][2][3][4]}
        // {r5 → [20][2][3][4]}

        for (int i = 0; i < r4.length; i++) {
            System.out.println(r4[i]);
        }

        System.out.println("-----");

        for (int i = 0; i < r5.length; i++) {
            System.out.println(r5[i]);
        }

        System.out.println("*****************");


        // ============================================
        // 🔹 7. MÁS REFERENCIAS (PELIGRO)
        // ============================================

        int[] r6 = r2;

        // MEMORIA:
        // {r1 → [20][2][3][4]}
        // {r2 → r1}
        // {r6 → r2}

        r6[0] = 888;

        // MEMORIA:
        // {r1 → [888][2][3][4]}
        // {r2 → r1}
        // {r6 → r2}

        for (int i = 0; i < r1.length; i++) {
            System.out.println(r1[i]);
        }

        System.out.println("-----");

        for (int i = 0; i < r2.length; i++) {
            System.out.println(r2[i]);
        }

        System.out.println("*****************");
    }
}