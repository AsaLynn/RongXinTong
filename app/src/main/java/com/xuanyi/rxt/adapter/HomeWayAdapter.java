package com.xuanyi.rxt.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xuanyi.rxt.R;
import com.xuanyi.rxt.entity.WayInfo;

import java.util.List;

/**
 *
 */

public class HomeWayAdapter extends BaseQuickAdapter<WayInfo> {

//    int[] ids = {R.mipmap.card_fast0,R.mipmap.card_fast1,R.mipmap.card_fast2,R.mipmap.card_fast3,R.mipmap.card_fast4,
//            R.mipmap.card_fast5,R.mipmap.card_fast6,R.mipmap.card_fast7,R.mipmap.card_fast8,R.mipmap.card_fast9,
//            R.mipmap.card_fast10,R.mipmap.card_fast11,R.mipmap.card_fast12,R.mipmap.card_fast13,R.mipmap.card_fast14,
//            R.mipmap.card_fast15,R.mipmap.card_fast16};

    public HomeWayAdapter(List<WayInfo> data) {
        super(R.layout.item_home_way, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, WayInfo item) {
        helper.setText(R.id.name_tv,item.name);
        helper.setImageResource(R.id.sign_iv,item.iconId);
    }
}
