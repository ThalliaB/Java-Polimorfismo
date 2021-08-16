//contrato autenticavel
	//quam assinar esse contrato, precisa implementar
		//metodo setSenha
		//metodo autentica

public abstract interface autenticavel {
	
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
}
