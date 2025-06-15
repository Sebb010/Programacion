public class Pantalla67 extends Pantalla{
	private double Tamaño;
	Pantalla67(){
		Tamaño=6.73;
		setTipo("AMOLED");
		setRelaconAspecto("20:9");
	}
	public void muestraImagen(){
		System.out.println("La pantalla muestra una imagen con buena resolución");
	}
	public void verVideo(){
		System.out.println("La pantalla esta reproduciendo un video con buena calidad");
	}
}