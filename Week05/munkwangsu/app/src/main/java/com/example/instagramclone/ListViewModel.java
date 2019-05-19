package com.example.instagramclone;

import android.widget.ListView;

import java.util.ArrayList;

public class ListViewModel {

    int profileImg;
    String profileId;
    int contentImg;
    String contentText;
    String guestId;
    String guestContent;


    public ListViewModel(int profileImg, String profileId, int contentImg, String contentText, String guestId, String guestContent) {
        this.profileImg = profileImg;
        this.profileId = profileId;
        this.contentImg = contentImg;
        this.contentText = contentText;
        this.guestId = guestId;
        this.guestContent = guestContent;
    }

    public int getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(int profileImg) {
        this.profileImg = profileImg;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public int getContentImg() {
        return contentImg;
    }

    public void setContentImg(int contentImg) {
        this.contentImg = contentImg;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getGuestContent() {
        return guestContent;
    }

    public void setGuestContent(String guestContent) {
        this.guestContent = guestContent;
    }
}
