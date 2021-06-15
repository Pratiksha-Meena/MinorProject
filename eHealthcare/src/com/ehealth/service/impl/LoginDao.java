package com.ehealth.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ehealth.util.EhealthUtil;

public class LoginDao {
	public boolean verifyUser(String email,String password) {
		final String sql="SELECT * FROM User WHERE Email=? AND Pwd=?";
		boolean isVerified=false;//flag
		try(Connection con=EhealthUtil.getMySqlConnection();PreparedStatement ps=con.prepareStatement(sql)){
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			rs.next();
			System.out.println(rs.getString(1) +" "+ rs.getString(2));
				if(rs.getString(1).equals(email) && rs.getString(2).equals(password)) 
					isVerified=true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isVerified;
		
	}
}
