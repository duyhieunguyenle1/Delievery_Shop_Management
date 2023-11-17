/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package dao;

import admin.AdminDashboard;
import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import supplier.SupplierDashboard;
import user.UserDashboard;

/**
 *
 * @author Admin
 */
public class Statistics {

    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public int total(String tableName) {
        int total = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("Select count(*) as 'total' from " + tableName + "");
            if (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public double totalSales() {
        double total = 0.0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("Select sum(total) as 'total' from purchase");
            if (rs.next()) {
                total = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public double todaySales() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Date date = new Date();
        String today = df.format(date);
        double total = 0.0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("Select sum(total) as 'total' from purchase where p_date= '" + today + "'");
            if (rs.next()) {
                total = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public void admin() {
        AdminDashboard.jCat.setText(String.valueOf(total("category")));
        AdminDashboard.jPro.setText(String.valueOf(total("product")));
        AdminDashboard.jUsers.setText(String.valueOf(total("user")));
        AdminDashboard.jSuppliers.setText(String.valueOf(total("supplier")));
        AdminDashboard.jTsales.setText(String.valueOf(todaySales()));
        AdminDashboard.jSales.setText(String.valueOf(totalSales()));
    }
    
    public double totalPurchase(int id) {
        double total = 0.0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("Select sum(total) as 'total' from purchase where uid= '"+id+"'");
            if (rs.next()) {
                total = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    public void user(int id){
        UserDashboard.jCat.setText(String.valueOf(total("category")));
        UserDashboard.jPro.setText(String.valueOf(total("product")));
        UserDashboard.jPur.setText(String.valueOf(totalPurchase(id)));
    }
    
    public int totalDeliveries(String name) {
        int total = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("Select count(*) as 'total' from purchase where supplier = '" + name + "' and status ='Received'");
            if (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    public void supplier(String name){
        SupplierDashboard.jDeli.setText(String.valueOf(totalDeliveries(name)));
    }
}
