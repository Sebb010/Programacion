public class Cuadcamara50 extends Camara{
	private int nCamaras;
	Cuadcamara50(){
		nCamaras=4;
		setResolucion(50);
		setSensor("Sony LYT-900");
		setTipo("CMOS");
	}
	public void tomandoFoto(){
		System.out.println("Las cámaras del dispositivo están tomando una foto");
	}
	public void haciendoZoom(){
		System.out.println("Las cámaras están haciendo zoom a un objetivo");
	}
}