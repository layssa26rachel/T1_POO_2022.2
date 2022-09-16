package questao19;
import java.util.Scanner; 
public class QUESTÃO19 {

	public static void main(String[] args) {
    Scanner degraus = new Scanner(System.in); 
		 System.out.println("Digite a altura do degrau em centímetros: ");
		 double degrau = degraus.nextDouble();
		 
		 System.out.println("Digite a altura em centímetros que o usuário deseja alcançar: ");
		 double usuario = degraus.nextDouble();
		 
		 double Degraus = (usuario)/(degrau); 
		 System.out.println("A quantidade de degraus que o usuário deverá subir para alcançar seu objetivo é: " + Degraus + " degraus");
		 
		 	}

}