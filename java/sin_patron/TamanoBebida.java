public enum TamanoBebida {
    CHICO(150, "chica"),
    MEDIANO(250, "mediana"),
    GRANDE(350, "grande");

    private final int mililitrosAgua;
    private final String etiqueta;

    TamanoBebida(int mililitrosAgua, String etiqueta) {
        this.mililitrosAgua = mililitrosAgua;
        this.etiqueta = etiqueta;
    }

    public int getMililitrosAgua() {
        return mililitrosAgua;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public static TamanoBebida desdeOpcion(int opcion) {
        switch (opcion) {
            case 1: return CHICO;
            case 2: return MEDIANO;
            case 3: return GRANDE;
            default: return null;
        }
    }
}
