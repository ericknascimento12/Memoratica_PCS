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
public class Peca {
    
    //Atributos
   int operando1;
   int operando2;
   char operador;
   boolean virada;
   int resultado;
    //Construtor
    public Peca()
    {
        virada = false;   
    }
    
    int resultadoOperacao(){
        if(operador =='+') {
          resultado = operando1+operando2;
        } 
        
        if(operador == '-'){
         resultado = operando1-operando2;
        }
        
        if(operador == '/'){
         resultado = operando1/operando2;
        }
        
        if (operador == '*'){
          resultado = operando1 * operando2;
        }
        
        return resultado;
    }
    
    //métodos
    
}
