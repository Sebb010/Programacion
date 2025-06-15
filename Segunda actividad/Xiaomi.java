public class Xiaomi extends Celular{
	Xiaomi(Procesador procesador, Camara camara, Pantalla pantalla, Bateria bateria){
		super(procesador, camara, pantalla, bateria);
		System.out.println("El celular Xiaomi se ensambló correctamente.");
	}
	public void jugar(){
		System.out.println("El celular Xiaomi esta ejecutando un juego");
		getProcesador().aumentaRendimiento();
	}
	public void selfie(){
		System.out.println("El celular Xiaomi esta tomando una foto");
		getCamara().tomandoFoto();
	}
	public void pelicula(){
		System.out.println("El celular Xiaomi esta reproduciendo una pelicula");
		getPantalla().verVideo();
	}
	public void conectado(){
		System.out.println("El celular Xiaomi esta cargando su bateria");
		getBateria().cargando();
	}
}