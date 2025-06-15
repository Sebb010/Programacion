public abstract class Procesador{
	private String gpu;
	private String marca;
	private String frecuencia;
	public abstract void procesandoInformacion();
	public abstract void aumentaRendimiento();
	public void setGPU(String gpu){
		this.gpu=gpu;
	}
	public void setMarca(String marca){
		this.marca=marca;
	}
	public void setFrecuencia(String frecuencia){
		this.frecuencia=frecuencia;
	}
}