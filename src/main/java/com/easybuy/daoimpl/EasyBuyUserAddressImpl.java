package com.easybuy.daoimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.entiy.EasyBuyUserAddress;
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
public class EasyBuyUserAddressImpl implements EasyBuyFindAllDao<EasyBuyUserAddress> {
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    /**
     * EasyBuyUser查询信息
     */
    public List<EasyBuyUserAddress> findAll(){
        List<EasyBuyUserAddress> list=new ArrayList<EasyBuyUserAddress>();
        conn= BaseDao.getConnection();
        String sql="select * from easybuy_user_address";
        try {
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                list.add(new EasyBuyUserAddress(rs.getInt("id"),rs.getInt("userId"),rs.getString("address"),rs.getString("createTime"),rs.getInt("isDefault"),rs.getString("remark")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public EasyBuyUserAddress findById(Integer id) {
        return null;
    }

    public List<EasyBuyUserAddress> findByUserId(Integer userId) {
        List<EasyBuyUserAddress> list=new ArrayList<EasyBuyUserAddress>();
        conn= BaseDao.getConnection();
        String sql="select * from easybuy_user_address WHERE userid=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1,userId);
            rs=pst.executeQuery();
            while(rs.next()){
                list.add(new EasyBuyUserAddress(rs.getInt("id"),rs.getInt("userId"),rs.getString("address"),rs.getString("createTime"),rs.getInt("isDefault"),rs.getString("remark")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    public Integer add(EasyBuyUserAddress easyBuyUserAddress) {
        return null;
    }

    public EasyBuyUserAddress findByNameAndPwd(String name, String pwd) {
        return null;
    }

    public List<EasyBuyProduct> findOne(Integer id) {
        return null;
    }


}
