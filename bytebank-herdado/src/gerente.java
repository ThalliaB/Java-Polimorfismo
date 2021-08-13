
public class gerente extends funcionario {

	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
	}
	
	
	
	
}
