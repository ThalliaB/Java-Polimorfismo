
public class administrador extends funcionario implements autenticavel{

	private autenticacaoUtil autenticador;

	public administrador() {
		this.autenticador = new autenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 0;
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
