# 💳 Simulador de Compras con Tarjeta de Crédito

Este proyecto fue realizado como parte de un desafío del curso de Alura Latam. Se trata de un programa en Java que simula el uso de una tarjeta de crédito: permite registrar compras hasta alcanzar el límite disponible, mostrando el historial y el saldo restante.

## 🧠 ¿Qué se aprende?

- Programación orientada a objetos en Java.
- Manejo de listas y colecciones.
- Uso de clases, atributos, métodos y encapsulamiento.
- Comparación y ordenamiento de objetos con `Comparable`.
- Interacción con el usuario mediante consola.

## 🚀 Cómo ejecutar el programa

1. Asegúrate de tener instalado [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Clona este repositorio:
   ```bash
   git clone https://github.com/ivanfr12/Aplicacion_compras_Alura_latam.git

Compila los archivos .java:
javac Principal.java Compra.java TarjetaDeCredito.java

Ejecuta el programa:
java Principal

🧾 Funcionamiento
El usuario ingresa el límite de crédito.

Luego, puede ingresar múltiples compras (descripción y valor).

Si hay saldo disponible, la compra se realiza.

Si el saldo no alcanza, se detiene la ejecución.

Finalmente, se muestran todas las compras realizadas en orden ascendente por valor y el saldo restante

📁 Archivos principales
Compra.java: Representa una compra con valor y descripción.

TarjetaDeCredito.java: Maneja el límite, el saldo y la lista de compras.

Principal.java: Contiene la lógica principal y la interacción con el usuario.

🛠 Ejemplo de uso

Escriba el limite de la tarjeta: 
1000
Escriba la descripción de la compra: 
Zapatos
Escriba el valor de la compra: 
300
Compra realizada!
Escriba 0 para salir o 1 para continuar
1
Escriba la descripción de la compra: 
Libro
Escriba el valor de la compra: 
800
Saldo insuficiente!
