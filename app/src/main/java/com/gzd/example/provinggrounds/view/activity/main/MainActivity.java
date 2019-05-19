package com.gzd.example.provinggrounds.view.activity.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.gzd.example.provinggrounds.R;
import com.gzd.example.provinggrounds.base.BaseActivity;
import com.gzd.example.provinggrounds.databinding.ActivityMainBinding;
import com.gzd.example.provinggrounds.view.fragment.main.MainFragment;

public class MainActivity extends BaseActivity<MainViewModel, ActivityMainBinding> {
    private Fragment fragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFragment();
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

    private void initFragment() {
        fragment = getSupportFragmentManager().findFragmentById(R.id.flTemplateContainer);
        if (fragment == null) {
            fragment = new MainFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.setTransition(FragmentTransaction.TRANSIT_NONE);
            ft.replace(R.id.flTemplateContainer, fragment);
            ft.commitAllowingStateLoss();
        }
    }
}
