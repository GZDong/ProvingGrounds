package com.gzd.example.provinggrounds.view.activity.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.gzd.example.provinggrounds.R;
import com.gzd.example.provinggrounds.base.BaseActivity;
import com.gzd.example.provinggrounds.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<MainViewModel, ActivityMainBinding> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected MainViewModel getViewModel() {
        return new MainViewModel(this);
    }

    @Override
    protected void bindViewModel(ActivityMainBinding binding, MainViewModel viewModel) {
        binding.setMainViewModel(viewModel);
    }
}
