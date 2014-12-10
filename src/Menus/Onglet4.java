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
public class Onglet4 extends JPanel implements ActionListener {

    private BufferedImage image, image2;
    private JLabel titre, avec;
    private JTextArea desc;

    @Override
    public void paintComponent(Graphics g) {

        try {
            image = ImageIO.read(new File("cva1.jpg"));
            image2 = ImageIO.read(new File("cva2.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Onglet1.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.drawImage(image, 125, 250, this);
        g.drawImage(image2, 180, 320, this);
    }

    public Onglet4() {

        Font font = new Font("Arial", Font.BOLD, 25);
        Font font1 = new Font("Arial", Font.BOLD, 18);
        Font font2 = new Font("Arial", Font.BOLD, 22);
        Font font3 = new Font("Arial", Font.PLAIN, 15);

        this.setLayout(null);

        titre = new JLabel("Le calcul du CVA");
        titre.setFont(font);
        titre.setBounds(200, 15, 400, 50);
        this.add(titre);

        desc = new JTextArea("La CVA (Credit Value Adjustment) est la valeur de marché du risque de défaut d’une contrepartie. On la mesure par la différence entre la valeur sans risque d’un portefeuille et la valeur de celui-ci en tenant compte du défaut potentiel des contreparties. Elle permet de déterminer la «fair value» de certains produits dérivés et de mettre en place des réserves pour se prémunir du défaut d’une contrepartie. En pratique la CVA est calculée indépendamment pour chaque contrepartie puis agrégée pour obtenir une CVA globale par portefeuille.");
        desc.setFont(font3);
        desc.setLineWrap(true);
        desc.setOpaque(false);
        desc.setBounds(30, 80, 550, 200);
        this.add(desc);
        
        avec = new JLabel("avec");
        avec.setFont(font3);
        avec.setBounds(130, 333, 50, 20);
        this.add(avec);
        
    }

    public void actionPerformed(ActionEvent e) {
    }

}
