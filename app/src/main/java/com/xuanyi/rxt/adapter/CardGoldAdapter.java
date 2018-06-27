package com.xuanyi.rxt.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xuanyi.rxt.R;
import com.xuanyi.rxt.entity.WayCardInfo;

import java.util.List;

/**
 *
 */

public class CardGoldAdapter extends BaseQuickAdapter<WayCardInfo> {

    public CardGoldAdapter(List<WayCardInfo> data) {
        super(R.layout.item_card_gold, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, WayCardInfo item) {
        helper.setText(R.id.name_tv, item.name)
                .setText(R.id.des_tv, item.des)
                .setImageResource(R.id.sign_iv, item.iconId);
    }
}
