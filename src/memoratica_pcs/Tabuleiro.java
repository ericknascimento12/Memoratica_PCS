/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoratica_pcs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class Tabuleiro {
    //atributos

    public Peca[][] tabuleiro = new Peca[5][4];// cria matriz de pecas 
    char operador;//seleciona o operador

    public Tabuleiro(char operador) //recebe parametros?
    {
        this.operador = operador;
        int cont = 0;
        int[] resultados = new int[10];
        ///////////////////////Lista Numeros///////////////////////
        ArrayList<Integer> numeros = new ArrayList();  //lista com valores de 1~100 
        for (int i = 10; i < 101; i++) {
            numeros.add(i);
        }

        Collections.shuffle(numeros);  //Embaralhamos os resultados:   
        for (int i = 0; i < 10; i++) //Pegamos 10 aleatÃ³rios  
        {
            resultados[i] = (numeros.get(i));
        }
        int[] resultadosB = resultados.clone();//cria copia com os resultados

///////////////////////Lista Pecas/////////////////////////
        ArrayList<Peca> pecas = new ArrayList();
        for (int i = 0; i < 10; i++) //armazena 10 primeiros resultados na lista
        {
            pecas.add(new Peca(resultados[i], operador));
        }
        for (int i = 0; i < 10; i++) {
            pecas.add(new Peca(resultadosB[i], operador));//armazenas os 10 resultados restantes
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                tabuleiro[i][j] = pecas.get(cont++);//armazena a peca na posicÃ£o do tabuleiro
            }
        }

        this.distribuirPecas(); //toda vez que uma novo tabuleiro for criado as pecas sao distribuidas

    }

    private void distribuirPecas() //embaralha as pecas no tabuleiro ( jogar para o tabuleiro)
    {

        Random random = new Random();

        for (int i = tabuleiro.length - 1; i > 0; i--) {
            for (int j = tabuleiro[i].length - 1; j > 0; j--) {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);

                Peca temp = tabuleiro[i][j];
                tabuleiro[i][j] = tabuleiro[m][n];
                tabuleiro[m][n] = temp;

            }

        }

    }

    public Peca getPeca(int i, int j) {
        return tabuleiro[i][j];
    }
}
