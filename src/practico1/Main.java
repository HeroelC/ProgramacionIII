package practico1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySimpleLinkedList list = new MySimpleLinkedList();
		
		list.insertFront("Hola");
		list.insertFront("¿Cómo estás?");
		list.insertFront("Chau");
		
		
		Iterator<Object> it = list.iterator();
		
		while(it.hasNext()) {
			Object tmp = it.next();
			System.out.println(tmp);
		}
		
		//System.out.println(pila.top());
	}

}
