package main;

public class Triangulo extends Forma{
	private int lado;

	  public Triangulo(int lado) {
	    this.lado = lado;
	  }
	  

	

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
	    return ((this.lado * this.lado) * 1.732)/4;  //Preferi mais uma vez usar um valor aproximado pra limitar as casas decimais professor, inv�s de usar o math.squart(3);
        //Pois continua dando problema na hora de exibi��o com %2.f

	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.lado * 3;
	}
	  
}
