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
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Usuario {
     // Atributos
    
    private String nome;
    private char modulo_liberado;
    Partida partida;
 /* 
public static obterTempo(Partida partida){

return partida.verificaTempo();
}
*/
    
    public Usuario( String nome, char modulo_liberado, Partida partida) {
       
        this.nome = nome;
        this.modulo_liberado = modulo_liberado;
        this.partida = partida;
    }
    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    
    
     //   private static final String USUARIO_XML = "usuario.xml";
    //Construtor
    
/*
    public void gravarusuario() {
        File usuario = new File("usuario.txt");//arquivo no local do projeto
        char usuario_registrado;
        try {
            if (usuario.exists() == false) {
                //se não haver esse arquivo ele cria um
                usuario.createNewFile();
            }

            File[] usuarios = usuario.listFiles(); //array para guardar as linhas do arquivo
            
            
            FileWriter fw = new FileWriter(usuario, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            
            FileReader fr = new FileReader(usuario);
            BufferedReader br = new BufferedReader(fr);
            

            String linha = null;
            while((linha = br.readLine()) != null) {
                if (br.readLine == nome)
                {
                    Partida.selecionaModulo();
                }
                if (br.readLine == id_usuario)
                {
                    Partida.selecionaModulo();
                }
                else
                    br.write(Partida.nome);
                br.newLine(); //adiciona uma linha
                br.write(Partida.id_usuario);
                br.newLine();
            }
            
            br.close();
            fr.close();
            
=======
 
    //Construtor
    public Usuario (String nome,int id_usuario)
    {
        this.nome=nome;
        this.id_usuario=id_usuario;

    }
    
     
                    br.close();
                    fr.close();
           
>>>>>>> origin/master
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    */
    //Metodos
    /*
    public class Usuario{
    private static final int ESTATISTICA_XML="Estatistica.xml";
    public Usuario(){
    public void
    }
    }
     */
    
  
    
}
