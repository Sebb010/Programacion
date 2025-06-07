public class Smartphone {
    private String modelo;
    private String sistemaOperativo;
    private int bateria;
    private int camaras;

    public Smartphone(String modelo, String sistemaOperativo, int bateria, int camaras) {
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.bateria = bateria;
        this.camaras = camaras;
    }

    public void tomarFoto() {
        System.out.println(modelo + " tomó una foto con " + camaras + " cámaras.");
    }

    public void navegarInternet() {
        System.out.println(modelo + " está navegando por internet.");
    }

    public void cargarBateria() {
        bateria = 100;
        System.out.println(modelo + " batería cargada al 100%.");
    }

    public void mostrarSO() {
        System.out.println(modelo + " usa " + sistemaOperativo + ".");
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}
