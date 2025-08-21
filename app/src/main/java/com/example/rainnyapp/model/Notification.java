package com.example.rainnyapp.model;

import java.util.Date;

public class Notification {
    private String notificationId;
    private String userId;
    private String actorId;
    private String type;
    private String postId;
    private String commentId;
    private boolean isRead;
    private Date createAt;

    // constructor
    public Notification(){}

    public Notification(String notificationId, String userId, String actorId, String type, String postId, String commentId, boolean isRead, Date createAt) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.actorId = actorId;
        this.type = type;
        this.postId = postId;
        this.commentId = commentId;
        this.isRead = isRead;
        this.createAt = createAt;
    }

    //setter & getter


    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
