package main;

import java.util.ArrayList;
import java.util.List;

public class Casa implements IAreaCalculavel{
	  public static void main(String[] args) {

  List<IAreaCalculavel> calculoDeArea = new ArrayList<IAreaCalculavel>();
  
  Forma c = new Circulo(1);
  Forma q = new Quadrado(2);
  Forma r = new Retangulo(3,3);
  Forma t = new Triangulo(4);
  
  calculoDeArea.add(c);
  calculoDeArea.add(q);
  calculoDeArea.add(r);
  calculoDeArea.add(t);
  for(IAreaCalculavel area : calculoDeArea) {
  	System.out.println("Areas dos cômodos:"+area.calcularArea());
    }
	  }

	@Override
	public double calcularArea() {
		return 0;
	}


	    
}

