# 📘 Java Cheatsheet – Estructuras de Control y Operadores Lógicos

Clase: `Clase1_EstructurasDeControl_Condicionales`

---

## 🧠 CONDICIONALES (IF)

### 📌 ¿Qué hacen?
Permiten tomar decisiones en el programa.

```java
if (condicion) {
    // código que se ejecuta si es TRUE
}
```

### 🔍 Ejemplo

```java
boolean x = 1 > 2; // false
boolean y = 1 < 2; // true
```

✔ Las condiciones SIEMPRE regresan:
- `true`
- `false`

---

## 🔢 OPERADORES DE COMPARACIÓN

| Operador | Significado |
|----------|------------|
| `>`      | Mayor que |
| `<`      | Menor que |
| `>=`     | Mayor o igual |
| `<=`     | Menor o igual |
| `==`     | Igual |
| `!=`     | Diferente |

---

## ⚡ USO DE IF

```java
if (a >= b) {
    System.out.println("Se cumple a >= b");
}

if (a == b) {
    System.out.println("Se cumple a == b");
}
```

⚠️ **IMPORTANTE**
- `if` separados → pueden ejecutarse varios bloques

---

## 🔀 IF - ELSE

```java
if (a > b) {
    System.out.println("Se cumple a > b");
} else {
    System.out.println("No se cumple a > b");
}
```

✔ Solo ejecuta UNA opción

---

## 🔁 IF - ELSE IF

```java
if (a > b) {
    System.out.println("a > b");
} else if (a < b) {
    System.out.println("a < b");
} else if (a == b) {
    System.out.println("a == b");
} else {
    System.out.println("Ninguna condición se cumplió");
}
```

✔ Solo se ejecuta la primera condición verdadera  
✔ Se evalúa de arriba hacia abajo  

---

## 🔗 IF ANIDADOS

```java
if (a > b) {
    if (a > c) {
        System.out.println("A es mayor que B y C");
    }
}
```

---

## 🔘 Operadores booleanos en Java

| A | B | `&&` AND | `||` OR | `!A` NOT | `A ^ B` XOR |
|---|---|----------|---------|----------|-------------|
| T | T | T        | T       | F        | F           |
| T | F | F        | T       | F        | T           |
| F | T | F        | T       | T        | T           |
| F | F | F        | F       | T        | F           |

### 🔍 Ejemplos

```java
// AND
if (a > b && a > c) { }

// OR
if (a > b || a > c) { }

// NOT
if (!(x > 10)) { }
```

---

## ⚠️ PRECEDENCIA LÓGICA

Orden de evaluación:

1. `()`
2. `&&`
3. `||`

```java
// Ejemplo
if (a > b || (c > d && e > f)) { }
```

---

## ⚠️ NOTA IMPORTANTE

```java
// Primitivos
a == b
a != b

// Objetos (String, etc.)
texto1.equals(texto2)
```

---

## 🔀 SWITCH (CLÁSICO)

```java
switch (z) {
    case 1:
        System.out.println("Caso 1");
        break;
    case 2:
        System.out.println("Caso 2");
        break;
    default:
        System.out.println("Default");
}
```

---

## ⚡ SWITCH MODERNO (Java 14+)

```java
switch (z) {
    case 1 -> System.out.println("Caso 1");
    case 2 -> System.out.println("Caso 2");
    default -> System.out.println("Default");
}
```

---

## 🔁 SWITCH CON MÚLTIPLES CASOS

```java
switch (z) {
    case 5:
    case 6:
    case 7:
    case 8:
        System.out.println("Z es 5, 6, 7 u 8");
        break;
}
```

---

## 🚀 RESUMEN RÁPIDO

| Tema        | Clave |
|-------------|------|
| `if`        | Ejecuta si es TRUE |
| `else`      | Alternativa |
| `else if`   | Solo una condición |
| `&&`        | AND |
| `||`        | OR |
| `!`         | NOT |
| `switch`    | Alternativa a múltiples if |

---

💻 **Nivel:** Principiante  
📚 **Tema:** Lógica y control de flujo en Java
