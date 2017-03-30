package com.lovejoy.listviewtest;

/**
 * Created by lovejoy on 30/03/2017.
 */
public class Mandora {
    private String mName;
    private int mIcon;
    private float mStar;

    public Mandora(String name, int icon, float star){
        this.mName = name;
        this.mIcon = icon;
        this.mStar = star;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getIcon() {
        return mIcon;
    }

    public void setIcon(int icon) {
        this.mIcon = icon;
    }

    public float getStar() {
        return mStar;
    }

    public void setStar(float star) {
        this.mStar = star;
    }
}
