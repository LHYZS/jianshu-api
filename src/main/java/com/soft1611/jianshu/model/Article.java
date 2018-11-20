package com.soft1611.jianshu.model;

import java.util.Date;
import javax.persistence.*;

public class Article {
    /**
     * 文章id
     */
    @Id
    @Column(name = "articleId")
    private Integer articleId;

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
    private Date writeTime;

    /**
     * 作者id
     */
    @Column(name = "userId")
    private Integer userId;

    public
    Integer getArticleId() {
        return articleId;
    }

    public
    void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public
    Integer getComments() {
        return comments;
    }

    public
    void setComments(Integer comments) {
        this.comments = comments;
    }

    public
    Integer getLikes() {
        return likes;
    }

    public
    void setLikes(Integer likes) {
        this.likes = likes;
    }

    public
    String getSummary() {
        return summary;
    }

    public
    void setSummary(String summary) {
        this.summary = summary;
    }

    public
    String getThumbnail() {
        return thumbnail;
    }

    public
    void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public
    String getTitle() {
        return title;
    }

    public
    void setTitle(String title) {
        this.title = title;
    }

    public
    Date getWriteTime() {
        return writeTime;
    }

    public
    void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    public
    Integer getUserId() {
        return userId;
    }

    public
    void setUserId(Integer userId) {
        this.userId = userId;
    }
}