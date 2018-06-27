package com.xuanyi.rxt;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.util.Log;
import android.view.View;

import com.xuanyi.rxt.base.BaseCardWayActivity;
import com.xuanyi.rxt.constant.RxtCT;

public class Card0FastActivity extends BaseCardWayActivity {

    @Override
    protected int getCardWayNamesId() {
        return R.array.card_fast_way_names;
    }

    @Override
    protected int[] getCardUrlsId() {
        return new int[]{R.array.card_ny_kk_urls,
                R.array.card_gs_kk_urls,
                R.array.card_zs_kk_urls,
                R.array.card_js_kk_urls,
                R.array.card_bs_kk_urls,
                R.array.card_bj_kk_urls,
                R.array.card_gd_kk_urls,
                R.array.card_gf_kk_urls,
                R.array.card_gz_kk_urls,
                R.array.card_jt_kk_urls,
               /* R.array.card_ms_kk_urls,*/
                R.array.card_pa_kk_urls,
                R.array.card_pf_kk_urls,
                R.array.card_sh_kk_urls,
                R.array.card_xy_kk_urls,
                R.array.card_zx_kk_urls,
                R.array.card_zg_kk_urls,
        };
    }

    @Override
    protected int[] getCardNamesId() {
        return new int[]{R.array.card_ny_kk_names,
                R.array.card_gs_kk_names,
                R.array.card_zs_kk_names,
                R.array.card_js_kk_names,
                R.array.card_bs_kk_names,
                R.array.card_bj_kk_names,
                R.array.card_gd_kk_names,
                R.array.card_gf_kk_names,
                R.array.card_gz_kk_names,
                R.array.card_jt_kk_names,
               /* R.array.card_ms_kk_names,*/
                R.array.card_pa_kk_names,
                R.array.card_pf_kk_names,
                R.array.card_sh_kk_names,
                R.array.card_xy_kk_names,
                R.array.card_zx_kk_names,
                R.array.card_zg_kk_names,
        };
    }

    @Override
    protected int[] getCardDessId() {
        return new int[]{R.array.card_ny_kk_dess,
                R.array.card_gs_kk_dess,
                R.array.card_zs_kk_dess,
                R.array.card_js_kk_dess,
                R.array.card_bs_kk_dess,
                R.array.card_bj_kk_dess,
                R.array.card_gd_kk_dess,
                R.array.card_gf_kk_dess,
                R.array.card_gz_kk_dess,
                R.array.card_jt_kk_dess,
               /* R.array.card_ms_kk_dess,*/
                R.array.card_pa_kk_dess,
                R.array.card_pf_kk_dess,
                R.array.card_sh_kk_dess,
                R.array.card_xy_kk_dess,
                R.array.card_zx_kk_dess,
                R.array.card_zg_kk_dess
        };
    }

    @Override
    protected int[][] getCardIvIdss() {
        return new int[][]{
                new int[]{R.mipmap.ny_kk_0, R.mipmap.ny_kk_1, R.mipmap.ny_kk_2, R.mipmap.ny_kk_3, R.mipmap.ny_kk_4},
                new int[]{R.mipmap.gs_kk_0, R.mipmap.gs_kk_1, R.mipmap.gs_kk_2, R.mipmap.gs_kk_3, R.mipmap.gs_kk_4, R.mipmap.gs_kk_5, R.mipmap.gs_kk_6, R.mipmap.gs_kk_7, R.mipmap.gs_kk_8, R.mipmap.gs_kk_9, R.mipmap.gs_kk_10, R.mipmap.gs_kk_11, R.mipmap.gs_kk_12},
                new int[]{R.mipmap.zs_kk_0, R.mipmap.zs_kk_1, R.mipmap.zs_kk_2, R.mipmap.zs_kk_3, R.mipmap.zs_kk_4
                },
                new int[]{R.mipmap.js_kk_0, R.mipmap.js_kk_1, R.mipmap.js_kk_2, R.mipmap.js_kk_3, R.mipmap.js_kk_4, R.mipmap.js_kk_5
                },
                new int[]{R.mipmap.bs_kk_0, R.mipmap.bs_kk_1, R.mipmap.bs_kk_2, R.mipmap.bs_kk_3, R.mipmap.bs_kk_4, R.mipmap.bs_kk_5, R.mipmap.bs_kk_6, R.mipmap.bs_kk_7
                },
                new int[]{R.mipmap.bj_kk_0, R.mipmap.bj_kk_1
                },
                new int[]{R.mipmap.gd_kk_0, R.mipmap.gd_kk_1, R.mipmap.gd_kk_2, R.mipmap.gd_kk_3, R.mipmap.gd_kk_4, R.mipmap.gd_kk_5
                },
                new int[]{R.mipmap.gf_kk_0, R.mipmap.gf_kk_1, R.mipmap.gf_kk_2, R.mipmap.gf_kk_3, R.mipmap.gf_kk_4, R.mipmap.gf_kk_5, R.mipmap.gf_kk_6, R.mipmap.gf_kk_7, R.mipmap.gf_kk_8, R.mipmap.gf_kk_9, R.mipmap.gf_kk_10, R.mipmap.gf_kk_11, R.mipmap.gf_kk_12, R.mipmap.gf_kk_13, R.mipmap.gf_kk_14, R.mipmap.gf_kk_15, R.mipmap.gf_kk_16, R.mipmap.gf_kk_17, R.mipmap.gf_kk_18
                },
                new int[]{R.mipmap.gz_kk_0, R.mipmap.gz_kk_1, R.mipmap.gz_kk_2},
                new int[]{R.mipmap.jt_kk_0, R.mipmap.jt_kk_1, R.mipmap.jt_kk_2, R.mipmap.jt_kk_3, R.mipmap.jt_kk_4, R.mipmap.jt_kk_5, R.mipmap.jt_kk_6, R.mipmap.jt_kk_7, R.mipmap.jt_kk_8, R.mipmap.jt_kk_9, R.mipmap.jt_kk_10, R.mipmap.jt_kk_11, R.mipmap.jt_kk_12, R.mipmap.jt_kk_13, R.mipmap.jt_kk_14, R.mipmap.jt_kk_15, R.mipmap.jt_kk_16, R.mipmap.jt_kk_17, R.mipmap.jt_kk_18
                },
                /*new int[]{
                        R.mipmap.ms_kk_0, R.mipmap.ms_kk_1, R.mipmap.ms_kk_2, R.mipmap.ms_kk_3,
                        R.mipmap.ms_kk_4, R.mipmap.ms_kk_5
                },*/
                new int[]{R.mipmap.pa_kk_0, R.mipmap.pa_kk_1, R.mipmap.pa_kk_2, R.mipmap.pa_kk_3, R.mipmap.pa_kk_4, R.mipmap.pa_kk_5, R.mipmap.pa_kk_6},
                new int[]{R.mipmap.pf_kk_0, R.mipmap.pf_kk_1, R.mipmap.pf_kk_2, R.mipmap.pf_kk_3},
                new int[]{R.mipmap.sh_kk_0, R.mipmap.sh_kk_1, R.mipmap.sh_kk_2, R.mipmap.sh_kk_3, R.mipmap.sh_kk_4, R.mipmap.sh_kk_5, R.mipmap.sh_kk_6, R.mipmap.sh_kk_7, R.mipmap.sh_kk_8, R.mipmap.sh_kk_9, R.mipmap.sh_kk_10, R.mipmap.sh_kk_11},
                new int[]{R.mipmap.xy_kk_0, R.mipmap.xy_kk_1, R.mipmap.xy_kk_2, R.mipmap.xy_kk_3, R.mipmap.xy_kk_4, R.mipmap.xy_kk_5},
                new int[]{R.mipmap.zx_kk_0, R.mipmap.zx_kk_1, R.mipmap.zx_kk_2, R.mipmap.zx_kk_3, R.mipmap.zx_kk_4},
                new int[]{R.mipmap.zg_kk_0, R.mipmap.zg_kk_1, R.mipmap.zg_kk_2, R.mipmap.zg_kk_3, R.mipmap.zg_kk_4, R.mipmap.zg_kk_5, R.mipmap.zg_kk_6, R.mipmap.zg_kk_7}
        };
    }
}
