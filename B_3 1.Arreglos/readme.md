# 📘 Java Cheatsheet – Arreglos (Arrays)

## 🧠 ¿Qué es un arreglo?

Un arreglo (array) en Java es una estructura de datos que almacena múltiples valores del **mismo tipo** en una sola variable. Cada valor se guarda en una posición llamada **índice**.

📌 Características clave:

* Todos los elementos son del mismo tipo
* Tamaño fijo (no cambia después de crearse)
* Acceso por índices
* Empiezan en 0

Ejemplo:

```java
int[] numeros = {10, 20, 30, 40};
```

---

## 🧱 Declaración e inicialización

```java
// Solo declaración
int[] arr;

// Inicialización con valores
int[] arr1 = {1, 2, 3, 4, 5};

// Inicialización con tamaño fijo (valores por defecto = 0)
int[] arr2 = new int[5];
```

📌 Resultado de `arr2`:

```text
{0, 0, 0, 0, 0}
```

---

## 📏 Propiedad length (tamaño)

```java
int[] arr = {5, 10, 15};

System.out.println(arr.length); // 3
```

📌 IMPORTANTE:

* `length` es fijo
* No se puede modificar
* Representa la cantidad de elementos

---

## 🎯 Índices del arreglo

```java
int[] arr = {10, 20, 30};
```

```text
arr[0] → 10
arr[1] → 20
arr[2] → 30
```

📌 Regla clave:

```text
Último índice = length - 1
```

❌ Error común:

```java
arr[3]; // fuera de rango
```

Esto provoca un error en tiempo de ejecución:

```text
ArrayIndexOutOfBoundsException
```

---

## ✏️ Modificar valores

```java
int[] arr = {1, 2, 3};

arr[0] = 100;
arr[2] = 999;
```

Resultado:

```text
{100, 2, 999}
```

📌 El arreglo cambia directamente en memoria.

---

## 🔁 Recorrer un arreglo

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

📌 El contador `i` representa la posición que se está leyendo.

El ciclo empieza en `0` y termina en `arr.length - 1`.

---

## ⚡ Uso típico con for

Los ciclos se utilizan con arreglos para:

* Leer elementos
* Modificar valores
* Buscar elementos
* Sumar valores
* Encontrar el mayor o el menor
* Copiar arreglos
* Invertir arreglos

---

## 🧠 Ejemplo completo: modificar e imprimir

```java
int[] arr = {1, 2, 3, 4, 5};

// Modificar todos los valores
for (int i = 0; i < arr.length; i++) {
    arr[i] = i * 10;
}

// Imprimir los valores
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

Resultado:

```text
0
10
20
30
40
```

---

## 🧩 Copia de arreglos y referencia en memoria

### 🔹 Copia con `=`: no es una copia real

```java
int[] a = {1, 2, 3};
int[] b = a;
```

🧠 Memoria:

```text
a ─┐
   ├──→ [1][2][3]
b ─┘
```

Las variables `a` y `b` apuntan al mismo arreglo.

```java
b[0] = 100;
```

Resultado:

```text
a ─┐
   ├──→ [100][2][3]
b ─┘
```

❗ Modificar el arreglo usando una variable también afecta a la otra.

---

### 🔹 Copia real con `for`

```java
int[] a = {1, 2, 3};
int[] b = new int[a.length];

for (int i = 0; i < a.length; i++) {
    b[i] = a[i];
}
```

🧠 Memoria:

```text
a ──→ [1][2][3]

b ──→ [1][2][3]
```

Ahora existen dos arreglos diferentes.

```java
a[0] = 999;
```

Resultado:

```text
a ──→ [999][2][3]

b ──→ [1][2][3]
```

✔ Los arreglos son independientes.

---

### 🔹 Copia con `Arrays.copyOf`

Para usar `Arrays.copyOf`, se importa la clase `Arrays`:

```java
import java.util.Arrays;
```

Después se crea la copia:

```java
int[] a = {1, 2, 3};
int[] b = Arrays.copyOf(a, a.length);
```

🧠 Memoria:

```text
a ──→ [1][2][3]

b ──→ [1][2][3]
```

✔ `b` es un arreglo nuevo e independiente.

---

### 🔹 Copia con `clone()`

```java
int[] a = {1, 2, 3};
int[] b = a.clone();
```

🧠 Memoria:

```text
a ──→ [1][2][3]

b ──→ [1][2][3]
```

✔ `clone()` también crea un arreglo nuevo.

---

## 🔃 Invertir un arreglo

Invertir un arreglo significa colocar sus valores en el orden contrario.

Ejemplo:

```text
Original:  [8][4][9][5][7]
Invertido: [7][5][9][4][8]
```

Para hacerlo se necesita:

1. Un arreglo original
2. Un arreglo nuevo del mismo tamaño
3. Un contador que recorra uno de los arreglos en sentido contrario

---

### 🔹 Forma 1: recorrer el arreglo original de derecha a izquierda

```java
int[] arr = {8, 4, 9, 5, 7};

int cont = 0;
int[] arr2 = new int[arr.length];

for (int i = arr.length - 1; i >= 0; i--) {
    arr2[cont] = arr[i];
    cont++;
}

for (int i = 0; i < arr2.length; i++) {
    System.out.println(arr2[i]);
}
```

📌 En este ejemplo:

* `i` recorre `arr` de derecha a izquierda
* `cont` recorre `arr2` de izquierda a derecha

```text
i:     4  3  2  1  0
cont:  0  1  2  3  4
```

Resultado:

```text
[7][5][9][4][8]
```

---

### 🔹 Forma 2: recorrer el nuevo arreglo normalmente

```java
int[] arr = {8, 4, 9, 5, 7};

int cont = arr.length - 1;
int[] arr2 = new int[arr.length];

for (int i = 0; i < arr2.length; i++) {
    arr2[i] = arr[cont];
    cont--;
}

for (int i = 0; i < arr2.length; i++) {
    System.out.println(arr2[i]);
}
```

📌 En esta forma:

* `i` recorre `arr2` de izquierda a derecha
* `cont` recorre `arr` de derecha a izquierda

```text
i:     0  1  2  3  4
cont:  4  3  2  1  0
```

Resultado:

```text
[7][5][9][4][8]
```

📌 Se recomienda usar:

```java
cont = arr.length - 1;
```

En lugar de:

```java
cont = 4;
```

Así el código funciona aunque cambie el tamaño del arreglo.

---

## 🚨 Errores comunes

❌ Acceder fuera del rango:

```java
arr[10];
```

❌ Intentar cambiar el tamaño:

```java
arr.length = 10; // no permitido
```

❌ Olvidar que el primer índice es `0`

❌ Usar `i <= arr.length`

```java
for (int i = 0; i <= arr.length; i++) {
    System.out.println(arr[i]);
}
```

La condición correcta es:

```java
i < arr.length
```

❌ Pensar que `=` crea una copia independiente

❌ Escribir manualmente el último índice:

```java
int cont = 4;
```

✔ Es mejor usar:

```java
int cont = arr.length - 1;
```

---

## 🧠 Resumen clave

| Concepto | Explicación |
|---|---|
| `arr[i]` | Acceder a un elemento por su índice |
| `arr.length` | Obtener el tamaño del arreglo |
| `arr.length - 1` | Obtener el último índice |
| `new int[n]` | Crear un arreglo con `n` posiciones |
| `=` | Copiar la referencia, no los elementos |
| `for` | Recorrer o copiar elementos |
| `Arrays.copyOf()` | Crear una copia independiente |
| `clone()` | Crear una copia independiente |
| `i++` | Recorrer de izquierda a derecha |
| `i--` | Recorrer de derecha a izquierda |

---

## 🔥 Reglas de oro

👉 Los índices de un arreglo empiezan en `0`.

👉 El último índice siempre es `arr.length - 1`.

👉 Si se usa `=`, los dos nombres apuntan al mismo arreglo.

👉 Para una copia independiente se puede usar `for`, `Arrays.copyOf()` o `clone()`.

👉 Para invertir un arreglo, uno de los contadores debe recorrer las posiciones en sentido contrario.
