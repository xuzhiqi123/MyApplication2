package com.balala.yaofun.httpUtils;

import android.app.Application;

public class MyApp extends Application {
    private static MyApp myApp;

    @Override
    public void onCreate() {
        super.onCreate();
        myApp=this;
    }

    public static MyApp getInstance() {
        return myApp;
    }
}