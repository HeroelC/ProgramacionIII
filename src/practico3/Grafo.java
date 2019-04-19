package practico3;

import java.util.ArrayList;

public class Grafo {

	//constantes
	private final static int BLANCO = 0;
	private final static int AMARILLO = 1;
	private final static int NEGRO = 2;
	
	//Atributos
	private ArrayList<Vertice> vertices;
	
	//constructor
	public Grafo() {
		vertices = new ArrayList<Vertice>();
	}
	
	public ArrayList<Vertice> getVertices(){
		ArrayList<Vertice> aux = new ArrayList<Vertice>(vertices);
		return aux;
	}
	//funcion para añadir vertices
	public void addVertice(int info) {
		vertices.add(new Vertice(info));
	}
	//funcion para añadir aristas
	public void addArista(int origen, int destino, int distance) {
		vertices.get(origen-1).addArista(vertices.get(destino-1), distance);
		vertices.get(destino-1).addArista(vertices.get(origen-1), distance);
	}
	
	public void print() {
		ArrayList<Vertice> aux = new ArrayList<Vertice>();
		
		for(int i=0; i < vertices.size(); i++) {
			aux = vertices.get(i).getAdyacentes();
			
			for(int j=0; j < aux.size(); j++) {
				System.out.print(vertices.get(i).toString() + "--");
				System.out.print(aux.get(j).toString() + ";");
			}
		}
	}
	
	public void dfs() {
		//pintamos todo los vertices de blanco/sin recorrer
		for(int i=0; i < vertices.size(); i++) {
			vertices.get(i).setColor(BLANCO);
		}
		
		int tiempo = 0;
		
		for(int i=0; i < vertices.size(); i++) {
			if(vertices.get(i).getColor() == BLANCO) {
				dfs_visit(vertices.get(i), tiempo);
			}
		}
	}
	
	private void dfs_visit(Vertice v, int tiempo) {
//		System.out.println(v.getInfo());
		v.setColor(AMARILLO);
		tiempo = tiempo + 1;
		v.setd(tiempo);
		ArrayList<Vertice> aux = new ArrayList<Vertice>();
		aux = v.getAdyacentes();
		
		//pintamos de amarillo el vertice visitado	
		for(int i = 0; i < aux.size(); i++) {
			if(aux.get(i).getColor() == BLANCO) {
				dfs_visit(aux.get(i), tiempo);
			}
		}
		v.setColor(NEGRO);
		tiempo = tiempo + 1;
		v.setf(tiempo);
	}

	public void bfs(Vertice v) {
		
		for (int i = 0 ; i < vertices.size(); i++) {
			vertices.get(i).setColor(BLANCO);
			vertices.get(i).setd(0);
		}
		
		v.setColor(AMARILLO);
		v.setd(0);
		ArrayList <Vertice> cola = new ArrayList <Vertice>();
		cola.add(v);
		while (!cola.isEmpty()) {
			Vertice u = cola.get(0);
			cola.remove(u);
			System.out.println(u.getInfo());
			ArrayList<Vertice> aux = new ArrayList<>(u.getAdyacentes());
			for ( int i = 0 ; i < aux.size(); i++) {
				if (aux.get(i).getColor() == BLANCO) {
					aux.get(i).setColor(AMARILLO);
					aux.get(i).setd(u.getd()+1);
					cola.add(aux.get(i));
				}
			}
			u.setColor(NEGRO);
		}
	}
}
