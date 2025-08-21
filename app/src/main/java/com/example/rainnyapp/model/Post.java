package com.example.rainnyapp.model;

import java.util.Date;

public class Post {
   private String id;
   private String userId;

   private String content;
   private String imgUrl;
   private String vidUrl;
   private int likeCount;
   private int commentCount;
   private int shareCount;
   private boolean isDeleted;
   private Date createAt;
   private User user;


   public Post(){}

   // constructor
    public Post(String id, String userId, String content, String imgUrl, String vidUrl, int likeCount, int commentCount, int shareCount, boolean isDeleted, Date createAt, User user) {
        this.id = id;
        this.userId = userId;
        this.content = content;
        this.imgUrl = imgUrl;
        this.vidUrl = vidUrl;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.shareCount = shareCount;
        this.isDeleted = isDeleted;
        this.createAt = createAt;
        this.user = user;
    }

    //setter getter


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getVidUrl() {
        return vidUrl;
    }

    public void setVidUrl(String vidUrl) {
        this.vidUrl = vidUrl;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
