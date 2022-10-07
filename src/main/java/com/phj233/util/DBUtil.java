package com.phj233.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/jspdemo";
    private static final String USER = "root";
    private static final String PASSWORD = "phj123456";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    /**
     * 静态工具类，不允许实例化，使用 “DBUtil.方法名” 调用
     */
    private DBUtil() {
    }

    static {
        //静态代码块，加载驱动，只加载一次
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static Connection getConnect() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 提取相同用法：获取 connection ，设置可变长度参数
     * @param sql    待处理的SQL语句
     * @param params SQL语句'?'对应的参数
     */
    private static void setParams(String sql, Object... params) throws SQLException {
        connection = getConnect();
        preparedStatement = connection.prepareStatement(sql);
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
        }
    }

    /**
     * 返回查询结果，resultSet转为包含Map的List，每个Map对应一条记录，key为字段名，value为字段值
     * @param sql    待处理的SQL语句，查询参数用'?'代替
     * @param params SQL语句'?'对应的参数
     * @return 包含Map的List列表，List：每行数据。Map：key为列名，value为列值
     */
    public static List<Map<String, Object>> query(String sql, Object... params) {
        //List用于存放多条查询结果
        List<Map<String, Object>> list = new ArrayList<>();
        try {
            //预处理SQL
            setParams(sql, params);
            resultSet = preparedStatement.executeQuery();
            //获取ResultSet对象的列数据
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                //Map存放一行数据，key为列名(String)，value为列值(Object)
                Map<String, Object> rowData = new HashMap<>(columnCount);
                for (int i = 0; i < columnCount; i++) {
                    //存放列名，列值
                    rowData.put(metaData.getColumnLabel(i + 1), resultSet.getObject(i + 1));
                }
                list.add(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return list;
    }

    /**
     * 数据库增删改，根据传入的参数个数动态设置占位符参数的值
     * @param sql    SQL语句，包含一个或多个'?'参数占位符
     * @param params 参数列表，与SQL语句中的'?'参数占位符对应
     * @return 影响的行数
     */
    public static int update(String sql, Object... params) {
        try {
            setParams(sql, params);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return -1;
    }

    /**
     * 关闭数据库连接，
     * 顺序：ResultSet -> PreparedStatement -> Connection
     */
    private static void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
                System.out.println("resultSet close");
            }
            if (preparedStatement != null) {
                preparedStatement.close();
                System.out.println("preparedStatement close");
            }
            if (connection != null) {
                connection.close();
                System.out.println("connection close");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
