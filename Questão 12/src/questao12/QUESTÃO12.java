package questao12;
import java.util.Scanner; 
public class QUEST�O12 {

	public static void main(String[] args) {
		 Scanner potencia = new Scanner(System.in); 
		 
		 System.out.println("Digite o primeiro n�mero: ");
		 double num1 = potencia.nextDouble();
		 
		 System.out.println("Digite o segundo n�mero: ");
		 double num2 = potencia.nextDouble();
		 
		 double R1 = (num1 * (num2 * num2)); 
		 double R2 = (num2 * (num1 * num1)); 
		 System.out.println("O resultado �: " + R1);
		 System.out.println("O resultado �: " + R2);
		 
		 
	}
}