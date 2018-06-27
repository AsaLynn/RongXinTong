package com.xuanyi.rxt.adapter;

import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xuanyi.rxt.R;
import com.xuanyi.rxt.entity.WayNetLoanInfo;

import java.util.List;

/**
 *
 */

public class WayNetLoanAdapter extends BaseQuickAdapter<WayNetLoanInfo> {

    public WayNetLoanAdapter(List<WayNetLoanInfo> data) {
        super(R.layout.item_card_fast, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, WayNetLoanInfo item) {
        helper.setText(R.id.name_tv,item.name);
        helper.setImageResource(R.id.sign_iv,item.iconId);
    }

}
