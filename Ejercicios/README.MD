# 📘 Java Cheatsheet – Ejercicios Parte 1

Este documento contiene ejemplos básicos de lógica en Java:
- Comparaciones (`if`, `else if`)
- Números pares e impares
- Ciclos `for`

---

## 🔹 1. NumeroMayor.java

### 📌 ¿Qué hace?
Compara dos números y determina:
- cuál es mayor
- o si son iguales

### 🧠 Conceptos clave
- `if` separados → evalúa TODAS las condiciones
- `if - else if` → SOLO ejecuta la primera verdadera

### ⚠️ Diferencia importante

```java
// ❌ Puede imprimir múltiples resultados
if (n > m) { ... }
if (n < m) { ... }

// ✅ Solo un resultado correcto
if (n > m) { ... }
else if (n < m) { ... }
else { ... }
```

### 💡 Idea clave
Usa `else if` cuando quieras **solo un resultado**

---

## 🔹 2. NumerosImpares.java

### 📌 ¿Qué hace?
Determina si un número es:
- PAR
- IMPAR

### 🧠 Concepto clave
Uso del operador módulo `%`

```java
int residuo = numero % 2;
```

### 📊 Regla

| Resultado | Significado |
|----------|------------|
| `0`      | PAR        |
| `1`      | IMPAR      |

### ✅ Ejemplo

```java
if (residuo == 0) {
    System.out.println("PAR");
} else {
    System.out.println("IMPAR");
}
```

---

## 🔹 3. SumaPrimerosNnumeros.java

### 📌 ¿Qué hace?
Imprime números desde `0` hasta `N` usando un ciclo `for`

---

### 🧠 Evolución del FOR

#### 🔸 Forma final (correcta y limpia)

```java
for (int e = 0; e <= n; e++) {
    System.out.println(e);
}
```

---

### 🔍 Partes del `for`

```java
for (inicialización; condición; incremento)
```

| Parte           | Ejemplo        | Significado              |
|----------------|---------------|--------------------------|
| Inicialización | `int e = 0`   | Empieza el contador      |
| Condición      | `e <= n`      | Hasta dónde llega        |
| Incremento     | `e++`         | Cómo avanza              |

---

## 🚀 Resumen Rápido

| Tema            | Clave                          |
|-----------------|--------------------------------|
| `if`            | Evalúa condiciones             |
| `else if`       | Solo una condición se ejecuta  |
| `%`             | Obtiene residuo                |
| `for`           | Repite código automáticamente  |

---

## 🧠 Tips importantes

- Usa `else if` para evitar múltiples resultados
- `% 2` es la forma estándar de saber si un número es par
- `for` es ideal cuando sabes cuántas veces repetir algo

---

💻 **Nivel:** Principiante  
📚 **Tema:** Fundamentos de lógica en Java