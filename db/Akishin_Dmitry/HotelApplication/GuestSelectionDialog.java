/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelapplication;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEAkishin
 */
public class GuestSelectionDialog extends javax.swing.JDialog {

    private Statement stmt;

    private int selectedGuestId = 0;
    private String selectedGuestFullName = "";
    private int selectedGuestPoints = 0;
    private boolean guestIsSelected = false;

    public int getSelectedGuestId() {
        return selectedGuestId;
    }

    public int getSelectedGuestPoints() {
        return selectedGuestPoints;
    }

    public String getSelectedGuestFullName() {
        return selectedGuestFullName;
    }

    public boolean isGuestSelected() {
        return guestIsSelected;
    }

    /**
     * Creates new form GuestSelectionDialog
     */
    public GuestSelectionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        stmt = HotelForm.stmt;
        setLocation(150,150);
        updateGuestsTable();
        setVisible(true);
    }

    //Запрос - все посетители
    private String guestsQuery() {
        String query = "SELECT id, last_name, first_name, patronymic_name,"
                + " passport, birthdate, points "
                + "FROM guests";
        return query;
    }

    private void updateGuestsTable() {
        String[] columnNames = {"id", "фамилия", "имя", "отчество",
            "паспорт", "дата рождения", "баллы"};
        try {
            ResultSet results;
            results = stmt.executeQuery(guestsQuery());
            guestsTable.setModel(new MyTableModel(results, columnNames));
            guestsTable.removeColumn(guestsTable.getColumn("id"));
            results.close();
        } catch (SQLException ex) {
            Logger.getLogger(TablesPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        guestsTable = new javax.swing.JTable();
        cancelButton = new javax.swing.JButton();
        selectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        guestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        guestsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        guestsTable.setAutoscrolls(false);
        guestsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        guestsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(guestsTable);

        cancelButton.setText("Отмена");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        selectButton.setText("Выбрать");
        selectButton.setEnabled(false);
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(selectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(selectButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void guestsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestsTableMouseClicked
        selectButton.setEnabled(true);
    }//GEN-LAST:event_guestsTableMouseClicked

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        int row = guestsTable.getSelectedRow();
        selectedGuestId = Integer.parseInt((String) guestsTable.getModel().getValueAt(row, 0));
        selectedGuestFullName = (String) guestsTable.getModel().getValueAt(row, 1) + " "
                + ((String) guestsTable.getModel().getValueAt(row, 2)).charAt(0) + ".";
        if (!"".equals((String) guestsTable.getModel().getValueAt(row, 3))) {
            selectedGuestFullName += ((String) guestsTable.getModel().getValueAt(row, 3)).charAt(0) + ".";
        }
        selectedGuestPoints = Integer.parseInt((String) guestsTable.getModel().getValueAt(row, 6));
        guestIsSelected = true;
        this.dispose();
    }//GEN-LAST:event_selectButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTable guestsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton selectButton;
    // End of variables declaration//GEN-END:variables
}
