package lista;

import basicas.Celula;

public class Lista {
	
	private Celula primeiro;
	private Celula ultimo;
	
	int totalElementos = 0;
	
	public void adicionarNoComeco(Object elemento) {
		
		if(this.totalElementos == 0) {
			Celula nova = new Celula(this.primeiro, elemento);
			this.primeiro = nova;
			this.ultimo = nova;
			this.totalElementos++;
		}else {
			Celula nova = new Celula(this.primeiro, elemento);
			this.primeiro.setAnterior(nova);
			this.primeiro = nova;
			this.totalElementos++;
		}
		
	}
	
	public String listar() {
		if(this.totalElementos==0) {
			return "[]";
		}
		
		StringBuffer lista = new StringBuffer();
		Celula aux = this.primeiro;
		
		lista.append("[");
		
		for(int i = 0; i < this.totalElementos-1; i++) {
			lista.append(aux.getElemento());
			lista.append(", ");
			aux = aux.getProximo();
		}
		
		
		lista.append(aux.getElemento());
		lista.append("]");
		return lista.toString();
		}
	
	public void adicicionarNoFinal(Object elemento) {
		if(this.totalElementos == 0) {
			adicionarNoComeco(elemento);
		}else {
			Celula nova = new Celula(elemento);
			nova.setAnterior(ultimo);
			this.ultimo.setProximo(nova);
			this.ultimo = nova;
			this.totalElementos++;
		}
	}
	
	public void adicionarPorPosicao(int posicao, Object elemento) {
		Celula nova = new Celula(elemento);
		for(int i = 0; i < this.totalElementos-1; i++) {
			if(= posicao) {
				
			}
		}
	}

}
