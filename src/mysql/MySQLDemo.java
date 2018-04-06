package mysql;

import java.sql.*;

public class MySQLDemo {
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/bupt";

    static final String USER = "mser";
    static final String PASS = "mser";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            //注册JDBC驱动
            Class.forName(DRIVER);

            //打开链接
            System.out.println("连接数据库...");
            connection = DriverManager.getConnection(URL,USER,PASS);

            //执行查询
            System.out.println("实例化Statement对象...");
            statement = connection.createStatement();
            String sql = "select * from student";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString("sname");
                System.out.println(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            //处理Class.forName错误
            e.printStackTrace();
        } finally {
            try{
                if(statement!=null) statement.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(statement!=null) statement.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Job done.");
    }
}
