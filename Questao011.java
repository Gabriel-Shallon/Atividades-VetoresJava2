import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Questao011 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas pessoas irá colocar as informações?"));


                double [] altura = new double[num];
                int [] genero = new int[num];
               


                UIManager.put("OptionPane.yesButtonText","Homem");
                UIManager.put("OptionPane.noButtonText","Mulher");

                for (int i = 0; i < num; i++){


                    altura[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Pessoa número "+(i+1)+".\n\n\nAltura ="));
                    genero[i] = JOptionPane.showConfirmDialog(null,"Pessoa número "+(i+1)+".\n\n\nGênero =", "genero", JOptionPane.YES_NO_OPTION);
     
                 }

                 double maior = 0;
                 double menor = 999999999;
            
                 for (int i = 0; i < num; i++){


                    if (altura[i]<menor){
        
                        menor = altura[i];
                       
                    }
                    if (altura[i]>maior){
        
                        maior = altura[i];
                       
                    }
        
        
                 }


                 JOptionPane.showMessageDialog(null, "Maior altura = "+maior );
                 JOptionPane.showMessageDialog(null, "Menor altura = "+menor );

                 double alturamed = 0;
                 int mulheres = 0;
                 for (int i = 0; i < num; i++){

                    if (genero[i] == 1){
                    alturamed=alturamed+altura[i];
                    mulheres++;
                    }

                 }
                 double alturamedia = alturamed/mulheres;

                 JOptionPane.showInternalMessageDialog(null, "Há "+mulheres+" mulheres.\n\nA média da altura das mulheres é "+alturamedia+".");

                 if (num-mulheres != 0){

                 JOptionPane.showMessageDialog(null, "Há "+(num-mulheres)+" homens.");

                 }else{

                    JOptionPane.showMessageDialog(null, "Não há homens.");

                 }

                 UIManager.put("OptionPane.yesButtonText","Sim");
                 UIManager.put("OptionPane.noButtonText","Não");
                 
                 
                   A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION);


        }
    }
}