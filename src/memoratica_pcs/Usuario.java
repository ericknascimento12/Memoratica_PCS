/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoratica_pcs;

/**
 *
 * @author Gian
 */
public class Usuario {
     // Atributos
    private int id_usuario;
    private String nome;
    private char modulo_liberado;
    
    //Construtor
    public Usuario (String nome,int id_usuario)
    {
        this.nome=nome;
        this.id_usuario=id_usuario;
    }
    //Metodos
    
    public String obterEstatistica(int id_usuario)
    {
       int tempo=0;
       return "";
               
    }
    
}
