/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacie;

import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Moi
 */
public class Agents extends javax.swing.JFrame {

    public void Modifier() {
        tableagent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                table1MouseReleased(evt);
            }

            private void table1MouseReleased(MouseEvent evt) {
                int selectionner = tableagent.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) tableagent.getModel();
                aid.setText(model.getValueAt(selectionner, 0).toString());
                nom_ag.setText(model.getValueAt(selectionner, 1).toString());
                age.setText(model.getValueAt(selectionner, 2).toString());
                tele.setText(model.getValueAt(selectionner, 3).toString());
                pass.setText(model.getValueAt(selectionner, 4).toString());
                sexe.setSelectedItem(model.getValueAt(selectionner, 5).toString());

            }
        });

    }

    /**
     * Creates new form Agents
     */
    public Agents() {
        initComponents();
        SelectAgent();
        Modifier();
    }
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;

    public void SelectAgent() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacie", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("select * from agents");
            tableagent.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        aid = new javax.swing.JTextField();
        sexe = new javax.swing.JComboBox<>();
        modifier_aj = new javax.swing.JButton();
        supprimer_ag = new javax.swing.JButton();
        ajouter_ag = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableagent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        nom_ag = new javax.swing.JTextField();
        effacer = new javax.swing.JButton();
        tele = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1519, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 153, 51));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Gestion des Agents");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 51));
        jLabel8.setText("ID");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 51));
        jLabel9.setText("Nom et Prénom");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 51));
        jLabel10.setText("Sexe");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 51));
        jLabel11.setText("Age");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 51));
        jLabel12.setText("Téléphone");

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 51));
        jLabel13.setText("Mot_de_passe");

        age.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        age.setForeground(new java.awt.Color(0, 153, 51));
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        aid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        aid.setForeground(new java.awt.Color(0, 153, 51));
        aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aidActionPerformed(evt);
            }
        });

        sexe.setBackground(new java.awt.Color(0, 204, 0));
        sexe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sexe.setForeground(new java.awt.Color(255, 255, 255));
        sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculin", "Féminin" }));
        sexe.setToolTipText(""); // NOI18N
        sexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexeActionPerformed(evt);
            }
        });

        modifier_aj.setBackground(new java.awt.Color(0, 153, 51));
        modifier_aj.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        modifier_aj.setForeground(new java.awt.Color(255, 255, 255));
        modifier_aj.setText("Modifier");
        modifier_aj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier_ajActionPerformed(evt);
            }
        });

        supprimer_ag.setBackground(new java.awt.Color(0, 153, 51));
        supprimer_ag.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        supprimer_ag.setForeground(new java.awt.Color(255, 255, 255));
        supprimer_ag.setText("Supprimer");
        supprimer_ag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_agActionPerformed(evt);
            }
        });

        ajouter_ag.setBackground(new java.awt.Color(0, 153, 51));
        ajouter_ag.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ajouter_ag.setForeground(new java.awt.Color(255, 255, 255));
        ajouter_ag.setText("Ajouter");
        ajouter_ag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouter_agMouseClicked(evt);
            }
        });
        ajouter_ag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_agActionPerformed(evt);
            }
        });

        tableagent.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tableagent.setForeground(new java.awt.Color(51, 51, 51));
        tableagent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numéro_agent", "Nom et Prénom de l'agent", "Age_agent", "Numéro de Téléphone", "Sexe", "mot de passe"
            }
        ));
        tableagent.setRowHeight(30);
        tableagent.setSelectionBackground(new java.awt.Color(0, 153, 51));
        jScrollPane1.setViewportView(tableagent);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Liste des Agents");

        pass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 153, 51));
        pass.setCaretColor(new java.awt.Color(0, 153, 51));

        nom_ag.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nom_ag.setForeground(new java.awt.Color(0, 153, 51));

        effacer.setBackground(new java.awt.Color(0, 153, 51));
        effacer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        effacer.setForeground(new java.awt.Color(255, 255, 255));
        effacer.setText("Effacer");
        effacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effacerActionPerformed(evt);
            }
        });

        tele.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tele.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aid, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom_ag, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(305, 305, 305)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(51, 51, 51)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(ajouter_ag, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(modifier_aj, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(supprimer_ag)
                        .addGap(90, 90, 90)
                        .addComponent(effacer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(aid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(nom_ag, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouter_ag, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifier_aj, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimer_ag, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(effacer, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Compagnie");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ventes");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Médicaments");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexeActionPerformed

    private void modifier_ajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier_ajActionPerformed
        // TODO add your handling code here:

        if (aid.getText().isEmpty() || nom_ag.getText().isEmpty() || age.getText().isEmpty() || tele.getText().isEmpty() || pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tout les champs !", null, JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacie", "root", "");
                String update = "update agents set nom_prenom='" + nom_ag.getText() + "'" + ",age='" + age.getText() + "'" + ",tele='" + tele.getText() + "'" + ",password='" + pass.getText() + "'" + ",sexe='" + sexe.getSelectedItem().toString() + "'" + "where id_ag=" + aid.getText();
                Statement up = con.createStatement();
                up.executeUpdate(update);
                SelectAgent();
                JOptionPane.showMessageDialog(null, "Un Agent modifié avec succes!", null, JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erreur un agent n'est pas modifié!", null, JOptionPane.ERROR_MESSAGE);

            }
        }


    }//GEN-LAST:event_modifier_ajActionPerformed

    private void supprimer_agActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_agActionPerformed
        // TODO add your handling code here:

        if (aid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Le champs de l'ID est vide !", null, JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String nbr = aid.getText();
                con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacie", "root", "");
                String rq = "Select * from agents where id_ag=?";
                PreparedStatement ps = con.prepareStatement(rq);
                ps.setString(1, nbr);
                rs = ps.executeQuery();
                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(null, "L'agent n'existe pas !", null, JOptionPane.ERROR_MESSAGE);
                    aid.setText("");
                } else {

                    String dl = "Delete from agents where id_ag=" + nbr;
                    Statement delt = con.createStatement();
                    delt.executeUpdate(dl);
                    SelectAgent();
                    JOptionPane.showMessageDialog(null, "un Agent supprimé avec succes !", null, JOptionPane.INFORMATION_MESSAGE);
                    aid.setText("");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_supprimer_agActionPerformed

    private void ajouter_agActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_agActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajouter_agActionPerformed

    private void effacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effacerActionPerformed
        // TODO add your handling code here:

        aid.setText("");
        nom_ag.setText("");
        age.setText("");
        tele.setText("");
        pass.setText("");
        sexe.setSelectedItem("");


    }//GEN-LAST:event_effacerActionPerformed

    private void ajouter_agMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouter_agMouseClicked
        // TODO add your handling code here:
        if (aid.getText().isEmpty() || tele.getText().isEmpty() || nom_ag.getText().isEmpty() || age.getText().isEmpty() || pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tout les champs !", null, JOptionPane.ERROR_MESSAGE);

        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacie", "root", "");
                PreparedStatement add = con.prepareStatement("insert into agents values (?,?,?,?,?,?)");
                add.setString(1, (aid.getText()));
                add.setString(2, (nom_ag.getText()));
                add.setString(3, (age.getText()));
                add.setString(4, (tele.getText()));
                add.setString(5, (pass.getText()));
                add.setString(6, sexe.getSelectedItem().toString());
                int row = add.executeUpdate();
                con.close();
                SelectAgent();
                JOptionPane.showMessageDialog(null, "Agent ajouté avec succes !", null, JOptionPane.INFORMATION_MESSAGE);
                aid.setText("");
                nom_ag.setText("");
                age.setText("");
                pass.setText("");
                sexe.setSelectedItem("");
                tele.setText("");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "error d'ajout !", null, JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_ajouter_agMouseClicked

    private void aidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aidActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        try {
            new Compagnie().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "erreur !", null, JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        try {
            new Medecine().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "erreur !", null, JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        try {
            new vente().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "erreur !", null, JOptionPane.ERROR_MESSAGE);

        }         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField aid;
    private javax.swing.JButton ajouter_ag;
    private javax.swing.JButton effacer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifier_aj;
    private javax.swing.JTextField nom_ag;
    private javax.swing.JTextField pass;
    private javax.swing.JComboBox<String> sexe;
    private javax.swing.JButton supprimer_ag;
    private javax.swing.JTable tableagent;
    private javax.swing.JTextField tele;
    // End of variables declaration//GEN-END:variables
}