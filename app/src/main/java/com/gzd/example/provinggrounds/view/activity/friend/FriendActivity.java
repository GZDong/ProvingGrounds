package com.gzd.example.provinggrounds.view.activity.friend;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.gzd.example.provinggrounds.R;
import com.gzd.example.provinggrounds.base.BaseActivity;
import com.gzd.example.provinggrounds.databinding.ActivityFriendBinding;
import com.gzd.example.provinggrounds.view.fragment.friend.FriendFragment;

/**
 * Created by gzd on 2019/5/21 0021
 */
public class FriendActivity extends BaseActivity<FriendViewModel, ActivityFriendBinding> {
    private Fragment fragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_friend;
    }

    @Override
    protected FriendViewModel getViewModel() {
        return new FriendViewModel(this);
    }

    @Override
    protected void bindViewModel(ActivityFriendBinding binding, FriendViewModel viewModel) {
        binding.setFriendViewModel(viewModel);
    }

    private void initFragment() {
        fragment = getSupportFragmentManager().findFragmentById(R.id.flTemplateContainer);
        if (fragment == null) {
            fragment = new FriendFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.setTransition(FragmentTransaction.TRANSIT_NONE);
            ft.replace(R.id.flTemplateContainer, fragment);
            ft.commitAllowingStateLoss();
        }
    }
}
