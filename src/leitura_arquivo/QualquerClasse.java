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
 
        private static final String ESTATISTICA_XML = "estatistica.xml";
        
            public void salvarJogo(Partida partida) throws IOException {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(ESTATISTICA_XML))) {
            xmlEncoder.writeObject(partida);
        }
        
        
        public void salvarJogo(Partida jogo) throws IOException {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(ESTATISTICA_XML))) {
            xmlEncoder.writeObject(jogo);
        }
    }
    
    public Partida recuperarJogo() throws IOException {
        Partida jogo = new JogoOrtografia();
        File arquivo = new File(ORTOGRAFIA_XML);
        if (arquivo.exists()) {
            try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(ORTOGRAFIA_XML))) {
                jogo = (JogoOrtografia) xmlDecoder.readObject();
            }
        }    
        return jogo;
    }
}

        
        
    }
}
