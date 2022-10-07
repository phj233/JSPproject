package com.phj233.util;


import java.sql.*;

public class DBUtil {
    private static final String url = "jdbc:mysql://localhost:3306/jspdemo";
    private static final String user = "root";
    private static final String passwd = "phj123456";
    static String driver = "com.mysql.cj.jdbc.Driver";
    static Connection connet;
    static Statement stmt;
    static PreparedStatement prestmt;
    static ResultSet rs;

    public static Connection getConnect() {
        try {
            Class.forName(driver);
            connet = DriverManager.getConnection(url, user, passwd);
            stmt = connet.createStatement();
            if (connet!=null){
                System.out.println("connect success!");
                return connet;
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void disConnect() {
        try {
            if (rs != null) {
                rs.close();
                System.out.println("dis successs");
            }
            if (stmt != null) {
                stmt.close();
                System.out.println("dis successs");
            }
            if (prestmt!=null){
                prestmt.close();
                System.out.println("dis successs");
            }
            if (connet!=null){
                connet.close();
                System.out.println("dis successs");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet select(String sql) throws SQLException {
//        try {
//            prestmt = connet.prepareStatement(sql);
//            rs = prestmt.executeQuery();
//            ResultSetMetaData resultSetMetaData = prestmt.getMetaData();
//            int colCount=resultSetMetaData.getColumnCount();
//            while (rs.next()) {
//                for (int i=1;i <= colCount;i++){
//                    System.out.print("|"+resultSetMetaData.getColumnName(i)+"|"+rs.getObject(i)+"\t");
//                }
//                System.out.print("\n");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }finally {
//            disConnect();
//        }
//        return rs;
        //        条件查询
        try {
            connet=getConnect();
            prestmt=connet.prepareStatement(sql);
            rs=prestmt.executeQuery();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally {
            disConnect();
        }
        return rs;
    }

    public static int update(String sql, Object... args) {
        int len;
        try {
            PreparedStatement pst = connet.prepareStatement(sql);
            if (args != null && args.length > 0) {
                for (int i = 0; i < args.length; i++) {
                    pst.setObject(i + 1, args[i]);
                }
            }
            len = pst.executeUpdate();
            if (len != 0) System.out.println("修改成功");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            disConnect();
        }
        return len;
    }
    public static int delete(String sql) {
        int len;
        try {
            PreparedStatement pst = connet.prepareStatement(sql);
            len = pst.executeUpdate();
            if (len != 0) System.out.println("修改成功");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            disConnect();
        }
        return len;
    }
}
