/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import memoratica_pcs.Partida;
import memoratica_pcs.Peca;

/**
 *
 * @author Gian
 */
public class Mesa extends javax.swing.JFrame {

    /**
     * Creates new form Mesa
     */
    public Mesa(final char modulo) {
        final Partida Partida1 = new Partida(modulo);
        initComponents();
//array list de botoes
        final ArrayList<JToggleButton> botoes = new ArrayList();
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
                    
                    if ((botoes.get(cont).isSelected() == true) && (botoes.get(cont)!= botoes.get(0))) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[0][0], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][0])) == true) 
                        {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            
                           
                            botoes.get(0).setEnabled(false);// caso bem sucedido
                            botoes.get(cont).setEnabled(false);//ambos os BOTOES sao desabilitados
                            break;
                           
                        }
                        //caso ache outro botão pressionado,mas não  que seja par da outra peca
                        else
                            Partida1.getTabuleiro().tabuleiro[0][0].desvirar();//ambas  são viradas novamente
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
                    
                    if ((botoes.get(cont).isSelected() == true) && (botoes.get(cont)!= botoes.get(1))) { //diferente dele propio
                        //caso encontre outro botão pressionado e seja o par
                        if (Partida1.jogada(Partida1.getTabuleiro().tabuleiro[0][1], Partida1.selecionarPeca(Partida1.getTabuleiro().tabuleiro[0][1])) == true) 
                        {//compara a peca 0 com a  outra peca virada do  tabuleiro.
                            //as pecas sao viradas novamente no metodo jogada
                            botoes.get(1).setEnabled(false);// caso bem sucedido
                            botoes.get(cont).setEnabled(false);//ambos os BOTOES sao desabilitados
                            break;
                           
                        }
                        //caso ache outro botão pressionado,mas não seja par
                        else
                            Partida1.getTabuleiro().tabuleiro[0][1].desvirar();//ambas  são viradas novamente
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
        

        //ver se consigo fazer um array list depois
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
        BotaoP1 = new javax.swing.JToggleButton();
        BotaoP3 = new javax.swing.JToggleButton();
        BotaoP4 = new javax.swing.JToggleButton();
        BotaoP5 = new javax.swing.JToggleButton();
        BotaoP2 = new javax.swing.JToggleButton();
        BotaoP8 = new javax.swing.JToggleButton();
        BotaoP6 = new javax.swing.JToggleButton();
        BotaoP7 = new javax.swing.JToggleButton();
        BotaoP11 = new javax.swing.JToggleButton();
        BotaoP12 = new javax.swing.JToggleButton();
        BotaoP13 = new javax.swing.JToggleButton();
        BotaoP10 = new javax.swing.JToggleButton();
        BotaoP16 = new javax.swing.JToggleButton();
        BotaoP14 = new javax.swing.JToggleButton();
        BotaoP15 = new javax.swing.JToggleButton();
        BotaoP9 = new javax.swing.JToggleButton();
        BotaoP17 = new javax.swing.JToggleButton();
        BotaoP20 = new javax.swing.JToggleButton();
        BotaoP18 = new javax.swing.JToggleButton();
        BotaoP19 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoP1ActionPerformed(evt);
            }
        });

        BotaoP8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoP8ActionPerformed(evt);
            }
        });

        BotaoP11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoP11ActionPerformed(evt);
            }
        });

        BotaoP14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoP14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoP2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoP3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoP4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoP5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoP6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoP7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoP8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BotaoP17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotaoP18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BotaoP19, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(BotaoP9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(BotaoP10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(BotaoP11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(BotaoP13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(BotaoP14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BotaoP15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotaoP16, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoP20, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoP12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(279, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoP5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoP9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoP13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP16, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoP17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP18, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP19, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoP20, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void BotaoP8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoP8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoP8ActionPerformed

    private void BotaoP11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoP11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoP11ActionPerformed

    private void BotaoP14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoP14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoP14ActionPerformed

    private void BotaoP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoP1ActionPerformed

    }//GEN-LAST:event_BotaoP1ActionPerformed

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
    private javax.swing.JToggleButton BotaoP1;
    private javax.swing.JToggleButton BotaoP10;
    private javax.swing.JToggleButton BotaoP11;
    private javax.swing.JToggleButton BotaoP12;
    private javax.swing.JToggleButton BotaoP13;
    private javax.swing.JToggleButton BotaoP14;
    private javax.swing.JToggleButton BotaoP15;
    private javax.swing.JToggleButton BotaoP16;
    private javax.swing.JToggleButton BotaoP17;
    private javax.swing.JToggleButton BotaoP18;
    private javax.swing.JToggleButton BotaoP19;
    private javax.swing.JToggleButton BotaoP2;
    private javax.swing.JToggleButton BotaoP20;
    private javax.swing.JToggleButton BotaoP3;
    private javax.swing.JToggleButton BotaoP4;
    private javax.swing.JToggleButton BotaoP5;
    private javax.swing.JToggleButton BotaoP6;
    private javax.swing.JToggleButton BotaoP7;
    private javax.swing.JToggleButton BotaoP8;
    private javax.swing.JToggleButton BotaoP9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
