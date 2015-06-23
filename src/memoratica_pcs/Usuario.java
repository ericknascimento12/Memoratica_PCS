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
import java.io.Serializable;



public class Usuario {
     // Atributos
    
    private String nome;
    Partida partida;
    char operador;

    public Usuario(String nome, Partida partida, char operador) {
        this.nome = nome;
        this.partida = partida;
        this.operador = operador;
    }
    
    public Usuario(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }
    
    public static void obterResultados(Partida partida)
    {
        partida.verificaTempo();
   
     
    }
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
    
  
    
