package com.group05.photomessage;

import android.app.Application;

import com.parse.Parse;
/**
 * Created by Ma Katz on 9/19/2015.
 */
public class PhotoMessage extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "32bJqvnlw3AsCnRJFWPnnJhdKaKCGQ3enWHv3Pn7", "aExsiyuUAfjRe6bzWqcVNeIKfFcULmibSso5avQH");
    }
}
