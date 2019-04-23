/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosdeordenacion;

/*
 * Autor: Daniel Bardera
 */
public class AlgoritmosDeOrdenacion {

    /**
     * @param args the command line arguments
     */
    
    public void ordenacionBurbuja(int[] numeros){
        
        int aux;
        
        for (int j=0; j<numeros.length; j++){
            
            for (int i=0; i<numeros.length - 1; i++){           
                if (numeros [i] > numeros [i + 1]){
                    aux = numeros [i + 1];
                    numeros[i] = numeros [i + 1];
                    aux = numeros [i];
                }
        }
        
        }

    }
  
    public static void main(String[] args) {
        
        int [] numeros = {11,17,21,55};
    }
    
}
