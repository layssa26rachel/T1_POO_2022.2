package questao19;
import java.util.Scanner; 
public class QUEST�O19 {

	public static void main(String[] args) {
    Scanner degraus = new Scanner(System.in); 
		 System.out.println("Digite a altura do degrau em cent�metros: ");
		 double degrau = degraus.nextDouble();
		 
		 System.out.println("Digite a altura em cent�metros que o usu�rio deseja alcan�ar: ");
		 double usuario = degraus.nextDouble();
		 
		 double Degraus = (usuario)/(degrau); 
		 System.out.println("A quantidade de degraus que o usu�rio dever� subir para alcan�ar seu objetivo �: " + Degraus + " degraus");
		 
		 	}

}