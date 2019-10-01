package com.moshtel.reportcrime.models;

import java.util.UUID;

public class Crime extends Object {
    private UUID mId;
    private String mTitle;

    public Crime(){

    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

}
