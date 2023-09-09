package com.example.customerInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CustomerInfoDA {
	Connection con;
	PreparedStatement pstmt;
	
	
	//insert customer data
	public CustomerInfo insertCustomer(CustomerInfo s3) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryshop", "root", "nh123456");
			pstmt = con.prepareStatement("INSERT INTO customer_data(id, name, email, gender, dob, address, mobile, image) VALUES (?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, s3.customer_id);
			pstmt.setString(2, s3.customer_name);
			pstmt.setString(3, s3.customer_email);
			pstmt.setString(4, s3.customer_gender); 
			pstmt.setDate(5, s3.customer_dob);
			pstmt.setString(6, s3.customer_address);
			pstmt.setInt(7, s3.customer_mobile);
			pstmt.setString(8, s3.customer_img);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return s3;
	}
	
	//customer id auto generate
			public String getNewCustomerId() {
				String acc = "109901";
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryshop", "root", "nh123456");
					pstmt = con.prepareStatement("SELECT id FROM customer_data ORDER BY id DESC LIMIT 1");
					ResultSet rs = pstmt.executeQuery();
					if(rs.next()) {
						int a = rs.getInt(1);
						a++;
						acc = String.valueOf(a);
					}
				} catch (Exception e) {
					System.out.println(e);
				}

				return acc;
			}
	
	    //show Customer data
		public List<CustomerInfo> allCustomer() {
			List<CustomerInfo> sList = new ArrayList<>();
			CustomerInfo s5;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryshop", "root", "nh123456");
				pstmt = con.prepareStatement("SELECT * FROM customer_data");
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					s5 = new CustomerInfo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), 
										  rs.getDate(5), rs.getString(6), rs.getInt(7), rs.getString(8));
					sList.add(s5);
				}
			} catch (Exception e) {
				System.out.println(e);
			}

			return sList;
		}
		
		// according to customer id get data
		public CustomerInfo customerById(int customer_id) {
			CustomerInfo s = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryshop", "root", "nh123456");
				pstmt = con.prepareStatement("select * from customer_data where id =" + customer_id);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					s = new CustomerInfo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), 
							  rs.getDate(5), rs.getString(6), rs.getInt(7), rs.getString(8));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return s;
		}
		
		

		//Update Data Customer
		public void updateCustomer(CustomerInfo p) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryshop", "root", "nh123456"));
				pstmt = con.prepareStatement("update customer_data set name=?, email=?, gender=?, dob=?, address=?, mobile=?, image=? where id =?");
				pstmt.setString(1, p.customer_name);
				pstmt.setString(2, p.customer_email);
				pstmt.setString(3, p.customer_gender);
				pstmt.setDate(4, p.customer_dob);
				pstmt.setString(5, p.customer_address);
				pstmt.setInt(6, p.customer_mobile);
				pstmt.setString(7, p.customer_img);
				pstmt.setInt(8, p.customer_id);
				pstmt.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		

		//Delete Data
		public void deleteCustomer(CustomerInfo x) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryshop", "root", "nh123456"));
				pstmt = con.prepareStatement("delete from customer_data where id = ?");
				pstmt.setInt(1, x.customer_id);
				pstmt.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	

}
