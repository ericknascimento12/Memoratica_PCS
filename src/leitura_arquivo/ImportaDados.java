/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leitura_arquivo;


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
