/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Menus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Pascal
 */
public class Onglet1 extends JPanel implements ActionListener {
    private BufferedImage image;
    private JLabel nom, name, prenom, firstname, dateDeNaissance, dateOfBirth,
            score, qcm, scoreQcm, qcm1, scoreQcm1, qcm2, scoreQcm2;
    private JButton buttonGraph;

    @Override
    public void paintComponent(Graphics g) {
        //Photo utilisateur
        try { 
            image = ImageIO.read(new File("profil.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Onglet1.class.getName()).log(Level.SEVERE, null, ex);
        }
         g.drawImage(image, 50, 50, this);
    }
    
    private void setContents(){
        
        Font font = new Font("Arial", Font.PLAIN, 18);
        Font font1 = new Font("Arial", Font.BOLD, 18);
        Font font2 = new Font("Arial", Font.BOLD, 22);
        Font font3= new Font("Arial", Font.PLAIN, 15);
        
        LineBorder bord = new LineBorder(Color.black, 3);
        
        nom= new JLabel("NOM: ");
        nom.setFont(font1);
        name= new JLabel("Fillion");
        name.setFont(font);
        prenom= new JLabel("Prénom: ");
        prenom.setFont(font1);
        firstname= new JLabel("Laura");
        firstname.setFont(font);
        dateDeNaissance= new JLabel("Anniversaire: ");
        dateDeNaissance.setFont(font1);
        dateOfBirth= new JLabel("25/12/1992");
        dateOfBirth.setFont(font);
        score= new JLabel("SCORE: ");
        score.setFont(font2);
        qcm= new JLabel("  Calcul du CVA");
        qcm.setFont(font3);
        qcm.setBorder(BorderFactory.createLineBorder(Color.black));
        scoreQcm= new JLabel("12/20");
        scoreQcm.setFont(font3);
        scoreQcm.setHorizontalAlignment(JLabel.CENTER);
        scoreQcm.setBorder(BorderFactory.createLineBorder(Color.black));
        qcm1= new JLabel("  Risque de Crédit");
        qcm1.setFont(font3);
        qcm1.setBorder(BorderFactory.createLineBorder(Color.black));
        scoreQcm1= new JLabel("15/20");
        scoreQcm1.setFont(font3);
        scoreQcm1.setHorizontalAlignment(JLabel.CENTER);
        scoreQcm1.setBorder(BorderFactory.createLineBorder(Color.black));
        qcm2= new JLabel("  Bâle III");
        qcm2.setFont(font3);
        qcm2.setBorder(BorderFactory.createLineBorder(Color.black));
        scoreQcm2= new JLabel("18/20");
        scoreQcm2.setFont(font3);
        scoreQcm2.setHorizontalAlignment(JLabel.CENTER);
        scoreQcm2.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonGraph= new JButton("Afficher Progression");
        buttonGraph.setFont(font1);
        buttonGraph.setBorder(bord);
        buttonGraph.setBackground(Color.white);
        buttonGraph.setPreferredSize(new Dimension(200, 50));
        
    }
    
    public Onglet1(){
        
        setContents();
        this.setLayout(null);
        
        nom.setBounds(250, 100, 60, 20); //x, y, largueur, hauteur
        this.add(nom);
        
        name.setBounds(400, 100, 60, 20);
        this.add(name);
        
        prenom.setBounds(250, 150, 100, 20);
        this.add(prenom);
        
        firstname.setBounds(400, 150, 100, 20);
        this.add(firstname);
        
        dateDeNaissance.setBounds(250, 200, 150, 20);
        this.add(dateDeNaissance);
        
        dateOfBirth.setBounds(400, 200, 100, 20);
        this.add(dateOfBirth);
        
        score.setBounds(70, 330, 100, 20);
        this.add(score);
        
        qcm.setBounds(70, 370, 200, 25);
        this.add(qcm);
        
        scoreQcm.setBounds(272, 370, 200, 25);
        this.add(scoreQcm);
        
        qcm1.setBounds(70, 397, 200, 25);
        this.add(qcm1);
        
        scoreQcm1.setBounds(272, 397, 200, 25);
        this.add(scoreQcm1);
        
        qcm2.setBounds(70, 424, 200, 25);
        this.add(qcm2);
        
        scoreQcm2.setBounds(272, 424, 200, 25);
        this.add(scoreQcm2);
        
        buttonGraph.setBounds(400, 500, 201, 51);
        this.add(buttonGraph);
    }
    
 public void actionPerformed(ActionEvent e) {
 }
    
}
