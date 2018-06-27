package com.xuanyi.rxt.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xuanyi.rxt.R;
import com.xuanyi.rxt.entity.WayBankInfo;

import java.util.List;

/**
 *
 */

public class CardFastAdapter extends BaseQuickAdapter<WayBankInfo> {

    public CardFastAdapter(List<WayBankInfo> data) {
        super(R.layout.item_card_fast, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, WayBankInfo item) {
        helper.setText(R.id.name_tv,item.name);
        helper.setImageResource(R.id.sign_iv,item.iconId);
    }
}
