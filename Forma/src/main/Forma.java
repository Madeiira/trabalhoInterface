package main;

public abstract class Forma implements IAreaCalculavel,  IComparavel, IPerimetroCalculavel {
	public int compareTo(Forma care) {

        if (this.calcularArea() >  care.calcularArea()) {
           
        	return 1;
       
        } else if (this.calcularArea() <  care.calcularArea()) {
           
        	return -1;
       
        } else {
           
        	return 0;
        }
    }
	
}
