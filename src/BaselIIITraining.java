
import Connexion.Connexion;
import Menus.Fenetre;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pascal
 */
public class BaselIIITraining {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Connexion connex = new Connexion("basel_training", "root", "");
        Fenetre mafenetre = new Fenetre(connex);
        
    }
    
}
