
import java.awt.Font;
import javax.swing.UIManager;
import ui.MainWindow;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yassine
 */
public class App { 
    public static void main(String[] args) {
                    UIManager.getLookAndFeelDefaults().put("defaultFont", new Font("Arial", Font.BOLD, 44));

        new MainWindow();
    }
}
