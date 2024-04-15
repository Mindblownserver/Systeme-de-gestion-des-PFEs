/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**Store Information in this class to display it 
 * and fetch info about column names and their data
 * to allow for flexibilty and genericity in terms of UI
 *
 * @author yassine
 */
public class TableInfo<E> {
    private JButton modifyBtn = new JButton(new FlatSVGIcon(ClassLoader.getSystemResource("edit.svg")));
    private JButton deleteBtn = new JButton(new FlatSVGIcon(ClassLoader.getSystemResource("delete.svg")));
            
    public List<E> data;
    public TableInfo(List<E> data){
        this.data = data;
    }
    public Object[][] listToArray(){
        Object[][]res = new Object[data.size()][4];
        if(data.get(0) instanceof Local){
            for(int i=0;i<data.size();i++){
                res[i][0]= ((Local)data.get(i)).getNumSalle();
                res[i][1]= ((Local)data.get(i)).getNomSalle();
                res[i][2] = modifyBtn;
                res[i][3]= deleteBtn;
            }
        }
        
        return res;
    }
   
}
