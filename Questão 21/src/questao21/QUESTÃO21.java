package questao21;
import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.lang.Double;
public class QUEST�O21 {

	public static void main(String[] args) {
		
		String textPergunta1;
		        String textPergunta2;
		        String textSaida;

		        double tamanhoEscada;
		        double alturaPrego;
		        double diferen�aEscada;
		        double resposta;
		        double controlador;

		        JOptionPane.showMessageDialog(null, "Ol�, vou te ajudar a saber a que dist�ncia sua escada deve "
		                + "ficar para colocar seu prego."
		                + "\n As medidas colocadas devem estar em metros. ");

		        do {
		        textPergunta1 = JOptionPane.showInputDialog("Digite o tamanho da escada que voc� ir� usar:");
		        tamanhoEscada  = Double.parseDouble(textPergunta1);

		        textPergunta2 = JOptionPane.showInputDialog("Digite a altura em que deseja pregar seu prego:");
		        alturaPrego = Double.parseDouble(textPergunta2);

		        resposta = Math.pow(tamanhoEscada, 2) - Math.pow(alturaPrego, 2);
		        resposta  = Math.sqrt(resposta);
		        resposta = (double)(Math.round(resposta * 100.0)/100.0);

		        if(alturaPrego<tamanhoEscada) {
		            JOptionPane.showMessageDialog(null, "A dist�ncia que a escada deve fica da parede � de: " + resposta + " metros");
		        }
		else {
		            diferen�aEscada = (alturaPrego - tamanhoEscada)+0.1 ;
		            diferen�aEscada  = (double) (Math.round(diferen�aEscada*10.0)/10.0);
		            JOptionPane.showMessageDialog(null, "Sua escada � muito pequena, escolha uma escada no m�nimo " + diferen�aEscada + " metros maior");
		        }

		        textSaida = JOptionPane.showInputDialog(null, "Deseja realizar outro c�culo? Se sim, digite [0]"
		                + "\nSe n�o, basta digitar [1] ");
		        controlador = Double.parseDouble(textSaida);

		        }while(controlador == 0);
		        if(controlador == 1) {
		        JOptionPane.showMessageDialog(null, "Isso � tudo pessoal!!!");
		        }
		        else {
		            JOptionPane.showMessageDialog(null, "ERROR!!!"
		                    + "\nREINICIE O PROGRAMA!");
		        }
		    }

	}
