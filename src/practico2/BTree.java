package practico2;

import java.util.ArrayList;

public class BTree {

	private TNode root;
	
	public BTree(TNode root) {
		this.root = root;
	}
	
	public int getRoot() {
		return root.getInfo();
	}
	
	public boolean hasElem(int element) {
		return root.hasElem(element);
	}
	
	public ArrayList<Integer> getElemAtLevel(int index){
		return root.getElemAtLevel(index);
	}
	public ArrayList<Integer> getLongestBranch() {
		return root.getLongestBranch();
	}
	
	public ArrayList<Integer> getFrontera(){
		return root.getFrontera();
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
