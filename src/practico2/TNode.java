package practico2;

import java.util.ArrayList;

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
	
	public ArrayList<Integer> getFrontera(){
		ArrayList<Integer> aux = new ArrayList<Integer>();
		if(left != null) {
			aux.addAll(left.getFrontera());
			if(right != null) {
				aux.addAll(right.getFrontera());
			}
		} else if(right != null) {
			aux.addAll(right.getFrontera());
		}else {
			aux.add(this.getInfo());
		}
		return aux;
	}
	public ArrayList<Integer> getLongestBranch() {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		if(left != null) {
			list1.add(this.getInfo());
			list2.add(this.getInfo());
			
			list1.addAll(left.getLongestBranch());
			
			if(right != null) {
				list2.addAll(right.getLongestBranch());
			}
		}else if(right != null) {
			list1.add(this.getInfo());
			list1.addAll(right.getLongestBranch());
		}else {
			list1.add(this.getInfo());
		}
		
		if(list1.size() > list2.size()) {
			return list1;
		}else {
			return list2;
		}
	}
	
	public boolean hasElem(int element) {
		
		if(this.getInfo() == element) {
			return true;
		}else {
			if(element < this.getInfo()) {
				if(left == null) {
					return false;
				}else {
					return left.hasElem(element);
				}
			}else {
				
				if(right != null) {
					return false;
				}else {
					return right.hasElem(element);
				}
			}
		}
	}
	public ArrayList<Integer> getElemAtLevel(int index){
		
		int corte = 1;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(index > corte) {
			if(left != null) {
				list.addAll(left.getElemAtLevel(index -1));
			}
			if(right != null) {
				list.addAll(right.getElemAtLevel(index-1));
			}
		}else if(corte == index) {
			list.add(this.getInfo());
		}
		
		return list;
	}

}
