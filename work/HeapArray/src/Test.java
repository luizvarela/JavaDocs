public class Test {

	public static void main(String[] args) {
		Heap no = new Heap(10);

		no.insert(9);
		no.insert(16);
		no.insert(1);
		no.insert(8);
		no.insert(14);
		no.insert(2);
		no.insert(3);
		no.insert(7);
		no.insert(4);
		no.insert(10);

		no.imprimir();
		System.out.println();
		no.remover();
		System.out.println();
		no.remover();
	}
}