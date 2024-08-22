/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazgrafica0108;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Calc extends javax.swing.JFrame {

    String operadores[] = {"/", "+", "-", "*", "%"};
    String operacionActual;
    String pantallaActual;

    double num;
    double num2;
    ArrayList<String> historial = new ArrayList<>();
    double resultado;

    public Calc() {
        initComponents();
    }

    private void m(String signo) {
        operacionActual = signo;
        pantallaActual = lblPantalla.getText();

        if ("0".equals(pantallaActual) & pantallaActual.length() == 1) {
            return;
        }

        if (pantallaActual.endsWith(signo)) {
            return;
        }

        for (String s : operadores) {
            if (pantallaActual.contains(s)) {
                num2 = Double.parseDouble(numPantalla.getText());
                System.out.println("numero2: " + num2);
                numPantalla.setText("0");
                Operar(num, num2, signo);
                return;
            }
        }

        num = Double.parseDouble(numPantalla.getText());
        System.out.println("numero: " + num);

        numPantalla.setText("0");

        pantallaActual += signo;

        lblPantalla.setText(pantallaActual);
    }

    private void r() {
        pantallaActual = lblPantalla.getText();
        pantallaActual += " = " + resultado;

        lblPantalla.setText(pantallaActual);

        historial.add(pantallaActual);
        pantallaActual = "";
        numPantalla.setText("0");
    }

    private void Operar(double n1, double n2, String signo) {
        if ("*".equals(signo)) {
            resultado = n1 * n2;
            r();
        }
        if ("+".equals(signo)) {
            resultado = n1 + n2;
            r();
        }
        if ("-".equals(signo)) {
            resultado = n1 - n2;
            r();
        }
        if ("/".equals(signo)) {
            if (n2 == 0) {
                resultado = 0;
                r();
                return;
            }
            resultado = n1 / n2;
            r();
        }
        if ("%".equals(signo)) {
            resultado = n1 / 100;
            r();
        }
    }

    private void intNumero(String numero) {
        //actualizando el numero del textbox
        pantallaActual = numPantalla.getText();

        if ("0".equals(pantallaActual) & pantallaActual.length() == 1) {
            pantallaActual = numero;
        } else {
            pantallaActual += numero;
        }

        numPantalla.setText(pantallaActual);
        
        //actualizando el label de historial
        if ("".equals(pantallaActual)) {
            pantallaActual = "0";
            lblPantalla.setText(pantallaActual);
        }
        pantallaActual = lblPantalla.getText();
        
        if ("0".equals(pantallaActual) & pantallaActual.length() == 1) {
            pantallaActual = numero;
        } else {
            pantallaActual += numero;
        }
        lblPantalla.setText(pantallaActual);

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSeis = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        numPantalla = new javax.swing.JTextField();
        btnCuatro = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        lblPantalla = new javax.swing.JLabel();
        btnTres = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnLimpiarMemoria = new javax.swing.JButton();
        btnPorciento = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnCambioSigno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSeis.setBackground(new java.awt.Color(102, 102, 102));
        btnSeis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(51, 51, 51));
        btnSeis.setText("6");
        btnSeis.setMaximumSize(new java.awt.Dimension(49, 25));
        btnSeis.setMinimumSize(new java.awt.Dimension(49, 25));
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnNueve.setBackground(new java.awt.Color(102, 102, 102));
        btnNueve.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNueve.setForeground(new java.awt.Color(51, 51, 51));
        btnNueve.setText("9");
        btnNueve.setMaximumSize(new java.awt.Dimension(49, 25));
        btnNueve.setMinimumSize(new java.awt.Dimension(49, 25));
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(102, 102, 102));
        btnCinco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(51, 51, 51));
        btnCinco.setText("5");
        btnCinco.setMaximumSize(new java.awt.Dimension(49, 25));
        btnCinco.setMinimumSize(new java.awt.Dimension(49, 25));
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        numPantalla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        numPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numPantalla.setText("0");
        numPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPantallaActionPerformed(evt);
            }
        });

        btnCuatro.setBackground(new java.awt.Color(102, 102, 102));
        btnCuatro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCuatro.setForeground(new java.awt.Color(51, 51, 51));
        btnCuatro.setText("4");
        btnCuatro.setMaximumSize(new java.awt.Dimension(49, 25));
        btnCuatro.setMinimumSize(new java.awt.Dimension(49, 25));
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnSuma.setBackground(new java.awt.Color(51, 51, 51));
        btnSuma.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(255, 255, 255));
        btnSuma.setText("+");
        btnSuma.setMaximumSize(new java.awt.Dimension(49, 25));
        btnSuma.setMinimumSize(new java.awt.Dimension(49, 25));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        lblPantalla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPantalla.setText("0");

        btnTres.setBackground(new java.awt.Color(102, 102, 102));
        btnTres.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnTres.setForeground(new java.awt.Color(51, 51, 51));
        btnTres.setText("3");
        btnTres.setMaximumSize(new java.awt.Dimension(49, 25));
        btnTres.setMinimumSize(new java.awt.Dimension(49, 25));
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnDos.setBackground(new java.awt.Color(102, 102, 102));
        btnDos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDos.setForeground(new java.awt.Color(51, 51, 51));
        btnDos.setText("2");
        btnDos.setMaximumSize(new java.awt.Dimension(49, 25));
        btnDos.setMinimumSize(new java.awt.Dimension(49, 25));
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnUno.setBackground(new java.awt.Color(102, 102, 102));
        btnUno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUno.setForeground(new java.awt.Color(51, 51, 51));
        btnUno.setText("1");
        btnUno.setMaximumSize(new java.awt.Dimension(49, 25));
        btnUno.setMinimumSize(new java.awt.Dimension(49, 25));
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(255, 255, 255));
        btnIgual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(0, 0, 0));
        btnIgual.setText("=");
        btnIgual.setMaximumSize(new java.awt.Dimension(49, 25));
        btnIgual.setMinimumSize(new java.awt.Dimension(49, 25));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnPunto.setBackground(new java.awt.Color(102, 102, 102));
        btnPunto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(51, 51, 51));
        btnPunto.setText(".");
        btnPunto.setMaximumSize(new java.awt.Dimension(49, 25));
        btnPunto.setMinimumSize(new java.awt.Dimension(49, 25));
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnLimpiarMemoria.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpiarMemoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLimpiarMemoria.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarMemoria.setText("CE");

        btnPorciento.setBackground(new java.awt.Color(51, 51, 51));
        btnPorciento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPorciento.setForeground(new java.awt.Color(255, 255, 255));
        btnPorciento.setText("%");
        btnPorciento.setMaximumSize(new java.awt.Dimension(49, 25));
        btnPorciento.setMinimumSize(new java.awt.Dimension(49, 25));
        btnPorciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcientoActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(51, 51, 51));
        btnBorrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("<--");
        btnBorrar.setMaximumSize(new java.awt.Dimension(49, 25));
        btnBorrar.setMinimumSize(new java.awt.Dimension(49, 25));

        btnDivision.setBackground(new java.awt.Color(51, 51, 51));
        btnDivision.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(255, 255, 255));
        btnDivision.setText("/");
        btnDivision.setMaximumSize(new java.awt.Dimension(49, 25));
        btnDivision.setMinimumSize(new java.awt.Dimension(49, 25));
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnMultiplicacion.setBackground(new java.awt.Color(51, 51, 51));
        btnMultiplicacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicacion.setText("X");
        btnMultiplicacion.setMaximumSize(new java.awt.Dimension(49, 25));
        btnMultiplicacion.setMinimumSize(new java.awt.Dimension(49, 25));
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnOcho.setBackground(new java.awt.Color(102, 102, 102));
        btnOcho.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOcho.setForeground(new java.awt.Color(51, 51, 51));
        btnOcho.setText("8");
        btnOcho.setMaximumSize(new java.awt.Dimension(49, 25));
        btnOcho.setMinimumSize(new java.awt.Dimension(49, 25));
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnSiete.setBackground(new java.awt.Color(102, 102, 102));
        btnSiete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSiete.setForeground(new java.awt.Color(51, 51, 51));
        btnSiete.setText("7");
        btnSiete.setMaximumSize(new java.awt.Dimension(49, 25));
        btnSiete.setMinimumSize(new java.awt.Dimension(49, 25));
        btnSiete.setPreferredSize(new java.awt.Dimension(49, 25));
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnCero.setBackground(new java.awt.Color(102, 102, 102));
        btnCero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCero.setForeground(new java.awt.Color(51, 51, 51));
        btnCero.setText("0");
        btnCero.setMaximumSize(new java.awt.Dimension(49, 25));
        btnCero.setMinimumSize(new java.awt.Dimension(49, 25));
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(51, 51, 51));
        btnResta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnResta.setForeground(new java.awt.Color(255, 255, 255));
        btnResta.setText("-");
        btnResta.setMaximumSize(new java.awt.Dimension(49, 25));
        btnResta.setMinimumSize(new java.awt.Dimension(49, 25));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnCambioSigno.setBackground(new java.awt.Color(102, 102, 102));
        btnCambioSigno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCambioSigno.setForeground(new java.awt.Color(51, 51, 51));
        btnCambioSigno.setText("+/-");
        btnCambioSigno.setMaximumSize(new java.awt.Dimension(49, 25));
        btnCambioSigno.setMinimumSize(new java.awt.Dimension(49, 25));
        btnCambioSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioSignoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(numPantalla, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCambioSigno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSiete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCuatro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPorciento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnOcho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLimpiarMemoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMultiplicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnResta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDivision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBorrar, btnCambioSigno, btnCero, btnCinco, btnCuatro, btnDivision, btnDos, btnIgual, btnLimpiarMemoria, btnMultiplicacion, btnNueve, btnOcho, btnPorciento, btnPunto, btnResta, btnSeis, btnSiete, btnSuma, btnTres, btnUno});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPantalla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLimpiarMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPorciento, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambioSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBorrar, btnCambioSigno, btnCero, btnCinco, btnCuatro, btnDivision, btnDos, btnIgual, btnLimpiarMemoria, btnMultiplicacion, btnNueve, btnOcho, btnPorciento, btnPunto, btnResta, btnSeis, btnSiete, btnSuma, btnTres, btnUno});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        intNumero("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        intNumero("9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        intNumero("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void numPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPantallaActionPerformed

    }//GEN-LAST:event_numPantallaActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        intNumero("5");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
//suma
        m("+");
        numPantalla.setText("0");

    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        intNumero("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        intNumero("2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        intNumero("1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
//igual
        System.out.println("signoActual: " + operacionActual);
        m(operacionActual);
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
//punto
        intNumero(".");
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnPorcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcientoActionPerformed
//porcentaje
        m("%");
    }//GEN-LAST:event_btnPorcientoActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
//division
        m("/");
    }//GEN-LAST:event_btnDivisionActionPerformed


    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
//multiplicacion
        m("*");


    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        intNumero("8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        intNumero("7");

    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed

        intNumero("0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
//resta
        m("-");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnCambioSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioSignoActionPerformed
//cambio de signo
    }//GEN-LAST:event_btnCambioSignoActionPerformed

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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCambioSigno;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpiarMemoria;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorciento;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JLabel lblPantalla;
    private javax.swing.JTextField numPantalla;
    // End of variables declaration//GEN-END:variables
}
