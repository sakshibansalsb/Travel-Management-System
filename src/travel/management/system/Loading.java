
package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    Thread t ;
    JProgressBar bar;
    String username;
    public void run(){
        try{
            for(int i=1;i <= 101;i++){
                int max =bar.getMaximum();
                int value = bar.getValue();
                
                if(value < max){          
                    bar.setValue(bar.getValue() + 1);
                } else{
                    setVisible(false);
                    new Dashboard(username);
                }
                Thread.sleep(50);
            }    
        } 
            catch(Exception e){
            e.printStackTrace();
            }
            
    }
    
    
    Loading(String username){
        this.username = username;
        t = new Thread(this);
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Travel And Tourism Application");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.magenta);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        add(text);
        
         bar = new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel loading = new JLabel("Loading, please wait...");
        loading.setBounds(230,130,250,30);
        loading.setForeground(Color.red);
        loading.setFont(new Font("Raleway",Font.BOLD,16));
        add(loading);
        
        JLabel lbluseranme = new JLabel("Welcome " + username);
        lbluseranme.setBounds(20,310,440,40);
        lbluseranme.setForeground(Color.red);
        lbluseranme.setFont(new Font("Raleway",Font.BOLD,16));
        add(lbluseranme);
        
        t.start();
        setVisible(true);
    }
    
    public static void main(String args[]){
       new Loading(""); 
    }
}
