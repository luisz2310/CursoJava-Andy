# 📘 Java Cheatsheet – Arreglos (Arrays)

## 🧠 Descripción
Los arreglos en Java almacenan múltiples valores del mismo tipo en una sola variable. Son fundamentales para ciclos, algoritmos y manejo de datos.

## 🎯 Objetivo
Aprender a declarar, inicializar, acceder, modificar y recorrer arreglos usando índices y `length`.

---

## 📦 Concepto
Un arreglo guarda valores en posiciones llamadas índices:
- Empiezan en 0
- Terminan en length - 1

Ejemplo:
int[] numeros = {1, 2, 3, 4, 5};

---

## 🧱 Declaración e inicialización
int[] arr;  
int[] arr1 = {1, 2, 3, 4};  
int[] arr2 = new int[5]; // {0,0,0,0,0}

---

## 📏 Tamaño del arreglo (length)
int[] arr = {1, 2, 3};
System.out.println(arr.length);

📌 El tamaño es fijo y no se puede cambiar.

---

## 🎯 Acceso a elementos
int[] arr = {10, 20, 30};

arr[0]; // 10  
arr[2]; // 30  

❌ Error:
arr[10]; // fuera de rango

---

## ✏️ Modificar valores
int[] arr = {1, 2, 3};

arr[0] = 100;
arr[2] = 999;

---

## 🔁 Recorrer arreglo
int[] arr = {1, 2, 3, 4, 5};

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

---

## 🧠 Ejemplo completo
int[] arr = {1, 2, 3, 4, 5};

for (int i = 0; i < arr.length; i++) {
    arr[i] = i * 10;
}

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

---

## 🚨 Errores comunes
- Acceder fuera de rango (arr[10])
- Intentar cambiar tamaño (arr.length = 10 ❌)
- Índices empiezan en 0

---

## 🧪 Ejercicios
- Encontrar el número mayor en un arreglo
- Sumar todos los elementos
- Llenar arreglo del 1 al 10 con for

---

## 🚀 Conclusión
Los arreglos son base fundamental en Java para manejar colecciones de datos y construir algoritmos eficientes.