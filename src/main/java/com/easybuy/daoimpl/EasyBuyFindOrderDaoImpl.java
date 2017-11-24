package com.easybuy.daoimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.entiy.EasyBuyOrder;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.utils.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EasyBuyFindOrderDaoImpl implements EasyBuyFindAllDao<EasyBuyOrder> {
    private Connection con= BaseDao.getConnection();
    private PreparedStatement ps=null;




    /**
     * 查询所有的EasyBuyOrder 的表内容
     * @return
     */



    public List<EasyBuyOrder> findAll() {
        List<EasyBuyOrder> EasyBuyOrder=new ArrayList<EasyBuyOrder>();
        try {
            ps= con.prepareStatement("SELECT * FROM easybuy_order");

            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                EasyBuyOrder.add(new EasyBuyOrder(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getString(7)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  EasyBuyOrder;

    }

    public EasyBuyOrder findById(Integer id) {
        return null;
    }

    public List<EasyBuyOrder> findByUserId(Integer userId) {
        List<EasyBuyOrder> EasyBuyOrder=new ArrayList<EasyBuyOrder>();
        try {
            ps= con.prepareStatement("SELECT * FROM easybuy_order WHERE userId=?");
            ps.setInt(1,userId);
            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                EasyBuyOrder.add(new EasyBuyOrder(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getString(7)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  EasyBuyOrder;

    }

    public Integer add(EasyBuyOrder easyBuyOrder) {
        return null;
    }

    public EasyBuyOrder findByNameAndPwd(String name, String pwd) {
        return null;
    }

    public List<EasyBuyProduct> findOne(Integer id) {
        return null;
    }


}
