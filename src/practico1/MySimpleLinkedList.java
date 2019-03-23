package practico1;

import java.util.Iterator;

public class MySimpleLinkedList implements Iterable<Object> {

	protected Node first;
	private int size;

	public MySimpleLinkedList() {
		first = null;
		size = 0;
	}

	public Iterator<Object> iterator() {
		Iterator it = new IteratorMySimpleLinkedList();
		return it;
	}

	public void insertFront(Object o) {
		Node tmp = new Node(o, null);
		tmp.setNext(first);
		first = tmp;
		size += 1;
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

	protected class IteratorMySimpleLinkedList implements Iterator<Object> {

		private int posicionList;

		public IteratorMySimpleLinkedList() {
			posicionList = 0;
		}

		public boolean hasNext() {
			return posicionList < size();
		}

		public Object next() {
			Object tmp = get(posicionList);
			posicionList += 1;
			return tmp;
		}

	}
}