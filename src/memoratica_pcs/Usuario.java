/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoratica_pcs;

/**
 *
 * @author Jessica
 */
public class Usuario {
    // Atributos

    private String nome;
    Partida partida;

    char operador;

    /**
     *
     * @param nome
     * @param partida
     * @param operador
     */
    public Usuario(String nome, Partida partida, char operador) {

           this.nome = nome;
        this.partida = partida;
        this.operador=operador;
       
    }
    
    /**
     *
     */
    public Usuario(){
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public Partida getPartida() {
        return partida;
    }

    /**
     *
     * @param partida
     */
    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    /**
     *
     * @return
     */
    public char getOperador() {
        return operador;
    }

    /**
     *
     * @param operador
     */
    public void setOperador(char operador) {
        this.operador = operador;
    }
    
    /**
     *
     * @param partida
     */
    public static void obterResultados(Partida partida)
    {
        partida.verificaTempo();
   
     
    }
}
    

    