public class AppleA18Pro extends Procesador{
	private int nNucleos;
	AppleA18Pro(){
		nNucleos=6;
		setGPU("Apple A18 Pro GPU");
		setMarca("Apple");
		setFrecuencia("4050 MHz");
	}
	public void procesandoInformacion(){
		System.out.println("El procesador está procesando la información");
	}
	public void aumentaRendimiento(){
		System.out.println("El procesador está aumentando el rendimiento");
	}
}