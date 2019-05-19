package com.gzd.example.provinggrounds.view.fragment.main;
import com.gzd.example.provinggrounds.R;
import com.gzd.example.provinggrounds.base.BaseFragment;
import com.gzd.example.provinggrounds.databinding.FragmentMainBinding;

/**
 * Created by gzd on 2019/5/20 0020
 */
public class MainFragment extends BaseFragment<MainViewModel, FragmentMainBinding>{

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    protected MainViewModel getViewModel() {
        return new MainViewModel(context);
    }

    @Override
    protected void bindViewModel(FragmentMainBinding binding, MainViewModel viewModel) {
        binding.setMainViewModel(viewModel);
    }
}
