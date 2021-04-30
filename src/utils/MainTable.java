package utils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainTable {

    private static void setTable(ResultSet resultSet, JTable table){
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"id"});

        try {
            while(resultSet.next()){
                model.addRow(new String[]{
                        resultSet.getString(1)
                });
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }

        table.setModel(model);
        DBHandler.closeConnection();
    }

    public static void refreshTable(JTable table){
        DBHandler.openConnection();
        ResultSet resultSet;
        resultSet = DBHandler.execQuery("SELECT * FROM table");
        setTable(resultSet, table);
    }


}
