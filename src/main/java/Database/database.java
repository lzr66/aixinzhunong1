package Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import pojo.*;

public class database {
    //查看评价
    public static ResultSet selectAllfeedback(){

        String sqlString = "SELECT * FROM feedback";
        try
        {
            Connection connection = databasepool.getHikariDataSource().getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlString);
            return  resultSet;
            // 获取执行结果

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;


    }

    //查看聊天记录
    public static ResultSet selectAllchat(){
        String sqlString = "SELECT * FROM chat";

        try
        {
            Connection connection = databasepool.getHikariDataSource().getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlString);
            // 获取执行结果
            return resultSet;

        } catch (SQLException e) {
            e.printStackTrace();
        }
    return null;
    }
//查看商家
    public static ResultSet selectAllshop(){
        String sqlString = "SELECT * FROM shop";

        try
        {
            Connection connection = databasepool.getHikariDataSource().getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlString);
            // 获取执行结果
            return resultSet;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
//查看购物车
    public static ResultSet selectAllshoppingcart(){
        String sqlString = "SELECT * FROM shoppingcart";

        try
        {
            Connection connection = databasepool.getHikariDataSource().getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlString);
            // 获取执行结果
            return resultSet;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //查看专家列表
    public static ResultSet selectAllpro(){
        String sqlString = "SELECT * FROM pro";

        try
        {
            Connection connection = databasepool.getHikariDataSource().getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlString);
            // 获取执行结果
            return resultSet;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //查看公告栏
    public static ResultSet selectAllannouncement(){
        String sqlString = "SELECT * FROM announcement";

        try
        {
            Connection connection = databasepool.getHikariDataSource().getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlString);
            // 获取执行结果
            return resultSet;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //查看足迹
    public static ResultSet selectAllfootprint(){
        String sqlString = "SELECT * FROM footprint";

        try
        {
            Connection connection = databasepool.getHikariDataSource().getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlString);
            // 获取执行结果
            return resultSet;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //生成足迹
    public  static void generateFootprint(footprint ft){
        String sqlString = "Insert into footprint values(?,?,?,?)";
        footprint footprint= ft;

        try
        {
            Connection connection = databasepool.getHikariDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(sqlString);


            statement.setString(1,ft.getFootId());
            statement.setString(2,ft.getUserId());
            statement.setString(3,ft.getGoodId());
            statement.setDate(4,ft.getTimestamp());

           statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static ResultSet selectAllgood(){
        String sqlString = "SELECT * FROM goods";

        try
        {
            Connection connection = databasepool.getHikariDataSource().getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlString);
            // 获取执行结果
            return resultSet;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
