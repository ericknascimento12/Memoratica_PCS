/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoratica_pcs;

import java.util.Random;
/**
 *
 * @author Gian
 */
public class Tabuleiro {
    //atributos
    int id_tabuleiro;
    
       
    //construtor    
public Peca tabuleiro[][] = new Peca[5][4];
     

        
    

 
private Peca matrizpecas(char operador)
{
          
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<4;j++)
        {
          Peca peca=new Peca(operador); 
          this.tabuleiro[i][j]=peca;
        }
    }
        
   return tabuleiro[5][4];
}


  
      
  
}
