package com.xuanyi.rxt;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xuanyi.rxt.adapter.CardPhoneAdapter;
import com.xuanyi.rxt.base.BaseRvActivity;
import com.xuanyi.rxt.entity.PhoneWayInfo;
import com.zxning.library.tool.UIUtils;

import java.util.ArrayList;
import java.util.List;

public class Way5BankTelActivity extends BaseRvActivity {

    protected int[] ids = {R.mipmap.card_fast2,
            R.mipmap.card_fast7,
            R.mipmap.card_fast15,
            R.mipmap.card_fast1,
            R.mipmap.card_fast16,
            R.mipmap.card_huaxia,
            R.mipmap.card_fast9,
            R.mipmap.card_fast3,
            R.mipmap.card_fast12,
            R.mipmap.card_fast14,
            R.mipmap.card_fast_minsheng,
            R.mipmap.card_fast0,
            R.mipmap.card_fast11,
            R.mipmap.card_fast6,
            R.mipmap.card_fast6,
            R.mipmap.card_fast6,
            R.mipmap.card_fast6,
    };

    @Override
    protected BaseQuickAdapter getBaseQuickAdapter() {
        List<PhoneWayInfo> infos =  new ArrayList<>();
        String[] names = UIUtils.getStringArray(R.array.card_phone_names);
        String[] tel = UIUtils.getStringArray(R.array.card_phones);
        for (int i = 0; i < names.length; i++) {
            PhoneWayInfo info = new PhoneWayInfo();
            info.name = names[i];
            info.tel = tel[i];
            info.iconId = ids[i];
            infos.add(info);
        }
        return new CardPhoneAdapter(infos);
    }
}
