
//O abstract aqui significa que n�o pode dar new em um objeto.
public abstract class funcionario {

	private String nome;
	private String cpf;
	private double salario;

	//No m�todo a palavra abstract sinaliza para o c�digo que esse m�todo n�o tem corpo(ou escopo)
	public abstract double getBonificacao();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
