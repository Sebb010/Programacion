public abstract class FabricaCelulares{
	public abstract Procesador crearProcesador();
	public abstract Camara crearCamara();
	public abstract Pantalla crearPantalla();
	public abstract Bateria crearBateria();
	public abstract Celular crearCelular(Procesador procesador, Camara cámara, Pantalla pantalla, Bateria bsteria);
}