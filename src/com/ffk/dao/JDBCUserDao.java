package com.ffk.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import sun.security.timestamp.TSRequest;

import com.ffk.entity.User;


/*持久层注解*/
@Repository("userDao")
public class JDBCUserDao implements UserDao ,Serializable{

	private JDBCDataSource dataSource;
	
	public JDBCUserDao() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param dataSource the dataSource to set
	 */
	@Autowired
	public void setDataSource(
			@Qualifier("jdbcDataSource") JDBCDataSource dataSource) {
		this.dataSource = dataSource;
	}


	@Override
	public User findByName(String name) {
		System.out.println("利用JDBC技术查找user信息");
		String sql = "select id, name, pwd, phone  from USERS where name=?";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			User user = null;
			while(rs.next()){
				user = new User();
				user.setId(rs.getInt("name"));
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setPhone(rs.getString("phone"));
			}
			rs.close();
			ps.close();
			return user;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException();
		}finally{
			dataSource.close(conn);
		}
	}

}
