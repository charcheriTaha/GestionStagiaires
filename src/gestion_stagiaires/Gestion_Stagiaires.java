/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_stagiaires;


import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.GroupLayout.Group;
import javax.swing.JFrame;


/**
 *
 * @author charc
 */
public class Gestion_Stagiaires {
    

public static DetailStagiaireAModifier det ;
    /**
     * @param args the command line arguments
     */




    
    public static void main(String[] args) {
        // TODO code application logic here
        
                InterfacePrincipale i1 =new InterfacePrincipale();
		i1.setVisible(true);
                i1.setTitle("Gestion des stagiaires ");
            i1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                i1.setLocationRelativeTo(null);
             i1.setResizable(false);
               // start();
             
    }
   
    
}
