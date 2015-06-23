/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leitura_xml;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import memoratica_pcs.Usuario;

/**
 *
 * @author LABCCET
 */

public class GravaDadosXML {
    
   
    private static final String USERDATA_XML = "userdata.xml";
   
    /**
     *
     * @param usuario
     * @throws IOException
     */
    public void salvarJogo(Usuario usuario) throws IOException {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(USERDATA_XML))) {
            xmlEncoder.writeObject(usuario);//tá gerando o xml a partir do objeto de usuário
        }     
    }

       public Usuario recuperarJogo() throws IOException {
        Usuario usuario = new Usuario();
        File arquivo = new File(USERDATA_XML);
        if (arquivo.exists()) {
            try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(USERDATA_XML))) {
                usuario = (Usuario) xmlDecoder.readObject();
            }
        }    
        return usuario;
    }
}

    
    

  