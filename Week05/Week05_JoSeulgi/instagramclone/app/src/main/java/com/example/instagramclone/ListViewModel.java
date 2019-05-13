package com.example.instagramclone;

public class ListViewModel {
    int profileImg;
    String profileId;
    int contentImg;
    String contentText;
    String guestId;
    String guestContent;

    public int getProfileImg() {
        return profileImg;
    }

    public String getProfileId() {
        return profileId;
    }

    public int getContentImg() {
        return contentImg;
    }

    public String getContentText() {
        return contentText;
    }

    public String getGuestId() {
        return guestId;
    }

    public String getGuestContent() {
        return guestContent;
    }

    public ListViewModel(int profileImg, String profileId, int contentImg, String contentText, String guestId, String guestContent) {
        this.profileImg = profileImg;
        this.profileId = profileId;
        this.contentImg = contentImg;
        this.contentText = contentText;
        this.guestId = guestId;
        this.guestContent = guestContent;
    }
}
