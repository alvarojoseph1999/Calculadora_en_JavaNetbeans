
package calculadora;

import java.awt.Color;
import java.awt.Frame;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CalculadoraR extends javax.swing.JFrame {
ScriptEngineManager sem = new ScriptEngineManager();
ScriptEngine se = sem.getEngineByName("JavaScript");//esto nos ayudara a que funcione la calculadora instanciando esto
    public CalculadoraR() {
        initComponents();
        setLocationRelativeTo(null); //al contructor le ponemos esto para que se aparesca al medio
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        btn_oscuro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_igual = new javax.swing.JButton();
        btn_ce = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_cero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(147, 223, 27));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 316, 30));

        txtResultado.setFont(new java.awt.Font("SansSerif", 1, 50)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 84, 316, 60));

        btn_oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/darkmode_1.png"))); // NOI18N
        btn_oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oscuroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_oscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 30, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("•");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("•");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_igual.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn3.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 50, 50));

        btn_ce.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        btn_ce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_ce.setText("CE");
        btn_ce.setFocusPainted(false);
        btn_ce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ce.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_ce.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btn_porcentaje.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btn_dividir.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_dividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_dividir.setText("/");
        btn_dividir.setFocusPainted(false);
        btn_dividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dividir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_dividir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btn_resta.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 50, 50));

        btn_multi.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_multi.setText("x");
        btn_multi.setFocusPainted(false);
        btn_multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_multi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 50, 50));

        btn_suma.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 50, 50));

        btn_c.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn_7.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 50));

        btn_8.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 50, 50));

        btn_9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, 50));

        btn_4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        btn_5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 50));

        btn_6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 50, 50));

        btn_1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

        btn_2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 50, 50));

        btn_3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 50, 50));

        btn_dot.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_dot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Btn2.png"))); // NOI18N
        btn_dot.setText(".");
        btn_dot.setFocusPainted(false);
        btn_dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_dot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 50, 50));

        btn_cero.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btn_cero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Btn2.png"))); // NOI18N
        btn_cero.setText("0");
        btn_cero.setFocusPainted(false);
        btn_cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/btn1.png"))); // NOI18N
        btn_cero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BtnPress.png"))); // NOI18N
        btn_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceroActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        
        try{
           String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        }catch(Exception e){
            // btn_c.doClick();
        }
               
        
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        btn_igual.doClick();
    }//GEN-LAST:event_btn_ceActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        addNumber("%");
         
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
        
        addNumber("/");
         
    }//GEN-LAST:event_btn_dividirActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        addNumber("-");
         
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
        addNumber("*");
         
    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        addNumber("+");
        
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed

        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
         btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
       addNumber("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
         btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");
         btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
         btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
         btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber("1");
         btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
         btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3");
         btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        addNumber(".");
        btn_igual.doClick();
        
    }//GEN-LAST:event_btn_dotActionPerformed

    private void btn_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceroActionPerformed
        addNumber("0");
         btn_igual.doClick();
    }//GEN-LAST:event_btn_ceroActionPerformed

    boolean modoOscuro = false;
    
    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
       if(!modoOscuro)
       {
       jPanel1.setBackground(Color.decode("#212b41"));
       jPanel2.setBackground(Color.decode("#2e3951"));
       txtOperacion.setForeground(Color.decode("#0db387"));
       txtResultado.setForeground(Color.decode("#0db387"));
       cambiarColorBtn1(btn_multi);
       cambiarColorBtn1(btn_dividir);
       cambiarColorBtn1(btn_suma);
       cambiarColorBtn1(btn_resta);
       cambiarColorBtn1(btn_porcentaje);
       cambiarColorBtn1(btn_ce);
       cambiarColorBtn1(btn_c);
       
       cambiarColorBtn2(btn_1);
       cambiarColorBtn2(btn_2);
       cambiarColorBtn2(btn_3);
       cambiarColorBtn2(btn_4);
       cambiarColorBtn2(btn_5);
       cambiarColorBtn2(btn_6);
       cambiarColorBtn2(btn_7);
       cambiarColorBtn2(btn_8);
       cambiarColorBtn2(btn_9);
       cambiarColorBtn2(btn_cero);
       cambiarColorBtn2(btn_dot);
       
       btn_oscuro.setIcon(new ImageIcon(getClass().getResource("/imagen/darkmode_2.png")));
       
       btn_igual.setIcon(new ImageIcon(getClass().getResource("/imagen/Btn3_dark.png")));
       btn_igual.setPressedIcon(new ImageIcon(getClass().getResource("/imagen/Btn3_dark.png")));
       btn_igual.setRolloverIcon(new ImageIcon(getClass().getResource("/imagen/Btn3_pres_dark.png")));
       btn_igual.setForeground(Color.decode("#2e3951"));
       modoOscuro = true;
       }else{
           CalculadoraR frame = new CalculadoraR();
            this.dispose();
            frame.setVisible(true);
       }
       
       
        
    }//GEN-LAST:event_btn_oscuroActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraR().setVisible(true);
            }
        });
    }
    public void cambiarColorBtn1(JButton btn){
       btn.setIcon(new ImageIcon(getClass().getResource("/imagen/Btn1_Dark.png")));
       btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagen/Btn1_Dark.png")));
       btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagen/Btn_press_dark.png")));
       btn.setForeground(Color.decode("#0db387"));   
    }
    public void cambiarColorBtn2(JButton btn){
       btn.setIcon(new ImageIcon(getClass().getResource("/imagen/btn2_Dark.png")));
       btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagen/btn2_Dark.png")));
       btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagen/Btn_press_dark.png")));
       btn.setForeground(Color.decode("#96a8a0"));
        
    }
    
    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito); //agrega los numeros y si se repite tambien
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_ce;
    private javax.swing.JButton btn_cero;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
