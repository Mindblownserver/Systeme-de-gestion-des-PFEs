package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class MyComponents {
    public static Font h1 = new Font("Monosans",0,26);
    public static Font h2 = new Font("Monosans",0,23);
    public static Font h3 = new Font("Monosans",0,20);    
    public static Color primaryColor= Color.WHITE;
    public static Color secondaryColor= Color.decode("#F2F2F2");
    public static Color accentNormal = Color.decode("#2c67f2");
    public static Color accentLessHue=Color.decode("#2c8ff2");

    
    public static class SubmitBtn extends JButton{

    }
    public static class JTableButtonRenderer implements TableCellRenderer {
        private TableCellRenderer defaultRenderer;
        public JTableButtonRenderer(TableCellRenderer renderer) {
            defaultRenderer = renderer;
        }
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if(value instanceof Component)
                return (Component)value;
                return defaultRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }
    public static class MyHeaderRenderer extends JLabel implements TableCellRenderer {
 
        public MyHeaderRenderer() {
            setFont(new Font("Monosans",1,18));
            setHorizontalAlignment(CENTER);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            setText(value.toString());
            return this;
        }
    }
}

//
//            Component res; 
//            res=(Component)value;
//            res.setFont(h1);