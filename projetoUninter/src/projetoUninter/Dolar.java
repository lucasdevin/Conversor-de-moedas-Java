package projetoUninter;

public class Dolar extends Moeda {
	
	     // Formação do Dolar
	
	double dolar = 5.21;
	
	public Dolar(double valor) {
	    super(valor);
	}
	
	@Override
	public void info(){
	    System.out.println("Dolar: " + dolar);
	}
	
	@Override
	public double converter(double valor){
	    dolar = dolar * valor;
	    return dolar;
	}
}
