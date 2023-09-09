package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class HolderDA {
	
	
	
	Connection con;
	PreparedStatement pstmt;
	
	
	
	
	
	//show data
	
	public List<Holder> allHolder() {
		List<Holder> sList = new ArrayList<>();
		Holder s;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arif", "root", "nh123456");
			pstmt = con.prepareStatement("SELECT * FROM info1");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {

				s = new Holder(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				sList.add(s);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return sList;
	}
	
	
	
	

	
	
}
