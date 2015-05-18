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
    private int id_usuario;
    private String nome;
    private char modulo_liberado;
 //   private static final String USUARIO_XML = "usuario.xml";

    
    //Construtor
    public Usuario (String nome,int id_usuario)
    {
        this.nome=nome;
        this.id_usuario=id_usuario;

    }
    
    public void gravarusuario(){
            File usuario = new File("usuario.txt");//arquivo no local do projeto
        try {
            if (usuario.exists() == false) {
                //se não haver esse arquivo ele cria um
                usuario.createNewFile();
            }

            File[] usuarios = usuario.listFiles(); //array para guardar as linhas do arquivo


            FileWriter fw = new FileWriter(usuario, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(nome);
            bw.newLine(); //adiciona uma linha
            bw.write(id_usuario);
            bw.newLine();
            bw.close();
            fw.close();

            FileReader fr = new FileReader(usuario);
            BufferedReader br = new BufferedReader(fr);

            String linha = null;
            while ((linha = br.readLine()) != null) 
            if ((br.readLine()).equals(nome))
              {  
                if ((br.readLine()).equals(id_usuario))
                                       
               }
           
            br.close();
            fr.close();
           
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
   
    //Metodos
    
    
    public String obterEstatistica(int id_usuario)
    {
       int tempo=0;
       
       
       return "";
               
    }
    
}
