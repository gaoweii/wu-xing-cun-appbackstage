package com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList;

import com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.backgroundcolor.BackgroundColor;


public class CarouselList {

    private String[] images;
    private BackgroundColor[] backgroundColors;

    public BackgroundColor[] getBackgroundColors() {
        return backgroundColors;
    }

    public void setBackgroundColors(BackgroundColor[] backgroundColors) {
        this.backgroundColors = backgroundColors;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }
}
