public class Tablet {
    private String modelo;
    private boolean soporteLapiz;
    private int almacenamiento;
    private double peso;

    public Tablet(String modelo, boolean soporteLapiz, int almacenamiento, double peso) {
        this.modelo = modelo;
        this.soporteLapiz = soporteLapiz;
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }

    public void dibujar() {
        if (soporteLapiz)
            System.out.println(modelo + " permite dibujar con lápiz óptico.");
        else
            System.out.println(modelo + " no tiene soporte para lápiz.");
    }

    public void abrirLibro() {
        System.out.println(modelo + " abrió un libro digital.");
    }

    public void mostrarAlmacenamiento() {
        System.out.println(modelo + " tiene " + almacenamiento + "GB.");
    }

    public void mostrarPeso() {
        System.out.println(modelo + " pesa " + peso + " kg.");
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}
