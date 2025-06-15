public abstract class Pantalla{
	private String tipo;
	private String relacionAspecto;
	public abstract void muestraImagen();
	public abstract void verVideo();
	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	public void setRelaconAspecto(String relacionAspecto){
		this.relacionAspecto=relacionAspecto;
	}
}