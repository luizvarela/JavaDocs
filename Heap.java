package Heap;

public class Heap {

	No raiz;

	public Heap() {

	}

	public void inserir(int valor) {
		No novoDado = new No(valor);
		if (raiz == null) {
			raiz = novoDado;
		} else if (raiz.getFilho_esq() == null) {
			raiz.setFilho_esq(novoDado);
		} else if (raiz.getFilho_dir() == null) {
			raiz.setFilho_dir(novoDado);
		} else {
			raiz.inserir(novoDado);
		}

	}
	
	public void inserirR(int dado) {
		No novoNo = new No(dado);
		if (raiz == null) {
			raiz = novoNo;
		}else{
			raiz.inserirR(novoNo);
		}
	}
	
	public void imprimirR(){
		if (raiz != null) {	
			//System.out.println(raiz.getValor());
			raiz.imprimir();
		}
	}
	
	
	public void imprimir() {
		
		if (raiz != null) {	
			System.out.println(raiz.getValor());
		} 
		if(raiz.getFilho_esq() != null){
			System.out.println(raiz.getFilho_esq().getValor());
		}
		if(raiz.getFilho_dir() != null){
			System.out.println(raiz.getFilho_dir().getValor());
		}
		raiz.getFilho_esq().imprimir();
		
		}

	/*
	 * public void heapfy(Lista a, int valor) { // }
	 * 
	 * public void trocar(Lista a, int valor) { if (raiz == null) {
	 * System.out.println("Árvore vazia"); } else { // } }
	 */

	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}

	public void remover(int valor) {
		//
	}

	public int buscar(int valor) {
		//
		return valor;
	}

}
