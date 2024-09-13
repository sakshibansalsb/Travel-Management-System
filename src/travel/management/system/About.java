package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class About extends JFrame implements ActionListener {
  JButton back;
  JLabel l1;
  Font f, f1, f2;
  TextArea area;
  String s;

  About() {
    setBounds(700, 220, 500, 550);

    setLayout(null);

    setLayout(null);
    back = new JButton("Exit");
    back.setBounds(180, 430, 120, 20);
    back.addActionListener(this);
    back.setBackground(new Color(0,53,102));
    back.setForeground(Color.WHITE);
    add(back);
    f = new Font("RALEWAY", Font.BOLD, 180);
    setFont(f);

    s = "                                   About Projects          \n  "
        + "\nThe objective of the Travel and Tourism Management System"
        + "project is to develop a system that automates the processes "
        + "and activities of a travel and the purpose is to design a "
        + "system using which one can perform all operations related to "
        + "traveling.\n\n"
        + "This application will help in accessing the information related "
        + "to the travel to the particular destination with great ease. "
        + "The users can track the information related to their tours with "
        + "great ease through this application. The travel agency information "
        + "can also be obtained through this application.\n\n"
        + "Advantages of Project:"
        + "\nGives accurate information"
        + "\nSimplifies the manual work"
        + "\nIt minimizes the documentation related work"
        + "\nProvides up to date information"
        + "\nFriendly Environment by providing warning messages."
        + "\ntravelers details can be provided"
        + "\nbooking confirmation notification"
        + "\n\n\n Run and Managed by Sakshi Aggarwal";

    area = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
    area.setEditable(false);
    area.setForeground(new Color(0,53,102));
    area.setBackground(new Color(202,231,223));
    area.setBounds(20, 100, 450, 300);

    add(area);

    f1 = new Font("RALEWAY", Font.BOLD, 16);
    area.setFont(f1);

    Container contentPane = this.getContentPane();
    area = new TextArea();

    l1 = new JLabel("About Project");
    add(l1);
    l1.setBounds(170, 10, 180, 80);
    l1.setForeground(Color.red);

    f2 = new Font("RALEWAY", Font.BOLD, 25);
    l1.setFont(f2);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    setVisible(false);
  }

  public static void main(String args[]) {
    new About();
  }
}