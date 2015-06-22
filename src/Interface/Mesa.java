/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JButton;
import memoratica_pcs.Partida;

/**
 *
 * @author Gian
 */
public class Mesa extends javax.swing.JFrame {

    /**
     * Creates new form Mesa
     */
    public Mesa(char modulo) {
       Partida Partida1=new Partida(modulo);
       initComponents();
      
       
       jButton1.setText(" "+Partida1.getTabuleiro().tabuleiro[0][0].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[0][0].getOperando1()); 
       jButton2.setText(" "+Partida1.getTabuleiro().tabuleiro[0][1].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[0][1].getOperando1());
       jButton3.setText(" "+Partida1.getTabuleiro().tabuleiro[0][2].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[0][2].getOperando1());
       jButton4.setText(" "+Partida1.getTabuleiro().tabuleiro[0][3].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[0][3].getOperando1());
       jButton5.setText(" "+Partida1.getTabuleiro().tabuleiro[1][0].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[1][0].getOperando1());
       jButton6.setText(" "+Partida1.getTabuleiro().tabuleiro[1][1].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[1][1].getOperando1());
       jButton7.setText(" "+Partida1.getTabuleiro().tabuleiro[1][2].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[1][2].getOperando1());
       jButton8.setText(" "+Partida1.getTabuleiro().tabuleiro[1][3].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[1][3].getOperando1());
       jButton9.setText(" "+Partida1.getTabuleiro().tabuleiro[2][0].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[2][0].getOperando1());
       jButton10.setText(" "+Partida1.getTabuleiro().tabuleiro[2][1].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[2][1].getOperando1());
       jButton11.setText(" "+Partida1.getTabuleiro().tabuleiro[2][2].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[2][2].getOperando1());
       jButton12.setText(" "+Partida1.getTabuleiro().tabuleiro[2][3].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[2][3].getOperando1());
       jButton13.setText(" "+Partida1.getTabuleiro().tabuleiro[3][0].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[3][0].getOperando1());
       jButton14.setText(" "+Partida1.getTabuleiro().tabuleiro[3][1].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[3][1].getOperando1());
       jButton15.setText(" "+Partida1.getTabuleiro().tabuleiro[3][2].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[3][2].getOperando1());
       jButton16.setText(" "+Partida1.getTabuleiro().tabuleiro[3][3].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[3][3].getOperando1());
       jButton17.setText(" "+Partida1.getTabuleiro().tabuleiro[4][0].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[4][0].getOperando1());
       jButton18.setText(" "+Partida1.getTabuleiro().tabuleiro[4][1].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[4][1].getOperando1());
       jButton19.setText(" "+Partida1.getTabuleiro().tabuleiro[4][2].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[4][2].getOperando1());
       jButton20.setText(" "+Partida1.getTabuleiro().tabuleiro[4][3].getOperando2()+" "+modulo+" "+Partida1.getTabuleiro().tabuleiro[4][3].getOperando1());

       
       
        
    }

    private Mesa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("sfas1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jButton6.setText("jButton1");

        jButton7.setText("jButton2");

        jButton8.setText("jButton3");

        jButton9.setText("jButton4");

        jButton10.setText("jButton5");

        jButton11.setText("jButton1");

        jButton12.setText("jButton2");

        jButton13.setText("jButton3");

        jButton14.setText("jButton4");

        jButton15.setText("jButton5");

        jButton16.setText("jButton1");

        jButton17.setText("jButton2");

        jButton18.setText("jButton3");

        jButton19.setText("jButton4");

        jButton20.setText("jButton5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(27, 27, 27)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(27, 27, 27)
                        .addComponent(jButton10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14)
                        .addGap(27, 27, 27)
                        .addComponent(jButton15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton16)
                        .addGap(18, 18, 18)
                        .addComponent(jButton17)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19)
                        .addGap(27, 27, 27)
                        .addComponent(jButton20)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20))
                .addContainerGap(278, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
