package questao9;
import java.util.Scanner; 
public class QUESTÃO9 {

	public static void main(String[] args) {
		 Scanner area = new Scanner(System.in); 
		 
		 System.out.println("Digite a base do triângulo: ");
		 double base = area.nextDouble();
		 
		 System.out.println("Digite a altura do triângulo: ");
		 double altura = area.nextDouble();
		 
		 double Area = ((base * altura)/2); 
		 System.out.println("A área do triângulo é: " + Area);
		 
		 
		 
	}
}