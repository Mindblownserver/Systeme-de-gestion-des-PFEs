package net.miginfocom.demo;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * @author Mikael Grev, MiG InfoCom AB
 *         Date: 2007-mar-13
 *         Time: 09:47:37
 */

public class TextProblem extends JFrame {
   public static void main(String[] a) {
      new TextProblem();
   }

   public TextProblem(){
      setSize(500,500);
      setLayout(new MigLayout("debug, fill, wrap 1"));

      JTextArea textArea = new JTextArea("xxx");
      JScrollPane pane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


      getContentPane().add(pane, "grow, height 50%");
      getContentPane().add(new JLabel("test"), "grow, height 50%");

      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}