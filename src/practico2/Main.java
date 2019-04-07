package practico2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TNode root = new TNode(10);
		BTree arbolito = new BTree(root);
		
		arbolito.insert(7);
		arbolito.insert(5);
		arbolito.inOrder();
	}

}
