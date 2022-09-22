import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Questao007 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){ 
            
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números irá digitar em cada vetor?"));


        int [] vetA = new int[num];
      

    
        for (int i = 0; i < num; i++){


            vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o "+(i+1)+"° número (vetorA)."));


        }
        double med = 0;
        for (int i = 0; i < num; i++){

          med+=vetA[i];

        }

        double media = med/num;

        JOptionPane.showMessageDialog(null, "A média dos números do vetorA é "+media+".");

        for (int i = 0; i < num; i++){

            if (vetA[i]<media){

                JOptionPane.showMessageDialog(null, "VetorA["+(i+1)+"] = "+vetA[i]+"\n\nEstá abaixo da média.");

            }

        }


            UIManager.put("OptionPane.yesButtonText","Sim");
            UIManager.put("OptionPane.noButtonText","Não");
            
            
              A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION);
    
    
           
         }
    }
}