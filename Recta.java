package guia1;

public class Recta {
	
	private Punto pa;
	private Punto pb;
	private float pendiente;

	public Recta(Punto a, Punto b){
		this.pa=a;
		this.pb=b;
		
	}
	
	public Recta() {
		this.pa= new Punto(0.0f,0.0f);
		this.pb= new Punto(1.1f,1.1f);
	}
	
	
	public float pendiente() {
		
		pendiente = (pb.getCoordy() - pa.getCoordy())/(pb.getCoordx() - pa.getCoordx());
		
		return(pendiente);
		
	}
	
	public boolean paralelas(Recta otraRecta) {
		
		if(this.pendiente() == otraRecta.pendiente()) {
			return true;
		} else return false;
		
	}
	
	public boolean equals(Recta r) {
		
		if( r == null || this.getClass()!=r.getClass() )
			return false;
		
		Recta r2= new Recta(r.pa,this.pb);
		
		if(this.paralelas(r2) && r.paralelas(r2) )
			return true;
		else return false;
		
	}
	
}
