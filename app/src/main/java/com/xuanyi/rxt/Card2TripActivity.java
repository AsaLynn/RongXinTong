package com.xuanyi.rxt;

import com.xuanyi.rxt.base.BaseCardWayActivity;

public class Card2TripActivity extends BaseCardWayActivity {

    @Override
    protected int getCardWayNamesId() {
        return R.array.card_gold_way_names;
    }

    @Override
    protected int[] getCardUrlsId() {
        return new int[]{R.array.card_ny_lx_urls,
                R.array.card_gs_lx_urls,
                R.array.card_zs_lx_urls,
                R.array.card_js_lx_urls,
                R.array.card_bs_lx_urls,
                R.array.card_bj_lx_urls,
                R.array.card_gd_lx_urls,
                R.array.card_gf_lx_urls,
                R.array.card_gz_lx_urls,
                R.array.card_jt_lx_urls,
                /*R.array.card_ms_lx_urls,*/
                R.array.card_pa_lx_urls,
                R.array.card_pf_lx_urls,
                R.array.card_sh_lx_urls,
                R.array.card_xy_lx_urls,
                R.array.card_zx_lx_urls,
                R.array.card_zg_lx_urls,
                R.array.card_hx_lx_urls,
                R.array.card_zd_lx_urls,
                R.array.card_hq_lx_urls
        };
    }

    @Override
    protected int[] getCardNamesId() {
        return new int[]{R.array.card_ny_lx_names,
                R.array.card_gs_lx_names,
                R.array.card_zs_lx_names,
                R.array.card_js_lx_names,
                R.array.card_bs_lx_names,
                R.array.card_bj_lx_names,
                R.array.card_gd_lx_names,
                R.array.card_gf_lx_names,
                R.array.card_gz_lx_names,
                R.array.card_jt_lx_names,
                /*R.array.card_ms_lx_names,*/
                R.array.card_pa_lx_names,
                R.array.card_pf_lx_names,
                R.array.card_sh_lx_names,
                R.array.card_xy_lx_names,
                R.array.card_zx_lx_names,
                R.array.card_zg_lx_names,
                R.array.card_hx_lx_names,//huaxia
                R.array.card_zd_lx_names,//zhada
                R.array.card_hq_lx_names//huaqi
        };
    }

    @Override
    protected int[] getCardDessId() {
        return new int[]{R.array.card_ny_lx_dess,
                R.array.card_gs_lx_dess,
                R.array.card_zs_lx_dess,
                R.array.card_js_lx_dess,
                R.array.card_bs_lx_dess,
                R.array.card_bj_lx_dess,
                R.array.card_gd_lx_dess,
                R.array.card_gf_lx_dess,
                R.array.card_gz_lx_dess,
                R.array.card_jt_lx_dess,
               /* R.array.card_ms_lx_dess,*/
                R.array.card_pa_lx_dess,
                R.array.card_pf_lx_dess,
                R.array.card_sh_lx_dess,
                R.array.card_xy_lx_dess,
                R.array.card_zx_lx_dess,
                R.array.card_zg_lx_dess,
                R.array.card_hx_lx_dess,
                R.array.card_zd_lx_dess,
                R.array.card_hq_lx_dess
        };
    }

    @Override
    protected int[][] getCardIvIdss() {
        return new int[][]{
                new int[]{R.mipmap.ny_lx_0,R.mipmap.ny_lx_1,R.mipmap.ny_lx_2,R.mipmap.ny_lx_3,R.mipmap.ny_lx_4,R.mipmap.ny_lx_5,R.mipmap.ny_lx_6,R.mipmap.ny_lx_7,R.mipmap.ny_lx_8,},
                new int[]{
                        R.mipmap.gs_lx_0,R.mipmap.gs_lx_1,R.mipmap.gs_lx_2,R.mipmap.gs_lx_3,R.mipmap.gs_lx_4,
                        R.mipmap.gs_lx_5,R.mipmap.gs_lx_6,R.mipmap.gs_lx_7,R.mipmap.gs_lx_8,
                        R.mipmap.gs_lx_9,R.mipmap.gs_lx_10,R.mipmap.gs_lx_11,R.mipmap.gs_lx_12,R.mipmap.gs_lx_13,
                        },
                new int[]{R.mipmap.zs_lx_0,R.mipmap.zs_lx_1,},
                new int[]{R.mipmap.js_lx_0,R.mipmap.js_lx_1,R.mipmap.js_lx_10,R.mipmap.js_lx_11,R.mipmap.js_lx_12,R.mipmap.js_lx_13,R.mipmap.js_lx_14,R.mipmap.js_lx_15,R.mipmap.js_lx_2,R.mipmap.js_lx_3,R.mipmap.js_lx_4,R.mipmap.js_lx_5,R.mipmap.js_lx_6,R.mipmap.js_lx_7,R.mipmap.js_lx_8,R.mipmap.js_lx_9,},
                new int[]{R.mipmap.bs_lx_0,R.mipmap.bs_lx_1,R.mipmap.bs_lx_2,R.mipmap.bs_lx_3,R.mipmap.bs_lx_4,R.mipmap.bs_lx_5, },
                new int[]{R.mipmap.bj_lx_0,R.mipmap.bj_lx_1,R.mipmap.bj_lx_2,R.mipmap.bj_lx_3,R.mipmap.bj_lx_4,},
                new int[]{R.mipmap.gd_x_0,R.mipmap.gd_x_1,R.mipmap.gd_x_2,},
                new int[]{R.mipmap.gf_lx_0,R.mipmap.gf_lx_1,R.mipmap.gf_lx_10,R.mipmap.gf_lx_11,R.mipmap.gf_lx_2,R.mipmap.gf_lx_3,R.mipmap.gf_lx_4,R.mipmap.gf_lx_5,R.mipmap.gf_lx_6,R.mipmap.gf_lx_7,R.mipmap.gf_lx_8,R.mipmap.gf_lx_9,},
                new int[]{R.mipmap.gz_lx_0,R.mipmap.gz_lx_1,R.mipmap.gz_lx_2,R.mipmap.gz_lx_3,},
                new int[]{R.mipmap.jt_lx_0,R.mipmap.jt_lx_1,R.mipmap.jt_lx_2,R.mipmap.jt_lx_3,R.mipmap.jt_lx_4,R.mipmap.jt_lx_5,R.mipmap.jt_lx_6,R.mipmap.jt_lx_7,R.mipmap.jt_lx_8,},
                /*new int[]{
                        R.mipmap.ms_lx_0,R.mipmap.ms_lx_1,R.mipmap.ms_lx_2,R.mipmap.ms_lx_3,
                        R.mipmap.ms_lx_4,R.mipmap.ms_lx_5,R.mipmap.ms_lx_6,R.mipmap.ms_lx_7,
                        R.mipmap.ms_lx_8
                },*/
                new int[]{
                        R.mipmap.pa_lx_0,R.mipmap.pa_lx_1,R.mipmap.pa_lx_2,R.mipmap.pa_lx_3,R.mipmap.pa_lx_4,
                        R.mipmap.pa_lx_5
                },
                new int[]{
                        R.mipmap.pf_lx_0,R.mipmap.pf_lx_1,R.mipmap.pf_lx_2,R.mipmap.pf_lx_3,R.mipmap.pf_lx_4,R.mipmap.pf_lx_5,R.mipmap.pf_lx_6,
                },
                new int[]{
                        R.mipmap.sh_lx_0,R.mipmap.sh_lx_1,R.mipmap.sh_lx_10,R.mipmap.sh_lx_11,R.mipmap.sh_lx_12,R.mipmap.sh_lx_13,R.mipmap.sh_lx_2,R.mipmap.sh_lx_3,R.mipmap.sh_lx_4,R.mipmap.sh_lx_5,R.mipmap.sh_lx_6,R.mipmap.sh_lx_7,R.mipmap.sh_lx_8,R.mipmap.sh_lx_9,
                },
                new int[]{
                        R.mipmap.xy_lx_0,R.mipmap.xy_lx_1,R.mipmap.xy_lx_2,R.mipmap.xy_lx_3,R.mipmap.xy_lx_4,
                },
                new int[]{
                        R.mipmap.zx_lx_0,R.mipmap.zx_lx_1,R.mipmap.zx_lx_2,R.mipmap.zx_lx_3,R.mipmap.zx_lx_4,R.mipmap.zx_lx_5,
                },
                new int[]{
                        R.mipmap.zg_lx_0,R.mipmap.zg_lx_1,R.mipmap.zg_lx_2,R.mipmap.zg_lx_3,R.mipmap.zg_lx_4,R.mipmap.zg_lx_5,R.mipmap.zg_lx_6,R.mipmap.zg_lx_7,R.mipmap.zg_lx_8,
                },
                new int[]{
                        R.mipmap.hx_lx_0,R.mipmap.hx_lx_1,R.mipmap.hx_lx_2
                },
                new int[]{
                        R.mipmap.zd_lx_0
                },
                new int[]{
                        R.mipmap.hq_lx_0,R.mipmap.hq_lx_1
                }
        };
    }
}
