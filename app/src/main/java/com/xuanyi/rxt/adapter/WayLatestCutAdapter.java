package com.xuanyi.rxt.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xuanyi.rxt.R;
import com.xuanyi.rxt.entity.WayNetLoanInfo;

import java.util.List;

/**
 *
 */

public class WayLatestCutAdapter extends BaseQuickAdapter<WayNetLoanInfo> {

    public WayLatestCutAdapter(List<WayNetLoanInfo> data) {
        super(R.layout.item_latest_cu, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, WayNetLoanInfo item) {
        helper.setText(R.id.name_tv,item.name);
        helper.setImageResource(R.id.sign_iv,item.iconId);
    }

}
