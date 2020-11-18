/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDonné;

import gestion_stagiaires.InscriptionAdmin;
import gestion_stagiaires.ModifierStagiaire;
import gestion_stagiaires.TableauStagiaires;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Bd {

  //  private static int rs;
  //  public static RefrechTable r = new RefrechTable();

     public static void InscriptionAdmin(String nom,String prénom,int cin,String matricule,String mail ,int téléphone,String motdepasse) throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
           String username = "root";
           String password = "";
            String url = "jdbc:mysql://localhost:3306/stagiaires";
            try{
            Connection con =DriverManager.getConnection(url,"root","");
            Statement st ;
            System.out.println("ok");
            
            String req = "INSERT INTO admin VALUES (?,?,?,?,?,?,?);";
            PreparedStatement stat = con.prepareStatement(req);
            stat.setString(1, nom);
            stat.setString(2, prénom);
            stat.setInt(3, cin);
            stat.setString(4, matricule);
            stat.setString(5, mail);
            stat.setInt(6, téléphone);
            stat.setString(7, motdepasse);
            
            stat.executeUpdate();
            
            }
            catch(Exception E)
             {
             System.out.println("Erreur");
           //  JOptionPane.showMessageDialog (null, "Un champ manquant ou un type incorrecte  !");
              }
        
    }
        
   
     public static void AjouterStagiaire(String aa,String bb,int cc,int dd,String ee,String ff,String gg,String hh,String ii,String jj,int kk,int ll,float mm,String nn,String oo,String pp,int qq,String rr) throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
            String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/stagiaires";
            try{
            Connection con =DriverManager.getConnection(url,"root","");
            Statement st ;
            //System.out.println("ok");
           
            
            String req = "INSERT INTO stagiaire VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement stat = con.prepareStatement(req);
            
          stat.setString(1, aa);
            stat.setString(2, bb);
       
            stat.setInt(3, cc);
            
         
            stat.setInt(4, dd);
            stat.setString(5, ee);
            stat.setString(6, ff);
             stat.setString(7, gg);
            stat.setString(8, hh);
             stat.setString(9, ii);
            stat.setString(10, jj);
              stat.setInt(11, kk);
            stat.setInt(12, ll);
            stat.setDouble(13, mm);
             stat.setString(14, nn);
            stat.setString(15, oo);
             stat.setString(16, pp);
              stat.setInt(17, qq);
                 stat.setString(18, rr);
            
          
            stat.executeUpdate();
            
            }
            catch(Exception E)
             {
             System.out.println("Erreur");
           //  JOptionPane.showMessageDialog (null, "Un champ manquant ou un type incorrecte  !");
              }
        
    }
     //update 
     public static void UpdateStagiaire(String aa,String bb,int cc,int dd,String ee,String ff,String gg,String hh,String ii,String jj,int kk,int ll,float mm,String nn,String oo,String pp,int qq,String rr) throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
           String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/stagiaires";
            try{
            Connection con =DriverManager.getConnection(url,"root","");
            
            Statement st ;
          //  System.out.println("ok");
           // JOptionPane.showMessageDialog (null, "Vos données ont étés enregistré  !");
            
            String req = "Update stagiaire SET aa =?,bb =? ,cc =?,dd =? ,ee =?,ff =?,gg =?,hh =?,ii =?,jj =?,kk =?,ll =?,mm =?,nn=?,oo =?,pp =?,qq =?,rr=?  where dd="+dd;

            PreparedStatement stat = con.prepareStatement(req);
            
              
            stat.setString(1, aa);
            stat.setString(2, bb);
            stat.setInt(3, cc);
            stat.setInt(4, dd);
            stat.setString(5, ee);
            stat.setString(6, ff);
             stat.setString(7, gg);
            stat.setString(8, hh);
             stat.setString(9, ii);
            stat.setString(10, jj);
              stat.setInt(11, kk);
            stat.setInt(12, ll);
            stat.setFloat(13, mm);
             stat.setString(14, nn);
            stat.setString(15, oo);
             stat.setString(16, pp);
              stat.setInt(17, qq);
                 stat.setString(18, rr);
            
          
            
             stat.executeUpdate();
             System.out.println("ok");
            }
            catch(Exception E)
             {
           //  System.out.println("Erreur");
        //     JOptionPane.showMessageDialog (null, "Un champ manquant ou un type incorrecte  !");
              }
        
    }
     public static void UpdateAdmin(String nom,String prénom,int cin,String matricule,String mail ,int téléphone,String motdepasse) throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
          String username = "root";
           String password = "";
            String url = "jdbc:mysql://localhost:3306/stagiaires";
            try{
            Connection con =DriverManager.getConnection(url,"root","");
            Statement st ;
            System.out.println("ok");
            
            String req = "Update admin SET nom =?,"+" prénom =? ,"+" cin =?, "+" matricule =? ,"+"mail =?,"+" téléphone =?,"+" motdepasse =? "+"  where motdepasse='"+motdepasse+"'";
            PreparedStatement stat = con.prepareStatement(req);
            stat.setString(1, nom);
            stat.setString(2, prénom);
            stat.setInt(3, cin);
            stat.setString(4, matricule);
            stat.setString(5, mail);
            stat.setInt(6, téléphone);
            stat.setString(7, motdepasse);
            
            stat.executeUpdate();
      //  r.refrech(table);
            }
            catch(Exception E)
             {
             System.out.println("ok");
           //  JOptionPane.showMessageDialog (null, "Un champ manquant ou un type incorrecte  !");
              }
        
    }
     //tableau formation 
          
           public void remplirjTableAdmin(JTable table) throws SQLException, ClassNotFoundException{
         Class.forName("com.mysql.jdbc.Driver");
            String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/stagiaires";
       
            PreparedStatement ps;
            Connection con =DriverManager.getConnection(url,"root","");
            ps = con.prepareStatement("SELECT * FROM `admin` " );
           
            
            ResultSet rs= ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel) table.getModel();
            model.setRowCount(0);
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[6];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                
                model.addRow(row);
                
                
            }
           }
           
             public void remplirjTableStagiaiare(JTable tablee) throws SQLException, ClassNotFoundException{
         Class.forName("com.mysql.jdbc.Driver");
        String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/stagiaires";
       
            PreparedStatement ps;
            Connection con =DriverManager.getConnection(url,"root","");
            
            ps = con.prepareStatement("SELECT * FROM `stagiaire` " );
           
            
            ResultSet rs= ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel) tablee.getModel();
             model.setRowCount(0);
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[18];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                 row[6] = rs.getString(7);
                  row[7] = rs.getString(8);
                   row[8] = rs.getString(9);
                    row[9] = rs.getString(10);
                     row[10] = rs.getString(11); 
                      row[11] = rs.getString(12);
                       row[12] = rs.getString(13);
                        row[13] = rs.getString(14);
                         row[14] = rs.getString(15);
                          row[15] = rs.getString(16);
                           row[16] = rs.getString(17);
                            row[17] = rs.getString(18);
                      
                   
                     
                
                model.addRow(row);
            
                
            }
            
   
    
           }
            

      public static int NombreStagiaire() throws ClassNotFoundException{
        int i=0 ;
        Class.forName("com.mysql.jdbc.Driver");
            //String username = "root";
          //  String password = "";
            String url = "jdbc:mysql://localhost:3306/stagiaires";
            try{
            Connection con =DriverManager.getConnection(url,"root","");
            Statement st ;
            System.out.println("ok");
            
            String  req = "SELECT COUNT(*) FROM stagiaire";
            PreparedStatement stat = con.prepareStatement(req);
  
            ResultSet n  =stat.executeQuery();
            if (n.next())
             i++;  
          
            }
            catch(Exception E)
             {
            // System.out.println(n);
           //  JOptionPane.showMessageDialog (null, "Un champ manquant ou un type incorrecte  !");
              }
    
       return i ;

    }
             
             
             
             
             
             
     
       
}             
                
  

   
    

 