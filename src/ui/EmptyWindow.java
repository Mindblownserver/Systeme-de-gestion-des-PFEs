package ui;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class EmptyWindow extends JFrame{
    public EmptyWindow(JComponent cmp){
        
		this.setSize(740,540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(cmp);
    }
}
