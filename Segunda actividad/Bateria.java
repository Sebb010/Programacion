public abstract class Bateria{
	private String tipo;
	private int cargaRapida;
	public abstract void cargando();
	public abstract void duracion();
	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	public void setCargaRapida(int cargaRapida){
		this.cargaRapida=cargaRapida;
	}
}