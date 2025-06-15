public class Bateria53 extends Bateria{
	private int Capacidad;
	Bateria53(){
		Capacidad=5300;
		setTipo("Li-Polymer");
		setCargaRapida(90);
	}
	public void cargando(){
		System.out.println("La batería del telefono esta cargando");
	}
	public void duracion(){
		System.out.println("La batería del telefono tiene una buena duración");
	}
}