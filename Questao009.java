import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Questao009 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos pessoas irá colocar as informações?"));

                int [] idade = new int[num];
                String [] nome = new String[num];
               

                for (int i = 0; i < num; i++){


                    nome[i] = JOptionPane.showInputDialog(null, "Pessoa número "+(i+1)+".\n\n\nNome =");
                    idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, nome[i]+".\n\n\nIdade ="));
                   
     
                 }


                 int maior = 0;
                 int marcador = 0;
                 for (int i = 0; i < num; i++){


                    if (idade[i]>maior){
        
                        maior = idade[i];
                        marcador = i;
                    }
        
        
                 }


                 JOptionPane.showMessageDialog(null, nome[marcador]+" Tem "+maior+" anos e é o mais velho.");


                UIManager.put("OptionPane.yesButtonText","Sim");
                UIManager.put("OptionPane.noButtonText","Não");
                
                
                  A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION);


       }
   }
}
    
