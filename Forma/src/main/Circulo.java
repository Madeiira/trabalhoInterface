package main;

public class Circulo extends Forma {
	private double raio;
	private double pi = 3.14;
	
	  public Circulo(double raio) {
		    this.raio = raio;
		  }
		  

		@Override
		public double calcularArea() {
		    return (this.raio * this.raio) * this.pi;
		}

		@Override
		public double calcularPerimetro() {
			return this.raio * 2 * this.pi;
		}

}
