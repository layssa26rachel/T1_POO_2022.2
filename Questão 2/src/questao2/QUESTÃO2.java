package questao2;
import java.util.Scanner; 
public class QUEST�O2 {

	public static void main(String[] args) {
		 Scanner m�dia = new Scanner(System.in); 
		 
		 System.out.println("Digite a primeira nota: ");
		 double n1 = m�dia.nextDouble();
		 
		 System.out.println("Digite a segunda nota: ");
		 double n2= m�dia.nextDouble();
		 
		 System.out.println("Digite a terceira nota: ");
		 double n3 = m�dia.nextDouble();
		 
		 double mediafin = ((n1 + n2 + n3)/3); 
		 System.out.println("Sua m�dia final �: " + mediafin);
		 
		 
		 
	}
}