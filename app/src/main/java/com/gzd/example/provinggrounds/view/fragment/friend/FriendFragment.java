package com.gzd.example.provinggrounds.view.fragment.friend;

import com.gzd.example.provinggrounds.R;
import com.gzd.example.provinggrounds.base.BaseFragment;
import com.gzd.example.provinggrounds.databinding.FragmentFriendBinding;

/**
 * Created by gzd on 2019/5/21 0021
 */
public class FriendFragment extends BaseFragment<FriendViewModel, FragmentFriendBinding> {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_friend;
    }

    @Override
    protected FriendViewModel getViewModel() {
        return new FriendViewModel(context);
    }

    @Override
    protected void bindViewModel(FragmentFriendBinding binding, FriendViewModel viewModel) {
        binding.setFriendViewModel(viewModel);
    }
}
