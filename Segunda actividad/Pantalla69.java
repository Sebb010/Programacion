public class Pantalla69 extends Pantalla{
	private double Tamaño;
	Pantalla69(){
		Tamaño=6.9;
		setTipo("OLED");
		setRelaconAspecto("19.5:9");
	}
	public void muestraImagen(){
		System.out.println("La pantalla muestra una imagen con buena resolución");
	}
	public void verVideo(){
		System.out.println("La pantalla esta reproduciendo un video con buena calidad");
	}
}