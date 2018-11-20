package com.soft1611.jianshu.model;

import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    /**
     * 用户id
     */
    @Id
    @Column(name = "userId")
    private Integer userId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 描述
     */
    private String description;

    /**
     * 喜欢数
     */
    @Column(name = "likeCount")
    private Integer likeCount;

    /**
     * 字数
     */
    @Column(name = "wordsCount")
    private Integer wordsCount;

    public
    Integer getUserId() {
        return userId;
    }

    public
    void setUserId(Integer userId) {
        this.userId = userId;
    }

    public
    String getEmail() {
        return email;
    }

    public
    void setEmail(String email) {
        this.email = email;
    }

    public
    String getPassword() {
        return password;
    }

    public
    void setPassword(String password) {
        this.password = password;
    }

    public
    String getNickname() {
        return nickname;
    }

    public
    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public
    String getAvatar() {
        return avatar;
    }

    public
    void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public
    String getDescription() {
        return description;
    }

    public
    void setDescription(String description) {
        this.description = description;
    }

    public
    Integer getLikeCount() {
        return likeCount;
    }

    public
    void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public
    Integer getWordsCount() {
        return wordsCount;
    }

    public
    void setWordsCount(Integer wordsCount) {
        this.wordsCount = wordsCount;
    }
}