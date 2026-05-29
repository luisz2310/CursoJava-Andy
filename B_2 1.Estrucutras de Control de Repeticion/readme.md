# 🔁 Repetición (Estructuras de Control)

Parte de: `estructuras_de_control`

---

## 🧠 ¿Qué es?

Permiten ejecutar un bloque de código varias veces según una condición.

---

## 🔹 Tipos de ciclos

### 📌 while

* Se ejecuta **mientras la condición sea verdadera**
* Puede no ejecutarse nunca

```java
while (condicion) {
    // código
}
```

---

### 📌 do-while

* Se ejecuta **al menos una vez**

```java
do {
    // código
} while (condicion);
```

---

### 📌 for

* Se usa cuando sabes cuántas veces repetir

```java
for (inicio; condicion; incremento) {
    // código
}
```

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

---

## ⚡ Resumen

* `while` → repite mientras se cumpla condición
* `do-while` → ejecuta al menos una vez
* `for` → repeticiones controladas
