# 🔁 Repetición (Estructuras de Control)

Parte de: `estructuras_de_control`

---

# 🧠 ¿Qué es?

Permiten ejecutar un bloque de código varias veces según una condición.

---

# 🔁 WHILE

El ciclo `while` repite un bloque de código **mientras su condición sea verdadera**.

```java
while (condicion) {
    // código que se repite
}
```

La condición se evalúa **antes de cada iteración**:

* `true` → ejecuta el bloque
* `false` → termina el ciclo

## 🧠 ¿Cuándo usarlo?

Se usa principalmente cuando:

* No sabemos exactamente cuántas veces se repetirá el ciclo.
* El final depende de una condición.
* Esperamos que ocurra algo, como encontrar un número aleatorio.

---

## 🔢 WHILE CON CONTADOR

```java
int contador = 0;

while (contador <= 5) {
    System.out.println(contador); // Imprime el valor actual
    contador = contador + 1;      // Avanza y evita un ciclo infinito
}
```

⚠️ Si la variable que controla la condición nunca cambia, el ciclo puede ser infinito.

---

## ♾️ WHILE TRUE

```java
int x = 0;

while (true) {
    System.out.println(x);

    if (x == 3) {
        break;
    }

    x = x + 1;
}
```

`while (true)` crea un ciclo que no termina por su condición. Necesita una salida, normalmente `break`.

---

## 🛑 BREAK

`break`:

* Termina el ciclo inmediatamente.
* Salta fuera del `while` o `for`.
* El programa continúa después del ciclo.

```java
while (true) {
    if (x == 3) {
        break; // Sale completamente del ciclo
    }
}
```

👉 Clave mental: **“Sal del ciclo ahora.”**

---

## ⏭️ CONTINUE

`continue`:

* No termina el ciclo.
* Salta el resto de la iteración actual.
* Regresa al inicio para comenzar la siguiente iteración.

```java
int y = 0;

while (y < 10) {
    y = y + 1; // Se actualiza antes de continue

    if (y % 2 != 0) {
        continue; // Salta los números impares
    }

    System.out.println(y + " es par");
}
```

⚠️ En un `while`, debemos cuidar que el contador se actualice antes de ejecutar `continue`. De lo contrario, puede producirse un ciclo infinito.

👉 Clave mental: **“Sáltate esta vuelta y continúa.”**

---

## ⚠️ BREAK VS. CONTINUE

| Instrucción | Comportamiento |
|---|---|
| `break` | Termina todo el ciclo |
| `continue` | Salta solo la iteración actual |

---

## 🧮 CONTADOR Y ACUMULADOR

Un **contador** normalmente aumenta o disminuye una cantidad fija:

```java
contador = contador + 1;
```

Un **acumulador** guarda un resultado que cambia en cada iteración:

```java
suma = suma + contador;
```

Ejemplo: sumar del `1` al `6`.

```java
int contador = 0;
int suma = 0;

while (contador < 6) {
    contador = contador + 1;
    suma = suma + contador;
}

System.out.println(suma); // 21
```

---

## 🎲 NÚMEROS ALEATORIOS

Java incluye la clase `Random` para generar números aleatorios.

```java
import java.util.Random;

Random random = new Random();
int numero = random.nextInt(1000);
```

`nextInt(1000)` genera valores desde `0` hasta `999`.

---

## 🔁 WHILE + RANDOM

No sabemos cuántos intentos serán necesarios para encontrar el número `6`, por eso usamos `while (true)`.

```java
Random random = new Random();

while (true) {
    int numero = random.nextInt(10); // De 0 a 9
    System.out.println(numero);

    if (numero == 6) {
        break; // Termina cuando aparece el 6
    }
}
```

---

# 🔄 FOR

El ciclo `for` también repite código, pero permite organizar el **inicio**, la **condición** y la **actualización** en una sola línea.

```java
for (inicializacion; condicion; actualizacion) {
    // código que se repite
}
```

Ejemplo:

```java
for (int contador = 0; contador <= 5; contador = contador + 1) {
    System.out.println(contador);
}
```

## 🧩 PARTES DEL FOR

```java
for (int contador = 0; contador <= 5; contador = contador + 1)
```

| Parte | Función |
|---|---|
| `int contador = 0` | Se ejecuta una sola vez antes de iniciar |
| `contador <= 5` | Se evalúa antes de cada iteración |
| `contador = contador + 1` | Se ejecuta al terminar cada iteración |

### 📌 ¿Qué parte es obligatoria?

En Java, las tres partes pueden dejarse vacías, pero los dos `;` deben permanecer.

```java
for (;;) {
    // ciclo infinito
}
```

Cuando no se escribe una condición, Java la trata como verdadera.

Aunque sintácticamente puede omitirse, la **condición normalmente es la parte que controla cuándo termina el ciclo**.

---

## 🧠 ¿CUÁNDO USAR FOR?

Se usa principalmente cuando:

* Tenemos un contador.
* Conocemos el valor inicial.
* Conocemos el límite.
* Sabemos cómo cambiará el contador.

Ejemplos:

* Imprimir del `0` al `100`.
* Repetir una operación diez veces.
* Sumar números dentro de un rango.
* Recorrer un arreglo.

---

## 🔁 WHILE Y FOR EQUIVALENTES

### Con `while`

```java
int x = 0;

while (x <= 5) {
    System.out.println(x);
    x = x + 1;
}
```

### Con `for`

```java
for (int x = 0; x <= 5; x = x + 1) {
    System.out.println(x);
}
```

Los dos ejemplos producen el mismo resultado.

La diferencia es que `for` organiza el contador en una sola línea.

---

## 🔄 FOR CON PARTES VACÍAS

```java
int x = 0;

for (; x <= 5;) {
    System.out.println(x);
    x = x + 1;
}
```

Este `for` funciona de manera muy parecida a un `while`, porque la inicialización y la actualización están fuera de la línea principal.

---

## 🧮 CONTADOR Y ACUMULADOR CON FOR

```java
int suma = 0;

for (int contador = 1; contador <= 6; contador = contador + 1) {
    suma = suma + contador;
}

System.out.println(suma); // 21
```

* `contador` avanza del `1` al `6`.
* `suma` conserva el resultado anterior.
* Al final: `1 + 2 + 3 + 4 + 5 + 6 = 21`.

---

## 🛑 BREAK Y CONTINUE EN FOR

`break` y `continue` también funcionan dentro de un `for`.

```java
for (int x = 0; x <= 10; x = x + 1) {

    if (x == 8) {
        break; // Termina el for
    }

    if (x % 2 != 0) {
        continue; // Salta los impares
    }

    System.out.println(x);
}
```

En un `for`, la actualización se ejecuta automáticamente después de `continue`.

---

## 📦 ALCANCE DE VARIABLES EN FOR

```java
for (int x = 0; x <= 5; x = x + 1) {
    System.out.println(x);
}

// System.out.println(x); // Error
```

La variable `x` fue declarada dentro del `for`, por lo que solo existe dentro de ese ciclo.

Para utilizarla después, debe declararse antes:

```java
int x = 0;

for (; x <= 5; x = x + 1) {
    System.out.println(x);
}

System.out.println(x); // Sí se puede usar
```

---

# ⚖️ WHILE VS. FOR

| `while` | `for` |
|---|---|
| Útil cuando no sabemos cuántas vueltas habrá | Útil cuando usamos un contador |
| La actualización suele escribirse dentro | La actualización suele estar en la estructura |
| Común con condiciones dinámicas | Común con rangos y cantidades conocidas |
| Puede usar `break` y `continue` | Puede usar `break` y `continue` |

---


## ➕ Operadores útiles

| Operador | Significado     |
| -------- | --------------- |
| `++`     | Incremento      |
| `--`     | Decremento      |
| `+=`     | Suma acumulada  |
| `-=`     | Resta acumulada |
| `*=`     | Multiplicación  |
| `/=`     | División        |

---

## 🚀 Ejemplos comunes

```java
// Contar
for (int i = 0; i < 10; i++) {}

// Contar hacia atrás
for (int i = 10; i > 0; i--) {}

// De 2 en 2
for (int i = 0; i < 100; i += 2) {}
```

