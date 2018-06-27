package com.example.devde.imageaudio;

import android.media.MediaDataSource;
import android.media.MediaPlayer;

public class Dataprovider {
    private int image;


    public Dataprovider(int image) {
        this.image = image;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
