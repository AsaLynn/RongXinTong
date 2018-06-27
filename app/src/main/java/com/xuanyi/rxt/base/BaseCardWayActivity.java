package com.xuanyi.rxt.base;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xuanyi.rxt.CardShowActivity;
import com.xuanyi.rxt.R;
import com.xuanyi.rxt.adapter.CardFastAdapter;
import com.xuanyi.rxt.constant.RxtCT;
import com.xuanyi.rxt.entity.WayBankInfo;
import com.zxning.library.tool.UIUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/4.
 */

public abstract class BaseCardWayActivity extends BaseRvActivity {

    protected int[] ids = {
            R.mipmap.card_fast0,
            R.mipmap.card_fast1
            ,R.mipmap.card_fast2,
            R.mipmap.card_fast3,
            R.mipmap.card_fast4,
            R.mipmap.card_fast5,
            R.mipmap.card_fast6,
            R.mipmap.card_fast7,
            R.mipmap.card_fast8,
            R.mipmap.card_fast9,
          /*  R.mipmap.card_fast_minsheng,*/
            R.mipmap.card_fast11,
            R.mipmap.card_fast12,
            R.mipmap.card_fast_shanghai,
            R.mipmap.card_fast14,
            R.mipmap.card_fast15,
            R.mipmap.card_fast16,
            R.mipmap.card_huaxia,
            R.mipmap.card_fast_zhada,
            R.mipmap.card__fast_huaqi,
            R.mipmap.card__fast_youzheng
    };
    protected List<WayBankInfo> infos;


    @Override
    protected BaseQuickAdapter getBaseQuickAdapter() {
        infos = new ArrayList<>();
        String[] names = UIUtils.getStringArray( getCardWayNamesId());
        int[][] mCardIvIdss = getCardIvIdss();
        for (int i = 0; i < mCardIvIdss.length; i++) {
            for (int j = 0; j < mCardIvIdss[i].length; j++) {
                Log.i(TAG,"---*"+mCardIvIdss[i][j]);
            }

        }
        int[] mCardDessId = getCardDessId();
        int[] mCardNamesId = getCardNamesId();
        int[] mCardUrlsId = getCardUrlsId();
        //String[] urls = UIUtils.getStringArray(R.array.card_fast_way_urls);
        for (int i = 0; i < names.length; i++) {
            WayBankInfo info = new WayBankInfo();
            info.name = names[i];
            info.iconId = ids[i];
            info.cardNamesId = mCardNamesId[i];
            info.cardDessId = mCardDessId[i];
            info.cardUrlsId = mCardUrlsId[i];
            info.cardIconIds = mCardIvIdss[i];
            for (int j = 0; j < info.cardIconIds.length; j++) {
                Log.i(TAG,"---**"+info.cardIconIds[j]);
            }
            infos.add(info);
        }
        return new CardFastAdapter(infos);
    }

    protected abstract int getCardWayNamesId();

    protected abstract int[] getCardUrlsId();

    protected abstract int[] getCardNamesId();

    protected abstract int[] getCardDessId();

    protected abstract int[][] getCardIvIdss();

    @Override
    protected void initContentView() {
        initTitleTv(true, this.getIntent().getStringExtra(RxtCT.RI.RXT_IT));
        super.initContentView();
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent();
        intent.setClass(this, CardShowActivity.class);
        intent.putExtra(RxtCT.RI.RXT_IT, infos.get(position).name);
        intent.putExtra(RxtCT.RI.CARD_NAMES_ID, infos.get(position).cardNamesId);
        intent.putExtra(RxtCT.RI.CARD_DESS_ID, infos.get(position).cardDessId);
        intent.putExtra(RxtCT.RI.CARD_IV_IDSS,infos.get(position).cardIconIds);
        intent.putExtra(RxtCT.RI.CARD_URLS_ID,infos.get(position).cardUrlsId);
        startActivity(intent);
    }
}
