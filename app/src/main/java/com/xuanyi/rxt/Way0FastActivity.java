package com.xuanyi.rxt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.viewpager.cycle.bean.ADInfo;
import com.viewpager.cycle.ui.CycleViewPager;
import com.viewpager.cycle.utils.ViewFactory;
import com.xuanyi.rxt.base.BaseActivity;
import com.xuanyi.rxt.constant.RxtCT;

import java.util.ArrayList;
import java.util.List;

public class Way0FastActivity extends BaseActivity {

    private List<ImageView> views = new ArrayList<ImageView>();
    private List<ADInfo> infos = new ArrayList<ADInfo>();
    private CycleViewPager cycleViewPager;

    private int[] vpDrawIds = {
            R.drawable.iv_way_fast0, R.drawable.iv_way_fast1
    };

    private String[] imageUrls = {"http://img.taodiantong.cn/v55183/infoimg/2013-07/130720115322ky.jpg",
            "http://pic30.nipic.com/20130626/8174275_085522448172_2.jpg",
            "http://pic18.nipic.com/20111215/577405_080531548148_2.jpg",
            "http://pic15.nipic.com/20110722/2912365_092519919000_2.jpg",
            "http://pic.58pic.com/58pic/12/64/27/55U58PICrdX.jpg"};

    @Override
    protected int getContentViewId() {
        return R.layout.activity_hand;
    }

    @Override
    protected void initContentView() {
        //initTitleTv(true,"快速通道");
        super.initContentView();
        int[] ids = {R.id.card0_rv, R.id.card1_rv, R.id.card2_rv, R.id.card3_rv};
        for (int i = 0; i < ids.length; i++) {
            findViewById(ids[i]).setOnClickListener(this);
        }
        //configImageLoader();
        initialize();
    }

    @SuppressLint("NewApi")
    private void initialize() {

        cycleViewPager = (CycleViewPager) getFragmentManager()
                .findFragmentById(R.id.fragment_cycle_viewpager_content);

//        for (int i = 0; i < imageUrls.length; i++) {
//            ADInfo info = new ADInfo();
//            info.setUrl(imageUrls[i]);
//            info.setContent("图片-->" + i);
//            infos.add(info);
//        }

        for (int i = 0; i < vpDrawIds.length; i++) {
            ADInfo info = new ADInfo();
            info.setUrl(vpDrawIds[i] + "---");
            info.setContent("图片-->" + i);
            info.setVpIconId(vpDrawIds[i]);
            infos.add(info);
        }

        // 将最后一个ImageView添加进来
//        views.add(ViewFactory.getImageView(this, infos.get(infos.size() - 1).getUrl()));
        views.add(ViewFactory.displayFromDrawable(this, infos.get(infos.size() - 1).getVpIconId()));
//        for (int i = 0; i < infos.size(); i++) {
//            views.add(ViewFactory.getImageView(this, infos.get(i).getUrl()));
//        }
        for (int i = 0; i < infos.size(); i++) {
            views.add(ViewFactory.displayFromDrawable(this, infos.get(i).getVpIconId()));
        }
        // 将第一个ImageView添加进来
//        views.add(ViewFactory.getImageView(this, infos.get(0).getUrl()));
         views.add(ViewFactory.displayFromDrawable(this, infos.get(0).getVpIconId()));

        // 设置循环，在调用setData方法前调用
        cycleViewPager.setCycle(true);

        // 在加载数据前设置是否循环
        cycleViewPager.setData(views, infos, mAdCycleViewListener);
        //设置轮播
        cycleViewPager.setWheel(true);

        // 设置轮播时间，默认5000ms
        cycleViewPager.setTime(4000);
        //设置圆点指示图标组居中显示，默认靠右
        cycleViewPager.setIndicatorCenter();
    }

    private CycleViewPager.ImageCycleViewListener mAdCycleViewListener = new CycleViewPager.ImageCycleViewListener() {

        @Override
        public void onImageClick(ADInfo info, int position, View imageView) {
            if (cycleViewPager.isCycle()) {
                position = position - 1;
//                Toast.makeText(Way0FastActivity.this,
//                        "position-->" + info.getContent(), Toast.LENGTH_SHORT)
//                        .show();
            }
        }
    };

    @Override
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.card0_rv:
                startFast();
                break;
            case R.id.card1_rv:
                startCardGold();
                break;
            case R.id.card2_rv:
                startTrip();
                break;
            case R.id.card3_rv:
                startShopping();
                break;
        }
    }

    private void startShopping() {
        Intent intent = new Intent();
        intent.setClass(this, Card3ShoppingActivity.class);
        intent.putExtra(RxtCT.RI.RXT_IT, RxtCT.RT.CARD_SHOPPING);
        startActivity(intent);
    }

    private void startTrip() {
        Intent intent = new Intent();
        intent.setClass(this, Card2TripActivity.class);
        intent.putExtra(RxtCT.RI.RXT_IT, RxtCT.RT.CARD_TRIP);
        startActivity(intent);
    }

    private void startFast() {
        Intent intent = new Intent();
        intent.setClass(this, Card0FastActivity.class);
        intent.putExtra(RxtCT.RI.RXT_IT, RxtCT.RT.CARD_FAST);
        startActivity(intent);
    }

    private void startCardGold() {
        Intent intent = new Intent();
        intent.setClass(this, Card1GoldActivity.class);
        intent.putExtra(RxtCT.RI.RXT_IT, RxtCT.RT.CARD_GOLD);
        startActivity(intent);
    }
}
