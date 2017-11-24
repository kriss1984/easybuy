package com.easybuy.daoimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.entiy.EasyBuyUser;
import com.easybuy.utils.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/20.
 */
public class EasyBuyUserDaoImpl implements EasyBuyFindAllDao<EasyBuyUser> {
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    /**
     * EasyBuyUser查询信息
     */
    public List<EasyBuyUser> findAll(){
        List<EasyBuyUser> list=new ArrayList<EasyBuyUser>();
        conn= BaseDao.getConnection();
        String sql="select * from easybuy_user";
        try {
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                list.add(new EasyBuyUser(rs.getInt("id"),rs.getString("loginName"),rs.getString("userName"),rs.getString("password"),rs.getInt("sex"),rs.getString("identityCode"),rs.getString("email"),rs.getString("mobile"),rs.getInt("type")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public EasyBuyUser findById(Integer id){
        EasyBuyUser easy=null;
        conn= BaseDao.getConnection();
        String sql="select * from easybuy_user WHERE id=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1,id);
            rs=pst.executeQuery();
            if(rs.next()){
               easy= new EasyBuyUser(rs.getInt("id"),rs.getString("loginName"),rs.getString("userName"),rs.getString("password"),rs.getInt("sex"),rs.getString("identityCode"),rs.getString("email"),rs.getString("mobile"),rs.getInt("type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return easy;
    }

    public List<EasyBuyUser> findByUserId(Integer userId) {
        return null;
    }

    public Integer add(EasyBuyUser easyBuyUser) {
        int result=-1;
        conn= BaseDao.getConnection();
        String sql="INSERT into  easybuy_user(loginName,password,email,mobile,type) VALUES(?,?,?,?,?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,easyBuyUser.getLoginName());
            pst.setString(2,easyBuyUser.getPassword());
            pst.setString(3,easyBuyUser.getEmail());
            pst.setString(4,easyBuyUser.getMobile());
            pst.setInt(5,easyBuyUser.getType());
             result=pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }

    public EasyBuyUser findByNameAndPwd(String name, String pwd) {
        EasyBuyUser easyBuyUser=null;
        conn= BaseDao.getConnection();
        String sql="select * from easybuy_user WHERE loginName=? and password=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,name);
            pst.setString(2,pwd);
            rs=pst.executeQuery();
            if(rs.next()){
                easyBuyUser=new EasyBuyUser(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return easyBuyUser;

    }

    public List<EasyBuyProduct> findOne(Integer id) {
        return null;
    }
}
