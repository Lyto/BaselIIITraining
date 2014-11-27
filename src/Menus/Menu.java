/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Menus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Menu extends JPanel implements ActionListener{
    
        JLabel titre, login, password, footer;
        JTextField jtfLogin, jtfPassword;
        JButton jbtConnexion;
    
    
     public Menu() {
        
        
        Font font = new Font("Arial", Font.BOLD, 34);
        Font font2 = new Font("Arial", Font.BOLD, 18);
        
        LineBorder bord = new LineBorder(Color.black, 3);
         
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        titre = new JLabel("Basel III Training ");
        titre.setFont(font);
        
        login = new JLabel("Login : ");
        login.setFont(font2);

        password = new JLabel("Password : ");
        password.setFont(font2);
        
        footer = new JLabel("Bonnelle Maximilien - Fillion Laura - Ly Pascal - Poli Alexane - Robineau Claire");
        footer.setFont(font2);
        
        jtfLogin = new JTextField(15);
        jtfLogin.setBorder(bord);
        jtfLogin.setPreferredSize(new Dimension(100, 30));
        jtfLogin.setHorizontalAlignment(JTextField.CENTER);

        jtfPassword = new JPasswordField(15);
        jtfPassword.setBorder(bord);
        jtfPassword.setPreferredSize(new Dimension(100, 30));
        jtfPassword.setHorizontalAlignment(JTextField.CENTER);
        
        jbtConnexion = new JButton("Connexion");
        jbtConnexion.setFont(font2);
        jbtConnexion.setBorder(bord);
        jbtConnexion.setPreferredSize(new Dimension(200, 50));
        jbtConnexion.addActionListener(this);
        
        gbc.gridx = gbc.gridy = 0;  // case (0,0)
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(15, 15, 10, 0);
        add(titre, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.BASELINE_LEADING;
        //gbc.insets = new Insets(15, 0, 0, 0);
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
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        add(jbtConnexion, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
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
                Fenetre fen = new Fenetre();
                fen.setContentPane(new Menu2());
                fenetre.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
    
}
     }
}
