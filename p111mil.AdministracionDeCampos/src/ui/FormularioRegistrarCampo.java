/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import tablemodel.LoteModeloTabla;
import dao.CampoDao;
import dao.EstadoCampoDao;
import dao.LoteDao;
import dao.TipoDeSueloDao;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import model.Campo;
import model.Lote;
import model.TipoDeSuelo;

/**
 *
 * @author admin
 */
public class FormularioRegistrarCampo extends javax.swing.JFrame {
    private List<TipoDeSuelo> tiposDeSuelo;
    private List<Lote> lotes;
    private Lote loteEnEdicion;
    private CampoDao campoDao;
    private EstadoCampoDao estadoCampoDao;
    private LoteDao loteDao;
            
    /**
     * Creates new form FormularioRegistrarCampo
     */
    public FormularioRegistrarCampo() {
        tiposDeSuelo = new TipoDeSueloDao().buscarTodos();
        lotes = new ArrayList<Lote>();
        loteEnEdicion = null;
        campoDao = new CampoDao();
        estadoCampoDao = new EstadoCampoDao();
        loteDao = new LoteDao();
        
        initComponents();           
        limpiarFormulario();
        cargarComboTipoDeSuelo();
        cargarTablaLotes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNombreCampo = new javax.swing.JLabel();
        textoNombreDeCampo = new javax.swing.JTextField();
        labelErrorCampo = new javax.swing.JLabel();
        labelSuperficieCampo = new javax.swing.JLabel();
        labelLotes = new javax.swing.JLabel();
        labelMensajeLotes = new javax.swing.JLabel();
        labelNumeroLote = new javax.swing.JLabel();
        labelSuperficieLote = new javax.swing.JLabel();
        textoNumeroDeLote = new javax.swing.JTextField();
        textoSuperficieDeLote = new javax.swing.JTextField();
        labelTipoDeSuelo = new javax.swing.JLabel();
        comboTipoDeSuelo = new javax.swing.JComboBox<>();
        labelErrorLote = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLotes = new javax.swing.JTable();
        buttonAgregarLote = new javax.swing.JButton();
        buttonEditarLote = new javax.swing.JButton();
        buttonQuitarLote = new javax.swing.JButton();
        buttonCancelarRegistro = new javax.swing.JButton();
        buttonRegistrarCampo = new javax.swing.JButton();
        textoSuperficieDeCampo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Campo");

        labelNombreCampo.setText("Nombre");

        textoNombreDeCampo.setText("jTextField1");
        textoNombreDeCampo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textoNombreDeCampoFocusLost(evt);
            }
        });

        labelErrorCampo.setForeground(new java.awt.Color(255, 0, 0));
        labelErrorCampo.setText("Este nombre ya está en uso");

        labelSuperficieCampo.setText("Superficie");

        labelLotes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLotes.setText("Lotes");

        labelMensajeLotes.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        labelMensajeLotes.setText("Tenga en cuenta que debe ingresar al menos un lote");

        labelNumeroLote.setText("Número");

        labelSuperficieLote.setText("Superficie");

        textoNumeroDeLote.setText("jTextField1");
        textoNumeroDeLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNumeroDeLoteKeyTyped(evt);
            }
        });

        textoSuperficieDeLote.setText("jTextField1");
        textoSuperficieDeLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoSuperficieDeLoteKeyTyped(evt);
            }
        });

        labelTipoDeSuelo.setText("Tipo de suelo");

        comboTipoDeSuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelErrorLote.setForeground(new java.awt.Color(255, 0, 0));
        labelErrorLote.setText("Este número de Lote ya está en uso");

        tableLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableLotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLotesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableLotesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableLotes);

        buttonAgregarLote.setText("Agregar Lote");
        buttonAgregarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarLoteActionPerformed(evt);
            }
        });

        buttonEditarLote.setText("Editar");
        buttonEditarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarLoteActionPerformed(evt);
            }
        });

        buttonQuitarLote.setText("Quitar");
        buttonQuitarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonQuitarLoteActionPerformed(evt);
            }
        });

        buttonCancelarRegistro.setText("Cancelar");
        buttonCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarRegistroActionPerformed(evt);
            }
        });

        buttonRegistrarCampo.setText("Registrar Campo");
        buttonRegistrarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarCampoActionPerformed(evt);
            }
        });

        textoSuperficieDeCampo.setText("jTextField1");
        textoSuperficieDeCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoSuperficieDeCampoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCancelarRegistro)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRegistrarCampo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(labelLotes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(labelSuperficieLote)
                                                .addGap(34, 34, 34))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(labelNumeroLote)
                                                .addGap(45, 45, 45))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(labelTipoDeSuelo)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(textoSuperficieDeLote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                            .addComponent(textoNumeroDeLote, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboTipoDeSuelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonEditarLote))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(labelErrorLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonQuitarLote)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(labelMensajeLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNombreCampo)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelSuperficieCampo)
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textoNombreDeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textoSuperficieDeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(labelErrorCampo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(buttonAgregarLote)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreCampo)
                    .addComponent(textoNombreDeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelErrorCampo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSuperficieCampo)
                    .addComponent(textoSuperficieDeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelLotes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMensajeLotes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoNumeroDeLote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNumeroLote))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSuperficieLote)
                            .addComponent(textoSuperficieDeLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboTipoDeSuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTipoDeSuelo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErrorLote)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAgregarLote)
                    .addComponent(buttonQuitarLote)
                    .addComponent(buttonEditarLote))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegistrarCampo)
                    .addComponent(buttonCancelarRegistro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarCampoActionPerformed
        labelErrorCampo.setVisible(false);
                
        // Valido los valores del campo
        String nombreDeCampo = textoNombreDeCampo.getText().trim();                
        if (nombreDeCampo.isEmpty()) {
            labelErrorCampo.setText("El nombre del campo es obligatorio");
            labelErrorCampo.setVisible(true);
            textoNombreDeCampo.requestFocus();
            return;
        }                
        
        if (textoSuperficieDeCampo.getText().trim().equals("")) {
            labelErrorCampo.setText("La superficie del campo es obligatoria");
            labelErrorCampo.setVisible(true);
            textoSuperficieDeCampo.requestFocus();
            return;
        }
        
        int superficieDeCampo = Integer.parseInt(textoSuperficieDeCampo.getText());
        if (superficieDeCampo <= 0 || superficieDeCampo > 999999) {
            labelErrorCampo.setText("La superficie del campo es inválida");
            labelErrorCampo.setVisible(true);
            textoSuperficieDeCampo.requestFocus();
            return;
        }
        
        if (lotes.isEmpty()) {
            labelErrorLote.setText("El campo debe tener al menos un lote");
            labelErrorLote.setVisible(true);
            textoNumeroDeLote.requestFocus();
            return;
        }
        
        int totalSuperficieDeLotes = 0;
        for(Lote lote : lotes) {
            totalSuperficieDeLotes += lote.getSuperficie();
        }
        
        if (totalSuperficieDeLotes != superficieDeCampo) {
            labelErrorLote.setText("La suma de las superficies de los lotes es de " + totalSuperficieDeLotes + " has, mientras que la superficie del campo es " + superficieDeCampo + " has. Los valores deben ser iguales");
            labelErrorLote.setVisible(true);
            textoNumeroDeLote.requestFocus();
            return;
        }
        
        int confirmacion = JOptionPane.showConfirmDialog (null, "¿Confirma el registro del Campo?", "Registrar Campo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirmacion == JOptionPane.CANCEL_OPTION){
            return;
        }

        // Instancio el nuevo campo
        Campo campo = new Campo();
        
        campo.setNombre(nombreDeCampo);
        campo.setSuperficie(superficieDeCampo);
        campo.setFechaCreacion(Calendar.getInstance().getTime());
        campo.setEstadoCampo(estadoCampoDao.buscarPorDefault());
        
        // Inserto los lotes en el campo
        for(Lote lote : lotes) {
            lote.setCampo(campo);
            campo.getLotes().add(lote);          
        }
        
        campoDao.guardar(campo);
        
        this.dispose();
        
        // Una vez que se guardo correctamente muestro el detalle
        FormularioCampoRegistrado formularioCampoRegistrado = new FormularioCampoRegistrado(campo);
        formularioCampoRegistrado.setLocationRelativeTo(null); 
        formularioCampoRegistrado.setResizable(false);                
        formularioCampoRegistrado.setVisible(true);
    }//GEN-LAST:event_buttonRegistrarCampoActionPerformed

    private void textoSuperficieDeCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoSuperficieDeCampoKeyTyped
        if (textoSuperficieDeCampo.getText().length() >= 10) {
            evt.consume();
        } else {        
            char caracter = evt.getKeyChar();

            // Verificar si la tecla pulsada un digito
            if ((caracter < '0') || (caracter > '9')) {
                evt.consume(); // ignorar el evento de teclado
            }
        }
    }//GEN-LAST:event_textoSuperficieDeCampoKeyTyped

    private void buttonAgregarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarLoteActionPerformed
        labelErrorLote.setVisible(false);                                       
        if (textoNumeroDeLote.getText().trim().isEmpty()) {
            labelErrorLote.setText("El numero del lote es obligatorio");
            labelErrorLote.setVisible(true);
            textoNumeroDeLote.requestFocus();
            return;   
        }
        
        int numeroLote = Integer.parseInt(textoNumeroDeLote.getText());
        
        // El numero de lote puede estar en uso en algun lote para agregar o bien en alguno existente en la base
        boolean existeConMismoNumero = false;
        for(Lote lote : lotes) {
            existeConMismoNumero = existeConMismoNumero || (lote.getNumeroLote() == numeroLote && lote != loteEnEdicion);
        }
                
        if (existeConMismoNumero || loteDao.existeConMismoNumero(numeroLote)) {
            labelErrorLote.setText("El numero del lote ya esta en uso");
            labelErrorLote.setVisible(true);
            textoNumeroDeLote.requestFocus();
            return;               
        }

        if (textoSuperficieDeLote.getText().trim().equals("")) {
            labelErrorLote.setText("La superficie del lote es obligatoria");
            labelErrorLote.setVisible(true);
            textoSuperficieDeLote.requestFocus();
            return;   
        }
        
        int superficie = Integer.parseInt(textoSuperficieDeLote.getText());                
                
        if (loteEnEdicion != null) {
            loteEnEdicion.setNumeroLote(numeroLote);
            loteEnEdicion.setSuperficie(superficie);
            loteEnEdicion.setTipoDeSuelo((TipoDeSuelo) comboTipoDeSuelo.getSelectedItem());
        } else {    
            // Instancio el lote y lo agrego al data table
            Lote lote = new Lote();
        
            lote.setNumeroLote(numeroLote);
            lote.setSuperficie(superficie);
            lote.setTipoDeSuelo((TipoDeSuelo) comboTipoDeSuelo.getSelectedItem());
        
            lotes.add(lote);
        }
        
        cargarTablaLotes();
        
        this.textoNumeroDeLote.setText("");
        this.textoSuperficieDeLote.setText("");        
        this.comboTipoDeSuelo.setSelectedIndex(0);
        
        loteEnEdicion = null;
        this.textoNumeroDeLote.requestFocus();
    }//GEN-LAST:event_buttonAgregarLoteActionPerformed

    private void textoNumeroDeLoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNumeroDeLoteKeyTyped
        if (textoNumeroDeLote.getText().length() >= 20) {
            evt.consume();
        } else {        
            char caracter = evt.getKeyChar();

            // Verificar si la tecla pulsada un digito
            if ((caracter < '0') || (caracter > '9')) {
                evt.consume(); // ignorar el evento de teclado
            }
        }
    }//GEN-LAST:event_textoNumeroDeLoteKeyTyped

    private void textoSuperficieDeLoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoSuperficieDeLoteKeyTyped
        if (textoSuperficieDeLote.getText().length() >= 10) {
            evt.consume();
        } else {        
            char caracter = evt.getKeyChar();

            // Verificar si la tecla pulsada un digito
            if ((caracter < '0') || (caracter > '9')) {
                evt.consume(); // ignorar el evento de teclado
            }
        }
    }//GEN-LAST:event_textoSuperficieDeLoteKeyTyped

    private void tableLotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLotesMouseClicked
        controlarEstadoBotonesLote();
    }//GEN-LAST:event_tableLotesMouseClicked

    private void tableLotesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLotesMouseReleased
        controlarEstadoBotonesLote();
    }//GEN-LAST:event_tableLotesMouseReleased

    private void buttonQuitarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonQuitarLoteActionPerformed
        lotes.remove(tableLotes.getSelectedRow());
        cargarTablaLotes();
    }//GEN-LAST:event_buttonQuitarLoteActionPerformed

    private void buttonEditarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarLoteActionPerformed
        loteEnEdicion = lotes.get(tableLotes.getSelectedRow());
        
        textoNumeroDeLote.setText(Integer.toString(loteEnEdicion.getNumeroLote()));
        textoSuperficieDeLote.setText(Integer.toString(loteEnEdicion.getSuperficie()));
        comboTipoDeSuelo.setSelectedItem(loteEnEdicion.getTipoDeSuelo());
        
        textoNumeroDeLote.requestFocus();
    }//GEN-LAST:event_buttonEditarLoteActionPerformed

    private void buttonCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarRegistroActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarRegistroActionPerformed

    private void textoNombreDeCampoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoNombreDeCampoFocusLost
        labelErrorCampo.setVisible(false);
        
        if (! textoNombreDeCampo.getText().trim().isEmpty() && campoDao.existeConMismoNombre(textoNombreDeCampo.getText())) {
            labelErrorCampo.setText("Este nombre ya está en uso");
            labelErrorCampo.setVisible(true);
            textoNombreDeCampo.requestFocus();
        }
    }//GEN-LAST:event_textoNombreDeCampoFocusLost

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
            java.util.logging.Logger.getLogger(FormularioRegistrarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioRegistrarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioRegistrarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioRegistrarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioRegistrarCampo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregarLote;
    private javax.swing.JButton buttonCancelarRegistro;
    private javax.swing.JButton buttonEditarLote;
    private javax.swing.JButton buttonQuitarLote;
    private javax.swing.JButton buttonRegistrarCampo;
    private javax.swing.JComboBox<String> comboTipoDeSuelo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelErrorCampo;
    private javax.swing.JLabel labelErrorLote;
    private javax.swing.JLabel labelLotes;
    private javax.swing.JLabel labelMensajeLotes;
    private javax.swing.JLabel labelNombreCampo;
    private javax.swing.JLabel labelNumeroLote;
    private javax.swing.JLabel labelSuperficieCampo;
    private javax.swing.JLabel labelSuperficieLote;
    private javax.swing.JLabel labelTipoDeSuelo;
    private javax.swing.JTable tableLotes;
    private javax.swing.JTextField textoNombreDeCampo;
    private javax.swing.JTextField textoNumeroDeLote;
    private javax.swing.JTextField textoSuperficieDeCampo;
    private javax.swing.JTextField textoSuperficieDeLote;
    // End of variables declaration//GEN-END:variables

    private void limpiarFormulario() {
        this.textoNombreDeCampo.setText("");
        this.textoSuperficieDeCampo.setText("");
        this.labelErrorCampo.setVisible(false);
        this.textoNumeroDeLote.setText("");
        this.textoSuperficieDeLote.setText("");        
        this.comboTipoDeSuelo.setSelectedIndex(0);
        this.labelErrorLote.setVisible(false);
        this.lotes.clear();
        this.buttonEditarLote.setEnabled(false);
        this.buttonQuitarLote.setEnabled(false);        
    }
    
    private void cargarComboTipoDeSuelo() {
        comboTipoDeSuelo.setModel(new DefaultComboBoxModel(tiposDeSuelo.toArray()));
        comboTipoDeSuelo.setSelectedIndex(0);
    }
    
    private void cargarTablaLotes() {
        LoteModeloTabla contactoModeloTabla = new LoteModeloTabla(lotes);
                
        tableLotes.setModel(contactoModeloTabla);
        tableLotes.setRowSelectionAllowed(true);
        tableLotes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        tableLotes.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);        
        
        controlarEstadoBotonesLote();
    }
    
    private void controlarEstadoBotonesLote() {
        // Si tengo una fila seleccionada, habilito los botones
        buttonEditarLote.setEnabled(tableLotes.getSelectedRow() >= 0);
        buttonQuitarLote.setEnabled(tableLotes.getSelectedRow() >= 0);        
    }
}
