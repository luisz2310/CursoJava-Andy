# 📘 Tipos de Datos en Java

## 🧠 Concepto básico
En programación, los **tipos de datos** definen qué tipo de valor puede guardar una variable.

---

## 🔢 Tipos principales

### Números
- **Enteros** → sin decimales (`int`, `long`, etc.)
- **Decimales** → con decimales (`float`, `double`)

### Texto
- **char** → un solo carácter (`'A'`)
- **String** → palabras o frases (`"Hola"`)

### Booleanos
- Solo dos valores:
  - `true` (verdadero)
  - `false` (falso)

---

## 💾 Bits y representación

Un **bit** es la unidad más pequeña de información:
- Solo puede ser: `0` o `1`

### 🔢 Combinaciones

1 bit  → 2 valores  
2 bits → 4 valores  
3 bits → 8 valores  
4 bits → 16 valores  
8 bits → 256 valores  

📌 Regla general:
Cantidad de valores = 2^n

---

## ☕ Tipos de datos en Java

### 🔢 Enteros

| Tipo   | Tamaño | Uso recomendado |
|--------|--------|----------------|
| `byte`  | 8 bits  | Valores pequeños |
| `short` | 16 bits | Poco usado |
| `int`   | 32 bits | ⭐ Uso general (recomendado) |
| `long`  | 64 bits | Valores muy grandes |

---

### 🔢 Decimales

| Tipo    | Tamaño | Uso recomendado |
|---------|--------|----------------|
| `float`  | 32 bits | Menor precisión |
| `double` | 64 bits | ⭐ Uso general (más preciso) |

---

### 🔤 Texto

| Tipo     | Tamaño    | Descripción |
|----------|----------|------------|
| `char`   | 16 bits  | Un carácter |
| `String` | Variable | Texto |

Ejemplo:
char letra = 'W';

📌 Nota:
Cada carácter tiene un valor numérico interno:
'W' = 119

---

### ✅ Booleanos

| Tipo      | Valores |
|-----------|--------|
| `boolean` | `true` / `false` |

---

## ⚠️ Reglas importantes

- Usa `int` por defecto para enteros
- Usa `double` por defecto para decimales
- `char` usa comillas simples `' '`  
- `String` usa comillas dobles `" "`
- Toda variable debe tener un tipo

---

## 🎯 Objetivo

Entender:
- Qué tipo de dato usar en cada caso  
- Cómo se representan los datos en memoria  
- Diferencia entre números, texto y booleanos  