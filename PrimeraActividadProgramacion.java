public class PrimeraActividadProgramacion {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("iPhone 14", "iOS", 80, 2);
        Smartphone s2 = new Smartphone("Galaxy S22", "Android", 70, 4);
        Smartphone s3 = new Smartphone("Redmi Note", "MIUI", 60, 3);
        Smartphone s4 = new Smartphone("Motorola G60", "Android", 75, 3);

        s1.tomarFoto(); s2.navegarInternet(); s3.cargarBateria(); s4.mostrarSO();

        Portatil p1 = new Portatil("HP Pavilion", 15.6, 16, true);
        Portatil p2 = new Portatil("Dell XPS", 13.3, 32, true);
        Portatil p3 = new Portatil("Acer Aspire", 14.0, 8, false);
        Portatil p4 = new Portatil("Lenovo ThinkPad", 14.0, 16, true);

        p1.compilarCodigo(); p2.activarTeclado(); p3.usarPantalla(); p4.ejecutarIDE();

        Tablet t1 = new Tablet("iPad Pro", true, 128, 0.5);
        Tablet t2 = new Tablet("Tab S8", true, 256, 0.6);
        Tablet t3 = new Tablet("MatePad", false, 64, 0.45);
        Tablet t4 = new Tablet("Lenovo Tab M10", false, 32, 0.52);

        t1.dibujar(); t2.abrirLibro(); t3.mostrarAlmacenamiento(); t4.mostrarPeso();

        Smartwatch w1 = new Smartwatch("Watch Series 8", true, 2000, true);
        Smartwatch w2 = new Smartwatch("Galaxy Watch 5", true, 3000, true);
        Smartwatch w3 = new Smartwatch("Fitbit Charge 5", false, 1500, false);
        Smartwatch w4 = new Smartwatch("Garmin Vivoactive", true, 4000, true);

        w1.contarPasos(); w2.medirFrecuencia(); w3.mostrarResistencia(); w4.mostrarHora();
    }
}
