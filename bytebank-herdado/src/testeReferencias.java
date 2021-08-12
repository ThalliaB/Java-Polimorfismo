
public class testeReferencias {

	public static void main(String[] args) {
		
		funcionario g1 = new gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
				
		funcionario ev = new editorVideo();
		ev.setSalario(2500.0);
		
		funcionario d = new designer();
		d.setSalario(2000.0);
		
		controleBonificacao controle = new controleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
	
		System.out.println(controle.getSoma());
	}
	
}
