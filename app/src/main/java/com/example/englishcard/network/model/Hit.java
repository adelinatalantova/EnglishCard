
package com.example.englishcard.network.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Hit  {

    @SerializedName("id")
    private Integer id;
    @SerializedName("pageURL")
    private String pageURL;
    @SerializedName("type")
    private String type;
    @SerializedName("tags")
    private String tags;
    @SerializedName("previewURL")
    private String previewURL;
    @SerializedName("previewWidth")
    private Integer previewWidth;
    @SerializedName("previewHeight")
    private Integer previewHeight;
    @SerializedName("webformatURL")
    private String webFormatURL;
    @SerializedName("webformatWidth")
    private Integer webFormatWidth;
    @SerializedName("webformatHeight")
    private Integer webFormatHeight;
    @SerializedName("largeImageURL")
    private String largeImageURL;
    @SerializedName("imageWidth")
    private Integer imageWidth;
    @SerializedName("imageHeight")
    private Integer imageHeight;
    @SerializedName("imageSize")
    private Integer imageSize;
    @SerializedName("views")
    private Integer views;
    @SerializedName("downloads")
    private Integer downloads;
    @SerializedName("collections")
    private Integer collections;
    @SerializedName("likes")
    private Integer likes;
    @SerializedName("comments")
    private Integer comments;
    @SerializedName("user_id")
    private Integer userId;
    @SerializedName("user")
    private String user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void setPageURL(String pageURL) {
        this.pageURL = pageURL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    public Integer getPreviewWidth() {
        return previewWidth;
    }

    public void setPreviewWidth(Integer previewWidth) {
        this.previewWidth = previewWidth;
    }

    public Integer getPreviewHeight() {
        return previewHeight;
    }

    public void setPreviewHeight(Integer previewHeight) {
        this.previewHeight = previewHeight;
    }

    public String getWebFormatURL() {
        return webFormatURL;
    }

    public void setWebFormatURL(String webFormatURL) {
        this.webFormatURL = webFormatURL;
    }

    public Integer getWebFormatWidth() {
        return webFormatWidth;
    }

    public void setWebFormatWidth(Integer webFormatWidth) {
        this.webFormatWidth = webFormatWidth;
    }

    public Integer getWebFormatHeight() {
        return webFormatHeight;
    }

    public void setWebFormatHeight(Integer webFormatHeight) {
        this.webFormatHeight = webFormatHeight;
    }

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    public Integer getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    public Integer getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    public Integer getImageSize() {
        return imageSize;
    }

    public void setImageSize(Integer imageSize) {
        this.imageSize = imageSize;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Integer getCollections() {
        return collections;
    }

    public void setCollections(Integer collections) {
        this.collections = collections;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserImageURL() {
        return userImageURL;
    }

    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }

    @SerializedName("userImageURL")
    private String userImageURL;

}
