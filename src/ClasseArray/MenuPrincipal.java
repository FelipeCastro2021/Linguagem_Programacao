package ClasseArray;

import javax.swing.JOptionPane;
import java.io.*;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class MenuPrincipal {
	public static void main(String[] args) {
		int v[] = new  int[5];
        int opc = 0;
        
        do {
        	opc = Integer.parseInt(JOptionPane.showInputDialog(
        			"1 - Carregar vetor"
        			+ "\n2 - Classificar vetor "
        			+ "\n 3 - Mostrar vetor"
        			+ "\n9 - Finalizar"));
            
            switch (opc)
            {
              case 1: v = Fun��oCarrega(v);
                               break;
              case 2: v = Fun��oClassifica(v);
                               break;
              case 3: ProcedimentoMostra(v);
                               break;
              case 9: JOptionPane.showMessageDialog(null,"finaliza");
                               break;
              default: JOptionPane.showMessageDialog(null,"opc inv�lida");
            }
      } while(opc != 9);
	}
	
	static int[] Fun��oCarrega(int v[]) {
		int  i;

        for(i=0; i<5; i++) 
        	v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i+1) + "o elemento do vetor."));

        return v;
    }

	static int[] Fun��oClassifica(int v[]) {
        int i, j, aux;
        
        for(i=0; i<4; i++) 
            for(j=i+1; j<5; j++) 
                if(v[i]>v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
        
        
        return v;
    }

    static void ProcedimentoMostra(int v[]) {
        System.out.print("O vetor eh:\n");
        String mostra="";
        
        for (int i=0; i<5; i++) { 
            System.out.print(v[i] + " | ");
            //mostra += ("\t "+v[i]);
        }
        
        JOptionPane.showMessageDialog(null,mostra);
    }
}