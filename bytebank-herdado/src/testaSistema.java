
public class testaSistema {

	public static void main(String[] args) {
		gerente g = new gerente();
		g.setSenha(2222);
		
		administrador adm = new administrador();
		adm.setSenha(3333);
		
		cliente cliente = new cliente();
		cliente.setSenha(2222);
		
		sistemaInterno si = new sistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
		
	}
	
}
