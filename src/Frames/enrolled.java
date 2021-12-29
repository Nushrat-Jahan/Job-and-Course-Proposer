package Frames;
import Database.*;
import java.sql.SQLException;

import javax.swing.JLabel;

public class enrolled extends javax.swing.JFrame {

    public enrolled() {
        initComponents();
    }
    public enrolled (courseType temp, String uname) throws ClassNotFoundException, SQLException {
        initComponents();
        prev = temp;
        JLabel arr[] = new JLabel [6];
        arr[0] = t1;
        arr[1] = t2;
        arr[2] = t3;
        arr[3] = t4;
        arr[4] = t5;
        arr[5] = t6;
        DBconnector db = new DBconnector ();
        db.eQuery("select * from enrolled where u_name = '"+uname+"'");
        int i = 0;
        while (db.rs.next()) {
            if (i==6) break;
            arr[i].setText(""+(i+1)+". "+db.rs.getString("c_name"));
            i++;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enrolled Courses");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 53));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_____________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 570, -1));

        t6.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 640, 40));

        t1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 630, 40));

        t2.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setText(" ");
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 630, 40));

        t3.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 630, 40));

        t4.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setText("         ");
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 630, 40));

        t5.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 640, 40));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        prev.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enrolled().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    // End of variables declaration//GEN-END:variables
    private courseType prev;
}
