import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Questao002 {
    
    public static void main(String[] args){


        int A = 0; 
        
        while (A!=1){            

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números irá digitar?"));


                int [] vetA = new int[num];

            
                for (int i = 0; i < num; i++){


                    vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o "+(i+1)+"° número."));
     
     
                 }
            
                 for (int i = 0; i < num; i++){


                            JOptionPane.showMessageDialog(null, "VetorA["+(i+1)+"] =  "+vetA[i]);


                 }


                 int soma = 0;
                 double media = 0;

                 for (int i = 0; i < num; i++){

                    soma+=vetA[i];

                 }

                media = soma/num;

                 JOptionPane.showMessageDialog(null, "Soma de todos os números = "+soma+"\n\nMédia dos números = "+media);


                UIManager.put("OptionPane.yesButtonText","Sim");
                UIManager.put("OptionPane.noButtonText","Não");
                
                
                  A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
                  
                  
                  
                
              }


    }
}
