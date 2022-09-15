import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Questao004 {
    
    public static void main(String[] args){


        int A = 0; 
        
        while (A!=1){ 
            
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números irá digitar?"));


        int [] vetA = new int[num];

    
        for (int i = 0; i < num; i++){


            vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o "+(i+1)+"° número."));


         } 

         int pares = 0;
        for (int i = 0; i < vetA.length; i++){
       
            if ((vetA[i]%2)==0){
                
              pares++;
              JOptionPane.showMessageDialog(null, "Número "+vetA[i]+" na posição "+(i+1)+" é par.");  
             
        }}

        if (pares>0){

        JOptionPane.showMessageDialog(null, "Há "+pares+" números pares no vetor A.");

        }else{

            JOptionPane.showMessageDialog(null, "Não há números pares no vetor A.");

        }

        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION);


}

    }
}
