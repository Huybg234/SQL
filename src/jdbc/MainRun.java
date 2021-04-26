package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MainRun {

    public static void main(String[] args) {
        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//
//            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "truongbb", "admin");
//
//            if (connection != null) {
//                System.out.println("Connected to the database!");
//            } else {
//                System.out.println("Failed to make connection!");
//            }

            Connection connection = JdbcUtil.getConnection("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@localhost:1521:xe", "truongbb", "admin");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");

            List<Student> students = new ArrayList<>();

            if (resultSet != null) {
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    int id1 = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String gender = resultSet.getString("gender");
                    String birthday = resultSet.getString(4);
                    String hometown = resultSet.getString(5);
                    long scholarship = resultSet.getLong(6);
                    Student student = new Student(id, name, gender, birthday, hometown, scholarship);
                    students.add(student);
                }
            }

            students.forEach(System.out::println);


            PreparedStatement preparedStatement = connection.prepareStatement("select * from student");

            ResultSet rs = preparedStatement.executeQuery();

            int i = preparedStatement.executeUpdate();// số dòng bị thay đổi trong DB

            //....


            JdbcUtil.closeConnection(resultSet, statement, connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
