# 📘 De IF a ciclo FOR en Java

## 🧠 Objetivo
Convertir una lógica basada en `if` (diagrama de flujo) en un ciclo `for`.

---

## 🔹 Paso 1: Lógica con IF (sin ciclo)
Se empieza con repetición manual:

```java
int n = 4;
int e = 0;

System.out.println(e);
e = e + 1;

if (e <= n) {
    // repetir manualmente
}
```
👉 Problema: no hay repetición automática.

---

## 🔹 Paso 2: Detectar patrón
Se identifica:
- Inicialización: `e = 0`
- Condición: `e <= n`
- Incremento: `e++`

👉 Esto indica necesidad de ciclo.

---

## 🔹 Paso 3: IF → FOR base

```java
for (; e <= n; ) {
    System.out.println(e);
    e++;
}
```
---

## 🔹 Paso 4: mover inicialización

```java
for (int e = 0; e <= n; ) {
    System.out.println(e);
    e++;
}
```
---

## 🔹 Paso 5: mover incremento (final)

```java
for (int e = 0; e <= n; e++) {
    System.out.println(e);
}
```
---

## 🚀 Resultado
0  
1  
2  
3  
4  

---

## 📌 Idea clave
Un `for` es la versión estructurada de un `if` repetido con:
- inicio
- condición
- actualización
