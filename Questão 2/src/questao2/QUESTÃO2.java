package questao2;
import java.util.Scanner; 
public class QUESTÃO2 {

	public static void main(String[] args) {
		 Scanner média = new Scanner(System.in); 
		 
		 System.out.println("Digite a primeira nota: ");
		 double n1 = média.nextDouble();
		 
		 System.out.println("Digite a segunda nota: ");
		 double n2= média.nextDouble();
		 
		 System.out.println("Digite a terceira nota: ");
		 double n3 = média.nextDouble();
		 
		 double mediafin = ((n1 + n2 + n3)/3); 
		 System.out.println("Sua média final é: " + mediafin);
		 
		 
		 
	}
}