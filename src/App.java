
import com.formdev.flatlaf.FlatLightLaf;
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
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
            UIManager.put( "TextComponent.arc", 15 );

        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        new MainWindow();
    }
}
