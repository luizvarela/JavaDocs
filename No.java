package Heap;

public class No {

	private No filho_esq;
	private No filho_dir;
	private No pai;
	private No prox;
	private int valor;

	public No(int valor) {
		this.valor = valor;
	}

	public No(No filho_esq, No filho_dir, No pai, int valor) {

		this.filho_esq = filho_esq;
		this.filho_dir = filho_dir;
		this.pai = pai;
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}

	public No getFilho_esq() {
		return filho_esq;
	}

	public void setFilho_esq(No filho_esq) {
		this.filho_esq = filho_esq;
	}

	public No getFilho_dir() {
		return filho_dir;
	}

	public void setFilho_dir(No filho_dir) {
		this.filho_dir = filho_dir;
	}

	public No getPai() {
		return pai;
	}

	public void setPai(No pai) {
		this.pai = pai;
	}

	public void trocar() {
		No aux;
		if (filho_esq.getValor() > filho_dir.getValor()) {
			aux = filho_esq;
			filho_esq = pai;
			pai = aux;
		} else {
			aux = filho_dir;
			filho_dir = pai;
			pai = aux;
		}
	}

	public void remover(No dado) {

	}

	public void inserir(No novoDado) {
		if (filho_esq == null) {
			filho_esq = novoDado;
		} else if (filho_dir == null) {
			filho_dir = novoDado;
		} else {
			filho_esq.inserir(novoDado);
		}

	}
	//ESSE ADICINAR SO ESTA FALTANDO A PARTE DE TROCAR
	//QUE VAI FICAR NO ELSE
	public void inserirR(No novoNo) {
		if (novoNo.getValor() < valor) {
			if (filho_esq == null) {
				filho_esq = novoNo;
			} else if (filho_dir == null) {
				filho_dir = novoNo;
			} else {
				filho_esq.inserir(novoNo);
			}
		} else {
			// Aqui vai ser realizada a troca entre o pai e seu respectivo filho
		}
	}

	public void imprimir() {

		// essa função tem que ajeitar alguma coisa
		// 
		// System.out.println(valor);

		if (filho_esq != null) {
			// filho_esq.imprimir();
			System.out.println(filho_esq.getValor());

		}
		if (filho_dir != null) {
			// filho_dir.imprimir();
			System.out.println(filho_dir.getValor());

		}
		filho_dir.imprimir();

	}

	public void heapfy(No pai, No novoDado) {
		if (novoDado.getValor() > pai.getValor()) {
			novoDado.trocar();
		}

	}
}
