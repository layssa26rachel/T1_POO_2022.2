package questao9;
import java.util.Scanner; 
public class QUEST�O9 {

	public static void main(String[] args) {
		 Scanner area = new Scanner(System.in); 
		 
		 System.out.println("Digite a base do tri�ngulo: ");
		 double base = area.nextDouble();
		 
		 System.out.println("Digite a altura do tri�ngulo: ");
		 double altura = area.nextDouble();
		 
		 double Area = ((base * altura)/2); 
		 System.out.println("A �rea do tri�ngulo �: " + Area);
		 
		 
		 
	}
}