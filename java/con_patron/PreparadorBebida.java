/**
 * Clase abstracta que concentra el flujo comun de preparacion.
 * Las subclases completan los pasos especificos de cada bebida.
 */
public abstract class PreparadorBebida {
    private final PedidoBebida pedido;

    public PreparadorBebida(PedidoBebida pedido) {
        this.pedido = pedido;
    }

    /** Template Method: fija el orden del algoritmo y no se sobrescribe. */
    public final void preparar() {
        mostrarInicio();
        hervirAgua();
        prepararBase();
        servirEnTaza();
        agregarComplementos();
        mostrarResumen();
    }

    private void mostrarInicio() {
        System.out.println("=== Preparando " + nombreBebida() + " ===");
    }

    private void hervirAgua() {
        System.out.println("Hirviendo " + pedido.getTamano().getMililitrosAgua() + " ml de agua");
    }

    /** Paso abstracto: cada subclase define como preparar su base. */
    protected abstract void prepararBase();

    private void servirEnTaza() {
        System.out.println("Sirviendo en una taza " + pedido.getTamano().getEtiqueta());
    }

    /** Paso opcional con comportamiento comun que las subclases pueden ampliar. */
    protected void agregarComplementos() {
        if (pedido.getCucharaditasAzucar() == 0) {
            System.out.println("Sin azucar agregada");
        } else {
            System.out.println("Agregando " + pedido.getCucharaditasAzucar()
                    + " cucharadita(s) de azucar");
        }
    }

    private void mostrarResumen() {
        System.out.println(nombreBebida() + " listo: "
                + pedido.getTamano().getMililitrosAgua() + " ml de agua, "
                + pedido.getCucharaditasAzucar() + " cucharadita(s) de azucar.\n");
    }

    protected abstract String nombreBebida();

    protected PedidoBebida getPedido() {
        return pedido;
    }
}
