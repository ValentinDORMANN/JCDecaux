package fr.esilv.jcdecaux.models;

import com.google.gson.annotations.SerializedName;

class ThumbnailsBean {

    @SerializedName("default")
    private Bean defaultX;
    private Bean medium;
    private Bean high;

    public Bean getDefaultX() {
        return defaultX;
    }

    public void setDefaultX(Bean defaultX) {
        this.defaultX = defaultX;
    }

    public Bean getMedium() {
        return medium;
    }

    public void setMedium(Bean medium) {
        this.medium = medium;
    }

    public Bean getHigh() {
        return high;
    }

    public void setHigh(Bean high) {
        this.high = high;
    }
}
