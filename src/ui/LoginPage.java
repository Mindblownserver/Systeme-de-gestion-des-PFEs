package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame implements ActionListener{
    
    JLabel username = new JLabel("Username: ");
    JLabel password = new JLabel("Password: ");
    JTextField usernameField= new JTextField();
    JPasswordField passwordField=new JPasswordField();
    
    JButton btn1 = new JButton("S'authentifier");
    JButton fermerBtn = new JButton("Fermer");
    JPanel contents = new JPanel();
    JPanel buttonContents=new JPanel();
    JPanel North=new JPanel(),South=new JPanel(),East=new JPanel(),West=new JPanel();
    public LoginPage(){
        this.setTitle("Authentification");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(680,680);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        //Setting up components
        North.setPreferredSize(new Dimension(200,200));
        South.setPreferredSize(new Dimension(200,200));
        East.setPreferredSize(new Dimension(100,100));
        West.setPreferredSize(new Dimension(100,100));
        contents.setLayout(new GridLayout(5,1,0,10));
        fermerBtn.addActionListener(this);
        //adding components
        contents.add(username); 
        contents.add(usernameField);
        contents.add(password); 
        contents.add(passwordField);
        contents.add(buttonContents);
        
        buttonContents.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        buttonContents.add(btn1);
        buttonContents.add(fermerBtn);

        this.add(contents,BorderLayout.CENTER);
        this.add(North, BorderLayout.NORTH);
        this.add(South,BorderLayout.SOUTH);
        this.add(West, BorderLayout.WEST);
        this.add(East,BorderLayout.EAST);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource()==fermerBtn){
            System.exit(0);
        }
    }

}
