/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoratica_pcs;


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
        
    }
    
    private void selecionarPecas(char operador)    
    {
        
    }
    
    public boolean verificaPar(Jogada jogada)
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
    public void desvirar()
    {
        
    }
}

