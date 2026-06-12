# 📘 Java Cheatsheet – Arreglos (Arrays)

## 🧠 ¿Qué es un arreglo?
Un arreglo (array) en Java es una estructura de datos que almacena múltiples valores del **mismo tipo** en una sola variable. Cada valor se guarda en una posición llamada **índice**.

📌 Características clave:
- Todos los elementos son del mismo tipo
- Tamaño fijo (no cambia después de crearse)
- Acceso por índices
- Empiezan en 0

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

📌 Resultado arr2:

```java
{0, 0, 0, 0, 0}
```

---

## 📏 Propiedad length (tamaño)

```java
int[] arr = {5, 10, 15};

System.out.println(arr.length); // 3
```

📌 IMPORTANTE:
- length es fijo
- no se puede modificar
- representa la cantidad de elementos

---

## 🎯 Índices del arreglo

```java
int[] arr = {10, 20, 30};
```

```bash
arr[0] → 10
arr[1] → 20
arr[2] → 30
```

📌 Regla clave:
Último índice = length - 1

❌ Error común:

```java
arr[3]; // fuera de rango → error en runtime
```

---

## ✏️ Modificar valores

```java
int[] arr = {1, 2, 3};

arr[0] = 100;
arr[2] = 999;
```

📌 El arreglo cambia directamente en memoria.

---

## 🔁 Recorrer un arreglo

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

📌 Esto permite acceder a todos los elementos uno por uno.

---

## ⚡ Uso típico con for

✔ Leer datos  
✔ Modificar valores  
✔ Buscar elementos  
✔ Calcular suma o máximos  

---

## 🧠 Ejemplo completo (modificación + impresión)

```java
int[] arr = {1, 2, 3, 4, 5};

// modificar valores
for (int i = 0; i < arr.length; i++) {
    arr[i] = i * 10;
}

// imprimir resultados
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

## 🚨 Errores comunes

❌ Acceder fuera del rango:

```java
arr[10];
```
❌ Intentar cambiar tamaño:

```java
arr.length = 10; // NO permitido
```
❌ Olvidar que inicia en 0

---
