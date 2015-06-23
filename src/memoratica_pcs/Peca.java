/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoratica_pcs;

import java.util.Random;

/**
 *
 * @author Gian
 */
public class Peca {

    //Atributos
    int operando1;
    int operando2;
    boolean virada;// peca esta virada ou nao
    int resultado;//resultado da operacao

    //Construtor
    public Peca(int resultado, char operador) {   /*algoritimo de criacao dos operando em cima do valor do resultado*/

        this.virada = false;
        this.resultado = resultado;

        Random rand = new Random();
        this.operando1 = rand.nextInt(resultado) + 1;

        if (operador == '+') {
            this.operando2 = resultado - operando1;

        } else if (operador == '-') {
            this.operando2 = resultado + operando1;

        } else if (operador == '/') {
            this.operando2 = resultado * operando1;
            //ao fazer o botaoo trocar a ordem do operando1 e operando 2 op2/op1=resultado
        } else if (operador == '*') {

            while (resultado % operando1 != 0) {
                this.operando1 = operando1 + 1;
            }

            this.operando2 = resultado / operando1;

        }

    }

    public void desvirar() {
        if (virada == true) {
            virada = false;
        } else {
            virada = true;
        }

    }

    public int getOperando1() {
        return operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public int getResultado() {
        return resultado;
    }

}
