package com.unioncub.tiempojoven;

import android.app.Application;
import android.content.res.Resources;

import java.sql.ResultSet;

public class MyApplication extends Application {
    protected static MyApplication instance;
    @Override
    public void onCreate(){

        super.onCreate();
        instance=this;

    }

    public static Resources getRes(){
        return instance.getResources();
    }
}
