import java.sql.*;
import javax.swing.*;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * characterencoder.java
 *
 * Created on Dec 27, 2013, 5:44:46 PM
 */

/**
 *
 * @author user
 */
public class f7characterencoder extends javax.swing.JFrame {

    /** Creates new form characterencoder */
    public f7characterencoder() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        a9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tt1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setText("image id");

        a9.setText("c002");
        a9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                a9CaretUpdate(evt);
            }
        });
        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });

        tt1.setColumns(20);
        tt1.setRows(5);
        tt1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(tt1);

        jButton1.setText("insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        b12.setText("jButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel9)
                        .addGap(110, 110, 110)
                        .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed
String x8 =a9.getText() ;

String hg =x8.substring(1);
switch (Integer.parseInt(hg)){


case 0:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c000.jpg"))); break;

case 1:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c001.jpg"))); break;

case 2:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c002.jpg"))); break;

case 3:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c003.jpg"))); break;

case 4:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c004.jpg"))); break;

case 5:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c005.jpg"))); break;

case 6:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c006.jpg"))); break;

case 7:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c007.jpg"))); break;

case 8:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c008.jpg"))); break;

case 9:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c009.jpg"))); break;

case 10:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c010.jpg"))); break;

case 11:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c011.jpg"))); break;

case 12:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c012.jpg"))); break;

case 13:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c013.jpg"))); break;

case 14:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c014.jpg"))); break;

case 15:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c015.jpg"))); break;

case 16:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c016.jpg"))); break;

case 17:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c017.jpg"))); break;

case 18:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c018.jpg"))); break;

case 19:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c019.jpg"))); break;

case 20:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c020.jpg"))); break;

case 21:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c021.jpg"))); break;

case 22:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c022.jpg"))); break;

case 23:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c023.jpg"))); break;

case 24:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c024.jpg"))); break;

case 25:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c025.jpg"))); break;

case 26:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c026.jpg"))); break;

case 27:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c027.jpg"))); break;

case 28:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c028.jpg"))); break;

case 29:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c029.jpg"))); break;

case 30:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c030.jpg"))); break;

case 31:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c031.jpg"))); break;
case 32:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c032.jpg"))); break;

case 33:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c033.jpg"))); break;

case 34:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c034.jpg"))); break;

case 35:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c035.jpg"))); break;

case 36:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c036.jpg"))); break;

case 37:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c037.jpg"))); break;

case 38:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c038.jpg"))); break;

case 39:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c039.jpg"))); break;

case 40:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c040.jpg"))); break;

case 41:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c041.jpg"))); break;

case 42:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c042.jpg"))); break;

case 43:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c043.jpg"))); break;

case 44:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c044.jpg"))); break;

case 45:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c045.jpg"))); break;

case 46:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c046.jpg"))); break;

case 47:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c047.jpg"))); break;

case 48:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c048.jpg"))); break;

case 49:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c049.jpg"))); break;

case 50:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c050.jpg"))); break;

case 51:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c051.jpg"))); break;

case 52:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c052.jpg"))); break;

case 53:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c053.jpg"))); break;

case 54:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c054.jpg"))); break;

case 55:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c055.jpg"))); break;

case 56:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c056.jpg"))); break;

case 57:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c057.jpg"))); break;

case 58:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c058.jpg"))); break;

case 59:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c059.jpg"))); break;

case 60:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c060.jpg"))); break;

case 61:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c061.jpg"))); break;

case 62:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c062.jpg"))); break;

case 63:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c063.jpg"))); break;

case 64:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c064.jpg"))); break;

case 65:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c065.jpg"))); break;

case 66:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c066.jpg"))); break;

case 67:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c067.jpg"))); break;

case 68:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c068.jpg"))); break;

case 69:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c069.jpg"))); break;

case 70:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c070.jpg"))); break;

case 71:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c071.jpg"))); break;

case 72:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c072.jpg"))); break;

case 73:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c073.jpg"))); break;

case 74:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c074.jpg"))); break;

case 75:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c075.jpg"))); break;

case 76:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c076.jpg"))); break;

case 77:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c077.jpg"))); break;

case 78:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c078.jpg"))); break;

case 79:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c079.jpg"))); break;

case 80:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c080.jpg"))); break;

case 81:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c081.jpg"))); break;

case 82:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c082.jpg"))); break;

case 83:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c083.jpg"))); break;

case 84:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c084.jpg"))); break;

case 85:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c085.jpg"))); break;

case 86:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c086.jpg"))); break;

case 87:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c087.jpg"))); break;

case 88:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c088.jpg"))); break;

case 89:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c089.jpg"))); break;

case 90:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c090.jpg"))); break;

case 91:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c091.jpg"))); break;
case 92:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c092.jpg"))); break;

case 93:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c093.jpg"))); break;

case 94:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c094.jpg"))); break;

case 95:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c095.jpg"))); break;

case 96:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c096.jpg"))); break;

case 97:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c097.jpg"))); break;

case 98:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c098.jpg"))); break;

case 99:b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c099.jpg"))); break;



    
}        // TODO add your handling code here:
}//GEN-LAST:event_a9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int gdft;
        String sql="";
        try{
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","tiger");
            Statement s = con.createStatement();



            sql ="create table charactar ( id varchar(30) unique , used varchar(30) ) ;";






            con.close();
            s.close();
        } catch (Exception e){
            String kj =""+e;
            if (kj.length()>3){gdft =1;}}

        try{
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();

            String x8=a9.getText() ;


            String sql2 ="";
            tt1.setText("create table charactar ( id varchar(30) unique , used varchar(30) ) ;");

            for(int i=0;i<91;++i)
            {

            if(i<10)
            {
            sql2 ="insert into charactar values ('c00"+i+"','not') ;";
            }
            else
            {
            sql2 ="insert into charactar values ('c0"+i+"','not') ;";}
            String mysql= tt1.getText();
            tt1.setText("");
            tt1.append(mysql+"\n");

            tt1.append(sql2 +"\n");

            }

            s.executeUpdate(tt1.getText());
            String mysql= tt1.getText();
            tt1.setText("");
            tt1.append(mysql+"\n");

            tt1.append(sql2 +"\n");

            s.executeUpdate(sql2);


            con.close();
            s.close();
           } catch (Exception e){JOptionPane.showMessageDialog(this, e);}
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void a9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_a9CaretUpdate

///if


   // TODO add your handling code here:
    }//GEN-LAST:event_a9CaretUpdate

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f7characterencoder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a9;
    private javax.swing.JButton b12;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tt1;
    // End of variables declaration//GEN-END:variables

}
