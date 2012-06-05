
public class Heap {
	private int[] data;
	private int heapSize;
	private int parentIndex;

	public Heap(int size) {
		data = new int[size];
		heapSize = 0;
	}

	public boolean isEmpty() {
		return (heapSize == 0);
	}

	public int getMinimo() {
		if (isEmpty())
			return 0;
		else
			return data[0];
	}

	public void insert(int dado) {
		if (heapSize == data.length)
			System.out.println("O Heap está cheio!!");
		else {
			heapSize++;
			data[heapSize - 1] = dado;
			trocar(heapSize - 1);
		}
	}

	private void trocar(int index) {

		int aux;
		if (index != 0) {
			parentIndex = getPaiIndex(index);
			if (data[index] > data[parentIndex]) {
				aux = data[parentIndex];
				data[parentIndex] = data[index];
				data[index] = aux;
				trocar(parentIndex);
			}
		}
	}
	
	public void remover() {
		
		if (isEmpty())
			System.out.println("Vazio");
		else {
			data[0] = data[heapSize - 1];

			heapSize--;

			int[] temp = new int[heapSize];
			int cont = 0;
			int aux;

			for (int i = 0; i < temp.length; i++) {
				temp[cont] = data[i];
				parentIndex = getPaiIndex(i);
				cont++;

				if (temp[i] > temp[parentIndex]) {
					aux = temp[parentIndex];
					temp[parentIndex] = temp[i];
					temp[i] = aux;
					trocar(0);
				}
			}

			int[] data = new int[heapSize];
			for (int i = 0; i < temp.length; i++) {
				data[i] = temp[i];

			}

			System.out.println("");
			for (int x = 0; x < data.length; x++) {
				System.out.print(data[x] + " ");
			}

		}
	}

	private int getLeftChildIndex(int index) {
		return 2 * index + 1;
	}

	private int getRightChildIndex(int index) {
		return 2 * index + 2;
	}

	private int getPaiIndex(int index) {
		return (index - 1) / 2;
	}

	public void imprimir() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

	/*
	 * public String toString() { final StringBuffer sb = new StringBuffer();
	 * 
	 * sb.append("[ ");
	 * 
	 * for (int i = 1; i < data.length; i++) { if (i != 1) { sb.append(", "); }
	 * sb.append(data[i]); }
	 * 
	 * sb.append(" ]");
	 * 
	 * return sb.toString(); }
	 */
}
