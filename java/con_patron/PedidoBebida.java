public class PedidoBebida {
    private final TamanoBebida tamano;
    private final int cucharaditasAzucar;

    public PedidoBebida(TamanoBebida tamano, int cucharaditasAzucar) {
        this.tamano = tamano;
        this.cucharaditasAzucar = cucharaditasAzucar;
    }

    public TamanoBebida getTamano() {
        return tamano;
    }

    public int getCucharaditasAzucar() {
        return cucharaditasAzucar;
    }
}
