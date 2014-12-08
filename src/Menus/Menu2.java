/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Menus;

import Connexion.Connexion;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Pascal
 */
public class Menu2 extends JPanel implements ActionListener {
    
    public Menu2(Connexion connex){
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        setLayout(new GridLayout(1, 1, 10, 10));
        JPanel panel1 = new Onglet1();
        JPanel panel2 = new Onglet2();
        JPanel panel3 = new Onglet3();
        JPanel panel4 = new Onglet4();
        JPanel panel5 = new Onglet5();
        JPanel panel6 = new Onglet6();
        
        tabbedPane.addTab("Profil", null, panel1, null);
        tabbedPane.addTab("Bâle III", null, panel2, null);
        tabbedPane.addTab("Risque de Crédit", null, panel3, null);
        tabbedPane.addTab("Calcul CVA", null, panel4, null);  
        tabbedPane.addTab("Simulation Monte-Carlo", null, panel5, null);
        tabbedPane.addTab("QCM", null, panel6,null);
        tabbedPane.setSelectedIndex(0);
        add(tabbedPane);
    }
    
 public void actionPerformed(ActionEvent e) {
 }
    
}
