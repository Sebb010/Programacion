public class Cuadcamara48 extends Camara{
	private int nCamaras;
	Cuadcamara48(){
		nCamaras=4;
		setResolucion(48);
		setSensor("Sony IMX903");
		setTipo("CMOS");
	}
	public void tomandoFoto(){
		System.out.println("Las cámaras del dispositivo están tomando una foto");
	}
	public void haciendoZoom(){
		System.out.println("Las cámaras están haciendo zoom a un objetivo");
	}
}