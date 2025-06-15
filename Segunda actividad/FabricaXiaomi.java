public class FabricaXiaomi extends FabricaCelulares{
	public Procesador crearProcesador(){
		return new QualcommSnapdragon8Gen3();
	}
	public Camara crearCamara(){
		return new Cuadcamara50();
	}
	public Pantalla crearPantalla(){
		return new Pantalla67();
	}
	public Bateria crearBateria(){
		return new Bateria53();
	}
	public Celular crearCelular(Procesador procesador, Camara camara, Pantalla pantalla, Bateria bateria){
		return new Xiaomi(procesador, camara, pantalla, bateria);
	}
}