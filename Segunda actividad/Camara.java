public abstract class Camara{
	private int resolucion;
	private String sensor;
	private String tipo;
	public abstract void tomandoFoto();
	public abstract void haciendoZoom();
	public void setResolucion(int resolucion){
		this.resolucion=resolucion;
	}
	public void setSensor(String sensor){
		this.sensor=sensor;
	}
	public void setTipo(String tipo){
		this.tipo=tipo;
	}
}