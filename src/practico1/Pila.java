package practico1;

public class Pila {

	MySimpleLinkedList list;
	
	public Pila() {
		list = new MySimpleLinkedList();
	}
	
	public void push(Object o) {
		list.insertFront(o);
	}
	
	public void pop() {
		list.extractFront();
	}
	
	//Devuelve el ultimo objeto de la pila
	public Object top() {
		return list.get(0);
	}
	
	public void reverse() {
		MySimpleLinkedList aux = new MySimpleLinkedList();
		
		for(int i = 0; i <= list.size(); i++) {
			aux.insertFront(list.extractFront());
		}

		list = aux;
	}
}
