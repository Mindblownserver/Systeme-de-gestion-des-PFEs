/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**Store Information in this class to display it 
 * and fetch info about column names and their data
 * to allow for flexibilty and genericity in terms of UI
 *
 * @author yassine
 */
public class TableInfo {
    public List<String> columnNames;
    public List<List<Object>> data;
    public TableInfo(){
        columnNames = new ArrayList<>();
        data = new ArrayList<>();
    }
}
