package com.xuanyi.rxt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xuanyi.rxt.adapter.CardFastAdapter;
import com.xuanyi.rxt.adapter.WayNetLoanAdapter;
import com.xuanyi.rxt.base.BaseRvActivity;
import com.xuanyi.rxt.constant.RxtCT;
import com.xuanyi.rxt.entity.WayBankInfo;
import com.xuanyi.rxt.entity.WayInfo;
import com.xuanyi.rxt.entity.WayNetLoanInfo;
import com.zxning.library.tool.UIUtils;

import java.util.ArrayList;

public class Way1NetLoanActivity extends BaseRvActivity {

    private ArrayList<WayNetLoanInfo> infos;

    @Override
    protected BaseQuickAdapter getBaseQuickAdapter() {
        infos = new ArrayList<>();
        String[] names = UIUtils.getStringArray(R.array.net_loan_names);
        String[] urls = UIUtils.getStringArray(R.array.net_loan_urls);
        for (int i = 0; i < names.length; i++) {
            WayNetLoanInfo info = new WayNetLoanInfo();
            info.name = names[i];
            info.iconId = R.mipmap.ic_item_net_loan;
            info.url = urls[i];
            infos.add(info);
        }
        return new WayNetLoanAdapter(infos);
    }

    @Override
    protected void initContentView() {
        super.initContentView();
        //initTitleTv(true,"网络贷款");
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
