package com.example.customerlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDA {
	Connection con;
	PreparedStatement pst;
	

	public CustomerLogin checkCustomer(CustomerLogin s1) {
		CustomerLogin u = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryshop", "root", "nh123456");
			pst = con.prepareStatement("select * from customer_data where id=? and email=?");
			pst.setInt(1, s1.customer_id);
			pst.setString(2, s1.customer_email);
			ResultSet rs = pst.executeQuery();
			
			if (rs.next()) {
				u = new CustomerLogin();
				u.setCustomer_id(rs.getInt(1));
				u.setCustomer_email(rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return u;
	}
}
