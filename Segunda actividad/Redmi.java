public class Redmi extends Celular{
	Redmi(Procesador procesador, Camara camara, Pantalla pantalla, Bateria bateria){
		super(procesador, camara, pantalla, bateria);
		System.out.println("El celular Redmi se ensambló correctamente.");
	}
	public void jugar(){
		System.out.println("El celular Redmi esta ejecutando un juego");
		getProcesador().aumentaRendimiento();
	}
	public void selfie(){
		System.out.println("El celular Redmi esta tomando una foto");
		getCamara().tomandoFoto();
	}
	public void pelicula(){
		System.out.println("El celular Redmi esta reproduciendo una pelicula");
		getPantalla().verVideo();
	}
	public void conectado(){
		System.out.println("El celular Redmi esta cargando su bateria");
		getBateria().cargando();
	}
}