import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Questao006 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){ 
            
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números irá digitar em cada vetor?"));


        int [] vetA = new int[num];
        int [] vetB = new int[num];

    
        for (int i = 0; i < num; i++){


            vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o "+(i+1)+"° número."));

        }

        for (int i = 0; i < num; i++){


            vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o "+(i+1)+"° número."));

        }







            UIManager.put("OptionPane.yesButtonText","Sim");
            UIManager.put("OptionPane.noButtonText","Não");
            
            
              A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION);
    
    
           
         }
    }
}
