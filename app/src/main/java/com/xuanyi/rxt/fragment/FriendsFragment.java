package com.xuanyi.rxt.fragment;

import android.view.View;
import android.widget.TextView;

import com.xuanyi.rxt.base.BaseFragment;

/**
 * Created by Administrator on 2016/10/3.
 */

public class FriendsFragment extends BaseFragment {
    @Override
    protected View onCreateSuccessedView() {
        TextView view = new TextView(getActivity());
        view.setText("2222222");
        return view;
    }
}
