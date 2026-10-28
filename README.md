# Template Method en Java: preparación de café y té

Proyecto didáctico para un trabajo práctico de patrones de diseño. Muestra el problema original, la refactorización con Template Method y una prueba básica sin librerías externas.

## Requisitos
- JDK 8 o superior (el código usa características estándar de Java).
- Terminal o un IDE como IntelliJ IDEA, Eclipse o VS Code.

## Estructura
- `java/sin_patron/`: versión funcional con duplicación de secuencia.
- `java/con_patron/`: versión con Template Method, pedidos configurables y pruebas básicas.
- `uml/generico.puml`: UML genérico del patrón.
- `uml/ejemplo.puml`: UML del caso concreto, incluidas clases de apoyo.
- `practica/ejercicio_y_solucion.md`: práctica de 10 minutos y resolución.


## Ejecutar versión sin patrón
```bash
cd java/sin_patron
javac *.java
java Main

```


## Ejecutar versión con patrón
```bash
cd java/con_patron
javac *.java
java Main
```
El programa pregunta tipo de bebida, tamaño y cantidad de azúcar (0 a 4). Cada versión se ejecuta desde su propia carpeta para no mezclar clases `Main`.


## Qué observar en la comparación
Sin patrón, `PreparadorCafe.preparar()` y `PreparadorTe.preparar()` repiten inicio, calentamiento del agua, servido y cierre. Con Template Method, `PreparadorBebida.preparar()` fija una sola secuencia; las subclases definen `nombreBebida()` y `prepararBase()`, y adaptan el paso opcional `agregarComplementos()`.

## UML
Los archivos `.puml` son editables con PlantUML o pueden usarse como guía para redibujarlos con draw.io. Revisar que los diagramas coincidan con las clases finales antes de la entrega.

