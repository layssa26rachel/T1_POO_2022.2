package questao1;
import java.util.Scanner;
public class QUESTÃO1 {

	public static void main(String[] args) {
		Scanner somar = new Scanner(System.in);
		
		int a, b, c, d, soma;
		System.out.print("Digite o primeiro número: ");
		a = somar.nextInt();
		
		System.out.print("Digite o segundo número: ");
		b = somar.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		c = somar.nextInt();
		
		System.out.print("Digite o quarto número: ");
		d = somar.nextInt();
		
		soma = (a + b + c + d);
		
		System.out.print("O resultado é: " + soma);
		
		}

	
	}



