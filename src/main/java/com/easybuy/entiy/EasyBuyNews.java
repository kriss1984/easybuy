package com.easybuy.entiy;

/**
 * Created by Wang1 on 2017/11/20.
 */
public class EasyBuyNews {
    private Integer id;
    private String title;//标题
    private String content;//内容
    private String createTime;//项目时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public EasyBuyNews(Integer id, String title, String content, String createTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }

    public EasyBuyNews(String title, String content, String createTime) {
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }

    public EasyBuyNews() {
    }
}
