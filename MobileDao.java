package com.xworkz.jdbc.practical;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MobileDao {

	public boolean save(MobileDto dto) {
		Connection connection = null;
		try {
			connection = SQLUtility.createConnection();
			String sql = "insert into mobile_table values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, dto.getMobile_id());
			preparedStatement.setObject(2, dto.getModelName());
			preparedStatement.setObject(3, dto.getPrice());
			preparedStatement.setObject(4, dto.getMemory());
			preparedStatement.setObject(5, dto.getBrandName());
			preparedStatement.setObject(6, dto.getNoOfCamere());
			
			return preparedStatement.executeUpdate() > 0 ? true : false;
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SQLUtility.closeConnection(connection);
		}
		return false;
	}

	public boolean delete(Integer mobile_id) {
		Connection connection = null;
		
		try {
			connection = SQLUtility.createConnection();
			String sql = "delete from mobile_table where mobile_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, mobile_id);
			
			return preparedStatement.executeUpdate() > 0 ? true : false;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SQLUtility.closeConnection(connection);
		}
		return false;
	}

	
//----
	public boolean displayAll() {
		Connection connection = null;
		try {
			connection = SQLUtility.createConnection();
			String sql = "select * from mobile_table";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Object col1 = resultSet.getObject(1);
				Object col2 = resultSet.getObject(2);
				Object col3 = resultSet.getObject(3);
				Object col4 = resultSet.getObject(4);
				Object col5 = resultSet.getObject(5);
				Object col6 = resultSet.getObject(6);
				
				System.out.println(col1 + " " + col2 + " " + col3 + " " + col4+ " "+ col5+ " "+ col6 );
			}}
		 catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SQLUtility.closeConnection(connection);
		}

		return false;
	}
	
	public boolean displayRecordsByBrandName() {
		Connection connection = null;
		try {
			connection = SQLUtility.createConnection();
			String sql = "select brandName from mobile_table";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Object col1 = resultSet.getObject(1);
				System.out.println(col1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SQLUtility.closeConnection(connection);
		}

		return false;
	}

//-----------------
	
	public boolean updateprice(Integer mobile_id) {
		Connection connection = null;
		try {
			connection = SQLUtility.createConnection();
			String sql = "update mobile_table SET price = 20000 where mobile_id =? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, mobile_id);
			return preparedStatement.executeUpdate() > 0 ? true : false;
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SQLUtility.closeConnection(connection);
		}
		return false;
	}
	
	}






	

