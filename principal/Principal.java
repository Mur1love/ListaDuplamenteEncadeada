package principal;

import lista.Lista;

public class Principal {
	
	public static void main(String[] args) {
		Lista l = new Lista();
		l.adicicionarNoFinal("Murilo");
		l.adicicionarNoFinal("beatriz");
		l.adicicionarNoFinal("Steve Jobs");
		l.adicionarNoComeco("Welito");
		
		
		System.out.println(l.listar());
	}

}
