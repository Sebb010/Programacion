public abstract class Celular {
	private Procesador procesador;
	private Camara camara;
	private Pantalla pantalla;
	private Bateria bateria;
	public Celular(Procesador procesador, Camara camara, Pantalla pantalla, Bateria bateria){
		this.procesador = procesador;
		this.camara = camara;
		this.pantalla = pantalla;
		this.bateria = bateria;
	}
	public abstract void jugar();
	public Procesador getProcesador(){
		return procesador;
	}
	public abstract void selfie();
	public Camara getCamara(){
		return camara;
	}
	public abstract void pelicula();	
	public Pantalla getPantalla(){
		return pantalla;
	}
	public abstract void conectado();
	public Bateria getBateria(){
		return bateria;
	}   
}
