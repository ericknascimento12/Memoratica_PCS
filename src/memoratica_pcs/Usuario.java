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
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;






public class Usuario {
     // Atributos
    private int id_usuario;
    private String nome;
    private char modulo_liberado;
    private static final String USUARIO_XML = "usuario.xml";

    
    //Construtor
    public Usuario (String nome,int id_usuario)
    {
        this.nome=nome;
        this.id_usuario=id_usuario;

    }
    
    public void salvarUsuario(Usuario usuario) throws IOException {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(USUARIO_XML))) {
            xmlEncoder.writeObject(usuario);
        }
    }
 /*public Usuario verificarUsuario() throws IOException {
        Usuario usuario = new usuario();
        File arquivo = new File(USUARIO_XML);
        if (arquivo.exists()) {
            try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(ORTOGRAFIA_XML))) {
                jogo = (JogoOrtografia) xmlDecoder.readObject();
            }
        }    
*/
    
    //Metodos
    
    
    public String obterEstatistica(int id_usuario)
    {
       int tempo=0;
       
       
       return "";
               
    }
    
}
