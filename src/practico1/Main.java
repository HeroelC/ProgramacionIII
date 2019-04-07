package practico1;

import java.util.Iterator;

import practico1.MySimpleLinkedList.IteratorMySimpleLinkedList;

public class Main {

	public static void main(String[] args) {

		MySimpleLinkedList list1 = new MySimpleLinkedList();
		MySimpleLinkedList list2 = new MySimpleLinkedList();
		MySimpleLinkedList aux = new MySimpleLinkedList();
		
		list1.insertLast(2);
		list1.insertLast(4);
		list1.insertLast(7);
		list1.insertLast(10);
		
		list2.insertLast(2);
		list2.insertLast(5);
		list2.insertLast(7);
		list2.insertLast(11);
		
		aux = noCommonFirstList(list1, list2);
		//aux.insertLast(3);
		//aux.insertLast(8);
		//aux.insertLast(4);
		aux.print(aux.size());
		
	}

	//Falta terminar, Ejercicio 1.4
	public static void maxPosAndNumber(MySimpleLinkedList list ) {
		
		int count = 0, pos = -1, maxValue = -1;
		
		Iterator<Object> it = list.iterator();
		
		while(it.hasNext()) {
			
			Object aux = it.next();
			
			
		count++;	
		}
	}
	
	//Funcion para ejercico 1.5A
	public static MySimpleLinkedList noOrderList(MySimpleLinkedList list1,
			MySimpleLinkedList list2) {
		
		MySimpleLinkedList aux = new MySimpleLinkedList();
		
		Iterator<Object> it1 = list1.iterator();
		
		while(it1.hasNext()) {
			
			Object val1 = it1.next();
			
			if(list2.contains(val1)) {
				aux.insertFront(val1);
			}
		}
		
		return aux;
	}
	
	//funcion para ejercicio 1.5B
	public static MySimpleLinkedList orderList(MySimpleLinkedList list1,
			MySimpleLinkedList list2) {
		
		MySimpleLinkedList aux = new MySimpleLinkedList();
		
		IteratorMySimpleLinkedList it1 = list1.iterator();
		IteratorMySimpleLinkedList it2 = list2.iterator();
		
		int val1, val2;
		
		while(it1.hasNext() && it2.hasNext()) {
			
			val1 = (int) it1.get();
			val2 = (int) it2.get();
			
			if(val1 == val2) {
				aux.insertLast(val1);
				it1.next();
				it2.next();
			}else if(val1 < val2) {
				it1.next();
			}else {
				it2.next();
				
			}
		}
		return aux;
	}
	
	//ejercicio 6, mejorar con lo del ejercicio 5B 
	public static MySimpleLinkedList noCommonFirstList(
			MySimpleLinkedList list1, MySimpleLinkedList list2
			) {
		
		MySimpleLinkedList aux = new MySimpleLinkedList();
		
		IteratorMySimpleLinkedList it1 = list1.iterator();
		
		while(it1.hasNext()) {
			
			int compare = (int) it1.next();
			
			if(!list2.contains(compare)) {
				aux.insertLast(compare);
			}
		}
		return aux;
	}
}
