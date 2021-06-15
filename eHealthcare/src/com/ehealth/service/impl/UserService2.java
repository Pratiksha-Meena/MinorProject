package com.ehealth.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ehealth.util.EhealthUtil;

public class UserService2 {
	public boolean verifyUser(String email) {
		final String sql="SELECT * FROM User WHERE email=?";
		boolean isVerified=false;//flag
		try(Connection con=EhealthUtil.getMySqlConnection();PreparedStatement ps=con.prepareStatement(sql)){
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			rs.next();
			System.out.println(rs.getString(1));
				if(rs.getString(1).equals(email)) 
					isVerified=true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isVerified;
	}
	public String getPassword(String email) {
		final String sql="SELECT password FROM User WHERE logIn=?";
		String password=null;
		try(Connection con=EhealthUtil.getMySqlConnection();PreparedStatement ps=con.prepareStatement(sql)){
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			rs.next();
			password=rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return password;	
	}
}
