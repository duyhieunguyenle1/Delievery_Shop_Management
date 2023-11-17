/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package dao;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ProductDao {
    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    // get product table max row
    public int getMaxRow(){
        int row=0;
        try {
            st=con.createStatement();
            rs=st.executeQuery("select max(pid) from product");
            while(rs.next()){
                row=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row+1;
    }
    
    public int countCategories(){
        int total=0;
        try {
            st=con.createStatement();
            rs=st.executeQuery("Select count(*) as 'total' from category");
            if(rs.next()){
                total=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    public String[] getCat(){
        String[] categories = new String[countCategories()];
        try {
            st=con.createStatement();
            rs=st.executeQuery("Select * from category");
            int i=0;
            while(rs.next()){
                categories[i]=rs.getString(2);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }
    
    // check if product id exists
    public boolean isIDExist(int id){
        try {
            ps = con.prepareStatement("select * from product where pid=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean isProCatExist(String pro,String cat){
        try {
            ps = con.prepareStatement("select * from product where pname=? and cname=?");
            ps.setString(1, pro);
            ps.setString(2, cat);
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void getProductsValue(JTable table,String search){
        String sql="select * from product where concat(pid,pname,cname) like ? order by pid desc";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, "%"+search+"%");
            rs=ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;
            while(rs.next()){
                row = new Object[5];
                row[0]=rs.getInt(1);
                row[1]=rs.getString(2);
                row[2]=rs.getString(3);
                row[3]=rs.getInt(4);
                row[4]=rs.getDouble(5);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //insert data into category table
    public void insert(int id,String pname,String cname,int qty,double price){
        String sql = "insert into product values(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.setString(2,pname);
            ps.setString(3,cname);
            ps.setInt(4,qty);
            ps.setDouble(5, price);
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Category added successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(int id){
        int x = JOptionPane.showConfirmDialog(null, "Are you sure to delete this product?","Delete Product",JOptionPane.OK_CANCEL_OPTION,0);
        if(x==JOptionPane.OK_OPTION){
            try {
                ps=con.prepareStatement("delete from product where pid=?");
                ps.setInt(1,id);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Delete product successfully!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void updateProduct(int id,String pname,String cname,int qty,double price){
        String sql ="update product set pname=?, cname=?,pqty=?,pprice=? where pid=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, pname);
            ps.setString(2, cname);
            ps.setInt(3, qty);
            ps.setDouble(4, price);
            ps.setInt(5, id);
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Product update successfully!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
