package com.xuanyi.rxt;

import android.content.Intent;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xuanyi.rxt.adapter.WayNetLoanAdapter;
import com.xuanyi.rxt.base.BaseRvActivity;
import com.xuanyi.rxt.constant.RxtCT;
import com.xuanyi.rxt.entity.WayNetLoanInfo;
import com.zxning.library.tool.UIUtils;

import java.util.ArrayList;

public class Way3QueryProgressActivity extends BaseRvActivity {

    private ArrayList<WayNetLoanInfo> infos;
    protected int[] mIconId = {
            R.mipmap.card_fast14,
            R.mipmap.card_fast6,
            R.mipmap.card_fast9,
            R.mipmap.card_fast15,
            R.mipmap.card_fast11,
            R.mipmap.card_fast7,
            R.mipmap.card_fast0,
            R.mipmap.card_fast12,
            R.mipmap.card__fast_huaqi,
            R.mipmap.card_huaxia,
            R.mipmap.card_fast2,
            R.mipmap.card_fast_minsheng,
            R.mipmap.card_fast16,
            R.mipmap.card_fast1,
            R.mipmap.card_fast3,
            /*R.mipmap.card_fast_shanghai,*/
            R.mipmap.card_fast5,
            R.mipmap.card_fast_zhada,
            R.mipmap.card_fast8,
            R.mipmap.card__fast_youzheng
    };

    @Override
    protected BaseQuickAdapter getBaseQuickAdapter() {
        infos = new ArrayList<>();
        String[] names = UIUtils.getStringArray(R.array.query_progress_names);
        String[] urls = UIUtils.getStringArray(R.array.query_progress_urls);
        for (int i = 0; i < names.length; i++) {
            WayNetLoanInfo info = new WayNetLoanInfo();
            info.name = names[i];
            info.iconId = mIconId[i];
            info.url = urls[i];
            infos.add(info);
        }
        return new WayNetLoanAdapter(infos);
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent();
        intent.setClass(this, BankNormalActivity.class);
        intent.putExtra(RxtCT.RI.CARD_URL,infos.get(position).url);
        intent.putExtra(RxtCT.RI.RXT_IT,infos.get(position).name);
        startActivity(intent);
    }
}
