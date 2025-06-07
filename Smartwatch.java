public class Smartwatch {
    private String modelo;
    private boolean resistenciaAgua;
    private int pasos;
    private boolean sensorFrecuencia;

    public Smartwatch(String modelo, boolean resistenciaAgua, int pasos, boolean sensorFrecuencia) {
        this.modelo = modelo;
        this.resistenciaAgua = resistenciaAgua;
        this.pasos = pasos;
        this.sensorFrecuencia = sensorFrecuencia;
    }

    public void contarPasos() {
        pasos += 1000;
        System.out.println(modelo + " ha contado " + pasos + " pasos.");
    }

    public void medirFrecuencia() {
        if (sensorFrecuencia)
            System.out.println(modelo + " está midiendo la frecuencia cardíaca.");
        else
            System.out.println(modelo + " no tiene sensor de frecuencia.");
    }

    public void mostrarResistencia() {
        System.out.println(modelo + " resistente al agua: " + resistenciaAgua);
    }

    public void mostrarHora() {
        System.out.println(modelo + " muestra la hora actual.");
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}
