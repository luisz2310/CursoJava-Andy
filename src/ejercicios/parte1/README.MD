# 🧪 Ejercicios – Parte 1 (Condicionales y Ciclos)

Carpeta: `ejercicios/parte1/`

---

## 📂 Archivos

```bash
NumeroMayor.java
NumerosImpares.java
SumaPrimerosNnumeros.java
```

---

## 🧠 ¿Qué aprenderás?

- Comparación de valores (`if`, `else if`)
- Uso correcto de condicionales
- Operador módulo `%`
- Ciclos `for`

---

## 🔢 1. NumeroMayor.java

📌 Compara dos números y determina:

- Cuál es mayor
- O si son iguales

### 🔍 Conceptos clave:
- `if` vs `if - else if`
- Diferencia entre múltiples condiciones y una sola decisión

💡 **Importante:**
- `if` separados → pueden ejecutarse varios resultados  
- `else if` → solo un resultado (correcto)

---

## 🔁 2. NumerosImpares.java

📌 Determina si un número es:

- PAR
- IMPAR

### 🔍 Conceptos clave:
- Operador módulo `%`

```java
int residuo = numero % 2;
```

✔ Si `residuo == 0` → PAR  
✔ Si no → IMPAR  

---

## 🔄 3. SumaPrimerosNnumeros.java

📌 Imprime los números desde `0` hasta `N`

### 🔍 Conceptos clave:
- Construcción paso a paso de un `for`
- Uso de contador

```java
for (int e = 0; e <= n; e++) {
    System.out.println(e);
}
```

💡 Muestra cómo pasar de lógica manual → ciclo automático

---

## 🔄 Flujo recomendado

```text
1. NumeroMayor → entender decisiones
2. NumerosImpares → aplicar lógica
3. SumaPrimerosNnumeros → introducir ciclos
```

---

## 🚀 Cómo ejecutar

Cada archivo tiene su propio `main`:

```bash
javac NombreArchivo.java
java NombreArchivo
```

---

## 💡 Tip

Modifica los valores de entrada (`n`, `m`, `numero`) para probar diferentes casos.

---

💻 **Nivel:** Principiante  
📚 **Tema:** Lógica básica, condicionales y ciclos en Java