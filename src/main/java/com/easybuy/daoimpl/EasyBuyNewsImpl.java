package com.easybuy.daoimpl;

import com.easybuy.dao.EasyBuyFindAllDao;
import com.easybuy.entiy.EasyBuyNews;
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
public class EasyBuyNewsImpl implements EasyBuyFindAllDao<EasyBuyNews> {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * EasyBuyNews 查询所有
     * @return
     */
    public List<EasyBuyNews> findAll() {
        List<EasyBuyNews> list = new ArrayList<EasyBuyNews>();
        conn = BaseDao.getConnection();
        String sql = "select * from easybuy_news order by createTime desc limit 5;";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new EasyBuyNews(rs.getInt("id"), rs.getString("title"), rs.getString("content"), rs.getString("createTime")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


    public EasyBuyNews findById(Integer id) {
        return null;
    }

    public List<EasyBuyNews> findByUserId(Integer userId) {
        return null;
    }

    public Integer add(EasyBuyNews easyBuyNews) {
        return null;
    }

    public EasyBuyNews findByNameAndPwd(String name, String pwd) {
        return null;
    }

    public List<EasyBuyProduct> findOne(Integer id) {
        return null;
    }

}

