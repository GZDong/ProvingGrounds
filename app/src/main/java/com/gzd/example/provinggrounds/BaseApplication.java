package com.gzd.example.provinggrounds;

import android.app.Application;
import android.content.Context;

/**
 * Created by gzd on 2019/5/19 0019
 */
public class BaseApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
