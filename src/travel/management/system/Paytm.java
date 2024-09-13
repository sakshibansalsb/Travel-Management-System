package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paytm extends JFrame implements ActionListener {
  Paytm() {
    setBounds(500, 200, 800, 600);

    JEditorPane pane = new JEditorPane();
    pane.setEditable(false);

    try {
      pane.setPage("https://paytm.com/rent-payment");

    } catch (Exception e) {
      pane.setContentType("text/html");
      pane.setText("<html>Could not load,Error404</html>");
    }

    JScrollPane sp = new JScrollPane(pane);
    getContentPane().add(sp);

    JButton back = new JButton("Back");
    back.setBounds(610, 20, 80, 40);
    back.setBackground(new Color(202,231,223));
    back.addActionListener(this);
    pane.add(back);

    setVisible(true);
  }
  public void actionPerformed(ActionEvent ae) {
    setVisible(false);
    new Payment();
  }

  public static void main(String args[]) {
    new Paytm();
  }
}
