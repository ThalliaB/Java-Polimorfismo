
public class testaFuncionario {

	public static void main(String[] args) {
		
		funcionario nico = new funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("22335564-9");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
	
}
