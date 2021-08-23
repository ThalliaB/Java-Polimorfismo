
public class gerente extends funcionario implements autenticavel{

	private autenticacaoUtil autenticador;

	public gerente() {
		this.autenticador = new autenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	
	
}
