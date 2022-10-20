package projetoUninter;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

	    Scanner teclado = new Scanner(System.in);
	    Cofrinho cofre = new Cofrinho();
	    int opcao = 0;
	    int tipoMoeda;
	    double moeda;

	    do {
	    	// Menu com 5 alternativas
	    	System.out.println("\n Escolha uma opcao: ");
	    	System.out.println("");
		    System.out.println("1 - Adicionar Moeda");
		    System.out.println("2 - Remover Moeda");
		    System.out.println("3 - Listar Moedas");
		    System.out.println("4 - Calcular total convertido para real");
		    System.out.println("5 - Encerrar");
		    opcao = teclado.nextInt();

	        switch(opcao) {

	        // Menu com alternativas tipo inteiro
	            case 1:
	                tipoMoeda=0;
	                while(tipoMoeda > 3 || tipoMoeda <= 0) {
	                    System.out.println("Escolha a moeda");
	                    System.out.println("1-Real");
	                    System.out.println("2-Dolar");
	                    System.out.println("3-Euro");
	                    tipoMoeda = teclado.nextInt();
	                }
	                // Valor das moedas tipo double para leitura de numero decimais
	                System.out.println("Digite o valor?");
	                moeda = teclado.nextDouble();
	                switch(tipoMoeda) {
	                	case 1:
	                		Real Real = new Real(moeda);
	                		cofre.adicionarMoeda(Real);
	                		break;
	                	case 2:
	                		Dolar Dolar = new Dolar(moeda);
	                		cofre.adicionarMoeda(Dolar);
	                		break;
	                	case 3:
	                		Euro Euro = new Euro(moeda);
	                		cofre.adicionarMoeda(Euro);
	                		break;
	                		
	                
	                }

	                break;
                   
	                // Apresentação de resultados
	            case 2:
	            	cofre.ListaParaRemoverMoeda();
	            	System.out.println("Digite o numero do item que deseja remover");
	            	int m = teclado.nextInt();
	            	cofre.removerMoeda(m);
	                break;

	            case 3:
	                System.out.println("Listar moedas adicionadas");
	                cofre.listagemMoeda();
	                break;

	            case 4:
	                System.out.println("Converter valores");
	                cofre.totalConvertido();
	                break;
	            default:
	                System.out.println("Opcao invalida!");
	        }

	    }
	    
	    while(opcao != 5);
	    
	    teclado.close();

	}
}
