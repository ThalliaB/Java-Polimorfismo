
public class cliente implements autenticavel {
	
private autenticacaoUtil autenticador;
	
	public cliente() {
		this.autenticador = new autenticacaoUtil();
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
