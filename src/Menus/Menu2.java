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
        JPanel TabbedPane1 = new Onglet1();
        JPanel TabbedPane2 = new Onglet2();
        JPanel TabbedPane3 = new Onglet3();
        JPanel TabbedPane4 = new Onglet4();
        JPanel TabbedPane5 = new Onglet5();
        
        tabbedPane.addTab("Profil", null, TabbedPane1, null);
        tabbedPane.addTab("Bâle III", null, TabbedPane2, null);
        tabbedPane.addTab("Risque de Crédit", null, TabbedPane3, null);
        tabbedPane.addTab("Calcul CVA", null, TabbedPane4, null);  
        tabbedPane.addTab("Simulation Monte-Carlo", null, TabbedPane5, null);
        tabbedPane.setSelectedIndex(0);
        add(tabbedPane);
    }
    
 public void actionPerformed(ActionEvent e) {
 }
    
}
