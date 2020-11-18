package main;

public class Retangulo extends Forma{
	  private int lado;
	  private int altura;

	  public Retangulo(int lado, int altura) {
	    this.lado = lado;
	    this.altura = altura;
	  }



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
	    return this.lado * this.altura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
	    return (this.lado * 2 ) + ( 2 * this.altura);
	}
}
