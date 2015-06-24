/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

import memoratica_pcs.Partida;

/**
 *
 * @author Gian
 */
public class Mesa extends javax.swing.JFrame {

    //faltou o timer para quando  a 2 peca for clicada, não consegui fazer e acho que um loop pra todo esse codigo ia
    //ajudar, mas estava dando erros
    public Mesa(final char modulo) {
        final Partida Partida1 = new Partida(modulo);
        initComponents();

//array list de botoes
        final ArrayList<JButton> botoes = new ArrayList();
        {
            botoes.add(BotaoP1);//0
            botoes.add(BotaoP2);//1
            botoes.add(BotaoP3);//2
            botoes.add(BotaoP4);
            botoes.add(BotaoP5);
            botoes.add(BotaoP6);
            botoes.add(BotaoP7);
            botoes.add(BotaoP8);
            botoes.add(BotaoP9);
            botoes.add(BotaoP10);
            botoes.add(BotaoP11);
            botoes.add(BotaoP12);
            botoes.add(BotaoP13);
            botoes.add(BotaoP14);
            botoes.add(BotaoP15);
            botoes.add(BotaoP16);
            botoes.add(BotaoP17);
            botoes.add(BotaoP18);
            botoes.add(BotaoP19);
            botoes.add(BotaoP20);
        }

        botoes.get(0).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(0).setText(" " + Partida1.getTabuleiro().tabuleiro[0][0].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[0][0].getOperando1());

                Partida1.getTabuleiro().tabuleiro[0][0].desvirar();// desvira a peça 0
                botoes.get(0).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida

                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 0)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[0][0], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][0])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            
                            botoes.get(0).setEnabled(true);
                            botoes.get(cont).setEnabled(true);                            
                            botoes.get(0).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache ouro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[0][0].desvirar();//ambas  são viradas novamente

                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][0]).desvirar();
                        }
                        botoes.get(0).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(0).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });

        botoes.get(1).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(1).setText(" " + Partida1.getTabuleiro().tabuleiro[0][1].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[0][1].getOperando1());

                Partida1.getTabuleiro().tabuleiro[0][1].desvirar();// desvira a peça 0
                botoes.get(1).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida

                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 1)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[0][1], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][1])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            //as pecas sao viradas novamente no metodo jogada
                            botoes.get(1).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(1).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não seja par
                        else {
                            Partida1.getTabuleiro().tabuleiro[0][1].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][1]).desvirar();
                        }
                        botoes.get(1).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(1).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });

        botoes.get(2).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(2).setText(" " + Partida1.getTabuleiro().tabuleiro[0][2].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[0][2].getOperando1());
                Partida1.getTabuleiro().tabuleiro[0][2].desvirar();// desvira a peça 0
                botoes.get(2).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida

                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 2)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[0][2], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][2])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(2).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(2).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[0][2].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][2]).desvirar();
                        }
                        botoes.get(2).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(2).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });

        botoes.get(3).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(3).setText(" " + Partida1.getTabuleiro().tabuleiro[0][3].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[0][3].getOperando1());
                Partida1.getTabuleiro().tabuleiro[0][3].desvirar();// desvira a peça 0
                botoes.get(3).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida

                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 3)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[0][3], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][3])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(3).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(3).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[0][3].desvirar();//ambas  são viradas novamente

                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][3]).desvirar();
                        }
                        botoes.get(3).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(3).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });

        botoes.get(4).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(4).setText(" " + Partida1.getTabuleiro().tabuleiro[1][0].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[1][0].getOperando1());
                Partida1.getTabuleiro().tabuleiro[1][0].desvirar();// desvira a peça 0
                botoes.get(4).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida

                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 4)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[1][0], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[1][0])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(4).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(4).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[1][0].desvirar();//ambas  são viradas novamente

                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[1][0]).desvirar();
                        }
                        botoes.get(4).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(4).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });

        botoes.get(5).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(5).setText(" " + Partida1.getTabuleiro().tabuleiro[1][1].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[1][1].getOperando1());
                Partida1.getTabuleiro().tabuleiro[1][1].desvirar();// desvira a peça 0
                botoes.get(5).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
                
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 5)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[1][1], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[1][1])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(5).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(5).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[1][1].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[1][1]).desvirar();
                        }
                        botoes.get(5).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(5).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });
        botoes.get(6).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(6).setText(" " + Partida1.getTabuleiro().tabuleiro[1][2].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[1][2].getOperando1());
                Partida1.getTabuleiro().tabuleiro[1][2].desvirar();// desvira a peça 0
                botoes.get(6).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
               
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 6)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[1][2], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[1][2])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(6).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(6).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[1][2].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[1][2]).desvirar();
                        }
                        botoes.get(6).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(6).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });
        botoes.get(7).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(7).setText(" " + Partida1.getTabuleiro().tabuleiro[1][3].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[1][3].getOperando1());
                Partida1.getTabuleiro().tabuleiro[1][3].desvirar();// desvira a peça 0
                botoes.get(7).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
                
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 7)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[1][3], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[1][3])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(7).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(7).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[1][3].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[1][3]).desvirar();
                        }
                        botoes.get(7).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(7).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });
        botoes.get(8).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(8).setText(" " + Partida1.getTabuleiro().tabuleiro[2][0].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[2][0].getOperando1());
                Partida1.getTabuleiro().tabuleiro[2][0].desvirar();// desvira a peça 0
                botoes.get(8).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
                
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 8)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[2][0], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[2][0])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(8).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(8).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[2][0].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[2][0]).desvirar();
                        }
                        botoes.get(8).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(8).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });
        botoes.get(9).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(9).setText(" " + Partida1.getTabuleiro().tabuleiro[2][1].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[2][1].getOperando1());
                Partida1.getTabuleiro().tabuleiro[2][1].desvirar();// desvira a peça 0
                botoes.get(9).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
                
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 9)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[2][1], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[2][1])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(9).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(9).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[2][1].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[2][1]).desvirar();
                        }
                        botoes.get(9).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(9).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });

        botoes.get(10).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(10).setText(" " + Partida1.getTabuleiro().tabuleiro[2][2].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[2][2].getOperando1());
                Partida1.getTabuleiro().tabuleiro[2][2].desvirar();// desvira a peça 0
                botoes.get(10).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
                
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 10)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[2][2], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[2][2])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(10).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(10).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[2][2].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[2][2]).desvirar();
                        }
                        botoes.get(10).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(10).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });

        botoes.get(11).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(11).setText(" " + Partida1.getTabuleiro().tabuleiro[2][3].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[2][3].getOperando1());
                Partida1.getTabuleiro().tabuleiro[2][3].desvirar();// desvira a peça 0
                botoes.get(11).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
               
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 11)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[2][3], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[2][3])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(11).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(11).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[2][3].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[2][3]).desvirar();
                        }
                        botoes.get(11).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(11).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });

        botoes.get(12).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(12).setText(" " + Partida1.getTabuleiro().tabuleiro[3][0].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[3][0].getOperando1());
                Partida1.getTabuleiro().tabuleiro[3][0].desvirar();// desvira a peça 0
                botoes.get(12).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
               
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 12)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[3][0], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[3][0])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(12).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(12).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[3][0].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[3][0]).desvirar();
                        }
                        botoes.get(12).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(12).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });
        botoes.get(13).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(13).setText(" " + Partida1.getTabuleiro().tabuleiro[3][1].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[3][1].getOperando1());
                Partida1.getTabuleiro().tabuleiro[3][1].desvirar();// desvira a peça 0
                botoes.get(13).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
                
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 13)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[3][1], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[3][1])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(13).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(13).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[3][1].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[3][1]).desvirar();
                        }
                        botoes.get(13).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(13).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });
        botoes.get(14).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(14).setText(" " + Partida1.getTabuleiro().tabuleiro[3][2].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[3][2].getOperando1());
                Partida1.getTabuleiro().tabuleiro[3][2].desvirar();// desvira a peça 0
                botoes.get(14).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
               
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 14)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[3][2], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[3][2])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(14).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(14).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[3][2].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[3][2]).desvirar();
                        }
                        botoes.get(14).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(14).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });
        botoes.get(15).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(15).setText(" " + Partida1.getTabuleiro().tabuleiro[3][3].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[3][3].getOperando1());
                Partida1.getTabuleiro().tabuleiro[3][3].desvirar();// desvira a peça 0
                botoes.get(15).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
                
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 15)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[3][3], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[3][3])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(15).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(15).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[3][3].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[3][3]).desvirar();
                        }
                        botoes.get(15).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(15).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });
        botoes.get(16).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(16).setText(" " + Partida1.getTabuleiro().tabuleiro[4][0].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[4][0].getOperando1());
                Partida1.getTabuleiro().tabuleiro[4][0].desvirar();// desvira a peça 0
                botoes.get(16).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
               
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 16)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[4][0], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[4][0])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(16).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(16).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[4][0].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[4][0]).desvirar();
                        }
                        botoes.get(16).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(16).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });
        botoes.get(17).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(17).setText(" " + Partida1.getTabuleiro().tabuleiro[4][1].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[4][1].getOperando1());
                Partida1.getTabuleiro().tabuleiro[4][1].desvirar();// desvira a peça 0
                botoes.get(17).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
                
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 17)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[4][1], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[4][1])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(17).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(17).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[4][1].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[4][1]).desvirar();
                        }
                        botoes.get(17).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(17).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });
        botoes.get(18).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(18).setText(" " + Partida1.getTabuleiro().tabuleiro[4][2].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[4][2].getOperando1());
                Partida1.getTabuleiro().tabuleiro[4][2].desvirar();// desvira a peça 0
                botoes.get(18).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
                
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 18)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[4][2], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[4][2])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(18).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(18).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[4][2].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[4][2]).desvirar();
                        }
                        botoes.get(18).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(18).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });
        botoes.get(19).addActionListener(new ActionListener() {//pega o primeiro botao da lista
            public void actionPerformed(ActionEvent evt) {

                botoes.get(19).setText(" " + Partida1.getTabuleiro().tabuleiro[4][3].getOperando2() + " " + modulo + " " + Partida1.getTabuleiro().tabuleiro[4][3].getOperando1());
                Partida1.getTabuleiro().tabuleiro[4][3].desvirar();// desvira a peça 0
                botoes.get(19).setEnabled(false);//desabilita o botao para que nao possa ser clicado de novo ate que outra peça seja escolhida
                
                for (int cont = 0; cont < 20; cont++) {//percorre a lista em busca de outro botão pressionado

                    if ((botoes.get(cont).isEnabled() == false) && (cont != 19)) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[4][3], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[4][3])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            botoes.get(19).setEnabled(true);
                            botoes.get(cont).setEnabled(true); 
                            botoes.get(19).setVisible(false);// caso bem sucedido
                            botoes.get(cont).setVisible(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[4][3].desvirar();//ambas  são viradas novamente                        
                            Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[4][3]).desvirar();
                        }
                        botoes.get(19).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(19).setText(" ");
                        botoes.get(cont).setText(" ");
                        break;

                    }
                }

            }
        });

        //não consegui fazer um array list usando o i e j
//       jButton1.setText(" "+Partida1.getTabuleiro().tabuleiro[0][0].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[0][0].getOperando1()); 
//       jButton2.setText(" "+Partida1.getTabuleiro().tabuleiro[0][1].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[0][1].getOperando1());
//       jButton3.setText(" "+Partida1.getTabuleiro().tabuleiro[0][2].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[0][2].getOperando1());
//       jButton4.setText(" "+Partida1.getTabuleiro().tabuleiro[0][3].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[0][3].getOperando1());
//       jButton5.setText(" "+Partida1.getTabuleiro().tabuleiro[1][0].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[1][0].getOperando1());
//       jButton6.setText(" "+Partida1.getTabuleiro().tabuleiro[1][1].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[1][1].getOperando1());
//       jButton7.setText(" "+Partida1.getTabuleiro().tabuleiro[1][2].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[1][2].getOperando1());
//       jButton8.setText(" "+Partida1.getTabuleiro().tabuleiro[1][3].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[1][3].getOperando1());
//       jButton9.setText(" "+Partida1.getTabuleiro().tabuleiro[2][0].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[2][0].getOperando1());
//       jButton10.setText(" "+Partida1.getTabuleiro().tabuleiro[2][1].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[2][1].getOperando1());
//       jButton11.setText(" "+Partida1.getTabuleiro().tabuleiro[2][2].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[2][2].getOperando1());
//       jButton12.setText(" "+Partida1.getTabuleiro().tabuleiro[2][3].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[2][3].getOperando1());
//       jButton13.setText(" "+Partida1.getTabuleiro().tabuleiro[3][0].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[3][0].getOperando1());
//       jButton14.setText(" "+Partida1.getTabuleiro().tabuleiro[3][1].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[3][1].getOperando1());
//       jButton15.setText(" "+Partida1.getTabuleiro().tabuleiro[3][2].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[3][2].getOperando1());
//       jButton16.setText(" "+Partida1.getTabuleiro().tabuleiro[3][3].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[3][3].getOperando1());
//       jButton17.setText(" "+Partida1.getTabuleiro().tabuleiro[4][0].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[4][0].getOperando1());
//       jButton18.setText(" "+Partida1.getTabuleiro().tabuleiro[4][1].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[4][1].getOperando1());
//       jButton19.setText(" "+Partida1.getTabuleiro().tabuleiro[4][2].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[4][2].getOperando1());
//       jButton20.setText(" "+Partida1.getTabuleiro().tabuleiro[4][3].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[4][3].getOperando1());
//
//       
    }

    private Mesa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotaoP1 = new javax.swing.JButton();
        BotaoP2 = new javax.swing.JButton();
        BotaoP3 = new javax.swing.JButton();
        BotaoP4 = new javax.swing.JButton();
        BotaoP5 = new javax.swing.JButton();
        BotaoP6 = new javax.swing.JButton();
        BotaoP7 = new javax.swing.JButton();
        BotaoP8 = new javax.swing.JButton();
        BotaoP9 = new javax.swing.JButton();
        BotaoP10 = new javax.swing.JButton();
        BotaoP11 = new javax.swing.JButton();
        BotaoP12 = new javax.swing.JButton();
        BotaoP13 = new javax.swing.JButton();
        BotaoP14 = new javax.swing.JButton();
        BotaoP15 = new javax.swing.JButton();
        BotaoP16 = new javax.swing.JButton();
        BotaoP17 = new javax.swing.JButton();
        BotaoP18 = new javax.swing.JButton();
        BotaoP19 = new javax.swing.JButton();
        BotaoP20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memorática");
        setBackground(new java.awt.Color(255, 51, 51));

        BotaoP1.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP1.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP2.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP2.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP3.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP3.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP4.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP4.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP5.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP5.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP6.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP6.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP7.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP7.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP8.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP8.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP9.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP9.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP10.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP10.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP11.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP11.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP12.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP12.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N
        BotaoP12.setBorderPainted(false);
        BotaoP12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BotaoP13.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP13.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP14.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP14.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP15.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP15.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP16.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP16.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP17.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP17.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP18.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP18.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP19.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP19.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        BotaoP20.setBackground(new java.awt.Color(255, 102, 51));
        BotaoP20.setFont(new java.awt.Font("Vani", 1, 17)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoP17, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(BotaoP13, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotaoP14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(BotaoP18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoP19, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoP20, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoP15, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoP16, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotaoP9, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BotaoP1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(BotaoP5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoP2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoP3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotaoP7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(BotaoP10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotaoP6, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(BotaoP11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotaoP8, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(BotaoP4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoP12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoP4, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(BotaoP3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(BotaoP2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(BotaoP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoP8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoP12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoP16, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(BotaoP15, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(BotaoP13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoP14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoP20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP19, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP18, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP17, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoP1;
    private javax.swing.JButton BotaoP10;
    private javax.swing.JButton BotaoP11;
    private javax.swing.JButton BotaoP12;
    private javax.swing.JButton BotaoP13;
    private javax.swing.JButton BotaoP14;
    private javax.swing.JButton BotaoP15;
    private javax.swing.JButton BotaoP16;
    private javax.swing.JButton BotaoP17;
    private javax.swing.JButton BotaoP18;
    private javax.swing.JButton BotaoP19;
    private javax.swing.JButton BotaoP2;
    private javax.swing.JButton BotaoP20;
    private javax.swing.JButton BotaoP3;
    private javax.swing.JButton BotaoP4;
    private javax.swing.JButton BotaoP5;
    private javax.swing.JButton BotaoP6;
    private javax.swing.JButton BotaoP7;
    private javax.swing.JButton BotaoP8;
    private javax.swing.JButton BotaoP9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
