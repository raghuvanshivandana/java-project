package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class database {
public static void main(String[] arg) throws SQLException
{
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","4568Hell@");
	System.out.println("connection established");
	Statement smt=c.createStatement();
	smt.execute("create database stud ");
	System.out.println("database created");
	c.close();
}
//
//		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ stud","root","4568Hell@");
//	System.out.println("connection established");
//	Statement smt=c.createStatement();
//	smt.execute("create table student(rollno int,name varchar(20))");
//	System.out.println("table created");
//	c.close();
//}
}
//OutputStream = SEND
//InputStream  = RECEIVE

