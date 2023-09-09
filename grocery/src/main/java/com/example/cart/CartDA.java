package com.example.cart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class CartDA {
	Connection con;
	PreparedStatement pstmt;
	
	//insert data cart
		public Cart insert(Cart s1) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryshop", "root", "nh123456");
				pstmt = con.prepareStatement("INSERT INTO cart(cart_id, p_id, customer_id, p_name, p_quantity, unit_price, total_price, p_img) VALUES (?,?,?,?,?,?,?,?)");
				pstmt.setInt(1, s1.cart_id);
				pstmt.setInt(2, s1.p_id);
				pstmt.setInt(3, s1.customer_id);
				pstmt.setString(4, s1.p_name);
				pstmt.setDouble(5, s1.p_quantity);
				pstmt.setDouble(6, s1.unit_price);
				pstmt.setDouble(7, s1.total_price);
				pstmt.setString(8, s1.p_img);
				pstmt.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}
			return s1;
		}
		
		// Show cart
		public List<Cart> getCartDataByCutomerId(int id) {
			List<Cart> cartList = new ArrayList<>();
			Cart c;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryshop", "root", "nh123456");
				pstmt = con.prepareStatement("select * from cart where customer_id =?");
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					c= new Cart(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4),rs.getDouble(5), rs.getDouble(6),rs.getDouble(7), rs.getString(8));
					 
					cartList.add(c);
				}
				
			}catch (Exception e){
				System.out.println(e);
				
			}
			
			return cartList;
		}
		
}
