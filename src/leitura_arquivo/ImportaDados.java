/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leitura_arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import memoratica_pcs.Usuario;
/*

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import memoratica_pcs.Usuario;

/**
 *
 * @author LABCCET
 */

public class ImportaDados {

        private List<Usuario> ListaUsuarios;
        private Usuario usuario;
        
        public List<Usuario> importarUsuarios(File arquivo) throws IOException {
        BufferedReader reader = null;
       
        ListaUsuarios = new ArrayList<>();
        try{
            reader = new BufferedReader (new FileReader(arquivo));
            while (reader.ready()) {
                reader.readLine();
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        return ListaUsuarios;
        
    }
        

        
    }
    
  /*  public void gravarusuario(){
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
    */    
            
                 
                       
    
    /*
    
    
    
    

