package com.xuanyi.rxt;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.xuanyi.rxt.base.BaseActivity;
import com.xuanyi.rxt.fragment.FriendsFragment;
import com.xuanyi.rxt.fragment.HomeFragment;
import com.xuanyi.rxt.fragment.LearnFragment;
import com.xuanyi.rxt.view.NestRadioGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity {

    @BindView(R.id.content_fl)
    FrameLayout content_fl;
    @BindView(R.id.radiogroup)
    NestRadioGroup mGroup;
    private int index;
    private final String[] tabNames = new String[]{"首页", "朋友圈", "系统学习"};
    private List<Fragment> fragments;
    NestRadioGroup.OnCheckedChangeListener myCheckChangeListener = new NestRadioGroup.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(NestRadioGroup group, int checkedId) {

            switch (checkedId) {
                case R.id.rb_home_page:
                    index = 0;
                    break;
                case R.id.rb_net:
                    //index = 1;
                    mGroup.check(R.id.rb_home_page);//选中首页.
                    break;
                case R.id.rb_comprehensive:
                    //index = 2;
                    mGroup.check(R.id.rb_home_page);//选中首页.
                    break;
            }

            Fragment fragment = (Fragment) fragmentStatePagerAdapter.instantiateItem(content_fl, index);
            //替换方法3,需要去替换的fragment对象
            fragmentStatePagerAdapter.setPrimaryItem(null, 0, fragment);
            //提交操作
            fragmentStatePagerAdapter.finishUpdate(null);

        }
    };

    @Override
    protected void initContentView() {
        initTitleIv(false, R.mipmap.ic_home_title);
        mGroup.setOnCheckedChangeListener(myCheckChangeListener);
        fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new FriendsFragment());
        fragments.add(new LearnFragment());
        mGroup.check(R.id.rb_home_page);
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_home;
    }

    //创建fragment的数据适配器
    FragmentStatePagerAdapter fragmentStatePagerAdapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {

        @Override
        public int getCount() {
            return tabNames.length;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = fragments.get(position);
            return fragment;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            return super.instantiateItem(container, position);
        }
    };
}
