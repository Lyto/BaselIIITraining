/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Menus;

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
import javax.swing.*;

/**
 *
 * @author Pascal
 */
public class Onglet5 extends JPanel implements ActionListener {
    
    
    private BufferedImage image;
    private JLabel titre;
    private JTextArea desc;
    
    @Override
    public void paintComponent(Graphics g) {
        
        try { 
            image = ImageIO.read(new File("monte_carlo.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Onglet1.class.getName()).log(Level.SEVERE, null, ex);
        }
         g.drawImage(image, 125, 250, this);
    }
    
    public Onglet5(){
        
        Font font = new Font("Arial", Font.BOLD, 25);
        Font font1 = new Font("Arial", Font.BOLD, 18);
        Font font2 = new Font("Arial", Font.BOLD, 22);
        Font font3= new Font("Arial", Font.PLAIN, 15);
        
        this.setLayout(null);
        
        titre = new JLabel("La simulation Monte Carlo");
        titre.setFont(font);
        titre.setBounds(160, 15, 400, 50);
        this.add(titre);
        
        desc = new JTextArea("La simulation Monte Carlo procède à l’analyse du risque par élaboration de modèles de résultats possibles, en substituant une plage de valeurs — une distribution de probabilités — à tout facteur porteur d’incertitude. Elle calcule et recalcule ensuite ces résultats selon, à chaque fois, un ensemble distinct de valeurs aléatoires des fonctions de probabilités. Suivant le nombre d’incertitudes et les plages spécifiées pour les représenter, une simulation Monte Carlo peut impliquer, pour être complète, des milliers ou même des dizaines de milliers de calculs et recalculs. La simulation produit des distributions de valeurs d’issue possibles. ");
        desc.setFont(font3);
        desc.setLineWrap(true);
        desc.setOpaque(false);
        desc.setBounds(30, 80, 550, 200);
        this.add(desc);
        
    }
    
 public void actionPerformed(ActionEvent e) {
 }
    
}
