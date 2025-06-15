public class Bateria51 extends Bateria{
	private int Capacidad;
	Bateria51(){
		Capacidad=5110;
		setTipo("Li-Polymer");
		setCargaRapida(45);
	}
	public void cargando(){
		System.out.println("La batería del telefono esta cargando");
	}
	public void duracion(){
		System.out.println("La batería del telefono tiene una buena duración");
	}
}