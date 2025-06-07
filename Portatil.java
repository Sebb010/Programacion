public class Portatil {
    private String modelo;
    private double pantalla;
    private int ram;
    private boolean tecladoRGB;

    public Portatil(String modelo, double pantalla, int ram, boolean tecladoRGB) {
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.ram = ram;
        this.tecladoRGB = tecladoRGB;
    }

    public void compilarCodigo() {
        System.out.println(modelo + " está compilando código con " + ram + "GB de RAM.");
    }

    public void activarTeclado() {
        System.out.println(modelo + " teclado retroiluminado: " + tecladoRGB);
    }

    public void usarPantalla() {
        System.out.println(modelo + " tiene pantalla de " + pantalla + " pulgadas.");
    }

    public void ejecutarIDE() {
        System.out.println(modelo + " ejecutó un entorno de desarrollo.");
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}
