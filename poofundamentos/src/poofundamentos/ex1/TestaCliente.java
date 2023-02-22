package poofundamentos.ex1;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Samuel", "(11)94858-7015", "509.912.048-95","59.580.658.22", "Rua Amaral de Souza");

		Cliente cliente2 = new Cliente("Novais", "(11)9110-7819", "519.112.098-92","22.330.558.12", "Rua Fernão Dias");
		
		cliente1.visualizar();
		cliente2.visualizar();

	}

}
