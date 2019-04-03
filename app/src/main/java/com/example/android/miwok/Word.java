package com.example.android.miwok;

public class Word {
    //The default translated word
    private String mDefaultTranslation;

    //the Miwok translated word
    private String mMiwokTranslation;

    //The Resource ID of the image that we are gonna add
    private int mResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //The ID of the media for each list
    int mMediaId;

    //Constructor to define each word
    public Word(String defaultTranslation, String miwokTranslation, int resourceId, int mediaId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceId = resourceId;
        mMediaId = mediaId;

    }

    public Word(String defaultTranslation, String miwokTranslation, int mediaId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mMediaId = mediaId;
    }

    //To return the default translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //To return Miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //To return the resource ID of the image to be inserted
    public int getResourceId() {
        return mResourceId;
    }

    //TO return the media ID
    public int getMediaId() {
        return mMediaId;
    }

    public boolean hasImage() {
        return mResourceId != NO_IMAGE_PROVIDED;
    }

}
