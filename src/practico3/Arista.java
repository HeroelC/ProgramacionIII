package practico3;

public class Arista {

	private Vertice origin;
	private Vertice destination;
	private int distance;
	
	public Arista(Vertice origin, Vertice destination, int distance) {
		this.origin = origin;
		this.destination = destination;
		this.distance = distance;
	}
	
	public Vertice getOrigin() {
		return origin;
	}
	
	public Vertice getDestination() {
		return destination;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}

}
