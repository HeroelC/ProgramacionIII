package practico1;

import java.util.Iterator;

public class MySimpleLinkedList implements Iterable<Object> {

	protected Node first;
	private int size;

	public MySimpleLinkedList() {
		first = null;
		size = 0;
	}

	public IteratorMySimpleLinkedList iterator() {
		return new IteratorMySimpleLinkedList();
	}
	
	public boolean contains(Object value) {
		
		Iterator<Object> it = this.iterator();
		
		while(it.hasNext()) {
		
			Object aux = it.next();
			
			if(aux.equals(value)) {
				return true;
			}
		}
		
		return false;
	}

	public void insertFront(Object o) {
		Node tmp = new Node(o, null);
		tmp.setNext(first);
		first = tmp;
		size += 1;
	}
	
	public void insertLast(Object o) {
		if(isEmpty()) {
			insertFront(o);
		}else {
			Node tmp = first;
			while(tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			Node tmpInsert = new Node(o, null);
			tmp.setNext(tmpInsert);
			size += 1;
		}
	}
	//implementar
	public void insertSort() {
		
	}
	
	public Object extractFront() {

		Object tmpObject = first.getInfo();
		first = first.getNext();
		size -= 1;
		return tmpObject;
	}

	public void print(int index) {

		int count = 0;
		Node tmpNode = first;

		while (count < index) {
			System.out.println(tmpNode.getInfo());
			count++;
			tmpNode = tmpNode.getNext();
		}
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return size;
	}

	// devuelve el objeto en la posicion index
	public Object get(int index) {
		int count = 0;
		Node tmpNode = first;
		while (count < index) {
			count++;
			tmpNode = tmpNode.getNext();
		}

		return tmpNode.getInfo();
	}

	public class IteratorMySimpleLinkedList implements Iterator<Object> {

		private int posicionList;
		private Node nodeTemp;
		
		public IteratorMySimpleLinkedList() {
			posicionList = 0;
			nodeTemp = first;
		}

		public boolean hasNext() {
			return posicionList < size();
		}

		public Object next() {
			Object tmp = nodeTemp.getInfo();
			nodeTemp = nodeTemp.getNext();
			posicionList += 1;
			return tmp;
		}
		
		public Object get() {
			return nodeTemp.getInfo();
		}

	}
}