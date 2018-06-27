package com.xuanyi.rxt.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xuanyi.rxt.R;
import com.xuanyi.rxt.entity.PhoneWayInfo;
import com.xuanyi.rxt.entity.WayInfo;

import java.util.List;

/**
 *
 */

public class CardPhoneAdapter extends BaseQuickAdapter<PhoneWayInfo> {

    public CardPhoneAdapter(List<PhoneWayInfo> data) {
        super(R.layout.item_card_phone, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, PhoneWayInfo item) {
        helper.setText(R.id.name_tv,item.name);
        helper.setImageResource(R.id.sign_iv,item.iconId);
        helper.setText(R.id.phone_tv,item.tel);
    }
}
