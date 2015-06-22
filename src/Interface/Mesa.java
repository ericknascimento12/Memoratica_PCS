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

                    if ((botoes.get(cont).isEnabled() == false) && (botoes.get(cont) != botoes.get(0))) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[0][0], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][0])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.

                            botoes.get(0).setEnabled(false);// caso bem sucedido
                            botoes.get(cont).setEnabled(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[0][0].desvirar();//ambas  são viradas novamente
                        }
                        Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][0]).desvirar();
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

                    if ((botoes.get(cont).isEnabled() == false) && (botoes.get(cont) != botoes.get(1))) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[0][1], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][1])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            //as pecas sao viradas novamente no metodo jogada
                            botoes.get(1).setEnabled(false);// caso bem sucedido
                            botoes.get(cont).setEnabled(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não seja par
                        else {
                            Partida1.getTabuleiro().tabuleiro[0][1].desvirar();//ambas  são viradas novamente
                        }
                        Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][1]).desvirar();
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

                    if ((botoes.get(cont).isEnabled() == false) && (botoes.get(cont) != botoes.get(2))) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[0][2], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][2])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.

                            botoes.get(2).setEnabled(false);// caso bem sucedido
                            botoes.get(cont).setEnabled(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[0][2].desvirar();//ambas  são viradas novamente
                        }
                        Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][2]).desvirar();
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

                    if ((botoes.get(cont).isEnabled() == false) && (botoes.get(cont) != botoes.get(3))) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[0][3], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][3])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.

                            botoes.get(3).setEnabled(false);// caso bem sucedido
                            botoes.get(cont).setEnabled(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[0][3].desvirar();//ambas  são viradas novamente
                        }
                        Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][3]).desvirar();
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

                    if ((botoes.get(cont).isEnabled() == false) && (botoes.get(cont) != botoes.get(4))) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[1][0], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[1][0])) == true) {//compara a peca 0 com a  outra peca virada do  tabuleiro.

                            botoes.get(4).setEnabled(false);// caso bem sucedido
                            botoes.get(cont).setEnabled(false);//ambos os BOTOES sao desabilitados
                            break;

                        } //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else {
                            Partida1.getTabuleiro().tabuleiro[1][0].desvirar();//ambas  são viradas novamente
                        }
                        Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[1][0]).desvirar();
                        botoes.get(4).setEnabled(true);// caso bem sucedido
                        botoes.get(cont).setEnabled(true);//ambos os BOTOES sao desabilitados
                        botoes.get(4).setText(" ");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoP17, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(BotaoP18, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(BotaoP19, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BotaoP20, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoP13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(BotaoP14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(BotaoP15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BotaoP16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(BotaoP9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(BotaoP10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(BotaoP11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(BotaoP12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(BotaoP5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(BotaoP6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(BotaoP7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(BotaoP8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(BotaoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(BotaoP2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(BotaoP3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(BotaoP4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoP4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoP16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoP20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP19, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP18, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP17, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
