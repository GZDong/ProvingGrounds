package com.gzd.example.provinggrounds.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by gzd on 2019/5/20 0020
 */
public class BaseApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getmContext() {
        return mContext;
    }
}
