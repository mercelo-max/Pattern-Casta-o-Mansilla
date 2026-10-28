public class PreparadorTe {
    private final PedidoBebida pedido;

    public PreparadorTe(PedidoBebida pedido) {
        this.pedido = pedido;
    }

    public void preparar() {
        // La secuencia general esta duplicada respecto de PreparadorCafe.
        System.out.println("=== Preparando te ===");
        System.out.println("Hirviendo " + pedido.getTamano().getMililitrosAgua() + " ml de agua");
        System.out.println("Colocando el saquito de te en la taza");
        System.out.println("Dejando infusionar durante 3 minutos");
        System.out.println("Sirviendo en una taza " + pedido.getTamano().getEtiqueta());
        if (pedido.getCucharaditasAzucar() > 0) {
            System.out.println("Agregando " + pedido.getCucharaditasAzucar() + " cucharadita(s) de azucar");
        } else {
            System.out.println("Sin azucar agregada");
        }
        System.out.println("Agregando una rodaja de limon");
        System.out.println("te listo: " + pedido.getTamano().getMililitrosAgua() + " ml de agua, "
                + pedido.getCucharaditasAzucar() + " cucharadita(s) de azucar.\n");
    }
}
