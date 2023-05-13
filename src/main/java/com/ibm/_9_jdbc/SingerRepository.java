package com.ibm._9_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SingerRepository {
	
	public static void main(String[] args) {
		SingerRepository singerRepository = new SingerRepository();
		List<Singer> singers = singerRepository.findSingersByFirstName("John");
		singers.forEach(singer -> System.out.println(singer));
	}
	
	public List<Singer> findSingersByFirstName(String firstName) {
		List<Singer> singers = new ArrayList<>();
		String query = "SELECT id, lastName, birthDate"
			               + " FROM singer "
			               + " WHERE firstName = ?"; //index care incepe de la 1
		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, firstName);
			ResultSet rs = preparedStatement.executeQuery();
			
			// r, |r,r,r,r
			while (rs.next()) {
				long id = rs.getLong("id");//getLong(1)
				String lastName = rs.getString("lastName");
				LocalDate birthDate = rs.getDate("birthDate") // java.sql.Date
				                        .toLocalDate();
				Singer singer = new Singer(id, firstName, lastName, birthDate);
				singers.add(singer);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return singers;
	}
	
	/*
	 docker run -d -p 3306:3306 --name mysql-docker-container -e MYSQL_ROOT_PASSWORD=secret -e MYSQL_DATABASE=spotify -e MYSQL_USER=my-user -e MYSQL_PASSWORD=secret mysql/mysql-server:latest
	 */
	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/spotify", "my-user", "secret");
	}
	
}
