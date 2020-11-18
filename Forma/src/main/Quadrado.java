package main;

public class Quadrado extends Forma{

	 private int lado;

	  public Quadrado(int lado) {
	    this.lado = lado;
	  }
	  
	
	

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
	    return this.lado * this.lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
	    return this.lado * 4 ;
	}

}
