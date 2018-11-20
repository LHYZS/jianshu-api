package com.soft1611.jianshu.model;

import java.util.Date;
import javax.persistence.*;

public class Comment {
    /**
     * 评论id
     */
    @Id
    @Column(name = "commentId")
    private Integer commentId;

    /**
     * 文章
     */
    @Column(name = "articleId")
    private Integer articleId;

    /**
     * 评论时间
     */
    @Column(name = "commentTime")
    private Date commentTime;

    /**
     * 内容
     */
    private String content;

    /**
     * 用户id
     */
    @Column(name = "userId")
    private Integer userId;

    public
    Integer getCommentId() {
        return commentId;
    }

    public
    void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public
    Integer getArticleId() {
        return articleId;
    }

    public
    void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public
    Date getCommentTime() {
        return commentTime;
    }

    public
    void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public
    String getContent() {
        return content;
    }

    public
    void setContent(String content) {
        this.content = content;
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