/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Controller.CategoryUserContorller;
import Database.DatabaseHandler;

/**
 *
 * @author glenn
 */
public class Registrasi extends JFrame implements ActionListener {

    private JFrame frame;
    private JTextField nama, email;
    private JPasswordField password;
    private JComboBox categoryUser;
    private JButton photo, submit;

    public static void main(String[] args) {
        new Registrasi();
    }

    Registrasi() {
        frame = new JFrame("Registrasi");
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        Font regular = new Font("Sans Serif", Font.PLAIN, 22);
        JLabel namaLb, emailLb, passwordLb, photoLb, categoryLb;
        namaLb = new JLabel("Nama:");
        namaLb.setFont(regular);
        namaLb.setBounds(10, 10, 100, 23);
        frame.add(namaLb);

        emailLb = new JLabel("Email:");
        emailLb.setFont(regular);
        emailLb.setBounds(10, 35, 100, 23);
        frame.add(emailLb);

        passwordLb = new JLabel("Password:");
        passwordLb.setFont(regular);
        passwordLb.setBounds(10, 60, 120, 23);
        frame.add(passwordLb);

        photoLb = new JLabel("Photo:");
        photoLb.setFont(regular);
        photoLb.setBounds(10, 85, 100, 23);
        frame.add(photoLb);

        categoryLb = new JLabel("Category:");
        categoryLb.setFont(regular);
        categoryLb.setBounds(10, 110, 100, 23);
        frame.add(categoryLb);
        

        nama = new JTextField();
        nama.setBounds(130, 10, 200, 23);
        nama.setFont(regular);
        frame.add(nama);

        email = new JTextField();
        email.setBounds(130, 35, 200, 23);
        email.setFont(regular);
        frame.add(email);

        password = new JPasswordField();
        password.setBounds(130, 60, 200, 23);
        password.setFont(regular);
        frame.add(password);

        photo = new JButton("insert photo");
        photo.setBounds(130, 85, 200, 23);
        photo.setFont(regular);
        frame.add(photo);
        
        
        
        categoryUser = new JComboBox(category());
        categoryUser.setBounds(130, 110, 200, 23);
        categoryUser.setFont(regular);
        frame.add(categoryUser);

        submit = new JButton("Submit");
        submit.setBounds(130, 135, 200, 23);
        submit.setFont(regular);
        submit.addActionListener(this);
        frame.add(submit);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==submit) {
            
        }
    }
    
    String[] category() {
        CategoryUserContorller cate = new CategoryUserContorller();
        String[] cateList = new String[cate.retrieveCategory().size()];
        for (int i = 0; i < cateList.length; i++) {
            cateList[i] = cate.retrieveCategory().get(i).getName();
        }
        return cateList;
    } 
}
