package com.soft1611.jianshu.model;

import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    /**
     * 用户id
     */
    @Id
    @Column(name = "userId")
    private Integer userid;

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
    private Integer likecount;

    /**
     * 字数
     */
    @Column(name = "wordsCount")
    private Integer wordscount;

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

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取喜欢数
     *
     * @return likeCount - 喜欢数
     */
    public Integer getLikecount() {
        return likecount;
    }

    /**
     * 设置喜欢数
     *
     * @param likecount 喜欢数
     */
    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

    /**
     * 获取字数
     *
     * @return wordsCount - 字数
     */
    public Integer getWordscount() {
        return wordscount;
    }

    /**
     * 设置字数
     *
     * @param wordscount 字数
     */
    public void setWordscount(Integer wordscount) {
        this.wordscount = wordscount;
    }
}