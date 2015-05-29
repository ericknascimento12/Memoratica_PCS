/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoratica_pcs;

import java.util.Random;
import java.util.Scanner;

public class Partida  {
    //atributos
    private String id_partida;
    private  int cronometro;
    private int tempo;
    private Jogada jogada;//Precisa desse atributo?
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
        distribuirPecas();   //Distribui as peças da partida
        inicializarCronometro(); //Inicializa o cronometro
        
        if(cronometro==0)  // caso o cronometro chegue a 0 a partida acaba(false)
        {
            return false;
        }
        
        return true;
    }
    public boolean inicializarCronometro()//inicializa o cronometro
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
    
    private void distribuirPecas() // cria o tabuleiro e distribui as peças
    {

       Peca[][] tabuleiro;  // cria uma matriz de peças(tabuleiro)
      
       tabuleiro = Tabuleiro.matrizpecas();//posiciona as peças no tabuleiro-"não consegui tabuleiro.matrizpecas()";


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

 
    
    private void selecionarPeca(Peca peca) //desvira a peça   
    {
        peca.desvirar();
       
        
    }
    private void jogada(Peca peca1,Peca peca2)// como vou armazenar as peças selecionadas em peça 1 e peça 2??
    {  
        
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

