package questao22;
import java.util.Scanner; 
public class QUESTÃO22 {

	public static void main(String[] args) {
    Scanner energia = new Scanner(System.in); 
		 System.out.println("Digite o valor do salário mínimo: ");
		 double salariomin = energia.nextDouble();
		 
		 System.out.println("Digite a quantidade de quilowatts consumida por residência: ");
		 double residencia = energia.nextDouble();
		 
		 double kw = (salariomin / 5); 
		 double reais = (kw * residencia);
		 double desconto = (reais * 15 / 100);
		 double valordesconto = (reais - desconto);
		
		 System.out.println("O valor em reais de cada kw é: " + kw + " reais");
		 System.out.println("o valor em reais a ser pago pela residência é: " + reais + " reais");
		 System.out.println("O valor em reais a ser pago com desconto é: " + valordesconto + " reais");	
	}

}