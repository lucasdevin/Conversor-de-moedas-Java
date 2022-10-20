package projetoUninter;

public class Real extends Moeda {
	
            // formação do Real
	
	double real = 0;
	
	public Real(double valor) {
	    super(valor);
	}
	
	@Override
	public void info(){
	    System.out.println("Real: " + real);
	}
	
	@Override
	public double converter(double valor){
	    real = real + valor;
	    return real;
	}
}
