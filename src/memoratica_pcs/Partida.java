/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoratica_pcs;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import sun.security.jca.GetInstance;

public class Partida  {
    //atributos
    private String id_partida;
    private  int cronometro;
    private int tempo;
    private Jogada jogada;
   Tabuleiro Tabuleiro;
  

 
    //construtor
    public Partida Partida=new Partida();
    
    
    //métodos   
    
    public static char selecionaModulo(/*char operador*/)
    {  
        Scanner reader = new Scanner(System.in);
    System.out.println("Digite o modulo: ");
    char operador = reader.next().charAt(0);
        
        
        return operador;
    }
    private boolean inicializarPartida()
    {
        if(cronometro==0)
        {
            return false;
        }
        
        return true;
    }
    public boolean inicializarCronometro()
    {    
     if(inicializarPartida()==true)
        {        
         cronometro = tempo;  
          try{  
               for (int i = cronometro; i > 0; i--)
                 {  
                  System.out.println(i + " segundos");  
                  Thread.sleep(1000); // 1 segundo  
                 }  
             System.out.println("Seu tempo acabou!");  
             } 
           catch (InterruptedException e)
            {  
             
             return true;
            }             
            
          return true;
        }
     else
         return false;
    }
    
    private void distribuirPecas()
    {
       Peca[][] tabuleiro;
        tabuleiro = Tabuleiro.matrizpecas();
        
     
    Random random = new Random();

    for (int i = tabuleiro.length - 1; i > 0; i--) {
        for (int j = tabuleiro[i].length - 1; j > 0; j--) 
        {
            int m = random.nextInt(i + 1);
            int n = random.nextInt(j + 1);

            Peca temp = tabuleiro[i][j];
            tabuleiro[i][j] = tabuleiro[m][n];
            tabuleiro[m][n] = temp;
        }
    
    
}
        
        
        
    }
    
    private void selecionarPecas(Peca peca1,Peca peca2)    
    {
        peca1.desvirar();
        peca2.desvirar();
        if((peca1.virada=true) &&(peca2.virada=true))
         {
           jogada.peca1=peca1;                 
           jogada.peca2=peca2;
           
        }
    }
    
    public boolean verificaPar()
    { 
        if(jogada.peca1.resultado==jogada.peca2.resultado)
        {
            return true;
        }
        else
            return false;
    }
    
    public void verificaTempo(int tempoF)
    {
        tempoF=tempo-cronometro;
        System.out.println("Tempo gasto:"+ tempoF);
        
        inicializarPartida(); //não consegui botar como false            
        
    }
   
}

