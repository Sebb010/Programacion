public class QualcommSnapdragon8Gen3 extends Procesador{
	private int nNucleos;
	QualcommSnapdragon8Gen3(){
		nNucleos=8;
		setGPU("Adreno 750");
		setMarca("Qualcomm");
		setFrecuencia("3300 MHz");
	}
	public void procesandoInformacion(){
		System.out.println("El procesador está procesando la información");
	}
	public void aumentaRendimiento(){
		System.out.println("El procesador está aumentando el rendimiento");
	}
}