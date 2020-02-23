package com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList;

import com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.backgroundcolor.BackgroundColor;
import org.springframework.stereotype.Component;


@Component
public class CarouselList {
    Carousel[] carousels;

    public void setCarousels(Carousel[] carousels) {
        this.carousels = carousels;
    }

    public Carousel[] getCarousels() {
        return carousels;
    }

    public void setImages(String[] images) {
        carousels[0].setImage(images[0]);
        carousels[1].setImage(images[1]);
        carousels[2].setImage(images[2]);
    }

    public void setBackgroundColors(BackgroundColor[] backgroundColors) {
        carousels[0].setBackgroundColor(backgroundColors[0]);
        carousels[1].setBackgroundColor(backgroundColors[1]);
        carousels[2].setBackgroundColor(backgroundColors[2]);
    }

}
