package com.sapient.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sapient.vo.Emp;

public class EmpService {
	
	EmpService(){}
	
	public Emp getEmployee(int eid) throws NotFoundException, ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","sapient123");
		String sql = "select * from emp where eid = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1,eid);
		ResultSet rs = st.executeQuery();
		Emp emp =null;
		while(rs.next()){
		 emp = new Emp(rs.getInt("eid"),rs.getString("ename"),rs.getDouble("sal")); 
		}
		if(emp == null) throw new NotFoundException();
		else
		return emp;
	} 

}
