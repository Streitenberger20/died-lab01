package guia1;
public class Punto {
	
	private float coordx;
	private float coordy;
	
	public Punto(float x, float y) {
		this.coordx=x;
		this.coordy=y;
	}

	public float getCoordx() {
		return coordx;
	}

	public void setCoordx(float coordx) {
		this.coordx = coordx;
	}

	public float getCoordy() {
		return coordy;
	}

	public void setCoordy(float coordy) {
		this.coordy = coordy;
	}
	
	public boolean equals(Punto punto) {
		
		float aux1, aux2;
		boolean b = false;
		
		aux1 = punto.getCoordx();
		aux2 = punto.getCoordy();
		
		
		if(punto == null || this.getClass() != punto.getClass() ) {
			return false;
		}
		
		if(aux1 == this.coordx) {
			if(aux2 == this.coordy) {
				b = true;
			}
		}
		
		return b;
		
	}
	
	
}
