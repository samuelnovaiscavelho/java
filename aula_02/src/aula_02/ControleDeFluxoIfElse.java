package aula_02;

public class ControleDeFluxoIfElse {

	public static void main(String[] args) {
		
		int estoque = 60;
		
		if(estoque >= 100) {
			System.out.println("produto suficiente");
			
		}else if(estoque < 100 && estoque > 50){
			System.out.println("alerta: avaliar possibilidade de novo pedido");
		}else 
		{
			System.out.println("atenção faça um novo pedido");
		}
		

	}

}
