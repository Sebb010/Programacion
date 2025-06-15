public class Bateria46 extends Bateria{
	private int Capacidad;
	Bateria46(){
		Capacidad=4685;
		setTipo("Li-Ion");
		setCargaRapida(25);
	}
	public void cargando(){
		System.out.println("La batería del telefono esta cargando");
	}
	public void duracion(){
		System.out.println("La batería del telefono tiene una buena duración");
	}
}