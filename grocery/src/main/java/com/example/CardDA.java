package com.example;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CardDA {

	Connection con;
	PreparedStatement pstmt;
	
	
	//insert data
	public Card insert(Card s) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryshop", "root", "nh123456");
			pstmt = con.prepareStatement("INSERT INTO card(card_id, p_id, title, weight, price, stock, type, manufacture, expire, notes, image) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
			
			pstmt.setInt(1, s.c_id);
			pstmt.setInt(2, s.p_id);
			pstmt.setString(3, s.p_title);
			pstmt.setString(4, s.weight);
			pstmt.setDouble(5, s.p_price);
			pstmt.setInt(6, s.p_stock);
			pstmt.setString(7, s.p_type);
			pstmt.setDate(8, s.p_manuf);
			pstmt.setDate(9, s.p_expire);
			pstmt.setString(10, s.p_notes);
			pstmt.setString(11, s.p_img);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return s;
	}
	
	public List<Card> ShowProduct(){  //ListType method
		List<Card> cardlist = new ArrayList<>();  // store data for all query
		Card c;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryshop", "root", "nh123456");
		pstmt = con.prepareStatement("select * from card");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			c=new Card(rs.getInt(1),rs.getInt(2), rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6), rs.getString(7),rs.getDate(8), rs.getDate(9), rs.getString(10),rs.getString(11));
			 cardlist.add(c);
		}
		 }catch (Exception e){
			e.printStackTrace();
		 }
			return cardlist;
		}
	
	public Card getProductById(int id) {
		Card c = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryshop", "root", "nh123456");
			pstmt = con.prepareStatement("select * from card where p_id =" +id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				c=new Card(rs.getInt(1),rs.getInt(2), rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6), rs.getString(7),rs.getDate(8), rs.getDate(9), rs.getString(10),rs.getString(11));
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
		return c;
	}
	
}

