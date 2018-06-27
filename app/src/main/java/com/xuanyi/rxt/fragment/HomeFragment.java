package com.xuanyi.rxt.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.viewpager.cycle.bean.ADInfo;
import com.viewpager.cycle.ui.CycleViewPager;
import com.viewpager.cycle.utils.ViewFactory;
import com.xuanyi.rxt.Way0FastActivity;
import com.xuanyi.rxt.Way3QueryProgressActivity;
import com.xuanyi.rxt.Way5BankTelActivity;
import com.xuanyi.rxt.R;
import com.xuanyi.rxt.Way1NetLoanActivity;
import com.xuanyi.rxt.Way2LatestCutActivity;
import com.xuanyi.rxt.adapter.HomeWayAdapter;
import com.xuanyi.rxt.base.BaseFragment;
import com.xuanyi.rxt.constant.RxtCT;
import com.xuanyi.rxt.entity.WayInfo;
import com.zxning.library.tool.UIUtils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class HomeFragment extends BaseFragment implements BaseQuickAdapter.OnRecyclerViewItemClickListener {

    //http://image.baidu.com/detail/newindex?col=&tag=&pn=0&pid=37755982895&aid=412819660&user_id=863659253&setid=-1&sort=0&newsPn=&star=&fr=&from=2
    //
    private String[] imageUrls = {
            " http://img.taodiantong.cn/v55183/infoimg/2013-07/130720115322ky.jpg",
            "http://pic30.nipic.com/20130626/8174275_085522448172_2.jpg",
            "http://pic18.nipic.com/20111215/577405_080531548148_2.jpg",
            "http://pic15.nipic.com/20110722/2912365_092519919000_2.jpg",
            "http://pic.58pic.com/58pic/12/64/27/55U58PICrdX.jpg"};
    private List<ImageView> views = new ArrayList<ImageView>();
    private List<ADInfo> infos = new ArrayList<ADInfo>();
    private CycleViewPager cycleViewPager;
    private List<WayInfo> wayInfos;

    @Override
    protected View onCreateSuccessedView() {
        View view = View.inflate(getActivity(), R.layout.fragmnet_home, null);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        GridLayoutManager manager = new GridLayoutManager(getActivity(), 3);
        rv.setLayoutManager(manager);
        wayInfos = new ArrayList<>();
        String[] names = UIUtils.getStringArray(R.array.home_way_names);
        for (int i = 0; i < names.length; i++) {
            WayInfo info = new WayInfo();
            info.name = names[i];
            info.iconId = ids[i];
            wayInfos.add(info);
        }
        HomeWayAdapter mAdapter = new HomeWayAdapter(wayInfos);
        rv.setAdapter(mAdapter);
        mAdapter.setOnRecyclerViewItemClickListener(this);
        //configImageLoader();
        initialize();
        return view;
    }

    @Override
    public void onItemClick(View view, int position) {
        switch (position) {
            case 0:
                startCardHand(wayInfos.get(position).name);
                break;
            case 1:
                startNetLoan(wayInfos.get(position).name);
                break;
            case 2:
                startLatestCut(wayInfos.get(position).name);
                break;
            case 3:
                startQueryProgress(wayInfos.get(position).name);
                break;
            case 5:
                startCardPhone(wayInfos.get(position).name);
                break;
        }
    }

    private void startQueryProgress(String name) {
        Intent intent = new Intent();
        intent.setClass(getActivity(), Way3QueryProgressActivity.class);
        intent.putExtra(RxtCT.RI.RXT_IT, name);
        startActivity(intent);
    }

    private void startLatestCut(String name) {
        Intent intent = new Intent();
        intent.setClass(getActivity(), Way2LatestCutActivity.class);
        intent.putExtra(RxtCT.RI.RXT_IT, name);
        startActivity(intent);
    }

    private void startNetLoan(String name) {
        Intent intent = new Intent();
        intent.setClass(getActivity(), Way1NetLoanActivity.class);
        intent.putExtra(RxtCT.RI.RXT_IT, name);
        startActivity(intent);
    }

    private void startCardPhone(String name) {
        Intent intent = new Intent();
        intent.setClass(getActivity(), Way5BankTelActivity.class);
        intent.putExtra(RxtCT.RI.RXT_IT, name);
        startActivity(intent);
    }

    private void startCardHand(String name) {
        Intent intent = new Intent();
        intent.setClass(getActivity(), Way0FastActivity.class);
        intent.putExtra(RxtCT.RI.RXT_IT, name);
        startActivity(intent);
    }

    private int[] ids = {R.mipmap.ic_home_way0, R.mipmap.ic_home_way1,
            R.mipmap.ic_home_way2, R.mipmap.ic_home_way3,
            R.mipmap.ic_home_way4, R.mipmap.ic_home_way5, R.mipmap.ic_home_way6, R.mipmap.ic_home_way7, R.mipmap.ic_home_way8};

    private int[] vpImageIds = {R.mipmap.iv_home_vp0, R.mipmap.iv_home_vp1,
            R.mipmap.iv_home_vp2};

    private int[] vpDrawIds = {R.drawable.iv_home_vp0, R.drawable.iv_home_vp1,
            R.drawable.iv_home_vp2};

    @SuppressLint("NewApi")
    private void initialize() {

        cycleViewPager = (CycleViewPager) getActivity().getFragmentManager()
                .findFragmentById(R.id.fragment_cycle_viewpager_content);

        /*for (int i = 0; i < imageUrls.length; i++) {
            ADInfo info = new ADInfo();
            info.setUrl(imageUrls[i]);
            info.setContent("图片-->" + i);
            infos.add(info);
        }*/

        /*for (int i = 0; i < vpImageIds.length; i++) {
            ADInfo info = new ADInfo();
            info.setUrl(vpImageIds[i]+"---");
            info.setContent("图片-->" + i);
            info.setVpIconId(vpImageIds[i]);
            infos.add(info);
        }*/

        for (int i = 0; i < vpDrawIds.length; i++) {
            ADInfo info = new ADInfo();
            info.setUrl(vpDrawIds[i]+"---");
            info.setContent("图片-->" + i);
            info.setVpIconId(vpDrawIds[i]);
            infos.add(info);
        }

        // 将最后一个ImageView添加进来
        //views.add(ViewFactory.getImageView(getActivity(), infos.get(infos.size() - 1).getUrl()));
//        views.add(ViewFactory.displayFromMipmap(getActivity(), infos.get(infos.size() - 1).getVpIconId()));
        views.add(ViewFactory.displayFromDrawable(getActivity(), infos.get(infos.size() - 1).getVpIconId()));

//        for (int i = 0; i < infos.size(); i++) {
//            views.add(ViewFactory.getImageView(getActivity(), infos.get(i).getUrl()));
//        }
//        for (int i = 0; i < infos.size(); i++) {
//            views.add(ViewFactory.displayFromMipmap(getActivity(), infos.get(i).getVpIconId()));
//        }
        for (int i = 0; i < infos.size(); i++) {
            views.add(ViewFactory.displayFromDrawable(getActivity(), infos.get(i).getVpIconId()));
        }
        // 将第一个ImageView添加进来
        //views.add(ViewFactory.getImageView(getActivity(), infos.get(0).getUrl()));
//        views.add(ViewFactory.displayFromMipmap(getActivity(), infos.get(0).getVpIconId()));
        views.add(ViewFactory.displayFromDrawable(getActivity(), infos.get(0).getVpIconId()));

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
//                Toast.makeText(HomeFragment.this.getActivity(),
//                        "position-->" + info.getContent(), Toast.LENGTH_SHORT)
//                        .show();
            }
        }
    };

}

