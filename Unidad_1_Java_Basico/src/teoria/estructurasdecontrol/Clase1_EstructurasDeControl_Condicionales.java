package teoria.estructurasdecontrol;

/**
 * 📘 CLASE: Estructuras de Control - Condicionales
 *
 * 🧠 ¿Qué aprenderás?
 * - Condicionales (if, else, else if)
 * - Operadores lógicos y booleanos
 * - Anidación de condiciones
 * - Precedencia lógica
 * - Uso de switch
 *
 * 💡 Este archivo funciona como referencia rápida (cheatsheet)
 */
public class Clase1_EstructurasDeControl_Condicionales {

    public static void main(String[] args) {

        // =====================================================
        // 🧠 CONDICIONALES (IF)
        // =====================================================
        // Permiten tomar decisiones en el programa
        // Ejecutan código SOLO si la condición es TRUE
        //
        // Estructura:
        // if (condición) { código }

        boolean x = 1 > 2; // false
        boolean y = 1 < 2; // true

        // =====================================================
        // 🔢 OPERADORES DE COMPARACIÓN
        // =====================================================
        // Comparan valores y regresan TRUE o FALSE
        //
        // >   mayor que
        // <   menor que
        // >=  mayor o igual
        // <=  menor o igual
        // ==  igual
        // !=  diferente

        int a = 0;
        int b = 10;

        boolean r0 = a > b;   // false
        boolean r1 = a < b;   // true
        boolean r2 = b > a;   // true
        boolean r3 = a == b;  // false
        boolean r4 = a != b;  // true

        // =====================================================
        // ⚡ IF SIMPLES
        // =====================================================
        // Se evalúan TODOS los if por separado

        if (a >= b) {
            System.out.println("Se cumple a >= b");
        }

        if (a == b) {
            System.out.println("Se cumple a == b");
        }

        // ⚠️ NOTA:
        // == y != funcionan bien con tipos primitivos
        // Para objetos (como String) usar .equals()

        // =====================================================
        // 🔀 IF - ELSE
        // =====================================================
        // Ejecuta UNA de dos opciones

        if (a > b) {
            System.out.println("Se cumple a > b");
        } else {
            System.out.println("No se cumple a > b");
        }

        // =====================================================
        // 🔁 IF - ELSE IF
        // =====================================================
        // Solo se ejecuta UNA condición (la primera verdadera)

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("Ninguna condición se cumplió");
        }

        // =====================================================
        // 🔗 IF ANIDADOS
        // =====================================================
        // Un if dentro de otro if

        int a1 = 0;
        int b1 = 1;
        int c1 = 2;

        if (a1 > b1) {
            if (a1 > c1) {
                System.out.println("A es mayor que B y C");
            }
        }

        // =====================================================
        // 🔗 OPERADORES BOOLEANOS
        // =====================================================
        // &&  → AND (y)
        // ||  → OR (o)
        // !   → NOT (negación)

        // AND (ambas deben ser TRUE)
        if (a1 > b1 && a1 > c1) {
            System.out.println("A es mayor que B y C");
        }

        a1 = 20;
        if (a1 > b1 && a1 > c1) {
            System.out.println("A es mayor que B y C");
        }

        // OR (al menos una debe ser TRUE)
        int a2 = 10;
        int b2 = 1;
        int c2 = 20;

        if (a2 > b2 || a2 > c2) {
            System.out.println("A es mayor que B o C");
        }

        // NOT (invierte el resultado)
        int x1 = 10;

        if (!(x1 > 10)) {
            System.out.println("X NO es mayor que 10");
        }

        // =====================================================
        // ⚠️ PRECEDENCIA LÓGICA
        // =====================================================
        // () primero
        // && después
        // || al final

        if (x1 > a1 || (b2 > c2 && b2 > a2)) {
            // Ejemplo de prioridad con paréntesis
        }

        if ((x1 > a1 || b2 > c2) && b2 > a2) {
            // Cambia el resultado por la agrupación
        }

        // =====================================================
        // 🔀 SWITCH (FORMA CLÁSICA)
        // =====================================================
        int z = 8;

        switch (z) {
            case 1:
                System.out.println("Caso 1");
                break;
            case 2:
                System.out.println("Caso 2");
                break;
            case 3:
                System.out.println("Caso 3");
                break;
            default:
                System.out.println("Z no coincidió");
                break;
        }

        // =====================================================
        // ⚡ SWITCH MODERNO (JAVA 14+)
        // =====================================================

        switch (z) {
            case 1 -> System.out.println("Caso 1");
            case 2 -> System.out.println("Caso 2");
            case 3 -> System.out.println("Caso 3");
            default -> System.out.println("Z no coincidió");
        }

        // =====================================================
        // 🔁 SWITCH CON MÚLTIPLES CASOS
        // =====================================================

        switch (z) {
            case 1:
                System.out.println("Caso 1");
                break;
            case 2:
                System.out.println("Caso 2");
                break;
            case 3:
                System.out.println("Caso 3");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("Z es 5, 6, 7 u 8");
                break;
            case 9:
                System.out.println("Z es 9");
                break;
            default:
                System.out.println("Z no coincidió");
                break;
        }

    }
}