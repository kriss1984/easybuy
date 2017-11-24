package com.easybuy.entiy;

/**
 * Created by Wang1 on 2017/11/20.
 */
public class EasyBuyProduct {
    private Integer id;
    private String name;//名称
    private String description;//描述
    private Double price;//价格
    private Integer stock;//库存
    private Integer categoryLevel1;//分类1
    private Integer categoryLevel2;//分类2
    private Integer categoryLevel3;//分类2
    private String fileName;//文件名称
    private Integer isDelete;//是否删除

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(Integer categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    public Integer getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(Integer categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    public Integer getCategoryLevel3() {
        return categoryLevel3;
    }

    public void setCategoryLevel3(Integer categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public EasyBuyProduct(Integer id, String name, String description, Double price, Integer stock, Integer categoryLevel1, Integer categoryLevel2, Integer categoryLevel3, String fileName, Integer isDelete) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.categoryLevel1 = categoryLevel1;
        this.categoryLevel2 = categoryLevel2;
        this.categoryLevel3 = categoryLevel3;
        this.fileName = fileName;
        this.isDelete = isDelete;
    }



    public EasyBuyProduct(String name, String description, Double price, Integer stock, Integer categoryLevel1, Integer categoryLevel2, Integer categoryLevel3, String fileName, Integer isDelete) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.categoryLevel1 = categoryLevel1;
        this.categoryLevel2 = categoryLevel2;
        this.categoryLevel3 = categoryLevel3;
        this.fileName = fileName;
        this.isDelete = isDelete;

    }
    public EasyBuyProduct() {
    }
}
