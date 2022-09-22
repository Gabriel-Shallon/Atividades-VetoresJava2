import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Questao003 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos pessoas irá colocar as informações?"));


                int [] idade = new int[num];
                String [] nome = new String[num];
                double [] altura = new double[num];


            
                for (int i = 0; i < num; i++){


                    nome[i] = JOptionPane.showInputDialog(null, "Pessoa número "+(i+1)+".\n\n\nNome =");
                    idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, nome[i]+".\n\n\nIdade ="));
                    altura[i] = Double.parseDouble(JOptionPane.showInputDialog(null, nome[i]+".\n\n\nAltura ="));
     
                 }


                 double somaalt = 0;
                 for (int i = 1; i < num; i++){

                    somaalt=altura[i]+altura[i-1];

                 }
                 double medalt = somaalt/num;

                 JOptionPane.showMessageDialog(null, "A altura média é "+medalt);


                 int menor16 = 0;
                  for (int i = 0; i < num; i++){
         
                     if (idade[i]<16){
          
                         menor16++;
                         JOptionPane.showMessageDialog(null, nome[i]+" é menor de 16.");
          
                         }
                         }
         
         double menor16porcent = (menor16*100)/num;

                         JOptionPane.showMessageDialog(null, menor16porcent+"% são menores de 16.");


                 UIManager.put("OptionPane.yesButtonText","Sim");
                 UIManager.put("OptionPane.noButtonText","Não");
                 
                 
                   A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION);


        }
    }
}