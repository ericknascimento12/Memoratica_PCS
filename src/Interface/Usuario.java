/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Gian
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;






public class Usuario {
     // Atributos
 
    private String nome;
    private char modulo_liberado;
    Partida partida;
 //  
    
    //Construtor
    public Usuario (String nome)
    {
        this.nome=nome;
     
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getModulo_liberado() {
        return modulo_liberado;
    }

    public void setModulo_liberado(char modulo_liberado) {
        this.modulo_liberado = modulo_liberado;
    }
    
      public String obterResultados(Partida partida, String nome)
    {
  
     partida.verificaTempo();
     partida.selecionaModulo();
     
    

    }               
    

}
