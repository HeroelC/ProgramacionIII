package practico2;

public class TNode {

	private TNode left;
	private TNode right;
	private int info;

	public TNode(int number) {
		setInfo(number);
	}

	public void setInfo(int number) {
		this.info = number;
	}

	public int getInfo() {
		return this.info;
	}

	public void inOrder() {
		if (this.left != null) {
			this.left.inOrder();
		} else {
			System.out.println("Left");
		}
		System.out.println(this.info);
		if (this.right != null) {
			this.right.inOrder();
		} else {
			System.out.println("Right");
		}
	}

	public void insert(int number) {

		if (this.info != 0) {
			if (number < info) {
				if (this.left == null) {
					this.left = new TNode(number);
				} else {
					this.left.insert(number);
				}
			} else {
				if (this.right == null) {
					this.right = new TNode(number);
				} else {
					this.right.insert(number);
				}
			}
		} else {
			setInfo(number);
		}
	}

}
