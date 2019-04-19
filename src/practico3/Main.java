package practico3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grafo adolfo = new Grafo();
		
		adolfo.addVertice(1);
		adolfo.addVertice(2);
		adolfo.addVertice(3);
		adolfo.addVertice(4);
		adolfo.addVertice(5);
		adolfo.addVertice(6);
		
		adolfo.addArista(1, 2, 100);
		adolfo.addArista(1, 6, 200);
		adolfo.addArista(2, 3, 100);
		adolfo.addArista(2, 5, 250);
		adolfo.addArista(3, 5, 100);
		adolfo.addArista(4, 6, 50);
		adolfo.addArista(5, 6, 400);
		
//		adolfo.print();
//		System.out.println(adolfo.getVertices().get(0).getf());
		
//		adolfo.bfs(adolfo.getVertices().get(0));
		adolfo.dfs();
		for ( int i = 0 ; i < adolfo.getVertices().size(); i++) {
			System.out.println(adolfo.getVertices().get(i).getInfo() + "/"+ adolfo.getVertices().get(i).getd());
		}
		
//		for ( int i = 0 ; i < adolfo.getVertices().size(); i++) {
//			System.out.println(adolfo.getVertices().get(i).getd() + "/"+ adolfo.getVertices().get(i).getf());
//		}
		
	}

}
