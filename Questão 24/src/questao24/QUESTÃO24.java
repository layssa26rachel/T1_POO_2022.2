package questao24;
import javax.swing.JOptionPane;
import java.math.BigDecimal;
public class QUEST�O24 {

	public static void main(String[] args) {
            double hora, h, m, conversao;
	        int controlador;

	        JOptionPane.showMessageDialog(null, "Ol�, vou te ajudar a saber os minutos de acordo "
	                        + "\ncom a hora que digitar."
	                        + "\nDigite a hora e os minutos separados por [ . ].");
	        do {
	            String receberHora  = JOptionPane.showInputDialog(null, "Digite a hora e os minutos");

	            hora = Double.parseDouble(receberHora);
	            h = Math.ceil(hora);
	            m = hora - h;
	            conversao = (h * 60) + (m * 100);
	            conversao = (double)(Math.round(conversao*100.0)/100.0);

	            JOptionPane.showMessageDialog(null, "A hora que voc� digitou equivale a " + conversao + " minutos.");

	            String saindo = JOptionPane.showInputDialog(null, "Para calcular novamente digite [0]"
	                        + "\nSe voc� quer sair digite [1]");
	            controlador = Integer.parseInt(saindo);
	            System.out.println("------------------------------------------------------------------------------");

	                }while(controlador == 0);
	                if(controlador == 1){
	                    JOptionPane.showMessageDialog(null, "Isso � tudo pessoal");
	                }
	                else {
	                    JOptionPane.showMessageDialog(null, "ERROR!!!"
	                            + "\nREINICIE O PROGRAMA!");
	                }

	    }
	

	}


