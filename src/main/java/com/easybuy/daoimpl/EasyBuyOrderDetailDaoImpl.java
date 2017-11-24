package com.easybuy.daoimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.entiy.EasyBuyOrderDetail;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.utils.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EasyBuyOrderDetailDaoImpl implements EasyBuyFindAllDao<EasyBuyOrderDetail> {
    private Connection con= BaseDao.getConnection();
    private PreparedStatement ps=null;


    /**
     * 查询所有的EasyBuyProductCategory 的表内容
     * @return
     */

    public List<EasyBuyOrderDetail> findAll(){
        List<EasyBuyOrderDetail> product=new ArrayList<EasyBuyOrderDetail>();
        try {
            ps= con.prepareStatement("SELECT * FROM easybuy_order_detail");

            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                product.add(new EasyBuyOrderDetail(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getDouble(5)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  product;

    }

    public EasyBuyOrderDetail findById(Integer id) {
        return null;
    }

    public List<EasyBuyOrderDetail> findByUserId(Integer userId) {
        return null;
    }

    public Integer add(EasyBuyOrderDetail easyBuyOrderDetail) {
        return null;
    }

    public EasyBuyOrderDetail findByNameAndPwd(String name, String pwd) {
        return null;
    }

    public List<EasyBuyProduct> findOne(Integer id) {
        return null;
    }


}
