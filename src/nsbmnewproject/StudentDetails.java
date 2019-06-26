/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmnewproject;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class StudentDetails extends AbstractTableModel {

    public static final String[] COLUMN__NAMES = {"Index Number", "RegNo", "FirstName", "Last Name", "Email", "Faculty","Entry Month"};
    private static ArrayList<student> list;

    StudentDetails(ArrayList<student> stList) {
        list = stList;
    }

    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN__NAMES.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return COLUMN__NAMES[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        //int columIndex = 0;
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getIndexnumber();
            case 1:
                return list.get(rowIndex).getRegNo();
            case 2:
                return list.get(rowIndex).getFirstName();
            case 3:
                return list.get(rowIndex).getLastName();
            case 4:
                return list.get(rowIndex).getEmail();
            case 5:
                return list.get(rowIndex).getFaculty();
            default:
                return "Error";
        }
    }
}