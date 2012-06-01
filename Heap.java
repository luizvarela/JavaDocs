package Heap;

public class Heap {

	private No raiz;

	public Heap() {

	}

	/*
	 * public void inserir(int valor) { No novoDado = new No(valor); if (raiz ==
	 * null) { raiz = novoDado; } else if (raiz.getFilho_esq() == null) {
	 * raiz.setFilho_esq(novoDado); } else filho_esq.inserirR(novoNo);filho_esq.inserirR(novoNo);filho_esq.inserirR(novoNo);filho_esq.inserirR(novoNo);filho_esq.inserirR(novoNo);filho_esq.inserirR(novoNo);filho_esq.inserirR(novoNo);filho_esq.inserirR(novoNo);filho_esq.inserirR(novoNo);filho_esq.inserirR(novoNo);filho_esq.inserirR(novoNo);filho_esq.inserirR(novoNo);if (raiz.getFilho_dir() == null) {
	 * raiz.setFilho_dir(novoDado); } else { raiz.inserir(novoDado); }
	 * 
	 * }
	 */

	public void inserirR(int dado) {
		No novoNo = new No(dado);
		// No novoNo = new No(dado);
		if (raiz == null) {
			raiz = novoNo;
		} else {
			No pai = raiz;
			No aux;

			while (true) {
				if (novoNo.getValor() < pai.getValor()) {
					if (pai.getFilho_esq() == null) {
						pai.setFilho_esq(novoNo);
						break;
					} else if (pai.getFilho_dir() == null) {
						pai.setFilho_dir(novoNo);
						break;
					} else {
						//O PROBLEMA esta aqui, como vai passar para o proximo No esquerda
						//inserirR(novoNo);
						pai.setFilho_esq(novoNo);
						break;
					}
					
				} else {
					if (pai.getFilho_esq() == null) {
						aux = novoNo.getFilho_esq();
						novoNo.setFilho_esq(pai);
						pai = aux;
						break;
					} else if (pai.getFilho_dir() == null) {
						aux = novoNo.getFilho_dir();
						novoNo.setFilho_dir(pai);
						pai = aux;
						break;
					} else {
						
						pai.setFilho_esq(novoNo);
						continue;
					}
				}
			}
		}

	}

	/*
	 * } public void inserirR(int dado) { No novoNo = new No(dado); if (raiz ==
	 * null) { raiz = novoNo; }else{ raiz.inserirR(novoNo); } }
	 */
	public void imprimirR() {
		if (raiz != null) {
			// System.out.println(raiz.getValor());
			raiz.imprimir();
		}

	}

	public void imprimir() {

		if (raiz != null) {
			System.out.println(raiz.getValor());
		}
		if (raiz.getFilho_esq() != null) {
			System.out.println(raiz.getFilho_esq().getValor());
		}

		if (raiz.getFilho_dir() != null) {
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
