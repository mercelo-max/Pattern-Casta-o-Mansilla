public class PreparadorTe extends PreparadorBebida {
    public PreparadorTe(PedidoBebida pedido) {
        super(pedido);
    }

    @Override
    protected String nombreBebida() {
        return "te";
    }

    @Override
    protected void prepararBase() {
        System.out.println("Colocando el saquito de te en la taza");
        System.out.println("Dejando infusionar durante 3 minutos");
    }

    @Override
    protected void agregarComplementos() {
        // Primero se mantiene el comportamiento comun del azucar.
        super.agregarComplementos();
        System.out.println("Agregando una rodaja de limon");
    }
}
