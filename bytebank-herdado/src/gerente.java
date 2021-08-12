
public class gerente extends funcionarioAutenticavel {

	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
	}
	
	
	
	
}
