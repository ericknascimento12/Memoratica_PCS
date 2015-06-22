/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoratica_pcs;

import java.util.Random;
import java.util.Scanner;

public class Partida {

    //atributos
    private String id_partida;
    int cronometro;
    int tempo;
    Tabuleiro Tabuleiro;

    //construtor
    public Partida(char operador) {
        this.Tabuleiro = new Tabuleiro(operador);

    }

    public Tabuleiro getTabuleiro() {
        return Tabuleiro;
    }

    //mÃ©todos   
    private boolean inicializarPartida() {

        inicializarCronometro(); //Inicializa o cronometro

        if (cronometro == 0) // caso o cronometro chegue a 0 a partida acaba(false)
        {
            return false;
        }

        return true;
    }

    public boolean inicializarCronometro()//inicializa o cronometro ( fazer depois)
    {

        cronometro = tempo;
        try {
            for (int i = cronometro; i > 0; i--) {
                System.out.println(i + " segundos");
                Thread.sleep(1000); // 1 segundo  
            }
            System.out.println("Seu tempo acabou!");
        } catch (InterruptedException e) {

            return true;
        }

        return true;

    }

    public Peca selecionarPeca(Peca peca) //Roda o tabuleiro a procura da segunda peca virada( diferente da usada como parametro)   
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (peca != Tabuleiro.tabuleiro[i][j]) {
                    if (Tabuleiro.tabuleiro[i][j].virada = true) {
                        return Tabuleiro.tabuleiro[i][j];
                    }
                }
            }
        }
        return null;

    }

    public boolean jogada(Peca peca1, Peca peca2)// como vou armazenar as pecas selecionadas em peca 1 e peca 2??
    {

        if ((peca1.virada = true) && (peca2.virada = true)) {

            if (peca1.resultado != peca2.resultado) {
                peca1.desvirar();
                peca2.desvirar();
                return false;
            }
            if ((peca1.resultado == peca2.resultado)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    public void verificaTempo()// verifica o tempo que o jogador levou para ganhar
    {
        int tempoF = tempo - cronometro;
        System.out.println("Tempo gasto:" + tempoF);

    }

}
