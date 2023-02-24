package poofundamentos.ex1;

public class Cliente {

	private String nome;
	private String telefone;
	private String cpf;
	private String rg;
	private String endereco;
	
	public Cliente(String nome, String telefone, String cpf, String rg, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}

	public Cliente(String nome2, String telefone2, Integer idade, String email, String endereco2, Integer tipo) {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void visualizar() {
		System.out.println(nome + ", " + telefone + ", " + cpf + ", " + rg + ", " +endereco);
		
	}
	
	

}
