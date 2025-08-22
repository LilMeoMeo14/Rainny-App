package com.example.rainnyapp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String userId;
    private String username;
    private String email;
    private String profilePic;
    private String bio;
    private int followerCount;
    private int followingCount;
    private int postCount;
    private Date creatAt; // thoi gian tao tai khoan
    private Date updateAt; // thoi gian cap nhat cuoi cung
    private Date birthDay;
    private List<String> followers;
    private List<String> following;

    // ham khoi tao
    public User(){}

    // ham khoi tao co tham so
    public User(String userId,String username,String email, String profilePic, String bio, Date creatAt,Date birthDay){
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.profilePic = profilePic;
        this.bio = bio;
        this.creatAt= creatAt != null ? creatAt : new Date();

        this.followerCount = 0;
        this.followingCount = 0;
        this.postCount = 0;
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }

    // getter & getter

    public String getUserid() {
        return userId;
    }

    public void setUserid(String userid) {
        this.userId = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getFollowing() {
        return following;
    }

    public void setFollowing(List<String> following) {
        this.following = following;
    }

    public List<String> getFollowers() {
        return followers;
    }

    public void setFollowers(List<String> followers) {
        this.followers = followers;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
