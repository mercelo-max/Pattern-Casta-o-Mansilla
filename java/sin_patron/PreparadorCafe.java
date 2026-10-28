public class PreparadorCafe {
    private final PedidoBebida pedido;

    public PreparadorCafe(PedidoBebida pedido) {
        this.pedido = pedido;
    }

    public void preparar() {
        // Estos pasos se repiten en PreparadorTe.
        System.out.println("=== Preparando cafe ===");
        System.out.println("Hirviendo " + pedido.getTamano().getMililitrosAgua() + " ml de agua");
        System.out.println("Colocando cafe molido en el filtro");
        System.out.println("Pasando agua caliente por el cafe");
        System.out.println("Sirviendo en una taza " + pedido.getTamano().getEtiqueta());
        if (pedido.getCucharaditasAzucar() == 0) {
            System.out.println("Sin azucar agregada");
        } else {
            System.out.println("Agregando " + pedido.getCucharaditasAzucar() + " cucharadita(s) de azucar");
        }
        System.out.println("Espolvoreando una pizca de canela");
        System.out.println("cafe listo: " + pedido.getTamano().getMililitrosAgua() + " ml de agua, "
                + pedido.getCucharaditasAzucar() + " cucharadita(s) de azucar.\n");
    }
}
