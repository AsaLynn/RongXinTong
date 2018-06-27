package com.xuanyi.rxt;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xuanyi.rxt.adapter.CardGoldAdapter;
import com.xuanyi.rxt.base.BaseRvActivity;
import com.xuanyi.rxt.constant.RxtCT;
import com.xuanyi.rxt.entity.WayCardInfo;
import com.zxning.library.tool.UIUtils;

import java.util.ArrayList;
import java.util.List;

public class CardShowActivity extends BaseRvActivity {

    private List<WayCardInfo> infos;

    @Override
    protected BaseQuickAdapter getBaseQuickAdapter() {
        infos = new ArrayList<>();
        String[] names = UIUtils.getStringArray(getIntent().getIntExtra(RxtCT.RI.CARD_NAMES_ID,0));
        String[] dess = UIUtils.getStringArray(getIntent().getIntExtra(RxtCT.RI.CARD_DESS_ID,0));
        int[] iconIds = getIntent().getIntArrayExtra(RxtCT.RI.CARD_IV_IDSS);
        String[] urls = UIUtils.getStringArray(getIntent().getIntExtra(RxtCT.RI.CARD_URLS_ID,0));

        for (int i = 0; i < iconIds.length; i++) {
            Log.i(TAG,"---##"+iconIds[i]);
        }
        for (int i = 0; i < names.length; i++) {
            WayCardInfo info = new WayCardInfo();
            info.name = names[i];
            info.des = dess[i];
            info.iconId = iconIds[i];
            info.url = urls[i];
            Log.i(TAG,"url---"+info.url);
            infos.add(info);
        }
        return new CardGoldAdapter(infos);
    }

    @Override
    protected void initContentView() {
        super.initContentView();
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent();
        intent.setClass(this, BankNormalActivity.class);
        intent.putExtra(RxtCT.RI.CARD_URL,infos.get(position).url);
        intent.putExtra(RxtCT.RI.RXT_IT,RxtCT.RT.CARD_APPLY);
        startActivity(intent);
    }
}
