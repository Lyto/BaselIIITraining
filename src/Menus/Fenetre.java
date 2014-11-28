/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Menus;

import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Pascal
 */
public class Fenetre extends JFrame{
    
        public Fenetre() throws SQLException {
        super("Basel III Training");

        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new Menu());
        setVisible(true);

    }
    
}
