package questao14;
import java.util.Scanner; 
public class QUEST�O14 {

	public static void main(String[] args) {
    Scanner idade = new Scanner(System.in); 
		 System.out.println("Digite o ano atual: ");
		 double atual = idade.nextDouble();
		 
		 System.out.println("Digite o ano de nascimento do indiv�duo: ");
		 double nascimento = idade.nextDouble();
		 
		 double Atual = (atual - nascimento); 
		 double doismilecinco = (2005 -  nascimento);
		 
		 System.out.println("A idade atual do indiv�duo �: " + Atual);
		 System.out.println("A idade do indiv�duo em 2005 �: " + doismilecinco);
		 	}

}