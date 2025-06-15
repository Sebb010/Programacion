public class FabricaApple extends FabricaCelulares{
	public Procesador crearProcesador(){
		return new AppleA18Pro();
	}
	public Camara crearCamara(){
		return new Cuadcamara48();
	}
	public Pantalla crearPantalla(){
		return new Pantalla69();
	}
	public Bateria crearBateria(){
		return new Bateria46();
	}
	public Celular crearCelular(Procesador procesador, Camara camara, Pantalla pantalla, Bateria bateria){
		return new Apple(procesador, camara, pantalla, bateria);
	}
}