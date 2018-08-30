package com.example.android.musicapp;

/**
 * Created by Jusutech on 8/7/2018.
 */

public class Word {
    private String mSongTitle;
    private String mSongArtist;

    public Word(String mSongTitle, String mSongArtist) {
        this.mSongTitle = mSongTitle;
        this.mSongArtist = mSongArtist;
    }

    public String getmSongTitle() {
        return mSongTitle;
    }

    public String getmSongArtist() {
        return mSongArtist;
    }
}
