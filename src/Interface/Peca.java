/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.util.Random;
/**
 *
 * @author Gian
 */
public class Peca   {
   
    //Atributos
    int operando1;
    int operando2;
    boolean virada;// peça esta virada ou não
     int resultado;//resultado da operação
   
    //Construtor
    public Peca (int resultado,char operador)
    {   /*algoritimo de criação dos operando em cima do valor do resultado*/
        
        this.virada = false;
      
        
    Random rand = new Random();
        this.operando1 = rand.nextInt(resultado) + 1;          
        
        if(operador =='+') {
        this.operando2=resultado-operando1; 
        
        }
        
        else if(operador == '-'){
        this.operando2=resultado+operando1;
        }
        
        else if(operador == '/'){
          this.operando2=resultado*operando1;
          //ao fazer o botão trocar a ordem do operando1 e operando 2 op2/op1=resultado
        }
        
        else if (operador == '*'){
                
            while(resultado%operando1!=0)
            {
                this.operando1=operando1+1;
            }
                                           
             this.operando2=resultado/operando1;
             
            
          }          
            
    } 
    
     public void desvirar()
    {
        virada=true;
        
    }
        
   }
    
    
    
  
    
    
    

