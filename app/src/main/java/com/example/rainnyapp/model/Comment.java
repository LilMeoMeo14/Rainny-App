package com.example.rainnyapp.model;

import java.util.Date;

public class Comment {
    private String commentId;
    private String postId;
    private String userId;
    private String content;
    private String parentCommentId;
    private int likeCount;
    private boolean isDeleted;
    private Date createAt;
    private Date updateAt;
    private User user;

    public Comment(){}

    public Comment(String commentId, Date updateAt, Date createAt, boolean isDeleted, int likeCount, String parentCommentId, String content, String userId, String postId, User user) {
        this.commentId = commentId;
        this.updateAt = updateAt;
        this.createAt = createAt;
        this.isDeleted = isDeleted;
        this.likeCount = likeCount;
        this.parentCommentId = parentCommentId;
        this.content = content;
        this.userId = userId;
        this.postId = postId;
        this.user = user;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(String parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
