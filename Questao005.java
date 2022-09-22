import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Questao005 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){ 
            
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números irá digitar?"));


        int [] vetA = new int[num];

    
        for (int i = 0; i < num; i++){


            vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o "+(i+1)+"° número."));


         } 

         int maior = 0;
         int posi = 0;
         for (int i = 0; i < num; i++){


            if (vetA[i]>maior){

                maior = vetA[i];
                posi = i+1;
            }


         }


         JOptionPane.showMessageDialog(null, "Maior valor = "+maior+" (posição ["+posi+"])");



         UIManager.put("OptionPane.yesButtonText","Sim");
         UIManager.put("OptionPane.noButtonText","Não");
         
         
           A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION);
 
 
        }
    }
}
