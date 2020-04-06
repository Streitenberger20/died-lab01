package guia1;

public class App {

	public static void main(String[] args) {
	
		//declaracion punto P1
		
		Punto P1= new Punto(1.0f,1.0f);
		
		//declaracion punto P1
		
		Punto P2= new Punto(2.0f,2.0f);
		
		//declaracion recta R1
		
		Recta R1= new Recta(P1,P2);
		
		//Muestro pendiente
		System.out.println("Pendiente de R1:"+R1.pendiente());
		
		
		//declaracion punto P3
		
		Punto P3= new Punto(3.0f,3.0f);
		
		//declaracion recta R2
		
		Recta R2= new Recta(P2,P3);
		
		
		//muestra si son la misma recta 
		
		System.out.println(R1.equals(R2));
		
		
		
		
	}

}
