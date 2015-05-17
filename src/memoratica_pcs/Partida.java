/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoratica_pcs;
import java.util.Random;

public class Partida {
    //atributos
    private String id_partida;
    private  int cronometro;
    private int tempo;
    private Jogada jogada;
    
 
    //construtor
    public Partida Partida=new Partida();
    
    //métodos   
    
    public char selecionaModulo(char operador)
    {         
        
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
    
    private void distribuirPecas(int Tabuleiro)
    {
     
        
        /*
        Random gerador = new Random();
 
        int numero1 = gerador.nextInt();
        int numero2 = gerador.nextInt();
        
 
       for(int i=0; i<=Tabuleiro.lenght;i++){
        
        switch(operador)
        
        case '+': Tabuleiro [i]=numero1+numero2;
        break;
        
        case '-': Tabuleiro [i]=numero1-numero2;
        break;
        }
        
    }
}*/
    }
    
    private void selecionarPecas(Peca peca1,Peca peca2)    
    {
        if(peca1.virada=true)
         {
           jogada.peca1=peca1;
         }
           
        if(peca2.virada=true)
        {
         jogada.peca2=peca2;
        }
    }
    
    public boolean verificaPar()
    { 
        if(jogada.peca1.resultadoOperacao()==jogada.peca2.resultadoOperacao())
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
        
        inicializarPartida();             
        
    }
    public void desvirar(Peca peca)
    {
        peca.virada=true;
    }
}

