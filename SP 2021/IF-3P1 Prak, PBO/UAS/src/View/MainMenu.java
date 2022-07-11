/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author glenn
 */
public class MainMenu extends JFrame implements ActionListener {

    private JButton login, registrasi, userData;
    private JFrame frame;

    public static void main(String[] args) {
        new MainMenu();
    }

    MainMenu() {
        frame = new JFrame("Main Menu");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        Font title = new Font("Sans Serif", Font.BOLD, 25);
        login = new JButton("Login");
        registrasi = new JButton("Registrasi");
        userData = new JButton("Liat Data Pengguna");
        login.setFont(title);
        registrasi.setFont(title);
        userData.setFont(title);
        login.setBounds(50, 0, 300, 100);
        registrasi.setBounds(50, 120, 300, 100);
        userData.setBounds(50, 240, 300, 100);
        frame.add(login);
        frame.add(registrasi);
        frame.add(userData);
        login.addActionListener(this);
        registrasi.addActionListener(this);
        userData.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        if (e.getSource() == login) {
            
        } else if (e.getSource() == registrasi) {
            new Registrasi();
        } else if (e.getSource() == userData) {

        }
    }
}
