# Bank Account Core & Transaction Engine (Java)

Este repositorio contiene un módulo de backend desarrollado en **Java**, diseñado para modelar y gestionar las operaciones nucleares de un sistema bancario (*Core Banking*). El proyecto aplica de forma estricta los pilares de la **Programación Orientada a Objetos (POO)** para resolver de manera segura flujos transaccionales críticos, tales como aperturas de cuentas, depósitos, retiros y validaciones de fondos.

## 🚀 Características y Capacidades Técnicas

* **Modelado de Entidades Financieras:** Estructuración robusta de clases orientadas a objetos (como `CuentaBancaria`, `Cliente`) garantizando una alta cohesión en la lógica del negocio.
* **Motor Transaccional Seguro:** Métodos encapsulados para el procesamiento de transacciones financieras, controlando condiciones de saldo e impidiendo operaciones inválidas (como retiros mayores al saldo disponible o depósitos negativos).
* **Encapsulamiento Avanzado:** Restricción estricta del acceso directo a los estados financieros de las cuentas, asegurando que cualquier mutación de saldo se realice exclusivamente a través de reglas de negocio autorizadas.
* **Extensiones Financieras:** Lógica para cuentas corrientes con autorización de sobregiro, cálculo de tasas de interés, generación de números de cuenta únicos.

## 🛠️ Stack Tecnológico

* **Lenguaje Principal:** Java (JDK 8 / 11 / 17 o superior)
* **Paradigma:** Programación Orientada a Objetos (POO)
* **IDE de Desarrollo:** Visual Code.
* **Gestor de Construcción:** Gradle.

## ⚙️ Principios de Ingeniería y Solución de Problemas

El desarrollo de este motor bancario se diseñó bajo estándares de software que priorizan la integridad de los datos:

1. **Inmutabilidad y Consistencia de Saldo:** Los atributos críticos (como el saldo y el identificador de la cuenta) están protegidos mediante modificadores de acceso privados. No existen métodos de mutación directa (*Setters*) para el saldo, obligando al sistema a pasar por flujos de validación antes de consolidar un cambio.
2. **Abstracción del Negocio:** La lógica encargada de validar las reglas bancarias se encuentra completamente aislada de cualquier interfaz de entrada o salida por consola. Esto permite que el núcleo del software sea 100% reutilizable para escalar hacia una API REST con Spring Boot.
3. **Tratamiento de Excepciones de Negocio:** Implementación de estructuras de control o excepciones personalizadas para gestionar de forma elegante los intentos de transacciones fallidas, evitando el colapso del sistema (*runtime crashes*).

## 🔧 Configuración y Ejecución Local

Para compilar, auditar o ejecutar este componente backend en tu máquina local, sigue estos pasos:

1. **Clonar el repositorio:**
```bash
   git clone [https://github.com/longaresf/bank-account-core-java.git](https://github.com/longaresf/bank-account-core-java.git)
```
2. Ingresar al directorio del proyecto:
  Bash
  cd bank-account-core-java

3. Compilación y Ejecución (Consola):
  Compila las clases de Java:

  Bash
  javac Main.java
     ```
* Ejecuta el programa compilado:
  ```bash
     java Main
  ```
   *(Nota: Si tu clase principal con el método `public static void main` tiene otro nombre, reemplaza `Main` por el correspondiente).*

4. **Ejecución en IDE (Recomendado):**
   * Importa el directorio en tu IDE preferido (IntelliJ IDEA, Eclipse o VS Code).
   * Localiza la clase principal y ejecuta el entorno de pruebas para validar las transacciones por consola.

## ✒️ Autor

* **Francisco Longares** - *Desarrollador Backend* - [longaresf](https://github.com/longaresf)
