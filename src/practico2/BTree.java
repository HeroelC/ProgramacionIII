package practico2;

public class BTree {

	private TNode root;
	
	public BTree(TNode root) {
		this.root = root;
	}
	
	public void insert(int number) {
		if(root != null) {
			root.insert(number);
		}else {
			TNode tmp = new TNode(number);
			this.root = tmp;
		}
	}
	
	public void inOrder() {
		this.root.inOrder();
	}
}
