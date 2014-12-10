/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Alexane
 */
public class QCMBale extends JPanel implements ActionListener {

    private JLabel titre, question, bonne_reponse, mauvaise_reponse;
    JRadioButton rep1, rep2, rep3, rep4;
    ButtonGroup group;
    JButton valider, fermer;

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(new Color(230, 230, 250));
        g.fillRect(0, 0, 800, 600);
    }

    public QCMBale() {

        Font font = new Font("Arial", Font.BOLD, 25);
        Font font1 = new Font("Arial", Font.BOLD, 18);
        Font font2 = new Font("Arial", 0, 15);
        Font font3 = new Font("Arial", Font.PLAIN, 15);

        this.setLayout(null);

        titre = new JLabel("QCM sur Bâle III");
        titre.setFont(font);
        titre.setBounds(280, 20, 200, 50);
        this.add(titre);

        question = new JLabel("La dérèglementation dans le secteur bancaire s'est traduite...");
        question.setFont(font1);
        question.setBounds(50, 100, 550, 50);
        this.add(question);

        rep1 = new JRadioButton("Par un relâchement des normes de conduite");
        rep1.setFont(font3);
        rep1.setBounds(100, 150, 450, 50);
        rep1.setOpaque(false);
        this.add(rep1);

        rep2 = new JRadioButton("Par un durcissement des normes de conduite");
        rep2.setFont(font3);
        rep2.setBounds(100, 200, 450, 50);
        rep2.setOpaque(false);
        this.add(rep2);

        rep3 = new JRadioButton("Par un renforcement des normes de structure");
        rep3.setFont(font3);
        rep3.setBounds(100, 250, 450, 50);
        rep3.setOpaque(false);
        this.add(rep3);

        rep4 = new JRadioButton("Par un durcissement des normes de structure");
        rep4.setFont(font3);
        rep4.setBounds(100, 300, 450, 50);
        rep4.setOpaque(false);
        this.add(rep4);
        
        group = new ButtonGroup();
        group.add(rep1);
        group.add(rep2);
        group.add(rep3);
        group.add(rep4);
        
        valider = new JButton("Valider");
        valider.setFont(font1);
        valider.setBounds(330, 380, 100, 40);
        valider.setBorder(new LineBorder(Color.BLACK, 2));
        valider.addActionListener(this);
        this.add(valider);
        
        bonne_reponse = new JLabel("Bonne réponse !");
        bonne_reponse.setFont(font1);
        bonne_reponse.setBounds(310, 440, 300, 40);
        bonne_reponse.setVisible(false);
        bonne_reponse.setForeground(Color.GREEN);
        this.add(bonne_reponse);
        
        mauvaise_reponse = new JLabel("Mauvaise réponse !");
        mauvaise_reponse.setFont(font1);
        mauvaise_reponse.setBounds(310, 440, 300, 40);
        mauvaise_reponse.setVisible(false);
        mauvaise_reponse.setForeground(Color.RED);
        this.add(mauvaise_reponse);
        
        fermer = new JButton("Fermer");
        fermer.setFont(font3);
        fermer.setBounds(680, 540, 100, 20);
        fermer.setOpaque(false);
        fermer.addActionListener(this);
        this.add(fermer);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JFrame fenetre = (JFrame) this.getTopLevelAncestor();
        
        if (e.getSource() == valider) {
            
            rep2.setForeground(Color.GREEN);
            
            if(rep2.isSelected() == true) {
                bonne_reponse.setVisible(true);
            } else {
                mauvaise_reponse.setVisible(true);
            }
            
        } else if (e.getSource() == fermer) {
            
            fenetre.dispose();
            
        }
        
    }
}
