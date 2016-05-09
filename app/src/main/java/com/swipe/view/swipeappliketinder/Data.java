package com.swipe.view.swipeappliketinder;

/**
 * Created by Rohit on 07-05-2016.
 */
public class Data {
    private String description;

    private String imagePath;

    public Data(String imagePath, String description) {
        this.imagePath = imagePath;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }
}
