package com.soft1611.jianshu.model;

import javax.persistence.*;

public class Collections {
    /**
     * 关注id
     */
    @Id
    @Column(name = "collectionId")
    private Integer collectionId;

    /**
     * 文章个数
     */
    @Column(name = "articleCount")
    private Integer articleCount;

    /**
     * 关注名字
     */
    @Column(name = "collectionName")
    private String collectionName;

    /**
     * 关注头像
     */
    @Column(name = "collectionUrl")
    private String collectionUrl;

    /**
     * 粉丝个数
     */
    @Column(name = "fansCount")
    private Integer fansCount;

    /**
     * 描述
     */
    private String summary;

    public
    Integer getCollectionId() {
        return collectionId;
    }

    public
    void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public
    Integer getArticleCount() {
        return articleCount;
    }

    public
    void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }

    public
    String getCollectionName() {
        return collectionName;
    }

    public
    void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public
    String getCollectionUrl() {
        return collectionUrl;
    }

    public
    void setCollectionUrl(String collectionUrl) {
        this.collectionUrl = collectionUrl;
    }

    public
    Integer getFansCount() {
        return fansCount;
    }

    public
    void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    public
    String getSummary() {
        return summary;
    }

    public
    void setSummary(String summary) {
        this.summary = summary;
    }
}