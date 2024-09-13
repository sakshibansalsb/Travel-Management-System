package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Signup extends JFrame implements ActionListener {
  JButton create, back;
  JTextField tuser, tname, tans, tpassword;
  Choice security;
  Signup() {
    setBounds(350, 200, 900, 360);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);

    JPanel p1 = new JPanel();
    p1.setBackground(new Color(133, 193, 233));
    p1.setBounds(0, 0, 500, 400);
    p1.setLayout(null);
    add(p1);
    
    JLabel luser = new JLabel("Username");
    luser.setFont(new Font("Tahoma", Font.BOLD, 14));
    luser.setBounds(50, 20, 125, 25);
    p1.add(luser);
    
    tuser = new JTextField();
    tuser.setBounds(190, 20, 180, 25);
    tuser.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tuser);
    
    JLabel lname = new JLabel("Name");
    lname.setFont(new Font("Tahoma", Font.BOLD, 14));
    lname.setBounds(50, 60, 125, 25);
    p1.add(lname);
    
    tname = new JTextField();
    tname.setBounds(190, 60, 180, 25);
    tname.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tname);
    
    JLabel lpassword = new JLabel("Password");
    lpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
    lpassword.setBounds(50, 100, 125, 25);
    p1.add(lpassword);
    
    tpassword = new JTextField();
    tpassword.setBounds(190, 100, 180, 25);
    tpassword.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tpassword);
    
    JLabel lsecurity = new JLabel("Security Questions");
    lsecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
    lsecurity.setBounds(50, 140, 125, 25);
    p1.add(lsecurity);
    
    security = new Choice();
    security.add("fav singer");
    security.add("your school name");
    security.add("fav player");
    security.add("fav person name ");
    security.add("your fav number");
    security.setBounds(190, 140, 180, 25);
    p1.add(security);
    
    JLabel lans = new JLabel("Answer");
    lans.setFont(new Font("Tahoma", Font.BOLD, 14));
    lans.setBounds(50, 180, 125, 25);
    p1.add(lans);
    
    tans = new JTextField();
    tans.setBounds(190, 180, 180, 25);
    tans.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tans);
    
    create = new JButton("Create");
    create.setBackground(Color.WHITE);
    create.setForeground(new Color(133, 193, 233));
    create.setFont(new Font("Tahoma", Font.BOLD, 14));
    create.setBounds(80, 250, 100, 30);
    create.addActionListener(this);
    p1.add(create);
    
    back = new JButton("Back");
    back.setBackground(Color.WHITE);
    back.setForeground(new Color(133, 193, 233));
    back.setFont(new Font("Tahoma", Font.BOLD, 14));
    back.setBounds(250, 250, 100, 30);
    back.addActionListener(this);
    p1.add(back);

    ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
    Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(580, 50, 250, 250);
    add(image);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == create) {
      String username = tuser.getText();
      String name = tname.getText();
      String password = tpassword.getText();
      String question = security.getSelectedItem();
      String answer = tans.getText();
      String query = " insert into account values('" + username + "','" + name
          + "','" + password + "','" + question + "','" + answer + "')";
      try {
        Conn c = new Conn();
        c.s.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Account Created Successfully");
        setVisible(false);
        new Login();
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else if (ae.getSource() == back) {
      setVisible(false);
      new Login();
    }
  }

  public static void main(String args[]) {
    new Signup();
  }
}
