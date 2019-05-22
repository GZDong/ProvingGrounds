package com.gzd.example.provinggrounds.view.activity.main;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.gzd.example.provinggrounds.base.ViewModel;
import com.gzd.example.provinggrounds.view.activity.friend.FriendActivity;

/**
 * Created by gzd on 2019/5/20 0020
 */
public class MainViewModel extends ViewModel {
    private Context mContext;

    public MainViewModel(Context context) {
        mContext = context;
    }

    public void onClick(View view){
        Intent intent = new Intent(mContext, FriendActivity.class);
        mContext.startActivity(intent);
    }
}
