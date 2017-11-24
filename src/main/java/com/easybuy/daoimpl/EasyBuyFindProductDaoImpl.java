package com.easybuy.daoimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.utils.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EasyBuyFindProductDaoImpl implements EasyBuyFindAllDao<EasyBuyProduct> {
    private Connection con= BaseDao.getConnection();
    private PreparedStatement ps=null;


    /**
     * 查询所有的EasyBuyProductCategory 的表内容
     * @return
     */

    public List<EasyBuyProduct> findAll(){
        List<EasyBuyProduct> product=new ArrayList<EasyBuyProduct>();
        try {
            ps= con.prepareStatement("SELECT * FROM easybuy_product");

            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                product.add(new EasyBuyProduct(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getString(9),rs.getInt(10)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  product;

    }

    public EasyBuyProduct findById(Integer id) {
        return null;
    }

    public List<EasyBuyProduct> findByUserId(Integer userId) {
        List<EasyBuyProduct> product=new ArrayList<EasyBuyProduct>();
        try {
            ps= con.prepareStatement("SELECT * FROM easybuy_product WHERE ");

            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                product.add(new EasyBuyProduct(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getString(9),rs.getInt(10)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  product;



    }

    public Integer add(EasyBuyProduct easyBuyProduct) {
        return null;
    }

    public EasyBuyProduct findByNameAndPwd(String name, String pwd) {
        return null;
    }

    public List<EasyBuyProduct> findOne(Integer id){
        List<EasyBuyProduct> product=new ArrayList<EasyBuyProduct>();
        try {
            ps= con.prepareStatement("SELECT * FROM easybuy_product WHERE id=?");
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                product.add(new EasyBuyProduct(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getString(9),rs.getInt(10)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  product;

    }

}
