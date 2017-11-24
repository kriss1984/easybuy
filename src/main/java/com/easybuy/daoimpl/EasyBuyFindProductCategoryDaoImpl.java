package com.easybuy.daoimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.entiy.EasyBuyProduct;
import com.easybuy.entiy.EasyBuyProductCategory;
import com.easybuy.utils.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EasyBuyFindProductCategoryDaoImpl implements EasyBuyFindAllDao<EasyBuyProductCategory> {
    private  Connection con=BaseDao.getConnection();
    private PreparedStatement ps=null;


    /**
     * 查询所有的EasyBuyProductCategory 的表内容
     * @return
     */
    public List<EasyBuyProductCategory> findAll(){
        List<EasyBuyProductCategory> productCateGory=new ArrayList<EasyBuyProductCategory>();
        try {
           ps= con.prepareStatement("SELECT * FROM easybuy_product_category");

          ResultSet rs= ps.executeQuery();

          while (rs.next()){
              productCateGory.add(new EasyBuyProductCategory(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
          }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  productCateGory;

    }

    public EasyBuyProductCategory findById(Integer id) {
        return null;
    }

    public List<EasyBuyProductCategory> findByUserId(Integer userId) {
        return null;
    }

    public Integer add(EasyBuyProductCategory easyBuyProductCategory) {
        return null;
    }

    public EasyBuyProductCategory findByNameAndPwd(String name, String pwd) {
        return null;
    }

    public List<EasyBuyProduct> findOne(Integer id) {
        return null;
    }


}
