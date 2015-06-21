/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



/**
 *
 * @author Gian
 */
public class Tabuleiro extends Partida {
    //atributos
    
  Peca[][] tabuleiro = new Peca[5][4];// cria matriz de peças 
   char operador=Partida.selecionaModulo();//seleciona o operador
   
   public  Tabuleiro() //recebe parametros?
 {   
       int cont=0;
     int[] resultados = null;//vetor de resultados  
     ///////////////////////Lista Numeros///////////////////////
     ArrayList<Integer> numeros = new ArrayList();  //lista com valores de 0~100 
    for (int i = 0; i < 101; i++) 
    { 
        numeros.add(i);  
    }    
      
    Collections.shuffle(numeros);  //Embaralhamos os resultados:   
    for (int i = 0; i < 10; i++)  //Pegamos 10 aleatórios  
    {  
       resultados[i]=(numeros.get(i));
    }      
    int[] resultadosB = resultados.clone();//cria copia com os resultados
    
///////////////////////Lista Peças/////////////////////////
       ArrayList<Peca> pecas = new ArrayList();
    for (int i=0;i < 10;i++) //armazena 10 primeiros resultados na lista
      {
            pecas.add(new Peca(resultados[i], operador));
            i++;
      }
    for (int i=0;i < 10;i++) 
      {
            pecas.add(new Peca(resultadosB[i], operador));//armazenas os 10 resultados restantes
            i++;
      }
 
 for(int i=0;i<5;i++)
 {
     for(int j=0;j<4;j++)
     {   
         tabuleiro[i][j]=pecas.get(cont);//armazena a peça na posição do tabuleiro
     }
 }
 

 }

      
  
}
