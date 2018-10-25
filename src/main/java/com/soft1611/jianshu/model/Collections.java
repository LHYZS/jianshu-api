package com.soft1611.jianshu.model;

import javax.persistence.*;

public class Collections {
    /**
     * 关注id
     */
    @Id
    @Column(name = "collectionId")
    private Integer collectionid;

    /**
     * 文章个数
     */
    @Column(name = "articleCount")
    private Integer articlecount;

    /**
     * 关注名字
     */
    @Column(name = "collectionName")
    private String collectionname;

    /**
     * 关注头像
     */
    @Column(name = "collectionUrl")
    private String collectionurl;

    /**
     * 粉丝个数
     */
    @Column(name = "fansCount")
    private Integer fanscount;

    /**
     * 描述
     */
    private String summary;

    /**
     * 获取关注id
     *
     * @return collectionId - 关注id
     */
    public Integer getCollectionid() {
        return collectionid;
    }

    /**
     * 设置关注id
     *
     * @param collectionid 关注id
     */
    public void setCollectionid(Integer collectionid) {
        this.collectionid = collectionid;
    }

    /**
     * 获取文章个数
     *
     * @return articleCount - 文章个数
     */
    public Integer getArticlecount() {
        return articlecount;
    }

    /**
     * 设置文章个数
     *
     * @param articlecount 文章个数
     */
    public void setArticlecount(Integer articlecount) {
        this.articlecount = articlecount;
    }

    /**
     * 获取关注名字
     *
     * @return collectionName - 关注名字
     */
    public String getCollectionname() {
        return collectionname;
    }

    /**
     * 设置关注名字
     *
     * @param collectionname 关注名字
     */
    public void setCollectionname(String collectionname) {
        this.collectionname = collectionname;
    }

    /**
     * 获取关注头像
     *
     * @return collectionUrl - 关注头像
     */
    public String getCollectionurl() {
        return collectionurl;
    }

    /**
     * 设置关注头像
     *
     * @param collectionurl 关注头像
     */
    public void setCollectionurl(String collectionurl) {
        this.collectionurl = collectionurl;
    }

    /**
     * 获取粉丝个数
     *
     * @return fansCount - 粉丝个数
     */
    public Integer getFanscount() {
        return fanscount;
    }

    /**
     * 设置粉丝个数
     *
     * @param fanscount 粉丝个数
     */
    public void setFanscount(Integer fanscount) {
        this.fanscount = fanscount;
    }

    /**
     * 获取描述
     *
     * @return summary - 描述
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置描述
     *
     * @param summary 描述
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
}