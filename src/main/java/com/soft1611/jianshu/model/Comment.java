package com.soft1611.jianshu.model;

import java.util.Date;
import javax.persistence.*;

public class Comment {
    /**
     * 评论id
     */
    @Id
    @Column(name = "commentId")
    private Integer commentid;

    /**
     * 文章
     */
    @Column(name = "articleId")
    private Integer articleid;

    /**
     * 评论时间
     */
    @Column(name = "commentTime")
    private Date commenttime;

    /**
     * 内容
     */
    private String content;

    /**
     * 用户id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 获取评论id
     *
     * @return commentId - 评论id
     */
    public Integer getCommentid() {
        return commentid;
    }

    /**
     * 设置评论id
     *
     * @param commentid 评论id
     */
    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    /**
     * 获取文章
     *
     * @return articleId - 文章
     */
    public Integer getArticleid() {
        return articleid;
    }

    /**
     * 设置文章
     *
     * @param articleid 文章
     */
    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    /**
     * 获取评论时间
     *
     * @return commentTime - 评论时间
     */
    public Date getCommenttime() {
        return commenttime;
    }

    /**
     * 设置评论时间
     *
     * @param commenttime 评论时间
     */
    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取用户id
     *
     * @return userId - 用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户id
     *
     * @param userid 用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}