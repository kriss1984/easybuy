package com.easybuy.utils;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

public class BaseDao {
    /**
     * 获取数据库连接对象
     * @return
     */
    public static   Connection getConnection()  {

        Connection con = null;
        try {
            Context ctx=new InitialContext();
           con=((DataSource) ctx.lookup("java:comp/env/dataBaseConnect")).getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;


    }


    /**
     * 关闭资源对象
     * @param con
     * @param st
     * @param rs
     */
    public static  void closeAll(Connection con, Statement st, ResultSet rs){
        try {
            if(rs!=null)rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            if(st!=null)st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            if(con!=null)con.close();

        }catch (Exception e){
            e.printStackTrace();
        }



    }






}
