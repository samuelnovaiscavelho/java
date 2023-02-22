package poofundamentos.ex2;


public class Funcionario {
		
		private String nome;
		private String contato;
		private String cargo;
		private Double salario;
		private String dataNascimento;
		
		public Funcionario(String nome, String contato, String cargo, Double salario, String dataNascimento) {
			this.nome = nome;
			this.contato = contato;
			this.cargo = cargo;
			this.salario = salario;
			this.dataNascimento = dataNascimento;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getContato() {
			return contato;
		}

		public void setContato(String contato) {
			this.contato = contato;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

		public Double getSalario() {
			return salario;
		}

		public void setSalario(Double salario) {
			this.salario = salario;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		
		public void visualizar() {
			System.out.println(nome+", "+ contato +", "+ cargo +", "+ salario +", "+ dataNascimento);
		}
}
