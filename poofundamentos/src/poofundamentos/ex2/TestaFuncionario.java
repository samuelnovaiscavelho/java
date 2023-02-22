package poofundamentos.ex2;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Luiz", "(11)95821-2542", "Tecnologia", 5000.00, "20/07/1998");
		
		Funcionario funcionario2 = new Funcionario("Maria", "(11)98852-2025", "Cozinheira", 2000.00, "25/09/1999");
		
		funcionario1.visualizar();
		funcionario2.visualizar();

	}

}
