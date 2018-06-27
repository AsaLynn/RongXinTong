package com.xuanyi.rxt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xuanyi.rxt.adapter.WayLatestCutAdapter;
import com.xuanyi.rxt.adapter.WayNetLoanAdapter;
import com.xuanyi.rxt.base.BaseRvActivity;
import com.xuanyi.rxt.constant.RxtCT;
import com.xuanyi.rxt.entity.WayNetLoanInfo;
import com.zxning.library.tool.UIUtils;

import java.util.ArrayList;

public class Way2LatestCutActivity extends BaseRvActivity {

    private ArrayList<WayNetLoanInfo> infos;
    int[] mIconId = {
            R.mipmap.chesudai,R.mipmap.daikuanwang,R.mipmap.duoduolidai,R.mipmap.fenqile,R.mipmap.haochedai,
            R.mipmap.haoyoudai,R.mipmap.hengdayidai,R.mipmap.jinhaidai,R.mipmap.jiujiudai,R.mipmap.kaixindai,
            R.mipmap.kuaikuaidai,R.mipmap.kuaixindai,R.mipmap.leledai,R.mipmap.lubanfu,R.mipmap.lujinsuo,
            R.mipmap.mingxiaodai,R.mipmap.minxindai,R.mipmap.niwodai,R.mipmap.paipaidai,R.mipmap.qinqinxiaodai,
            R.mipmap.qudian,R.mipmap.renrenjucai,R.mipmap.rongtuedai,R.mipmap.ruyidai,R.mipmap.wangdaizhijia,
            R.mipmap.wenzhoudai,R.mipmap.woaika,R.mipmap.wodedai,R.mipmap.xianjinbashi,R.mipmap.yilongdai,
            R.mipmap.yirendai,R.mipmap.yizhengdai,R.mipmap.youfenqi,R.mipmap.yourendai,R.mipmap.zhangliandai,
            R.mipmap.zhaolianhaoqidai,R.mipmap.zhaoshangdai,R.mipmap.zhijiandai,R.mipmap.zhuliudai
    };
    @Override
    protected BaseQuickAdapter getBaseQuickAdapter() {
        infos = new ArrayList<>();
        String[] names = UIUtils.getStringArray(R.array.latest_cut_names);
        String[] urls = UIUtils.getStringArray(R.array.latest_cut_urls);
        for (int i = 0; i < names.length; i++) {
            WayNetLoanInfo info = new WayNetLoanInfo();
            info.name = names[i];
            info.iconId = mIconId[i];
            info.url = urls[i];
            infos.add(info);
        }
        return new WayLatestCutAdapter(infos);
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
