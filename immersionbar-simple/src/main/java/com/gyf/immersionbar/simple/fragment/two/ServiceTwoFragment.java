package com.gyf.immersionbar.simple.fragment.two;

import com.gyf.immersionbar.ImmersionBar;
import com.gyf.immersionbar.simple.R;
import com.gyf.immersionbar.simple.fragment.BaseFragment;

/**
 * @author geyifeng
 * @date 2017/7/20
 */
public class ServiceTwoFragment extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_two_service;
    }

    @Override
    public void initImmersionBar() {
        super.initImmersionBar();
        ImmersionBar.with(this)
                .statusBarDarkFont(true, 0.2f)
                .navigationBarColor(R.color.btn2)
                .navigationBarDarkIcon(true)
                .keyboardEnable(false)
                .init();
    }
}