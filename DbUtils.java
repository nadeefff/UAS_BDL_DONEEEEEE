/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanfinalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author LENOVO
 */
public class DbUtils {

    // Database connection details
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/Perpustakaan"; // replace with your DB details
    private static final String USER = "postgres"; // replace with your DB username
    private static final String PASSWORD = "12345678"; // replace with your DB password

    public static TableModel resultSetToTableModel(ResultSet rs) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector<String> columnNames = new Vector<>();
            // Get the column names
            for (int column = 1; column <= numberOfColumns; column++) {
                columnNames.add(metaData.getColumnLabel(column));
            }
            // Get all rows
            Vector<Vector<Object>> rows = new Vector<>();
            while (rs.next()) {
                Vector<Object> newRow = new Vector<>();
                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.add(rs.getObject(i));
                }
                rows.add(newRow);
            }
            return new DefaultTableModel(rows, columnNames);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("PostgreSQL JDBC Driver not found.", e);
        }
    }
}
