package com.gzd.example.provinggrounds.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.gzd.example.provinggrounds.R;
import com.gzd.example.provinggrounds.databinding.ActivityMainBinding;
import com.gzd.example.provinggrounds.model.User;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Main";
    private ActivityMainBinding binding;
    public User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("John", 20, "https://www.zybuluo.com/static/img/my_head.jpg", "Hello World");
        binding.setUser(user);
        binding.setUserPresenter(new UserPresenter());
    }

    public class UserPresenter {
        public void onUpdateIntroduce(User user) {
            Log.e(TAG, "onUpdateIntroduce: " + user.toString());
        }
    }
}
