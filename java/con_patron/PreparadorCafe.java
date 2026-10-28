public class PreparadorCafe extends PreparadorBebida {
    public PreparadorCafe(PedidoBebida pedido) {
        super(pedido);
    }

    @Override
    protected String nombreBebida() {
        return "cafe";
    }

    @Override
    protected void prepararBase() {
        System.out.println("Colocando cafe molido en el filtro");
        System.out.println("Pasando agua caliente por el cafe");
    }

    @Override
    protected void agregarComplementos() {
        // Reutiliza la implementacion comun para manejar el azucar.
        super.agregarComplementos();
        System.out.println("Espolvoreando una pizca de canela");
    }
}
