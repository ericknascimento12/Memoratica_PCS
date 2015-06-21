/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leitura_arquivo;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import memoratica_pcs.Partida;

/**
 *
 * @author LABCCET
 */
public class QualquerClasse {
 
        private static final String USERDATA_XML = "userdata.xml";
        
            public void salvarJogo(Partida partida) throws IOException {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(USERDATA_XML))) {
            xmlEncoder.writeObject(partida);
        }
        
        
     /*   public void salvarJogo(Partida jogo) throws IOException {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(USERDATA_XML))) {
            xmlEncoder.writeObject(jogo);
        }
    }*/
    
   /*
    public Partida recuperarJogo() throws IOException {
        Partida jogo = new Partida();
        File arquivo = new File(USERDATA_XML);
        if (arquivo.exists()) {
            try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(USERDATA_XML))) {
                jogo = (Partida) xmlDecoder.readObject();
            }
        }    
        return jogo;
    }
}*/

     
        
    }
}
