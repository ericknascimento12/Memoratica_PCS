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
    //construtor
    public Partida Partida=new Partida();
   
    //métodos   
    
    public char selecionaModulo(char operador)
    {   
        return operador;
    }
    private boolean inicializarPartida(int cronometro)
    {
        return true;
    }
    public boolean inicializarCronometro()
    {
        return true;
    }
    
    private void distribuirPecas(int Tabuleiro)
    {
        
    }
    
    private void selecionarPecas(char operador)    
    {
        
    }
    
    public boolean verificaPar(int peca1,int peca2)
    { 
        if(peca1==peca2)
        {
            return true;
        }
        else
            return false;
    }
    
    public boolean verificaTempo(int tempo)
    {
        
        return true;
    }
    public void desvirar()
    {
        
    }
}

