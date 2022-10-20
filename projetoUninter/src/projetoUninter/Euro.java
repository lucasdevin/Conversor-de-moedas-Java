package projetoUninter;


public class Euro extends Moeda {
	
           // formação do Euro
	
	double euro = 5.09;
	
	public Euro(double valor) {
	    super(valor);
	}
	
	
	@Override
	public void info(){
	    System.out.println("Euro: " + euro);
	}
	
	@Override
	public double converter(double valor){
	    euro = euro * valor;
	    return euro;
	}
}
