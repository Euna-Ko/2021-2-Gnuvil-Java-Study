package com.gnuvil_practice_ko.class_6.model;

public class PostItem {

    boolean isUserLike;

    int postLikeCount;

    String userName;
    String postImgUrl;
    String postText;


    public PostItem(boolean isUserLike, int postLikeCount, String userName, String pstImgUrl, String postText) {
        this.isUserLike = isUserLike;
        this.postLikeCount = postLikeCount;
        this.userName = userName;
        this.postImgUrl = postImgUrl;
        this.postText = postText;
    }

    public boolean isUserLike() {
        return isUserLike;
    }

    public int getPostLikeCount() {
        return postLikeCount;
    }

    public String getUserName() {
        return userName;
    }

    public String getPostImgUrl() {
        return postImgUrl;
    }

    public String getPostText() {
        return postText;
    }
}
