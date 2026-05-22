# 📘 Operadores en Java

Este README resume los **operadores aritméticos, relacionales y lógicos** en Java.

---

## 🔢 Operadores Aritméticos

Se usan para realizar operaciones matemáticas:

```java
int a = 10;
int b = 5;

int suma = a + b;   // 15
int resta = a - b;  // 5
int mult = a * b;   // 50
int div = a / b;    // 2
int mod = a % b;    // 0 (residuo)
```
### Operadores:
- `+` → suma  
- `-` → resta  
- `*` → multiplicación  
- `/` → división  
- `%` → módulo  

---

## ⚖️ Operadores Relacionales

Se usan para comparar valores (devuelven true o false):

```java
int x = 10;
int y = 5;

x > y   // true
x < y   // false
x >= y  // true
x <= y  // false
x == y  // false
x != y  // true
```
### Operadores:
- `>`  → mayor que  
- `<`  → menor que  
- `>=` → mayor o igual que  
- `<=` → menor o igual que  
- `==` → igual a  
- `!=` → diferente de  

---

## 🧠 Operadores Lógicos

Se usan para combinar condiciones:

```java
boolean a = true;
boolean b = false;

a && b  // AND → false
a || b  // OR  → true
!a      // NOT → false
```
### Operadores:
- `&&` → AND (y)  
- `||` → OR (o)  
- `!`  → NOT (negación)  

---

## ✅ Ejemplo combinado

```java
int edad = 20;

if (edad >= 18 && edad < 65) {
    System.out.println("Es adulto");
}
```