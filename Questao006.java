import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Questao006 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){ 
            
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números irá digitar em cada vetor?"));


        int [] vetA = new int[num];
        int [] vetB = new int[num];
        int [] vetC = new int[num];

    
        for (int i = 0; i < num; i++){


            vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o "+(i+1)+"° número (vetorA)."));

        }

        for (int i = 0; i < num; i++){


            vetB[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o "+(i+1)+"° número (vetorB)."));

        }


        for (int i = 0; i < num; i++){

            vetC[i] = vetA[i]+vetB[i];

        }

        for (int i = 0; i < num; i++){

            JOptionPane.showMessageDialog(null, "VetorA["+(i+1)+"] = "+vetA[i]+"\nVetorB["+(i+1)+"] = "+vetB[i]+"\nVetorC["+(i+1)+"] = "+vetC[i]+"\n\nVetorA["+(i+1)+"] + VetorB["+(i+1)+"] = VetorC["+(i+1)+"].");


        }


            UIManager.put("OptionPane.yesButtonText","Sim");
            UIManager.put("OptionPane.noButtonText","Não");
            
            
              A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION);
    
    
           
         }
    }
}
