package com.soft1611.jianshu.model;

import java.util.Date;
import javax.persistence.*;

public class Article {
    /**
     * 文章id
     */
    @Id
    @Column(name = "articleId")
    private Integer articleid;

    /**
     * 评论数
     */
    private Integer comments;

    /**
     * 喜欢数
     */
    private Integer likes;

    /**
     * 内容
     */
    private String summary;

    /**
     * 头像
     */
    private String thumbnail;

    /**
     * 标题
     */
    private String title;

    /**
     * 发布时间
     */
    @Column(name = "writeTime")
    private Date writetime;

    /**
     * 作者id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 获取文章id
     *
     * @return articleId - 文章id
     */
    public Integer getArticleid() {
        return articleid;
    }

    /**
     * 设置文章id
     *
     * @param articleid 文章id
     */
    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    /**
     * 获取评论数
     *
     * @return comments - 评论数
     */
    public Integer getComments() {
        return comments;
    }

    /**
     * 设置评论数
     *
     * @param comments 评论数
     */
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    /**
     * 获取喜欢数
     *
     * @return likes - 喜欢数
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * 设置喜欢数
     *
     * @param likes 喜欢数
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * 获取内容
     *
     * @return summary - 内容
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置内容
     *
     * @param summary 内容
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取头像
     *
     * @return thumbnail - 头像
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 设置头像
     *
     * @param thumbnail 头像
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取发布时间
     *
     * @return writeTime - 发布时间
     */
    public Date getWritetime() {
        return writetime;
    }

    /**
     * 设置发布时间
     *
     * @param writetime 发布时间
     */
    public void setWritetime(Date writetime) {
        this.writetime = writetime;
    }

    /**
     * 获取作者id
     *
     * @return userId - 作者id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置作者id
     *
     * @param userid 作者id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}