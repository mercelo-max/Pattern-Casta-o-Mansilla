import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Preparador de bebidas con Template Method");
        System.out.println("1. Cafe");
        System.out.println("2. Te");
        System.out.print("Elegir bebida: ");
        int bebida = teclado.nextInt();
        System.out.println("Tamano: 1. Chico (150 ml), 2. Mediano (250 ml), 3. Grande (350 ml)");
        System.out.print("Elegir tamano: ");
        TamanoBebida tamano = TamanoBebida.desdeOpcion(teclado.nextInt());
        System.out.print("Cucharaditas de azucar (0 a 4): ");
        int azucar = teclado.nextInt();

        if (tamano == null || azucar < 0 || azucar > 4) {
            System.out.println("Entrada invalida. Usa un tamano del 1 al 3 y azucar de 0 a 4.");
        } else {
            PedidoBebida pedido = new PedidoBebida(tamano, azucar);
            PreparadorBebida preparador = null;
            if (bebida == 1) preparador = new PreparadorCafe(pedido);
            else if (bebida == 2) preparador = new PreparadorTe(pedido);
            else System.out.println("Opcion de bebida invalida.");
            if (preparador != null) preparador.preparar();
        }
        teclado.close();
    }
}
