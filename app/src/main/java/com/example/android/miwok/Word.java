package com.example.android.miwok;

/**
 * Created by fedea on 12/04/2017.
 */

public class Word {

    private String MiwokTranslation;
    private String DefaultTranslation;
    private int ImageResourceId;
    private int SoundResourceId;

    public Word(String miwokTranslation, String defaultTranslation, int soundResourceId) {
        MiwokTranslation = miwokTranslation;
        DefaultTranslation = defaultTranslation;
        SoundResourceId = soundResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int soundResourceId) {
        MiwokTranslation = miwokTranslation;
        DefaultTranslation = defaultTranslation;
        ImageResourceId = imageResourceId;
        SoundResourceId = soundResourceId;
    }

    public String getMiwokTranslation() {
        return MiwokTranslation;
    }

    public String getDefaultTranslation() {
        return DefaultTranslation;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public int getSoundResourceId() {
        return SoundResourceId;
    }

    public boolean hasImage() {
        return ImageResourceId != 0;
    }
}
