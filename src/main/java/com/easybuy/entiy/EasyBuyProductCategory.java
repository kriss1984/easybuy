package com.easybuy.entiy;

public class EasyBuyProductCategory {
    private Integer id;
    private String name;
    private Integer  parentId;
    private Integer type;

    public EasyBuyProductCategory(Integer id, String name, Integer parentId, Integer type) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.type = type;
    }

    public EasyBuyProductCategory() {
    }

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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
