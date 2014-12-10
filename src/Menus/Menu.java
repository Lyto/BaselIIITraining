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
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Pascal
 */
public class Menu extends JPanel implements ActionListener {

    private BufferedImage image;
    JLabel titre, login, password, footer, fail;
    JTextField jtfLogin, jtfPassword;
    JButton jbtConnexion, jbtInscription;
    Connexion connex;

    @Override
    public void paintComponent(Graphics g) {
        
        // Fond
        g.setColor(new Color(245, 245, 245));
        g.fillRect(0, 0, 800, 600);
        
        // Titre
        g.setColor(new Color(15, 5, 107));
        g.fillRoundRect(0, 0, 800, 100, 0, 10);
        
         try { 
            image = ImageIO.read(new File("logoPPE.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Onglet1.class.getName()).log(Level.SEVERE, null, ex);
        }
         g.drawImage(image, 120, 330, this);

    }

    private void setContents() {

        Font font = new Font("Arial", Font.BOLD, 34);
        Font font1 = new Font("Arial", Font.PLAIN, 15);
        Font font2 = new Font("Arial", Font.BOLD, 18);

        LineBorder bord = new LineBorder(Color.black, 3);

        titre = new JLabel("Basel III Training                                  "
                + "                     ");
        titre.setFont(font);
        titre.setForeground(Color.white);

        login = new JLabel("Login : ");
        login.setFont(font2);

        password = new JLabel("Password : ");
        password.setFont(font2);

        footer = new JLabel("Bonnelle Maximilien   -   Fillion Laura   -   "
                + "Ly Pascal   -   Poli Alexane   -   Robineau Claire");
        footer.setFont(font1);

        fail = new JLabel("Erreur dans votre login ou dans votre mot de passe.");
        fail.setForeground(new Color(245, 245, 245));
        fail.setFont(font1);

        jtfLogin = new JTextField(15);
        jtfLogin.setBorder(bord);
        jtfLogin.setPreferredSize(new Dimension(100, 30));
        jtfLogin.setHorizontalAlignment(JTextField.CENTER);

        jtfPassword = new JPasswordField(15);
        jtfPassword.setBorder(bord);
        jtfPassword.setPreferredSize(new Dimension(100, 30));
        jtfPassword.setHorizontalAlignment(JTextField.CENTER);

        jbtConnexion = new JButton("SE CONNECTER");
        jbtConnexion.setFont(font2);
        jbtConnexion.setBorder(bord);
        jbtConnexion.setPreferredSize(new Dimension(200, 50));
        jbtConnexion.addActionListener(this);
        
        jbtInscription = new JButton("S'INSCRIRE");
        jbtInscription.setFont(font2);
        jbtInscription.setBorder(bord);
        jbtInscription.setPreferredSize(new Dimension(200, 50));
        jbtInscription.addActionListener(this);

    }

    public Menu(Connexion connexion) {

        connex = connexion;

        setContents();
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = gbc.gridy = 0;  // case (0,0)
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 15, 100, 0);
        add(titre, gbc);

        gbc.gridx = gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        gbc.insets = new Insets(15, 70, 0, 30);
        add(login, gbc);

        gbc.gridy = 2;
        add(password, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(jtfLogin, gbc);

        gbc.gridy = 2;
        add(jtfPassword, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.insets = new Insets(20, 0, 20, 0);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        add(jbtConnexion, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.insets = new Insets(0, 0, 60, 0);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        add(jbtInscription, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.insets = new Insets(10, 0, 0, 0);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        //add(fail, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.insets = new Insets(60, 0, 0, 0);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        add(footer, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JFrame fenetre = (JFrame) this.getTopLevelAncestor();
        
        if (e.getSource() == jbtConnexion) {

            try {

                String login = "YuuKii";
                String password = "chocolat01";
                //String login = jtfLogin.getText();
                //String password = jtfPassword.getText();

                if (connex.authentification(login, password)) {
                    Fenetre fen = new Fenetre(connex);
                    fen.setContentPane(new Menu2(connex));
                    fenetre.dispose();
                } else {
                    fail.setForeground(Color.RED);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
