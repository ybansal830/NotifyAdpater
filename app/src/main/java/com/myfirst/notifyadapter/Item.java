package com.myfirst.notifyadapter;

import android.graphics.drawable.Drawable;

public class Item {
    private String text;
    private int textColor;
    private Drawable background;
    private Boolean isBoolean;

    public Item(String text, int textColor, Drawable background, Boolean isBoolean) {
        this.text = text;
        this.textColor = textColor;
        this.background = background;
        this.isBoolean = isBoolean;
    }

    public String getText() {
        return text;
    }

    public int getTextColor() {
        return textColor;
    }

    public Drawable getBackground() {
        return background;
    }

    public Boolean getBoolean() {
        return isBoolean;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public void setBackground(Drawable background) {
        this.background = background;
    }

    public void setBoolean(Boolean aBoolean) {
        isBoolean = aBoolean;
    }
}
