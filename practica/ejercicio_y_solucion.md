# Ejercicio de práctica: Template Method (10 minutos)

## Consigna para los compañeros
Un sistema prepara dos tipos de sándwich: vegetariano y de pollo. Ambos deben seguir el mismo orden:

1. Preparar el pan.
2. Preparar el relleno (cambia según el sándwich).
3. Armar el sándwich.
4. Agregar salsa (paso opcional que puede cambiar).
5. Mostrar “Sándwich listo”.

Creá una clase abstracta `PreparadorSandwich` con un método plantilla `preparar()` que defina ese orden. Después creá `SandwichVegetariano` y `SandwichPollo`. Añadí una clase `Main` para ejecutar ambos. El método `preparar()` debe ser `final`.

## Pistas
- Usá métodos privados para los pasos comunes.
- Usá un método abstracto para el relleno.
- Usá un paso opcional con implementación vacía o por defecto para la salsa.
- No uses bibliotecas externas.

## Resolución sugerida
Guardá este código como `Main.java` y ejecutá `javac Main.java` y `java Main`.

```java
abstract class PreparadorSandwich {
    public final void preparar() {
        prepararPan();
        prepararRelleno();
        armar();
        agregarSalsa();
        System.out.println("Sandwich listo.\n");
    }

    private void prepararPan() {
        System.out.println("Preparando pan");
    }

    protected abstract void prepararRelleno();

    private void armar() {
        System.out.println("Armando sandwich");
    }

    protected void agregarSalsa() {
        // La implementación por defecto no agrega salsa.
    }
}

class SandwichVegetariano extends PreparadorSandwich {
    @Override
    protected void prepararRelleno() {
        System.out.println("Agregando vegetales y queso");
    }

    @Override
    protected void agregarSalsa() {
        System.out.println("Agregando salsa de yogur");
    }
}

class SandwichPollo extends PreparadorSandwich {
    @Override
    protected void prepararRelleno() {
        System.out.println("Agregando pollo y lechuga");
    }

    @Override
    protected void agregarSalsa() {
        System.out.println("Agregando mayonesa");
    }
}

public class Main {
    public static void main(String[] args) {
        PreparadorSandwich vegetariano = new SandwichVegetariano();
        PreparadorSandwich pollo = new SandwichPollo();
        vegetariano.preparar();
        pollo.preparar();
    }
}
```

## Qué debe demostrar la solución
- Los dos sándwiches respetan el mismo orden.
- El relleno y la salsa cambian por subclase.
- El código común no está duplicado.
- Las subclases no pueden sobrescribir `preparar()` porque es `final`.
