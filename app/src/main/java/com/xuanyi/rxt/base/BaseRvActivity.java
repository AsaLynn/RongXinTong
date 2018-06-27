package com.xuanyi.rxt.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xuanyi.rxt.R;
import com.xuanyi.rxt.adapter.CardFastAdapter;
import com.xuanyi.rxt.entity.WayInfo;
import com.zxning.library.tool.UIUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 列表基类
 */

public abstract class BaseRvActivity extends BaseActivity implements BaseQuickAdapter.OnRecyclerViewItemClickListener{

    protected RecyclerView rv;

    protected abstract BaseQuickAdapter getBaseQuickAdapter();

    @Override
    public void onItemClick(View view, int position) {

    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_card_fast;
    }

    @Override
    protected void initContentView() {
        super.initContentView();
        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);
        BaseQuickAdapter mAdapter = getBaseQuickAdapter();
        mAdapter.setOnRecyclerViewItemClickListener(this);
        rv.setAdapter(mAdapter);
    }
}
