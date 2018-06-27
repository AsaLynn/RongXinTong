package com.xuanyi.rxt.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 *
 */

public abstract class BaseFragment extends Fragment implements View.OnClickListener {
    private String title;
    private int iconId;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return BaseFragment.this.onCreateSuccessedView();
    }

    //BaseFragment中依然是不知道子界面的展示效果,所以抽象,让其放到子类中去处理
    protected abstract View onCreateSuccessedView();

    @Override
    public void setMenuVisibility(boolean menuVisible) {

        //如果当前view是可见的,则menuVisible就是true
        //每一个子类fragment对应view是否存在的操作
        if (getView() != null) {
            getView().setVisibility(menuVisible ? View.VISIBLE : View.GONE);
        }
        super.setMenuVisibility(menuVisible);
    }

    public void startAty(Intent intent, boolean isFinish) {
        this.startActivity(intent);
        if (isFinish) {
            this.getActivity().finish();
        }
    }


    @Override
    public void onClick(View v) {
    }

}
