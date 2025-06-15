public class FabricaRedmi extends FabricaCelulares{
	public Procesador crearProcesador(){
		return new MediaTekDimensity7025();
	}
	public Camara crearCamara(){
		return new Tricamara108();
	}
	public Pantalla crearPantalla(){
		return new Pantalla66();
	}
	public Bateria crearBateria(){
		return new Bateria51();
	}
	public Celular crearCelular(Procesador procesador, Camara camara, Pantalla pantalla, Bateria bateria){
		return new Redmi(procesador, camara, pantalla, bateria);
	}
}