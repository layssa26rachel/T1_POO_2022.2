package questao14;
import java.util.Scanner; 
public class QUESTÃO14 {

	public static void main(String[] args) {
    Scanner idade = new Scanner(System.in); 
		 System.out.println("Digite o ano atual: ");
		 double atual = idade.nextDouble();
		 
		 System.out.println("Digite o ano de nascimento do indivíduo: ");
		 double nascimento = idade.nextDouble();
		 
		 double Atual = (atual - nascimento); 
		 double doismilecinco = (2005 -  nascimento);
		 
		 System.out.println("A idade atual do indivíduo é: " + Atual);
		 System.out.println("A idade do indivíduo em 2005 é: " + doismilecinco);
		 	}

}