package com.gzd.example.provinggrounds.base;

import android.app.Activity;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gzd on 2019/5/19 0019
 */
public abstract class BaseFragment<VM extends ViewModel, D extends ViewDataBinding> extends Fragment {

    protected Activity activity;
    protected Context context;
    protected VM viewModel;
    protected D binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = getContext();
        bindView(inflater, container);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        activity = getActivity();
    }

    protected void bindView(LayoutInflater inflater, ViewGroup container) {
        if (binding == null) {
            binding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false);
            viewModel = getViewModel();
            bindViewModel(binding, viewModel);
        }
    }

    protected abstract @LayoutRes int getLayoutId();

    protected abstract VM getViewModel();

    protected abstract void bindViewModel(D binding, VM viewModel);

    @Override
    public void onResume() {
        super.onResume();
        if (viewModel != null) {
            viewModel.onResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (viewModel != null) {
            viewModel.onPause();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (viewModel != null) {
            viewModel.onDestroy();
            viewModel = null;
        }
    }
}
