package died.lab01.problema02;

public class Temperatura {
	
	private double grados;
	private Escala escala;
	
	public Temperatura() {
		this.grados=0;
		this.escala=Escala.CELCIUS;
	}
	
	public Temperatura(double temp, Escala defEscala) {
		this.grados=temp;
		this.escala=defEscala;
		
	}
	
	public String toString() {
		
		String retorno = new String();
		String temp = String.valueOf(this.grados);
		
		if(this.escala == Escala.CELCIUS) {
			
			retorno = temp + "C°";
			
		}else if(this.escala == Escala.FAHRENHEIT) {
			
			retorno = temp + "F°";
		}
		return retorno;
	}
	
	public double asCelcius() {
		
		if(this.escala == Escala.FAHRENHEIT ) {
			double aux = (grados-32)*5/9;
			return aux;
		}
		
		return grados;
	}
	
	public double asFahrenheit() {
		
		if(this.escala == Escala.CELCIUS ) {
			double aux =(grados*9/5)+32;
			return aux;
		}
		
		return grados;
	}
	
	public void aumentar(Temperatura temperatura) {
		
		if(temperatura.grados > 0.0) {
			
			if(this.escala == temperatura.escala) {
			this.grados+=temperatura.grados;
		}
			else if (this.escala == Escala.CELCIUS) {
				
				this.grados+= temperatura.asCelcius();
			
			}else this.grados += temperatura.asFahrenheit();

		}
		
	}
	
	public void disminuir(Temperatura temperatura) {
		
		if(this.escala == temperatura.escala) {
			if(this.grados - temperatura.grados > 0) {
				this.grados-=temperatura.grados;
			}
		}else if (this.escala == Escala.CELCIUS) {
			if(this.grados - temperatura.asCelcius() > 0) {
				this.grados-=temperatura.asCelcius();
			}else if(this.grados - temperatura.asFahrenheit() > 0) {
				this.grados -= temperatura.asFahrenheit();
			}
		}
		
	}
	
	
	
	
	
}
