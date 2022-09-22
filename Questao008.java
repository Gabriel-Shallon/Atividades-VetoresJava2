import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Questao008 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){ 
            
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números irá digitar?"));


        int [] vetA = new int[num];

    
        for (int i = 0; i < num; i++){


            vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o "+(i+1)+"° número."));


         } 

       
         int parestotal = 0;
         int pares = 0;
         for (int i = 0; i < vetA.length; i++){
        
            if ((vetA[i]%2)==0){
                pares++;
              parestotal = parestotal+
              vetA[i];
            JOptionPane.showMessageDialog(null, parestotal+"\n\n"+pares);
        }}

        

        if (pares>0){
            double mediapares = parestotal/pares;
            JOptionPane.showMessageDialog(null, "A média dos números pares é "+mediapares);

        }else{

            JOptionPane.showMessageDialog(null, "Não há números pares no vetorA.");

        }



         UIManager.put("OptionPane.yesButtonText","Sim");
         UIManager.put("OptionPane.noButtonText","Não");
         
         
           A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION);
 
 
         }
     }
 }
