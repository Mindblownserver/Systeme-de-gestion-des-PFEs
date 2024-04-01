package ui;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class MyComponents {
    public static Font h1 = new Font("Khmer OS",0,26);
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
}
