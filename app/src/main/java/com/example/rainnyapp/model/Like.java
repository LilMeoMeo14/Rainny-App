package com.example.rainnyapp.model;

import java.util.Date;

public class Like {
    private String likeId;
    private String userId;
    private String postId;
    private String commentId;
    private Date createAt;

    // constructor

    public Like(){}

    public Like(String likeId, String userId, String postId, Date createAt, String commentId) {
        this.likeId = likeId;
        this.userId = userId;
        this.postId = postId;
        this.createAt = createAt;
        this.commentId = commentId;
    }

    // setter & getter
    public String getLikeId() {
        return likeId;
    }

    public void setLikeId(String likeId) {
        this.likeId = likeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
