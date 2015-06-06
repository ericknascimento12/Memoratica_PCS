/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoratica_pcs;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Gian
 */
public class Tabuleiro extends Partida {
    //atributos
    private int id_tabuleiro;
  Peca[][] tabuleiro = new Peca[5][4]; 
   char operador=Partida.selecionaModulo();
    public  Tabuleiro()
 {
   
    

  ArrayList<Peca> pecas = new ArrayList();
  
  





 
 Peca peca1=new Peca(20,operador);
 Peca peca2=new Peca(20,operador);
 Peca peca3=new Peca(40,operador);
 Peca peca4=new Peca(40,operador);
 Peca peca5=new Peca(10,operador);
 Peca peca6=new Peca(10,operador);
 Peca peca7=new Peca(50,operador);
 Peca peca8=new Peca(50,operador);
 Peca peca9=new Peca(16,operador);
 Peca peca10=new Peca(16,operador);
 Peca peca11=new Peca(4,operador);
 Peca peca12=new Peca(4,operador);
 Peca peca13=new Peca(2,operador);
 Peca peca14=new Peca(2,operador);
 Peca peca15=new Peca(12,operador);
 Peca peca16=new Peca(12,operador);
 Peca peca17=new Peca(64,operador);
 Peca peca18=new Peca(64,operador);
 Peca peca19=new Peca(6,operador);
 Peca peca20=new Peca(6,operador);
  
    
      tabuleiro[0][0]=peca1;
      tabuleiro[1][1]=peca2;
      tabuleiro[2][2]=peca3;
      tabuleiro[3][3]=peca4;
      tabuleiro[4][0]=peca5;
      tabuleiro[0][1]=peca6;
      tabuleiro[1][2]=peca7;
      tabuleiro[2][3]=peca8;
      tabuleiro[3][0]=peca9;
      tabuleiro[4][1]=peca10;
      tabuleiro[0][2]=peca11;
      tabuleiro[1][3]=peca12;
      tabuleiro[2][0]=peca13;
      tabuleiro[3][1]=peca14;
      tabuleiro[4][2]=peca15;
      tabuleiro[0][3]=peca16;
      tabuleiro[1][0]=peca17;
      tabuleiro[2][1]=peca18;
      tabuleiro[3][2]=peca19;
      tabuleiro[4][3]=peca20;
        

 }


      
  
}
