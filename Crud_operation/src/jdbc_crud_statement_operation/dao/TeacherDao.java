package jdbc_crud_statement_operation.dao;
import java.sql.DriverManager;

import java.sql.DriverManager;

import jdbc_crud_statement_operation.dto.Teacher;

public class TeacherDao {
	
	
	public void insertTeacher(Teacher teacher)
	//Sir yaha pe without introduing methhod can we use class.for name?
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Object url;
			connection conn = new DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
