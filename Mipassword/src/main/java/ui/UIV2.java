/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import dto.PasswordConfigDTO;
import generator.PasswordGenerator;
import generator.PasswordValidator;

/**
 *
 * @author ROG STRIX
 */
import dto.PasswordConfigDTO;
import generator.PasswordGenerator;
import generator.PasswordValidator;
import javax.swing.JFrame;

public class UIV2 extends javax.swing.JPanel {

    /**
     * Creates new form UIV2
     */
    public UIV2() {
        initComponents();
        
        setSize(400, 300); // Tamaño del formulario

     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        minLengthField = new javax.swing.JTextField();
        digitsCheckBox = new javax.swing.JCheckBox();
        minDigitsField = new javax.swing.JTextField();
        upperCaseCheckBox = new javax.swing.JCheckBox();
        minUpperCaseField = new javax.swing.JTextField();
        lowerCaseCheckBox = new javax.swing.JCheckBox();
        specialCharsCheckBox = new javax.swing.JCheckBox();
        minSpecialCharsField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        minLowerCaseField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbPasswordGenerado = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        minLengthField.setText("12");
        minLengthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minLengthFieldActionPerformed(evt);
            }
        });

        digitsCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        digitsCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        digitsCheckBox.setText("Incluir dígitos");
        digitsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitsCheckBoxActionPerformed(evt);
            }
        });

        minDigitsField.setText("2");

        upperCaseCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        upperCaseCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        upperCaseCheckBox.setText("Incluir letras mayúsculas");
        upperCaseCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperCaseCheckBoxActionPerformed(evt);
            }
        });

        minUpperCaseField.setText("2");

        lowerCaseCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        lowerCaseCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lowerCaseCheckBox.setText("Incluir letras minúsculas");

        specialCharsCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        specialCharsCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        specialCharsCheckBox.setText("Incluir caracteres especiales");

        minSpecialCharsField.setText("2");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Longitud mínima:");

        minLowerCaseField.setText("2");
        minLowerCaseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minLowerCaseFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(digitsCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upperCaseCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minLengthField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(minDigitsField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minUpperCaseField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lowerCaseCheckBox)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(minSpecialCharsField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(specialCharsCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(minLowerCaseField, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 120, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minLengthField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(digitsCheckBox)
                .addGap(2, 2, 2)
                .addComponent(minDigitsField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(upperCaseCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minUpperCaseField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lowerCaseCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minLowerCaseField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(specialCharsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minSpecialCharsField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbPasswordGenerado.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbPasswordGenerado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnGenerar.setBackground(new java.awt.Color(255, 255, 204));
        btnGenerar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGenerar.setText("Generar Password");
        btnGenerar.setBorder(null);
        btnGenerar.setBorderPainted(false);
        btnGenerar.setFocusable(false);
        btnGenerar.setOpaque(true);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ROG STRIX\\Desktop\\pass64.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbPasswordGenerado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(lbPasswordGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void upperCaseCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperCaseCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upperCaseCheckBoxActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
      try {
        // Recuperar valores del formulario
        int minLength = Integer.parseInt(minLengthField.getText());
        boolean restrictDigits = digitsCheckBox.isSelected();
        int minDigits = restrictDigits ? Integer.parseInt(minDigitsField.getText()) : 0;

        boolean restrictUpperCase = upperCaseCheckBox.isSelected();
        int minUpperCase = restrictUpperCase ? Integer.parseInt(minUpperCaseField.getText()) : 0;

        boolean restrictLowerCase = lowerCaseCheckBox.isSelected();
        int minLowerCase = restrictLowerCase ? Integer.parseInt(minLowerCaseField.getText()) : 0;

        boolean restrictSpecialChars = specialCharsCheckBox.isSelected();
        int minSpecialChars = restrictSpecialChars ? Integer.parseInt(minSpecialCharsField.getText()) : 0;

        // Crear objeto de configuración
        PasswordConfigDTO config = new PasswordConfigDTO(
                restrictDigits, minDigits,
                restrictUpperCase, minUpperCase,
                restrictLowerCase, minLowerCase,
                restrictSpecialChars, minSpecialChars,
                minLength
        );

        // Generar contraseña
        String password = PasswordGenerator.generatePassword(config);

        // Validar contraseña
        if (PasswordValidator.validate(password, config)) {
            // Mostrar la contraseña generada en el JLabel
            lbPasswordGenerado.setText(password);
        } else {
            lbPasswordGenerado.setText("Error: La contraseña no cumple con las políticas.");
        }
    } catch (NumberFormatException ex) {
        lbPasswordGenerado.setText("Error: Ingrese valores válidos en los campos.");
    } catch (Exception ex) {
        lbPasswordGenerado.setText("Error al generar la contraseña.");
    }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void minLowerCaseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minLowerCaseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minLowerCaseFieldActionPerformed

    private void minLengthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minLengthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minLengthFieldActionPerformed

    private void digitsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitsCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitsCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JCheckBox digitsCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbPasswordGenerado;
    private javax.swing.JCheckBox lowerCaseCheckBox;
    private javax.swing.JTextField minDigitsField;
    private javax.swing.JTextField minLengthField;
    private javax.swing.JTextField minLowerCaseField;
    private javax.swing.JTextField minSpecialCharsField;
    private javax.swing.JTextField minUpperCaseField;
    private javax.swing.JCheckBox specialCharsCheckBox;
    private javax.swing.JCheckBox upperCaseCheckBox;
    // End of variables declaration//GEN-END:variables
}
