package practico3;

import java.util.ArrayList;

public class Vertice {

	//atributos
	private int index;
	private int color;
	private int d;
	private int f;
	private ArrayList<Arista> aristas;

	public Vertice(int index) {
		aristas = new ArrayList<Arista>();
		this.index = index;
	}
	public void setd(int v) {
		d = v;
	}
	public void setf(int e) {
		f = e;
	}
	public int getd() {
		return d;
	}
	public int getf() {
		return f;
	}
	public int getInfo() {
		return index;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public ArrayList<Vertice> getAdyacentes(){
		
		ArrayList<Vertice> aux = new ArrayList<Vertice>();
		
		for(int i = 0; i < aristas.size(); i++) {
			aux.add(aristas.get(i).getDestination());
		}
		
		return aux;
	}
	
	public void addArista(Vertice destino, int distance) {
		Arista origen = new Arista(this, destino, distance);
		aristas.add(origen);
	}
	
	public String toString() {
		return index + "";
	}
}
