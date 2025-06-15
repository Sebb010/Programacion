public class Tricamara108 extends Camara{
	private int nCamaras;
	Tricamara108(){
		nCamaras=3;
		setResolucion(108);
		setSensor("Samsung HM6");
		setTipo("ISOCELL");
	}
	public void tomandoFoto(){
		System.out.println("Las cámaras del dispositivo están tomando una foto");
	}
	public void haciendoZoom(){
		System.out.println("Las cámaras están haciendo zoom a un objetivo");
	}
}