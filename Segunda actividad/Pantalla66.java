public class Pantalla66 extends Pantalla{
	private double Tamaño;
	Pantalla66(){
		Tamaño=6.67;
		setTipo("OLED");
		setRelaconAspecto("20:9");
	}
	public void muestraImagen(){
		System.out.println("La pantalla muestra una imagen con buena resolución");
	}
	public void verVideo(){
		System.out.println("La pantalla esta reproduciendo un video con buena calidad");
	}
}