package com.gzd.example.provinggrounds.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by gzd on 2019/5/19 0019
 */
public abstract class BaseActivity<VM extends ViewModel, D extends ViewDataBinding> extends AppCompatActivity {
    protected VM viewModel;
    protected D binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindView();
    }

    private void bindView() {
        binding = DataBindingUtil.setContentView(this, getLayoutId());
        viewModel = getViewModel();
        bindViewModel(binding, viewModel);
    }

    protected abstract @LayoutRes int getLayoutId();

    protected abstract VM getViewModel();

    protected abstract void bindViewModel(D binding, VM viewModel);

    @Override
    protected void onResume() {
        super.onResume();
        if (viewModel != null) {
            viewModel.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (viewModel != null) {
            viewModel.onPause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (viewModel != null) {
            viewModel.onDestroy();
            viewModel = null;
        }
    }
}
