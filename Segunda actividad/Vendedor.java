public class Vendedor{
	public Celular comprarCelular(FabricaCelulares pedido){
		return pedido.crearCelular(pedido.crearProcesador(), pedido.crearCamara(), pedido.crearPantalla(), pedido.crearBateria());
	}
}