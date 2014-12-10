/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import Connexion.Connexion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Alexane
 */
public class Onglet6 extends JPanel implements ActionListener {

    JLabel titre;
    JButton buttonBale, buttonCVA, buttonRisque, buttonCalculCVA;
    Connexion connex;

    @Override
    public void paintComponent(Graphics g) {

    }

    private void setContents() {

        Font font = new Font("Arial", Font.PLAIN, 18);
        Font font1 = new Font("Arial", Font.BOLD, 18);
        Font font2 = new Font("Arial", Font.BOLD, 28);

        LineBorder bord = new LineBorder(Color.black, 3);

        titre = new JLabel("Tester Vos Connaissances");
        titre.setFont(font2);

        buttonBale = new JButton("Bâle III");
        buttonBale.setFont(font1);
        buttonBale.setBorder(bord);
        buttonBale.setPreferredSize(new Dimension(400, 40));
        buttonBale.addActionListener(this);

        buttonRisque = new JButton("Risque de Crédit");
        buttonRisque.setFont(font1);
        buttonRisque.setBorder(bord);
        buttonRisque.setPreferredSize(new Dimension(400, 40));

        buttonCVA = new JButton("CVA");
        buttonCVA.setFont(font1);
        buttonCVA.setBorder(bord);
        buttonCVA.setPreferredSize(new Dimension(400, 40));

        buttonCalculCVA = new JButton("Calcul de la CVA");
        buttonCalculCVA.setFont(font1);
        buttonCalculCVA.setBorder(bord);
        buttonCalculCVA.setPreferredSize(new Dimension(400, 400));

    }

    public Onglet6(Connexion connexion) {

        connex = connexion;

        setContents();
        this.setLayout(null);

        titre.setBounds(110, 50, 400, 80);
        this.add(titre);

        buttonBale.setBounds(100, 150, 400, 40);
        this.add(buttonBale);

        buttonRisque.setBounds(100, 200, 400, 40);
        this.add(buttonRisque);

        buttonCVA.setBounds(100, 250, 400, 40);
        this.add(buttonCVA);

        buttonCalculCVA.setBounds(100, 300, 400, 40);
        this.add(buttonCalculCVA);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JFrame fenetre = (JFrame) this.getTopLevelAncestor();

        if (e.getSource() == buttonBale) {
            Fenetre fen;
            try {
                fen = new Fenetre(connex);
                fen.setContentPane(new QCMBale());
            } catch (SQLException ex) {
                Logger.getLogger(Onglet6.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }

    }

}
