public class Apple extends Celular{
	Apple(Procesador procesador, Camara camara, Pantalla pantalla, Bateria bateria){
		super(procesador, camara, pantalla, bateria);
		System.out.println("El celular Apple se ensambló correctamente.");
	}
	public void jugar(){
		System.out.println("El celular Apple esta ejecutando un juego");
		getProcesador().aumentaRendimiento();
	}
	public void selfie(){
		System.out.println("El celular Apple esta tomando una foto");
		getCamara().tomandoFoto();
	}
	public void pelicula(){
		System.out.println("El celular Apple esta reproduciendo una pelicula");
		getPantalla().verVideo();
	}
	public void conectado(){
		System.out.println("El celular Apple esta cargando su bateria");
		getBateria().cargando();
	}
}