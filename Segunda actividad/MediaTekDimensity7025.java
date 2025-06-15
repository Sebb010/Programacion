public class MediaTekDimensity7025 extends Procesador{
	private int nNucleos;
	MediaTekDimensity7025(){
		nNucleos=8;
		setGPU("IMG BXM-8-256");
		setMarca("MediaTek");
		setFrecuencia("2500 MHz");
	}
	public void procesandoInformacion(){
		System.out.println("El procesador está procesando la información");
	}
	public void aumentaRendimiento(){
		System.out.println("El procesador está aumentando el rendimiento");
	}
}