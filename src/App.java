
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatInspector;
import java.awt.Color;
import javax.swing.UIManager;
import ui.MainWindow;
import ui.MyComponents;

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
            UIManager.put( "Button.arc", 15 );
            // TabPanel
            UIManager.put( "TabbedPane.selectedBackground", MyComponents.accentNormal );
            UIManager.put( "TabbedPane.selectedForeground", MyComponents.primaryColor );
            UIManager.put( "TabbedPane.hoverColor", MyComponents.accentLessHue );
            UIManager.put( "TabbedPane.hoverForeground", MyComponents.secondaryColor );
            UIManager.put( "TabbedPane.focusColor", MyComponents.accentLessHue );
            // Table
            UIManager.put("TableHeader.height", 40);
            UIManager.put("TableHeader.background", MyComponents.secondaryColor);
            //
            UIManager.put("ComboBox.buttonArrowColor", Color.green);

            
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        FlatInspector.install("ctrl shift X");
        new MainWindow();
    }
}
