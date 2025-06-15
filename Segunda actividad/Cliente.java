import java.util.Scanner;
public class Cliente{
	public static void main(String args[]){
		Celular click;
		Vendedor juan = new Vendedor();
		Scanner lectura = new Scanner(System.in);
		System.out.println("Marque 1 para comprar un Celular Xiaomi, 2 para un Celular Redmi, 3 para un Celular Apple");
		int resultado = lectura.nextInt();
		if(resultado == 1){
			click=juan.comprarCelular(new FabricaXiaomi());
		}else if(resultado == 2){
			click=juan.comprarCelular(new FabricaRedmi());
		}else if(resultado == 3){
			click=juan.comprarCelular(new FabricaApple());
		}else{
			System.out.println("Opción inválida");
			return;
		}
		click.selfie();
	}
}