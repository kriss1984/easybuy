package com.easybuy.entiy;

/**
 * Created by Wang1 on 2017/11/20.
 */
public class EasyBuyUserAddress {
    private Integer id;
    private Integer userId;//用户主键
    private String address;//地址
    private String createTime;//创建时间
    private Integer isDefault;//是否是默认地址
    private String remark;//备注

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public EasyBuyUserAddress() {
    }

    public EasyBuyUserAddress(Integer id, Integer userId, String address, String createTime, Integer isDefault, String remark) {
        this.id = id;
        this.userId = userId;
        this.address = address;
        this.createTime = createTime;
        this.isDefault = isDefault;
        this.remark = remark;
    }

    public EasyBuyUserAddress(Integer userId, String address, String createTime, Integer isDefault, String remark) {
        this.userId = userId;
        this.address = address;
        this.createTime = createTime;
        this.isDefault = isDefault;
        this.remark = remark;
    }
}

