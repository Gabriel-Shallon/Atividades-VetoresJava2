import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Questao010 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos alunos irá colocar as notas?"));


                double [] nota1 = new double[num];
                String [] nome = new String[num];
                double [] nota2 = new double[num];
                double [] media = new double[num];


            
                for (int i = 0; i < num; i++){


                    nome[i] = JOptionPane.showInputDialog(null, "Pessoa número "+(i+1)+".\n\n\nNome =");
                    nota1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, nome[i]+".\n\n\nNota1 ="));
                    nota2[i] = Double.parseDouble(JOptionPane.showInputDialog(null, nome[i]+".\n\n\nNota2 ="));
     
                 }


                 for (int i = 0; i < num; i++){

                    media[i] = (nota1[i]+nota2[i])/2;

                 }


                 for (int i = 0; i < num; i++){


                   if (media[i]>=6){

                    JOptionPane.showMessageDialog(null, nome[i]+"\n\n\nMédia = "+media[i]+"\nAprovado.");

                   }else{

                    JOptionPane.showMessageDialog(null, nome[i]+"\n\n\nMédia = "+media[i]+"\nReprovado.");

                   }


                 }


                 UIManager.put("OptionPane.yesButtonText","Sim");
                 UIManager.put("OptionPane.noButtonText","Não");
                 
                 
                   A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION);


        }
    }
}


