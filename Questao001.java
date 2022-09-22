import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Questao001 {

    public static void main(String[] args) {
        
        int A = 0; 
        
        while (A!=1){            

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números irá digitar?"));


                int [] vetA = new int[num];

            for (int i = 0; i < num; i++){


               vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o "+(i+1)+"° número."));


            }
            
            for (int i = 0; i < num; i++){


                if (vetA[i]<0){


                    JOptionPane.showMessageDialog(null, "O número "+vetA[i]+" na posição "+(i+1)+" é negativo.");


                }
            }


                UIManager.put("OptionPane.yesButtonText","Sim");
                UIManager.put("OptionPane.noButtonText","Não");
                
                
                  A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
                  
                  
                  
                
              }
             }
            }
