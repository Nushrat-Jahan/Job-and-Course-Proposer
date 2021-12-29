package Frames;
import Database.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class courseList extends javax.swing.JFrame {

    public courseList(courseType temp, String uname) throws ClassNotFoundException, SQLException {
        
        //CHECK
        System.out.println(uname);
        
        
        initComponents();
        prev = temp;
        username = uname;
        DBconnector db = new DBconnector ();
        String query = "select c_name from courses ORDER BY `c_name` DESC";
        db.eQuery(query);
        db.rs.next();
        l1.setText(l1.getText()+"  "+db.rs.getString("c_name"));
        db.rs.next();
        l2.setText(l2.getText()+"  "+db.rs.getString("c_name"));
        db.rs.next();
        l3.setText(l3.getText()+"  "+db.rs.getString("c_name"));
        db.rs.next();
        l4.setText(l4.getText()+"  "+db.rs.getString("c_name"));
        db.rs.next();
        l5.setText(l5.getText()+"  "+db.rs.getString("c_name"));
        db.rs.next();
        l6.setText(l6.getText()+"  "+db.rs.getString("c_name"));
    }
    public courseList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("1.");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 410, 40));

        l2.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("2.");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 410, 40));

        l3.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("3.");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 410, 40));

        l4.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setText("4.");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 410, 40));

        l5.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setText("5.");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 410, 40));

        l6.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));
        l6.setText("6.");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 410, 40));

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, -1));

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course Results");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 430, 69));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("_____________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 622, 52));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        prev.setVisible(true);
        this.setVisible (false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        DBconnector db = new DBconnector();
        String query = "select * from courses where c_name = '"+l1.getText().substring(4)+"'";
        System.out.println(query);
        //JOptionPane.showMessageDialog (this, query,"Back to the game",2);
        try {
            db.eQuery(query);
            db.rs.next();
            new courseDetails(this, db.rs.getString("c_id"), username).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.closeConnection();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        DBconnector db = new DBconnector();
        String query = "select * from courses where c_name = '"+l2.getText().substring(4)+"'";
        //JOptionPane.showMessageDialog (this, query,"Back to the game",2);
        try {
            db.eQuery(query);
            db.rs.next();
            new courseDetails(this, db.rs.getString("c_id"), username).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.closeConnection();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        DBconnector db = new DBconnector();
        String query = "select * from courses where c_name = '"+l3.getText().substring(4)+"'";
        //JOptionPane.showMessageDialog (this, query,"Back to the game",2);
        try {
            db.eQuery(query);
            db.rs.next();
            new courseDetails(this, db.rs.getString("c_id"), username).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.closeConnection();
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        DBconnector db = new DBconnector();
        String query = "select * from courses where c_name = '"+l4.getText().substring(4)+"'";
        //JOptionPane.showMessageDialog (this, query,"Back to the game",2);
        try {
            db.eQuery(query);
            db.rs.next();
            new courseDetails(this, db.rs.getString("c_id"), username).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.closeConnection();
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        DBconnector db = new DBconnector();
        String query = "select * from courses where c_name = '"+l5.getText().substring(4)+"'";
        //JOptionPane.showMessageDialog (this, query,"Back to the game",2);
        try {
            db.eQuery(query);
            db.rs.next();
            new courseDetails(this, db.rs.getString("c_id"), username).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.closeConnection();
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        DBconnector db = new DBconnector();
        String query = "select * from courses where c_name = '"+l6.getText().substring(4)+"'";
        //JOptionPane.showMessageDialog (this, query,"Back to the game",2);
        try {
            db.eQuery(query);
            db.rs.next();
            new courseDetails(this, db.rs.getString("c_id"), username).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.closeConnection();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(courseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    // End of variables declaration//GEN-END:variables
    private courseType prev;
    private String username;
}