import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * f6showdown.java
 *
 * Created on Jan 5, 2014, 12:10:10 PM
 */

/**
 *
 * @author user
 */
public class f6showdown extends javax.swing.JFrame {

    /** Creates new form f6showdown */
    public f6showdown() {
        initComponents();

           String gaurav="";
        sc1.setText(""+100);
        sc2.setText(""+100);


        try{String ss1="",ss2="";
        Class.forName("java.sql.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
        Statement s = con.createStatement();

        String sql="select name from playerexecutive ;";
        ResultSet rs = s.executeQuery(sql);
        while (rs.next()) {
            if (rs.relative(0)) {
                ss1 = rs.getString(1);}
            if (rs.relative(1)) {
                ss2 = rs.getString(1);}
        }
        pname1.setText(ss1);
        pname2.setText(ss2);
        rs.close();
        s.close();
        con.close();
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}


        //corrected
        { //p1
            String carde ="";

            String yy1 =pname1.getText()+"deck";
            String yy2 =pname2.getText()+"deck";
            try{String ss1="",ss2="";
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();

            String sql="select cardid from "+yy1+" ;";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                String hj=  rs.getString(1);
                carde += hj;

            }
            rs.close();
            s.close();
            con.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}
            String newd="",newrs ;
            newd = carde;

            for (;!(gaurav.length()>carde.length());newd =newrs){
                int r = newd.length()/3-1;
                int ra=(int)(Math.random()*r);
                int l=0;
                //31
                //corrected

                l=ra*3;




                //error some where run it

                //not exe
                String p="";
                if(newd.length()>2){ p=newd.substring(l, l+3);
                String pi =newd.substring(0,l);
                String pit=newd.substring(l+3);

                newrs =pi+pit;
                gaurav +=p;
                } else break;


            }//big loop
          
            extra1.setText(gaurav);
       
        }//p1

gaurav="";
        { //p2
            String carde ="";


            String yy2 =pname2.getText()+"deck";
            try{String ss1="",ss2="";
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();

            String sql="select cardid from "+yy2+" ;";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                String hj=  rs.getString(1);
                carde += hj;

            }
            rs.close();
            s.close();
            con.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}
            String newd="",newrs ;
            newd = carde;
            for (;!(gaurav.length()>carde.length());newd =newrs){
                int r = newd.length()/3-1;
                int ra=(int)(Math.random()*r);
                int l=0;
                //31
                //corrected

                l=ra*3;




                //error some where run it

                //not exe
                String p="";
                if(newd.length()>2){ p=newd.substring(l, l+3);
                String pi =newd.substring(0,l);
                String pit=newd.substring(l+3);

                newrs =pi+pit;
                gaurav +=p;
                } else break;

            }//big loop
            extra2.setText(gaurav);
       
        }        //p2



        String sd;


        try{
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            Object n1 =pname1.getText();

            String sql="select imageid from player where name ='"+n1+"';";

            ResultSet rs = s.executeQuery(sql);

            rs.first();
            sd =rs.getString(1);

            String hg =sd.substring(1,4);

            switch (Integer.parseInt(hg)){


case 0:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c000.jpg"))); break;

                    case 1:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c001.jpg"))); break;

                    case 2:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c002.gif"))); break;

                    case 3:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c003.jpg"))); break;

                    case 4:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c004.jpg"))); break;

                    case 5:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c005.gif"))); break;

                    case 6:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c006.jpg"))); break;

                    case 7:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c007.jpg"))); break;

                    case 8:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c008.jpg"))); break;

                    case 9:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c009.jpg"))); break;

                    case 10:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c010.jpg"))); break;

                    case 11:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c011.jpg"))); break;

                    case 12:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c012.jpg"))); break;

                    case 13:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c013.jpg"))); break;

                    case 14:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c014.jpg"))); break;

                    case 15:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c015.jpg"))); break;

                    case 16:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c016.jpg"))); break;

                    case 17:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c017.gif"))); break;

                    case 18:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c018.jpg"))); break;

                    case 19:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c019.gif"))); break;

                    case 20:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c020.jpg"))); break;

                    case 21:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c021.gif"))); break;

                    case 22:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c022.jpg"))); break;

                    case 23:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c023.gif"))); break;

                    case 24:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c024.jpg"))); break;

                    case 25:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c025.jpg"))); break;

                    case 26:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c026.gif"))); break;

                    case 27:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c027.gif"))); break;

                    case 28:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c028.jpg"))); break;

                    case 29:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c029.jpg"))); break;

                    case 30:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c030.gif"))); break;

                    case 31:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c031.gif"))); break;

                    case 32:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c032.jpg"))); break;

                    case 33:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c033.jpg"))); break;

                    case 34:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c034.jpg"))); break;

                    case 35:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c035.jpg"))); break;

                    case 36:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c036.jpg"))); break;

                    case 37:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c037.jpg"))); break;

                    case 38:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c038.jpg"))); break;

                    case 39:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c039.jpg"))); break;

                    case 40:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c040.jpg"))); break;

                    case 41:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c041.jpg"))); break;

                    case 42:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c042.jpg"))); break;

                    case 43:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c043.jpg"))); break;

                    case 44:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c044.jpg"))); break;

                    case 45:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c045.jpg"))); break;

                    case 46:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c046.jpg"))); break;

                    case 47:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c047.jpg"))); break;

                    case 48:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c048.jpg"))); break;

                    case 49:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c049.jpg"))); break;

                    case 50:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c050.jpg"))); break;

                    case 51:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c051.jpg"))); break;

                    case 52:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c052.jpg"))); break;

                    case 53:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c053.jpg"))); break;

                    case 54:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c054.jpg"))); break;

                    case 55:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c055.jpg"))); break;

                    case 56:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c056.jpg"))); break;

                    case 57:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c057.jpg"))); break;

                    case 58:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c058.jpg"))); break;

                    case 59:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c059.jpg"))); break;

                    case 60:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c060.jpg"))); break;

                    case 61:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c061.jpg"))); break;

                    case 62:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c062.gif"))); break;

                    case 63:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c063.jpg"))); break;

                    case 64:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c064.gif"))); break;

                    case 65:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c065.jpg"))); break;

                    case 66:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c066.jpg"))); break;

                    case 67:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c067.jpg"))); break;

                    case 68:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c068.jpg"))); break;

                    case 69:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c069.jpg"))); break;

                    case 70:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c070.jpg"))); break;

                    case 71:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c071.jpg"))); break;

                    case 72:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c072.jpg"))); break;

                    case 73:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c073.gif"))); break;

                    case 74:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c074.jpg"))); break;

                    case 75:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c075.jpg"))); break;

                    case 76:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c076.jpg"))); break;

                    case 77:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c077.jpg"))); break;

                    case 78:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c078.jpg"))); break;

                    case 79:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c079.jpg"))); break;

                    case 80:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c080.jpg"))); break;

                    case 81:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c081.jpg"))); break;

                    case 82:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c082.jpg"))); break;

                    case 83:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c083.jpg"))); break;

                    case 84:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c084.jpg"))); break;

                    case 85:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c085.jpg"))); break;

                    case 86:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c086.jpg"))); break;

                    case 87:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c087.jpg"))); break;

                    case 88:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c088.jpg"))); break;

                    case 89:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c089.jpg"))); break;

                    case 90:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c090.jpg"))); break;

                    case 91:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c091.jpg"))); break;
                    case 92:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c092.jpg"))); break;

                    case 93:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c093.jpg"))); break;

                    case 94:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c094.jpg"))); break;

                    case 95:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c095.jpg"))); break;

                    case 96:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c096.jpg"))); break;

                    case 97:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c097.jpg"))); break;

                    case 98:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c098.jpg"))); break;

                    case 99:b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c099.jpg"))); break;



            }

        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}








        try{
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            Object n2 =pname2.getText();

            String sql="select imageid from player where name ='"+n2+"';";

            ResultSet rs = s.executeQuery(sql);

            rs.first();

            sd =rs.getString(1);

            String hg =sd.substring(1,4);
            switch (Integer.parseInt(hg)){

case 0:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c000.jpg"))); break;

                  
                    case 1:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c001.jpg"))); break;

                    case 2:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c002.gif"))); break;

                    case 3:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c003.jpg"))); break;

                    case 4:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c004.jpg"))); break;

                    case 5:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c005.gif"))); break;

                    case 6:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c006.jpg"))); break;

                    case 7:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c007.jpg"))); break;

                    case 8:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c008.jpg"))); break;

                    case 9:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c009.jpg"))); break;

                    case 10:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c010.jpg"))); break;

                    case 11:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c011.jpg"))); break;

                    case 12:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c012.jpg"))); break;

                    case 13:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c013.jpg"))); break;

                    case 14:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c014.jpg"))); break;

                    case 15:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c015.jpg"))); break;

                    case 16:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c016.jpg"))); break;

                    case 17:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c017.gif"))); break;

                    case 18:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c018.jpg"))); break;

                    case 19:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c019.gif"))); break;

                    case 20:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c020.jpg"))); break;

                    case 21:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c021.gif"))); break;

                    case 22:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c022.jpg"))); break;

                    case 23:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c023.gif"))); break;

                    case 24:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c024.jpg"))); break;

                    case 25:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c025.jpg"))); break;

                    case 26:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c026.gif"))); break;

                    case 27:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c027.gif"))); break;

                    case 28:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c028.jpg"))); break;

                    case 29:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c029.jpg"))); break;

                    case 30:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c030.gif"))); break;

                    case 31:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c031.gif"))); break;

                    case 32:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c032.jpg"))); break;

                    case 33:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c033.jpg"))); break;

                    case 34:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c034.jpg"))); break;

                    case 35:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c035.jpg"))); break;

                    case 36:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c036.jpg"))); break;

                    case 37:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c037.jpg"))); break;

                    case 38:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c038.jpg"))); break;

                    case 39:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c039.jpg"))); break;

                    case 40:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c040.jpg"))); break;

                    case 41:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c041.jpg"))); break;

                    case 42:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c042.jpg"))); break;

                    case 43:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c043.jpg"))); break;

                    case 44:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c044.jpg"))); break;

                    case 45:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c045.jpg"))); break;

                    case 46:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c046.jpg"))); break;

                    case 47:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c047.jpg"))); break;

                    case 48:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c048.jpg"))); break;

                    case 49:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c049.jpg"))); break;

                    case 50:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c050.jpg"))); break;

                    case 51:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c051.jpg"))); break;

                    case 52:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c052.jpg"))); break;

                    case 53:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c053.jpg"))); break;

                    case 54:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c054.jpg"))); break;

                    case 55:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c055.jpg"))); break;

                    case 56:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c056.jpg"))); break;

                    case 57:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c057.jpg"))); break;

                    case 58:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c058.jpg"))); break;

                    case 59:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c059.jpg"))); break;

                    case 60:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c060.jpg"))); break;

                    case 61:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c061.jpg"))); break;

                    case 62:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c062.gif"))); break;

                    case 63:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c063.jpg"))); break;

                    case 64:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c064.gif"))); break;

                    case 65:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c065.jpg"))); break;

                    case 66:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c066.jpg"))); break;

                    case 67:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c067.jpg"))); break;

                    case 68:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c068.jpg"))); break;

                    case 69:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c069.jpg"))); break;

                    case 70:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c070.jpg"))); break;

                    case 71:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c071.jpg"))); break;

                    case 72:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c072.jpg"))); break;

                    case 73:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c073.gif"))); break;

                    case 74:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c074.jpg"))); break;

                    case 75:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c075.jpg"))); break;

                    case 76:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c076.jpg"))); break;

                    case 77:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c077.jpg"))); break;

                    case 78:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c078.jpg"))); break;

                    case 79:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c079.jpg"))); break;

                    case 80:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c080.jpg"))); break;

                    case 81:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c081.jpg"))); break;

                    case 82:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c082.jpg"))); break;

                    case 83:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c083.jpg"))); break;

                    case 84:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c084.jpg"))); break;

                    case 85:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c085.jpg"))); break;

                    case 86:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c086.jpg"))); break;

                    case 87:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c087.jpg"))); break;

                    case 88:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c088.jpg"))); break;

                    case 89:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c089.jpg"))); break;

                    case 90:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c090.jpg"))); break;

                    case 91:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c091.jpg"))); break;
                    case 92:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c092.jpg"))); break;

                    case 93:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c093.jpg"))); break;

                    case 94:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c094.jpg"))); break;

                    case 95:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c095.jpg"))); break;

                    case 96:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c096.jpg"))); break;

                    case 97:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c097.jpg"))); break;

                    case 98:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c098.jpg"))); break;

                    case 99:b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/character/c099.jpg"))); break;


            }

        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}

   String a11t=  a111.getText();
        String a12t=  a112.getText();
        String a13t=  a113.getText();
        String a14t=  a114.getText();
        String a21t=  a116.getText();
        String a22t=  a115.getText();
        String a23t=  a117.getText();
        String a24t=  a118.getText();

        if (a11t.equals("")){
            try{

                String cd =extra1.getText();

              sd=cd.substring(0, 3);

                String sql = "select name from yugioh,"+pname1.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra1.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                String res = rs.getString(1);
                a111.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }




        if (a12t.equals("")){
            try{

                String cd =extra1.getText();

             sd=cd.substring(0, 3);

                String sql = "select name from yugioh,"+pname1.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra1.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                String res = rs.getString(1);
                a112.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }




        if (a13t.equals("")){
            try{

                 String cd =extra1.getText();

                 sd=cd.substring(0, 3);

                String sql = "select name from yugioh,"+pname1.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra1.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();

                String res = rs.getString(1);
                a113.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }





        if (a14t.equals("")){
            try{

                String cd =extra1.getText();

                 sd=cd.substring(0, 3);

                String sql = "select name from yugioh,"+pname1.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra1.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                String res = rs.getString(1);
                a114.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }



        //successful
a11t=  a111.getText();
        a12t=  a112.getText();
        a13t=  a113.getText();
        a14t=  a114.getText();
        a21t=  a115.getText();
        a22t=  a116.getText();
        a23t=  a117.getText();
        a24t=  a118.getText();



        if (a21t.equals("")){
            try{

                String cd =extra2.getText();

              sd=cd.substring(0, 3);

                String sql = "select name from yugioh,"+pname2.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra2.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                String res = rs.getString(1);
                a115.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }




        if (a22t.equals("")){
            try{

                String cd =extra2.getText();

              sd=cd.substring(0, 3);

                String sql = "select name from yugioh,"+pname2.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra2.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                String res = rs.getString(1);
                a116.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }




        if (a23t.equals("")){
            try{

                 String cd =extra2.getText();

                sd=cd.substring(0, 3);

                String sql = "select name from yugioh,"+pname2.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra2.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();

                String res = rs.getString(1);
                a117.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }





        if (a24t.equals("")){
            try{

                String cd =extra2.getText();

                 sd=cd.substring(0, 3);



                String sql = "select name from yugioh,"+pname2.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra2.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                String res = rs.getString(1);
                a118.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}
        }// TODO add your handling code here:



        {
            String tet ;


        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";

        tet = a111.getText();
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            aa1.setText(ab11);
            aa2.setText(ab21);
            aa3.setText(ab31);
            aa4.setText(ab41);
            aa5.setText(ab51);
            String hg =ab71;
            switch_bb1(hg);

        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}
    }

        {
            String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";


        String tet = a115.getText();
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            ab1.setText(ab11);
            ab2.setText(ab21);
            ab3.setText(ab31);
            ab4.setText(ab41);
            ab5.setText(ab51);
String hg =ab71 ;
            switch_bb3(hg);

        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        aa12 = new javax.swing.JLabel();
        b2back = new javax.swing.JToggleButton();
        nameaa11 = new javax.swing.JLabel();
        sc1 = new javax.swing.JLabel();
        ab4 = new javax.swing.JTextField();
        nameaa12 = new javax.swing.JLabel();
        bb3 = new javax.swing.JButton();
        a117 = new javax.swing.JButton();
        at1attack1 = new javax.swing.JLabel();
        d1def1 = new javax.swing.JLabel();
        b2back1 = new javax.swing.JToggleButton();
        aa5 = new javax.swing.JTextField();
        a116 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        aa4 = new javax.swing.JTextField();
        lamg = new javax.swing.JLabel();
        s1str1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        aa1 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        pname1 = new javax.swing.JLabel();
        sk1sjill = new javax.swing.JLabel();
        sc2 = new javax.swing.JLabel();
        ab2 = new javax.swing.JTextField();
        a114 = new javax.swing.JButton();
        s1str = new javax.swing.JLabel();
        ab3 = new javax.swing.JTextField();
        ab1 = new javax.swing.JLabel();
        ab5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        aa3 = new javax.swing.JTextField();
        d1def = new javax.swing.JLabel();
        a111 = new javax.swing.JButton();
        at1attack = new javax.swing.JLabel();
        bb1 = new javax.swing.JButton();
        extra1 = new javax.swing.JLabel();
        a112 = new javax.swing.JButton();
        pname2 = new javax.swing.JLabel();
        rt3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        aa2 = new javax.swing.JTextField();
        a115 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        sk1sjill1 = new javax.swing.JLabel();
        a113 = new javax.swing.JButton();
        rt2 = new javax.swing.JButton();
        a118 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        extra2 = new javax.swing.JLabel();
        extra11 = new javax.swing.JLabel();
        extra21 = new javax.swing.JLabel();
        aa7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        aa12.setText("present cards");

        b2back.setFont(new java.awt.Font("Agency FB", 1, 18));
        b2back.setText("Back");
        b2back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2backActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1381, 874));

        nameaa11.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        nameaa11.setForeground(new java.awt.Color(102, 0, 204));
        nameaa11.setText("Name");

        sc1.setFont(new java.awt.Font("Comic Sans MS", 1, 25));
        sc1.setForeground(new java.awt.Color(153, 0, 51));
        sc1.setText("Score");

        ab4.setEditable(false);
        ab4.setFont(new java.awt.Font("Arial", 1, 14));

        nameaa12.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        nameaa12.setForeground(new java.awt.Color(102, 0, 204));
        nameaa12.setText("Name");

        bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/019.jpg"))); // NOI18N
        bb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb3ActionPerformed(evt);
            }
        });

        a117.setFont(new java.awt.Font("Footlight MT Light", 0, 24));
        a117.setAlignmentY(0.0F);
        a117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a117ActionPerformed(evt);
            }
        });

        at1attack1.setFont(new java.awt.Font("Tahoma", 1, 14));
        at1attack1.setForeground(new java.awt.Color(102, 0, 0));
        at1attack1.setText("Atttack");

        d1def1.setFont(new java.awt.Font("Tahoma", 1, 14));
        d1def1.setForeground(new java.awt.Color(102, 0, 0));
        d1def1.setText("Defence");

        b2back1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b2back1.setForeground(new java.awt.Color(51, 51, 0));
        b2back1.setText("Back");
        b2back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2back1ActionPerformed(evt);
            }
        });

        aa5.setEditable(false);
        aa5.setFont(new java.awt.Font("Arial", 1, 14));

        a116.setFont(new java.awt.Font("Footlight MT Light", 0, 24));
        a116.setAlignmentY(0.0F);
        a116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a116ActionPerformed(evt);
            }
        });

        b1.setRolloverEnabled(false);

        aa4.setEditable(false);
        aa4.setFont(new java.awt.Font("Arial", 1, 14));

        lamg.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14));
        lamg.setForeground(new java.awt.Color(153, 0, 51));
        lamg.setText("Present Cards");

        s1str1.setFont(new java.awt.Font("Tahoma", 1, 14));
        s1str1.setForeground(new java.awt.Color(102, 0, 0));
        s1str1.setText("Strategy");

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 24));
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("Perform");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        aa1.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        aa1.setForeground(new java.awt.Color(102, 0, 204));

        b2.setAlignmentY(0.0F);
        b2.setRolloverEnabled(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        pname1.setFont(new java.awt.Font("Comic Sans MS", 1, 25));
        pname1.setForeground(new java.awt.Color(153, 0, 51));
        pname1.setText("Pname");

        sk1sjill.setFont(new java.awt.Font("Tahoma", 1, 14));
        sk1sjill.setForeground(new java.awt.Color(102, 0, 0));
        sk1sjill.setText("Skill");

        sc2.setFont(new java.awt.Font("Comic Sans MS", 1, 25));
        sc2.setForeground(new java.awt.Color(153, 0, 51));
        sc2.setText("Score");

        ab2.setEditable(false);
        ab2.setFont(new java.awt.Font("Arial", 1, 14));

        a114.setFont(new java.awt.Font("Footlight MT Light", 0, 24));
        a114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a114ActionPerformed(evt);
            }
        });

        s1str.setFont(new java.awt.Font("Tahoma", 1, 14));
        s1str.setForeground(new java.awt.Color(102, 0, 0));
        s1str.setText("Strategy");

        ab3.setEditable(false);
        ab3.setFont(new java.awt.Font("Arial", 1, 14));

        ab1.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        ab1.setForeground(new java.awt.Color(102, 0, 204));

        ab5.setEditable(false);
        ab5.setFont(new java.awt.Font("Arial", 1, 14));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back/nnext1.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        aa3.setEditable(false);
        aa3.setFont(new java.awt.Font("Arial", 1, 14));

        d1def.setFont(new java.awt.Font("Tahoma", 1, 14));
        d1def.setForeground(new java.awt.Color(102, 0, 0));
        d1def.setText("Defence");

        a111.setFont(new java.awt.Font("Footlight MT Light", 0, 24));
        a111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a111ActionPerformed(evt);
            }
        });

        at1attack.setFont(new java.awt.Font("Tahoma", 1, 14));
        at1attack.setForeground(new java.awt.Color(102, 0, 0));
        at1attack.setText("Attack");

        bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/008.jpg"))); // NOI18N
        bb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb1ActionPerformed(evt);
            }
        });

        extra1.setText("jLabel2");

        a112.setFont(new java.awt.Font("Footlight MT Light", 0, 24));
        a112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a112ActionPerformed(evt);
            }
        });

        pname2.setFont(new java.awt.Font("Comic Sans MS", 1, 25));
        pname2.setForeground(new java.awt.Color(153, 0, 51));
        pname2.setText("Pname");

        rt3.setFont(new java.awt.Font("Comic Sans MS", 1, 36));
        rt3.setForeground(new java.awt.Color(0, 51, 0));
        rt3.setText("Load cards");
        rt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt3ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back/nnext1.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        aa2.setEditable(false);
        aa2.setFont(new java.awt.Font("Arial", 1, 14));

        a115.setFont(new java.awt.Font("Footlight MT Light", 0, 24));
        a115.setAlignmentY(0.0F);
        a115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a115ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back/bback1.jpg"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        sk1sjill1.setFont(new java.awt.Font("Tahoma", 1, 14));
        sk1sjill1.setForeground(new java.awt.Color(102, 0, 0));
        sk1sjill1.setText("Skill");

        a113.setFont(new java.awt.Font("Footlight MT Light", 0, 24));
        a113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a113ActionPerformed(evt);
            }
        });

        rt2.setFont(new java.awt.Font("Comic Sans MS", 1, 36));
        rt2.setForeground(new java.awt.Color(0, 51, 0));
        rt2.setText("Load cards");
        rt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt2ActionPerformed(evt);
            }
        });

        a118.setFont(new java.awt.Font("Footlight MT Light", 0, 24));
        a118.setAlignmentY(0.0F);
        a118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a118ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back/bback1.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        extra2.setText("jLabel2");

        extra11.setText("jLabel2");

        extra21.setText("jLabel2");

        aa7.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14));
        aa7.setForeground(new java.awt.Color(153, 0, 51));
        aa7.setText("Present Cards");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(extra1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(extra2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(extra11, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(extra21, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lamg, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a111, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a112, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a113, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a114, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(s1str)
                                                                .addComponent(sk1sjill, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(aa4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(aa5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(nameaa11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(36, 36, 36)
                                                            .addComponent(aa1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(d1def)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(aa3))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(at1attack)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(aa2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGap(53, 53, 53)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(at1attack1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(d1def1))
                                                .addComponent(nameaa12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(ab3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ab2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(27, 27, 27)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(s1str1)
                                                        .addComponent(sk1sjill1))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(ab5)
                                                        .addComponent(ab4, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(38, 38, 38)
                                                    .addComponent(ab1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(pname1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(sc1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(bb1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(pname2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(83, 83, 83))
                                                .addComponent(bb3))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton7, 0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE))
                                            .addGap(8, 8, 8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(a115, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                                .addComponent(a116, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                                .addComponent(a117, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                                .addComponent(aa7)
                                                .addComponent(a118, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                                .addComponent(rt3, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                                        .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(593, 593, 593)
                                    .addComponent(sc2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(b2back1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)))
                        .addGap(500, 500, 500))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pname1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pname2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sc1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sc2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bb3, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bb1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(aa1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                        .addComponent(ab1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                                    .addGap(32, 32, 32))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(nameaa12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nameaa11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(at1attack)
                                    .addComponent(aa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s1str)
                                    .addComponent(aa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(d1def)
                                    .addComponent(aa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sk1sjill)
                                    .addComponent(aa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(s1str1)
                                    .addComponent(ab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(at1attack1)
                                    .addComponent(ab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(d1def1)
                                    .addComponent(sk1sjill1)
                                    .addComponent(ab5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lamg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(a111, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(a112, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a113, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a114, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rt2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aa7)
                        .addGap(5, 5, 5)
                        .addComponent(a115, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a116, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a117, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(a118, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rt3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b2back1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extra1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extra21, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extra2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extra11, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb3ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_bb3ActionPerformed

    private void a117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a117ActionPerformed

        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";

        String tet = a117.getText();
        if(tet.equals("")){JOptionPane.showMessageDialog(this,"Please Load your Cards");}else{
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            ab1.setText(ab11);
            ab2.setText(ab21);
            ab3.setText(ab31);
            ab4.setText(ab41);
            ab5.setText(ab51);

            String hg =ab71 ;
      switch_bb3(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}} // TODO add your handling code here:
}//GEN-LAST:event_a117ActionPerformed

    private void b2back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2back1ActionPerformed
 dispose();
        new f4menu().setVisible(true);        // TODO add your handling code here:
}//GEN-LAST:event_b2back1ActionPerformed

    private void a116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a116ActionPerformed

        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";

        String tet = a116.getText();
        if(tet.equals("")){JOptionPane.showMessageDialog(this,"Please Load your Cards");}else{
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            ab1.setText(ab11);
            ab2.setText(ab21);
            ab3.setText(ab31);
            ab4.setText(ab41);
            ab5.setText(ab51);

String hg =ab71 ;
       switch_bb3(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}  }  // TODO add your handling code here:
}//GEN-LAST:event_a116ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String n1="",n2="";
        // TODO add your handling code here:
        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";

        String tet1 =aa1.getText(),tet2=ab1.getText();
        try{


            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet1+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();



        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet2+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab12 = rs.getString(1);
                ab22 = rs.getString(2);
                ab32 = rs.getString(3);
                ab42 = rs.getString(4);
                ab52 = rs.getString(5);
                ab62 = rs.getString(6);
                ab72 = rs.getString(7);}
            con.close();
            s.close();
            rs.close();


        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}
       int ikj=0;
        double pi=0,lion=0;
        boolean abc = 6==6;
        double first=Double.parseDouble(ab61);
        double second=Double.parseDouble(ab62);
        abc= first>second;
        double pit =0;
        pit =Math.round(pi);
      double scvv1=0;
       double scvv2=0,sc1v,sc2v;
        if (abc){
            //photo
            pi = (first -second) /50;
            pit =Math.round(pi);
           sc1v = Double.parseDouble(sc1.getText())+pit;
         sc2v = Double.parseDouble(sc2.getText())-pit;
         scvv1=sc1v;
           scvv2=sc2v;
       if  (sc2v>0&&sc2v>0){


            sc2.setText(""+sc2v);
 }

            //sc1,sc2
        } else{
          
            pi = -1*(first -second) /50 ;

            pit =Math.round(pi);
            sc1v = Double.parseDouble(sc1.getText())-pit;
            sc2v = Double.parseDouble(sc2.getText())+pit;
            scvv1=sc1v;
              scvv2=sc2v;
              if(sc1v>0&&sc2v>0)
            {
              sc1.setText(""+sc1v);
            }
        }

        if (sc1v <0&&sc2v>0){
            lion =sc1v+sc2v;
       
            double but =Double.parseDouble(sc2.getText());
ikj =1;
            JOptionPane.showMessageDialog(null,"game over " +pname2.getText()+" won the game by "+lion+" points");
            String sql = "update player " +
                    "set points =points -"+lion +"" +
                    " where name='" +pname1.getText()+"';" ;
            String sql1="update player set points =points +"+lion+" where name='" +pname2.getText()+"';" ;
              String sql2 =      " drop table playerexecutive;" ;//yy is tablename
           String sql3="update player set lost=lost+1 where name='" +pname1.getText()+"';" ;
                      String sql4="update player set win =win+1 where name='" +pname2.getText()+"';" ;
           String sql5="update player set totalmatches =totalmatches+1 where name='" +pname1.getText()+"';" ;
      String sql6="update player set totalmatches =totalmatches+1 where name='" +pname2.getText()+"';" ;
              try{Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();

            s.executeUpdate(sql);
            s.executeUpdate(sql2);
 s.executeUpdate(sql1);
 s.executeUpdate(sql3);s.executeUpdate(sql4);s.executeUpdate(sql5);s.executeUpdate(sql6);

            con.close();
            s.close();
dispose();
new f5playerstats().setVisible(true);
            }catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);}
        }


         if (sc1v >0&&sc2v<0){
            double but =Double.parseDouble(sc1.getText());
             lion =sc1v+sc2v;
ikj=1;
            JOptionPane.showMessageDialog(null,"game over " +pname1.getText()+" won the game by"+lion+"points");
            String sql = "update player set points =points +"+lion +" where name='" +pname1.getText()+"';";
            String sql1="update player set points =points -"+lion
                                           +" where name='" +pname2.getText()+"';";
            String sql2= "drop table playerexecutive; " ;
            String sql3="update player set lost =lost+1 where name='" +pname2.getText()+"';" ;
                      String sql4="update player set win =win+1 where name='" +pname1.getText()+"';" ;
           String sql5="update player set totalmatches =totalmatches+1 where name='" +pname2.getText()+"';" ;
      String sql6="update player set totalmatches =totalmatches+1 where name='" +pname1.getText()+"';" ;//yy is tablename
            try{Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            s.executeUpdate(sql);
            s.executeUpdate(sql1);
            s.executeUpdate(sql2);
            s.executeUpdate(sql3);s.executeUpdate(sql4);s.executeUpdate(sql5);s.executeUpdate(sql6);
            con.close();
            s.close();
dispose();
new f5playerstats().setVisible(true);

            }catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);}
        }
       if(ikj==0){
        {if(aa1.getText().equals(a111.getText())){aa1.setText("");a111.setText("");aa2.setText("");aa3.setText("");aa4.setText("");aa5.setText("");}
        else if(aa1.getText().equals(a112.getText())){aa1.setText("");a112.setText("");aa2.setText("");aa3.setText("");aa4.setText("");aa5.setText("");}
        else if(aa1.getText().equals(a113.getText())){aa1.setText("");a113.setText("");aa2.setText("");aa3.setText("");aa4.setText("");aa5.setText("");}
        else if(aa1.getText().equals(a114.getText())){aa1.setText("");a114.setText("");aa2.setText("");aa3.setText("");aa4.setText("");aa5.setText("");}

        if(ab1.getText().equals(a115.getText())){ab1.setText("");a115.setText("");ab2.setText("");ab3.setText("");ab4.setText("");ab5.setText("");}
        else if(ab1.getText().equals(a116.getText())){ab1.setText("");a116.setText("");ab2.setText("");ab3.setText("");ab4.setText("");ab5.setText("");}
        else if(ab1.getText().equals(a117.getText())){ab1.setText("");a117.setText("");ab2.setText("");ab3.setText("");ab4.setText("");ab5.setText("");}
        else if(ab1.getText().equals(a118.getText())){ab1.setText("");a118.setText("");ab2.setText("");ab3.setText("");ab4.setText("");ab5.setText("");}
}
 String tet ;
int uy=0;

        if(!(a111.getText().equals("")))
        {tet = a111.getText();
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            aa1.setText(ab11);
            aa2.setText(ab21);
            aa3.setText(ab31);
            aa4.setText(ab41);
            aa5.setText(ab51);
            String hg =ab71;
            switch_bb1(hg);

        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}  }
        else if(!(a112.getText().equals(""))){
            tet = a112.getText();
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            aa1.setText(ab11);
            aa2.setText(ab21);
            aa3.setText(ab31);
            aa4.setText(ab41);
            aa5.setText(ab51);
String hg =ab71;
                switch_bb1(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}  }
 else if(!(a113.getText().equals(""))){  tet = a113.getText();
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            aa1.setText(ab11);
            aa2.setText(ab21);
            aa3.setText(ab31);
            aa4.setText(ab41);
            aa5.setText(ab51);

String hg =ab71;
              switch_bb1(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }
 else if(!(a114.getText().equals(""))){  tet = a114.getText();
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            aa1.setText(ab11);
            aa2.setText(ab21);
            aa3.setText(ab31);
            aa4.setText(ab41);
            aa5.setText(ab51);

String hg =ab71;
                  switch_bb1(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);} }


if(!(a115.getText().equals("")))
        {tet = a115.getText();
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            ab1.setText(ab11);
            ab2.setText(ab21);
            ab3.setText(ab31);
            ab4.setText(ab41);
            ab5.setText(ab51);
            String hg =ab71;
            switch_bb3(hg);

        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}  }
        else if(!(a116.getText().equals(""))){
            tet = a116.getText();
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            ab1.setText(ab11);
            ab2.setText(ab21);
            ab3.setText(ab31);
            ab4.setText(ab41);
            ab5.setText(ab51);
String hg =ab71;
                switch_bb3(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}  }
 else if(!(a117.getText().equals(""))){  tet = a117.getText();
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            ab1.setText(ab11);
            ab2.setText(ab21);
            ab3.setText(ab31);
            ab4.setText(ab41);
            ab5.setText(ab51);

String hg =ab71;
              switch_bb3(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }
 else if(!(a118.getText().equals(""))){  tet = a118.getText();
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            ab1.setText(ab11);
            ab2.setText(ab21);
            ab3.setText(ab31);
            ab4.setText(ab41);
            ab5.setText(ab51);

String hg =ab71;
                  switch_bb3(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);} }

       }
}//GEN-LAST:event_jButton4ActionPerformed

    private void a114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a114ActionPerformed

        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";

        String tet = a114.getText();
        if(tet.equals("")){JOptionPane.showMessageDialog(this,"Please Load your Cards");}else{
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            aa1.setText(ab11);
            aa2.setText(ab21);
            aa3.setText(ab31);
            aa4.setText(ab41);
            aa5.setText(ab51);

String hg =ab71;
                  switch_bb1(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}    }     // TODO add your handling code here:
}//GEN-LAST:event_a114ActionPerformed

    private void b2backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2backActionPerformed
        dispose();
        new f4menu().setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_b2backActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String tyi =aa1.getText();
        if(aa1.getText().equals(a111.getText())){aa1.setText(a112.getText());}
        else if(aa1.getText().equals(a112.getText())){aa1.setText(a113.getText());}
        else if(aa1.getText().equals(a113.getText())){aa1.setText(a114.getText());}
        else if(aa1.getText().equals(a114.getText())){aa1.setText(a111.getText());}

      

        String tet =aa1.getText();
        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";
if(tet.equals("")){JOptionPane.showMessageDialog(this,"Please Load your Cards. This card is empty");
aa1.setText(tyi);}else{
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            aa1.setText(ab11);
            aa2.setText(ab21);
            aa3.setText(ab31);
            aa4.setText(ab41);
            aa5.setText(ab51);
   String hg =ab71;

               switch_bb1(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}}
        // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

    private void a111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a111ActionPerformed

        String tet ;


        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";

        tet = a111.getText();
        if(tet.equals("")){JOptionPane.showMessageDialog(this,"Please Load your Cards");}else{
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            aa1.setText(ab11);
            aa2.setText(ab21);
            aa3.setText(ab31);
            aa4.setText(ab41);
            aa5.setText(ab51);
            String hg =ab71;
            switch_bb1(hg);

        } catch (Exception e){JOptionPane.showMessageDialog(this, e);} }        // TODO add your handling code here:
}//GEN-LAST:event_a111ActionPerformed

    private void bb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_bb1ActionPerformed

    private void a112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a112ActionPerformed

        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";

        String tet = a112.getText();
        if(tet.equals("")){JOptionPane.showMessageDialog(this,"Please Load your Cards");}else{
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            aa1.setText(ab11);
            aa2.setText(ab21);
            aa3.setText(ab31);
            aa4.setText(ab41);
            aa5.setText(ab51);
String hg =ab71;
                switch_bb1(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}  }       // TODO add your handling code here:
}//GEN-LAST:event_a112ActionPerformed

    private void rt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt3ActionPerformed
   String a11t=  a111.getText();
        String a12t=  a112.getText();
        String a13t=  a113.getText();
        String a14t=  a114.getText();
        String a21t=  a115.getText();
        String a22t=  a116.getText();
        String a23t=  a117.getText();
        String a24t=  a118.getText();



        if (a21t.equals("")){
            try{

                String cd =extra2.getText();

                String sd=cd.substring(0, 3);
          
                String sql = "select name from yugioh,"+pname2.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra2.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                String res = rs.getString(1);
                a115.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }




        if (a22t.equals("")){
            try{

                String cd =extra2.getText();

                String sd=cd.substring(0, 3);
                
                String sql = "select name from yugioh,"+pname2.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra2.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                String res = rs.getString(1);
                a116.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }




        if (a23t.equals("")){
            try{

                 String cd =extra2.getText();

                String sd=cd.substring(0, 3);
               
                String sql = "select name from yugioh,"+pname2.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra2.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();

                String res = rs.getString(1);
                a117.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }





        if (a24t.equals("")){
            try{

                String cd =extra2.getText();

                String sd=cd.substring(0, 3);


                
                String sql = "select name from yugioh,"+pname2.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra2.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                String res = rs.getString(1);
                a118.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}
        }// TODO add your handling code here:




             // TODO add your handling code here:
}//GEN-LAST:event_rt3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
String tyi =ab1.getText();
if(ab1.getText().equals(a115.getText()))     {ab1.setText(a116.getText());}
        else if(ab1.getText().equals(a116.getText())){ab1.setText(a117.getText());}
        else if(ab1.getText().equals(a117.getText())){ab1.setText(a118.getText());}
        else if(ab1.getText().equals(a118.getText())){ab1.setText(a115.getText());}

        String tet =ab1.getText();
        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";
if(tet.equals("")){JOptionPane.showMessageDialog(this,"Please Load your Cards. This card is empty");
ab1.setText(tyi);}else{
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            ab1.setText(ab11);
            ab2.setText(ab21);
            ab3.setText(ab31);
            ab4.setText(ab41);
            ab5.setText(ab51);
   String hg =ab71 ;
        switch_bb3(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}}
        // TODO add your handling code here:
}//GEN-LAST:event_jButton7ActionPerformed

    private void a115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a115ActionPerformed

        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";

        String tet = a115.getText();
        if(tet.equals("")){JOptionPane.showMessageDialog(this,"Please Load your Cards");}else{
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            ab1.setText(ab11);
            ab2.setText(ab21);
            ab3.setText(ab31);
            ab4.setText(ab41);
            ab5.setText(ab51);
String hg =ab71 ;
            switch_bb3(hg);

        } catch (Exception e){JOptionPane.showMessageDialog(this, e);} }  // TODO add your handling code here:
}//GEN-LAST:event_a115ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 String tyi =ab1.getText();
        if(ab1.getText().equals(a115.getText())){ab1.setText(a118.getText());}
        else if(ab1.getText().equals(a116.getText())){ab1.setText(a115.getText());}
        else if(ab1.getText().equals(a117.getText())){ab1.setText(a116.getText());}
        else if(ab1.getText().equals(a118.getText())){ab1.setText(a117.getText());}

      //correct it

  String tet = ab1.getText();
        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";
if(tet.equals("")){JOptionPane.showMessageDialog(this,"Please Load your Cards. This card is empty");
ab1.setText(tyi);
}else{
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            ab1.setText(ab11);
            ab2.setText(ab21);
            ab3.setText(ab31);
            ab4.setText(ab41);
            ab5.setText(ab51);





            

            String hg =ab71;
             switch_bb3(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }        // TODO add your handling code here:
}//GEN-LAST:event_jButton8ActionPerformed

    private void a113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a113ActionPerformed

        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";

        String tet = a113.getText();
        if(tet.equals("")){JOptionPane.showMessageDialog(this,"Please Load your Cards");}else{
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            aa1.setText(ab11);
            aa2.setText(ab21);
            aa3.setText(ab31);
            aa4.setText(ab41);
            aa5.setText(ab51);

String hg =ab71;
              switch_bb1(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }      // TODO add your handling code here:
}//GEN-LAST:event_a113ActionPerformed

    private void rt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt2ActionPerformed
        String a11t=  a111.getText();
        String a12t=  a112.getText();
        String a13t=  a113.getText();
        String a14t=  a114.getText();
        String a21t=  a116.getText();
        String a22t=  a115.getText();
        String a23t=  a117.getText();
        String a24t=  a118.getText();



        if (a11t.equals("")){
            try{

                String cd =extra1.getText();

                String sd=cd.substring(0, 3);
               
                String sql = "select name from yugioh,"+pname1.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra1.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                String res = rs.getString(1);
                a111.setText(res);
                
                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }




        if (a12t.equals("")){
            try{

                String cd =extra1.getText();

                String sd=cd.substring(0, 3);
                
                String sql = "select name from yugioh,"+pname1.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra1.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                String res = rs.getString(1);
                a112.setText(res);
               
                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }




        if (a13t.equals("")){
            try{

                 String cd =extra1.getText();

                String sd=cd.substring(0, 3);
               
                String sql = "select name from yugioh,"+pname1.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra1.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                
                String res = rs.getString(1);
                a113.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }





        if (a14t.equals("")){
            try{

                String cd =extra1.getText();

                String sd=cd.substring(0, 3);
               
                String sql = "select name from yugioh,"+pname1.getText()+"deck where nameid =cardid && nameid=" +sd+";" ;
                String cd1 =""+cd.substring(3);
                extra1.setText(cd1);//yy is tablename
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(sql);
                rs.first();
                String res = rs.getString(1);
                a114.setText(res);

                con.close();
                s.close();
                rs.close();
            } catch (Exception e){JOptionPane.showMessageDialog(this, e);}   }         // TODO add your handling code here:
}//GEN-LAST:event_rt2ActionPerformed

    private void a118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a118ActionPerformed

        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";

        String tet = a118.getText();
        if(tet.equals("")){JOptionPane.showMessageDialog(this,"Please Load your Cards");}else{
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            ab1.setText(ab11);
            ab2.setText(ab21);
            ab3.setText(ab31);
            ab4.setText(ab41);
            ab5.setText(ab51);

            String hg =ab71 ;
        switch_bb3(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);} }  // TODO add your handling code here:
}//GEN-LAST:event_a118ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
String tyi =aa1.getText();
      if(aa1.getText().equals(a111.getText())){aa1.setText(a114.getText());}
        else if(aa1.getText().equals(a112.getText())){aa1.setText(a111.getText());}
        else if(aa1.getText().equals(a113.getText())){aa1.setText(a112.getText());}
        else if(aa1.getText().equals(a114.getText())){aa1.setText(a113.getText());}

      


        String tet = aa1.getText();
        String ab11="",ab21="",ab31="",ab41="",ab51="",ab61="",ab71="",ab12="",ab22="",ab32="",ab42="",ab52="",ab62="",ab72="",ab13="",ab23="",ab33="",ab43="",ab53="",ab63="",ab73="",ab14="",ab24="",ab34="",ab44="",ab54="",ab64="",ab74="",ab15="",ab25="",ab35="",ab45="",ab55="",ab65="",ab75="",ab16="",ab26="",ab36="",ab46="",ab56="",ab66="",ab76="",ab17="",ab27="",ab37="",ab47="",ab57="",ab67="",ab77="",ab18="",ab28="",ab38="",ab48="",ab58="",ab68="",ab78="",ab19="",ab29="",ab39="",ab49="",ab59="",ab69="",ab79="",ab110="",ab210="",ab310="",ab410="",ab510="",ab610="",ab710="";
if(tet.equals("")){JOptionPane.showMessageDialog(this,"Please Load your Cards. This card is empty");
aa1.setText(tyi);}else{
        try{

            String sql = "select name,attack,defence,strategy,skill,power,imageid from yugioh where name='" +tet+"';" ;//yy is tablename
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){

                ab11 = rs.getString(1);
                ab21 = rs.getString(2);
                ab31 = rs.getString(3);
                ab41 = rs.getString(4);
                ab51 = rs.getString(5);
                ab61 = rs.getString(6);
                ab71 = rs.getString(7);}

            con.close();
            s.close();
            rs.close();
            aa1.setText(ab11);
            aa2.setText(ab21);
            aa3.setText(ab31);
            aa4.setText(ab41);
            aa5.setText(ab51);


            String hg =ab71;
                  switch_bb1(hg);
        } catch (Exception e){JOptionPane.showMessageDialog(this, e);} }       // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f6showdown().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a111;
    private javax.swing.JButton a112;
    private javax.swing.JButton a113;
    private javax.swing.JButton a114;
    private javax.swing.JButton a115;
    private javax.swing.JButton a116;
    private javax.swing.JButton a117;
    private javax.swing.JButton a118;
    private javax.swing.JLabel aa1;
    private javax.swing.JLabel aa12;
    private javax.swing.JTextField aa2;
    private javax.swing.JTextField aa3;
    private javax.swing.JTextField aa4;
    private javax.swing.JTextField aa5;
    private javax.swing.JLabel aa7;
    private javax.swing.JLabel ab1;
    private javax.swing.JTextField ab2;
    private javax.swing.JTextField ab3;
    private javax.swing.JTextField ab4;
    private javax.swing.JTextField ab5;
    private javax.swing.JLabel at1attack;
    private javax.swing.JLabel at1attack1;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JToggleButton b2back;
    private javax.swing.JToggleButton b2back1;
    private javax.swing.JButton bb1;
    private javax.swing.JButton bb3;
    private javax.swing.JLabel d1def;
    private javax.swing.JLabel d1def1;
    private javax.swing.JLabel extra1;
    private javax.swing.JLabel extra11;
    private javax.swing.JLabel extra2;
    private javax.swing.JLabel extra21;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lamg;
    private javax.swing.JLabel nameaa11;
    private javax.swing.JLabel nameaa12;
    private javax.swing.JLabel pname1;
    private javax.swing.JLabel pname2;
    private javax.swing.JButton rt2;
    private javax.swing.JButton rt3;
    private javax.swing.JLabel s1str;
    private javax.swing.JLabel s1str1;
    private javax.swing.JLabel sc1;
    private javax.swing.JLabel sc2;
    private javax.swing.JLabel sk1sjill;
    private javax.swing.JLabel sk1sjill1;
    // End of variables declaration//GEN-END:variables

    private void switch_bb1(String hg) throws NumberFormatException {
        switch (Integer.parseInt(hg)) {
            case 0:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/000.jpg")));
                break;
            case 1:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/001.jpg")));
                break;
            case 2:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/002.jpg")));
                break;
            case 3:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/003.jpg")));
                break;
            case 4:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/004.jpg")));
                break;
            case 5:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/005.jpg")));
                break;
            case 6:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/006.jpg")));
                break;
            case 7:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/007.jpg")));
                break;
            case 8:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/008.jpg")));
                break;
            case 9:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/009.jpg")));
                break;
            case 10:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/010.jpg")));
                break;
            case 11:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/011.jpg")));
                break;
            case 12:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/012.jpg")));
                break;
            case 13:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/013.jpg")));
                break;
            case 14:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/014.jpg")));
                break;
            case 15:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/015.jpg")));
                break;
            case 16:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/016.jpg")));
                break;
            case 17:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/017.jpg")));
                break;
            case 18:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/018.jpg")));
                break;
            case 19:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/019.jpg")));
                break;
            case 20:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/020.jpg")));
                break;
            case 21:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/021.jpg")));
                break;
            case 22:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/022.jpg")));
                break;
            case 23:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/023.jpg")));
                break;
            case 24:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/024.jpg")));
                break;
            case 25:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/025.jpg")));
                break;
            case 26:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/026.jpg")));
                break;
            case 27:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/027.jpg")));
                break;
            case 28:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/028.jpg")));
                break;
            case 29:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/029.jpg")));
                break;
            case 30:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/030.jpg")));
                break;
            case 31:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/031.jpg")));
                break;
            case 32:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/032.jpg")));
                break;
            case 33:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/033.jpg")));
                break;
            case 34:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/034.jpg")));
                break;
            case 35:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/035.jpg")));
                break;
            case 36:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/036.jpg")));
                break;
            case 37:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/037.jpg")));
                break;
            case 38:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/038.jpg")));
                break;
            case 39:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/039.jpg")));
                break;
            case 40:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/040.jpg")));
                break;
               case 41:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/041.png")));
                break;
            case 42:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/042.png")));
                break;
            case 43:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/043.png")));
                break;
            case 44:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/044.png")));
                break;
            case 45:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/045.png")));
                break;
            case 46:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/046.png")));
                break;
            case 47:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/047.png")));
                break;
            case 48:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/048.png")));
                break;
            case 49:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/049.png")));
                break;
            case 50:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/050.png")));
                break;
            case 51:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/051.jpg")));
                break;
            case 52:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/052.jpg")));
                break;
            case 53:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/053.jpg")));
                break;
            case 54:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/054.jpg")));
                break;
            case 55:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/055.jpg")));
                break;
            case 56:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/056.jpg")));
                break;
            case 57:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/057.jpg")));
                break;
            case 58:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/058.jpg")));
                break;
            case 59:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/059.jpg")));
                break;
            case 60:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/060.jpg")));
                break;
            case 61:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/061.jpg")));
                break;
            case 62:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/062.jpg")));
                break;
            case 63:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/063.jpg")));
                break;
            case 64:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/064.jpg")));
                break;
            case 65:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/065.jpg")));
                break;
            case 66:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/066.jpg")));
                break;
            case 67:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/067.jpg")));
                break;
            case 68:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/068.jpg")));
                break;
            case 69:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/069.jpg")));
                break;
            case 70:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/070.jpg")));
                break;
            case 71:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/071.jpg")));
                break;
            case 72:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/072.jpg")));
                break;
            case 73:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/073.jpg")));
                break;
            case 74:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/074.jpg")));
                break;
            case 75:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/075.jpg")));
                break;
            case 76:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/076.jpg")));
                break;
            case 77:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/077.jpg")));
                break;
            case 78:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/078.jpg")));
                break;
            case 79:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/079.jpg")));
                break;
            case 80:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/080.jpg")));
                break;
            case 81:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/081.jpg")));
                break;
            case 82:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/082.jpg")));
                break;
            case 83:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/083.jpg")));
                break;
            case 84:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/084.jpg")));
                break;
            case 85:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/085.jpg")));
                break;
            case 86:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/086.jpg")));
                break;
            case 87:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/087.jpg")));
                break;
            case 88:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/088.jpg")));
                break;
            case 89:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/089.jpg")));
                break;
            case 90:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/090.jpg")));
                break;
            case 91:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/091.jpg")));
                break;
            case 92:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/092.jpg")));
                break;
            case 93:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/093.jpg")));
                break;
            case 94:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/094.jpg")));
                break;
            case 95:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/095.jpg")));
                break;
            case 96:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/096.jpg")));
                break;
            case 97:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/097.jpg")));
                break;
            case 98:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/098.jpg")));
                break;
            case 99:
                bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/099.jpg")));
                break;
        }
    }

    private void switch_bb3(String hg) throws NumberFormatException {
        switch (Integer.parseInt(hg)) {
            case 0:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/000.jpg")));
                break;
            case 1:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/001.jpg")));
                break;
            case 2:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/002.jpg")));
                break;
            case 3:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/003.jpg")));
                break;
            case 4:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/004.jpg")));
                break;
            case 5:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/005.jpg")));
                break;
            case 6:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/006.jpg")));
                break;
            case 7:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/007.jpg")));
                break;
            case 8:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/008.jpg")));
                break;
            case 9:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/009.jpg")));
                break;
            case 10:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/010.jpg")));
                break;
            case 11:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/011.jpg")));
                break;
            case 12:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/012.jpg")));
                break;
            case 13:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/013.jpg")));
                break;
            case 14:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/014.jpg")));
                break;
            case 15:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/015.jpg")));
                break;
            case 16:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/016.jpg")));
                break;
            case 17:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/017.jpg")));
                break;
            case 18:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/018.jpg")));
                break;
            case 19:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/019.jpg")));
                break;
            case 20:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/020.jpg")));
                break;
            case 21:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/021.jpg")));
                break;
            case 22:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/022.jpg")));
                break;
            case 23:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/023.jpg")));
                break;
            case 24:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/024.jpg")));
                break;
            case 25:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/025.jpg")));
                break;
            case 26:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/026.jpg")));
                break;
            case 27:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/027.jpg")));
                break;
            case 28:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/028.jpg")));
                break;
            case 29:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/029.jpg")));
                break;
            case 30:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/030.jpg")));
                break;
            case 31:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/031.jpg")));
                break;
            case 32:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/032.jpg")));
                break;
            case 33:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/033.jpg")));
                break;
            case 34:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/034.jpg")));
                break;
            case 35:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/035.jpg")));
                break;
            case 36:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/036.jpg")));
                break;
            case 37:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/037.jpg")));
                break;
            case 38:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/038.jpg")));
                break;
            case 39:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/039.jpg")));
                break;
            case 40:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/040.jpg")));
                break;
            case 41:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/041.png")));
                break;
            case 42:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/042.png")));
                break;
            case 43:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/043.png")));
                break;
            case 44:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/044.png")));
                break;
            case 45:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/045.png")));
                break;
            case 46:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/046.png")));
                break;
            case 47:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/047.png")));
                break;
            case 48:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/048.png")));
                break;
            case 49:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/049.png")));
                break;
            case 50:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/050.png")));
                break;
            case 51:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/051.jpg")));
                break;
            case 52:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/052.jpg")));
                break;
            case 53:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/053.jpg")));
                break;
            case 54:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/054.jpg")));
                break;
            case 55:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/055.jpg")));
                break;
            case 56:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/056.jpg")));
                break;
            case 57:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/057.jpg")));
                break;
            case 58:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/058.jpg")));
                break;
            case 59:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/059.jpg")));
                break;
            case 60:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/060.jpg")));
                break;
            case 61:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/061.jpg")));
                break;
            case 62:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/062.jpg")));
                break;
            case 63:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/063.jpg")));
                break;
            case 64:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/064.jpg")));
                break;
            case 65:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/065.jpg")));
                break;
            case 66:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/066.jpg")));
                break;
            case 67:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/067.jpg")));
                break;
            case 68:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/068.jpg")));
                break;
            case 69:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/069.jpg")));
                break;
            case 70:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/070.jpg")));
                break;
            case 71:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/071.jpg")));
                break;
            case 72:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/072.jpg")));
                break;
            case 73:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/073.jpg")));
                break;
            case 74:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/074.jpg")));
                break;
            case 75:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/075.jpg")));
                break;
            case 76:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/076.jpg")));
                break;
            case 77:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/077.jpg")));
                break;
            case 78:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/078.jpg")));
                break;
            case 79:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/079.jpg")));
                break;
            case 80:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/080.jpg")));
                break;
            case 81:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/081.jpg")));
                break;
            case 82:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/082.jpg")));
                break;
            case 83:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/083.jpg")));
                break;
            case 84:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/084.jpg")));
                break;
            case 85:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/085.jpg")));
                break;
            case 86:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/086.jpg")));
                break;
            case 87:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/087.jpg")));
                break;
            case 88:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/088.jpg")));
                break;
            case 89:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/089.jpg")));
                break;
            case 90:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/090.jpg")));
                break;
            case 91:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/091.jpg")));
                break;
            case 92:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/092.jpg")));
                break;
            case 93:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/093.jpg")));
                break;
            case 94:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/094.jpg")));
                break;
            case 95:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/095.jpg")));
                break;
            case 96:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/096.jpg")));
                break;
            case 97:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/097.jpg")));
                break;
            case 98:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/098.jpg")));
                break;
            case 99:
                bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yugioh/099.jpg")));
                break;
        }
    }

}
