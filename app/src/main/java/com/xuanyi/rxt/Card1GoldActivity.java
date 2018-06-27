package com.xuanyi.rxt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuanyi.rxt.base.BaseCardWayActivity;

public class Card1GoldActivity extends BaseCardWayActivity {

    @Override
    protected int getCardWayNamesId() {
        return R.array.card_gold_way_names;
    }

    @Override
    protected int[] getCardUrlsId() {
        return new int[]{R.array.card_ny_jk_urls,
                R.array.card_gs_jk_urls,
                R.array.card_zs_jk_urls,
                R.array.card_js_jk_urls,
                R.array.card_bs_jk_urls,
                R.array.card_bj_jk_urls,
                R.array.card_gd_jk_urls,
                R.array.card_gf_jk_urls,
                R.array.card_gz_jk_urls,
                R.array.card_jt_jk_urls,
              /*  R.array.card_ms_jk_urls,*/
                R.array.card_pa_jk_urls,
                R.array.card_pf_jk_urls,
                R.array.card_sh_jk_urls,
                R.array.card_xy_jk_urls,
                R.array.card_zx_jk_urls,
                R.array.card_zg_jk_urls,
                R.array.card_hx_jk_urls,
                R.array.card_zd_jk_urls,
                R.array.card_hq_jk_urls
        };
    }

    @Override
    protected int[] getCardNamesId() {
        return new int[]{R.array.card_ny_jk_names,
                R.array.card_gs_jk_names,
                R.array.card_zs_jk_names,
                R.array.card_js_jk_names,
                R.array.card_bs_jk_names,
                R.array.card_bj_jk_names,
                R.array.card_gd_jk_names,
                R.array.card_gf_jk_names,
                R.array.card_gz_jk_names,
                R.array.card_jt_jk_names,
                /*R.array.card_ms_jk_names,*/
                R.array.card_pa_jk_names,
                R.array.card_pf_jk_names,
                R.array.card_sh_jk_names,
                R.array.card_xy_jk_names,
                R.array.card_zx_jk_names,
                R.array.card_zg_jk_names,
                R.array.card_hx_jk_names,
                R.array.card_zd_jk_names,
                R.array.card_hq_jk_names
        };
    }

    @Override
    protected int[] getCardDessId() {
        return new int[]{R.array.card_ny_jk_dess,
                R.array.card_gs_jk_dess,
                R.array.card_zs_jk_dess,
                R.array.card_js_jk_dess,
                R.array.card_bs_jk_dess,
                R.array.card_bj_jk_dess,
                R.array.card_gd_jk_dess,
                R.array.card_gf_jk_dess,
                R.array.card_gz_jk_dess,
                R.array.card_jt_jk_dess,
               /* R.array.card_ms_jk_dess,*/
                R.array.card_pa_jk_dess,
                R.array.card_pf_jk_dess,
                R.array.card_sh_jk_dess,
                R.array.card_xy_jk_dess,
                R.array.card_zx_jk_dess,
                R.array.card_zg_jk_dess,
                R.array.card_hx_jk_dess,
                R.array.card_zd_jk_dess,
                R.array.card_hq_jk_dess
        };
    }

    @Override
    protected int[][] getCardIvIdss() {
        return new int[][]{
                new int[]{R.mipmap.ny_jk_0, R.mipmap.ny_jk_1, R.mipmap.ny_jk_2, R.mipmap.ny_jk_3, R.mipmap.ny_jk_4, R.mipmap.ny_jk_5, R.mipmap.ny_jk_6, R.mipmap.ny_jk_7, R.mipmap.ny_jk_8, R.mipmap.ny_jk_9, R.mipmap.ny_jk_10, R.mipmap.ny_jk_11, R.mipmap.ny_jk_12
                },
                new int[]{R.mipmap.gs_jk_0, R.mipmap.gs_jk_1, R.mipmap.gs_jk_2, R.mipmap.gs_jk_3, R.mipmap.gs_jk_4, R.mipmap.gs_jk_5,
                        R.mipmap.gs_jk_6, R.mipmap.gs_jk_7, R.mipmap.gs_jk_8, R.mipmap.gs_jk_9, R.mipmap.gs_jk_10, R.mipmap.gs_jk_11,
                        R.mipmap.gs_jk_12, R.mipmap.gs_jk_13, R.mipmap.gs_jk_14, R.mipmap.gs_jk_15,
                        R.mipmap.gs_jk_16, R.mipmap.gs_jk_17, R.mipmap.gs_jk_18
                },
                new int[]{R.mipmap.zs_jk_0, R.mipmap.zs_jk_1, R.mipmap.zs_jk_2
                },
                new int[]{R.mipmap.js_jk_0, R.mipmap.js_jk_1, R.mipmap.js_jk_2, R.mipmap.js_jk_3, R.mipmap.js_jk_4, R.mipmap.js_jk_5, R.mipmap.js_jk_6, R.mipmap.js_jk_7, R.mipmap.js_jk_8, R.mipmap.js_jk_9, R.mipmap.js_jk_10, R.mipmap.js_jk_11, R.mipmap.js_jk_12, R.mipmap.js_jk_13, R.mipmap.js_jk_14, R.mipmap.js_jk_15, R.mipmap.js_jk_16, R.mipmap.js_jk_17, R.mipmap.js_jk_18, R.mipmap.js_jk_19
                },
                new int[]{R.mipmap.bs_jk_0, R.mipmap.bs_jk_1, R.mipmap.bs_jk_2, R.mipmap.bs_jk_3, R.mipmap.bs_jk_4, R.mipmap.bs_jk_5, R.mipmap.bs_jk_6, R.mipmap.bs_jk_7, R.mipmap.bs_jk_8, R.mipmap.bs_jk_9, R.mipmap.bs_jk_10, R.mipmap.bs_jk_11, R.mipmap.bs_jk_12, R.mipmap.bs_jk_13, R.mipmap.bs_jk_14
                },
                new int[]{R.mipmap.bj_jk_0, R.mipmap.bj_jk_1, R.mipmap.bj_jk_2, R.mipmap.bj_jk_3, R.mipmap.bj_jk_4, R.mipmap.bj_jk_5, R.mipmap.bj_jk_6, R.mipmap.bj_jk_7, R.mipmap.bj_jk_8
                },
                new int[]{R.mipmap.gd_jk_0, R.mipmap.gd_jk_1, R.mipmap.gd_jk_2, R.mipmap.gd_jk_3
                },
                new int[]{R.mipmap.gf_jk_0, R.mipmap.gf_jk_1, R.mipmap.gf_jk_2, R.mipmap.gf_jk_3, R.mipmap.gf_jk_4, R.mipmap.gf_jk_5, R.mipmap.gf_jk_6, R.mipmap.gf_jk_7, R.mipmap.gf_jk_8, R.mipmap.gf_jk_9, R.mipmap.gf_jk_10, R.mipmap.gf_jk_11, R.mipmap.gf_jk_12, R.mipmap.gf_jk_13, R.mipmap.gf_jk_14, R.mipmap.gf_jk_15, R.mipmap.gf_jk_16, R.mipmap.gf_jk_17, R.mipmap.gf_jk_18, R.mipmap.gf_jk_19, R.mipmap.gf_jk_20, R.mipmap.gf_jk_21, R.mipmap.gf_jk_22, R.mipmap.gf_jk_23, R.mipmap.gf_jk_24
                },
                new int[]{R.mipmap.gz_jk_0, R.mipmap.gz_jk_1, R.mipmap.gz_jk_2, R.mipmap.gz_jk_3
                },
                new int[]{R.mipmap.jt_jk_0, R.mipmap.jt_jk_1, R.mipmap.jt_jk_2, R.mipmap.jt_jk_3, R.mipmap.jt_jk_4, R.mipmap.jt_jk_5, R.mipmap.jt_jk_6, R.mipmap.jt_jk_7, R.mipmap.jt_jk_8, R.mipmap.jt_jk_9, R.mipmap.jt_jk_10, R.mipmap.jt_jk_11, R.mipmap.jt_jk_12, R.mipmap.jt_jk_13, R.mipmap.jt_jk_14, R.mipmap.jt_jk_15, R.mipmap.jt_jk_16, R.mipmap.jt_jk_17
                },
                new int[]{
                        /*R.mipmap.ms_jk_0, R.mipmap.ms_jk_1, R.mipmap.ms_jk_2, R.mipmap.ms_jk_3,
                        R.mipmap.ms_jk_4, R.mipmap.ms_jk_5, R.mipmap.ms_jk_6, R.mipmap.ms_jk_7,
                        R.mipmap.ms_jk_8, R.mipmap.ms_jk_9, R.mipmap.ms_jk_10, R.mipmap.ms_jk_11,
                        R.mipmap.ms_jk_12*/
                },
                new int[]{R.mipmap.pa_jk_0, R.mipmap.pa_jk_1, R.mipmap.pa_jk_2, R.mipmap.pa_jk_3, R.mipmap.pa_jk_4, R.mipmap.pa_jk_5
                },
                new int[]{R.mipmap.pf_jk_0, R.mipmap.pf_jk_1, R.mipmap.pf_jk_2, R.mipmap.pf_jk_3, R.mipmap.pf_jk_4,
                        R.mipmap.pf_jk_5, R.mipmap.pf_jk_6,R.mipmap.pf_jk_7
                },
                new int[]{R.mipmap.sh_jk_0, R.mipmap.sh_jk_1, R.mipmap.sh_jk_2, R.mipmap.sh_jk_3, R.mipmap.sh_jk_4, R.mipmap.sh_jk_5, R.mipmap.sh_jk_6, R.mipmap.sh_jk_7, R.mipmap.sh_jk_8, R.mipmap.sh_jk_9, R.mipmap.sh_jk_10, R.mipmap.sh_jk_11, R.mipmap.sh_jk_12, R.mipmap.sh_jk_13
                },
                new int[]{R.mipmap.xy_jk_0, R.mipmap.xy_jk_1, R.mipmap.xy_jk_2, R.mipmap.xy_jk_3, R.mipmap.xy_jk_4, R.mipmap.xy_jk_5, R.mipmap.xy_jk_6, R.mipmap.xy_jk_7, R.mipmap.xy_jk_8
                },
                new int[]{R.mipmap.zx_jk_0, R.mipmap.zx_jk_1, R.mipmap.zx_jk_2, R.mipmap.zx_jk_3, R.mipmap.zx_jk_4,
                        R.mipmap.zx_jk_5, R.mipmap.zx_jk_6, R.mipmap.zx_jk_7, R.mipmap.zx_jk_8, R.mipmap.zx_jk_9, R.mipmap.zx_jk_10,
                        R.mipmap.zx_jk_11, R.mipmap.zx_jk_12, R.mipmap.zx_jk_13, R.mipmap.zx_jk_14, R.mipmap.zx_jk_15, R.mipmap.zx_jk_16,
                        R.mipmap.zx_jk_17, R.mipmap.zx_jk_18
                },
                new int[]{R.mipmap.zg_jk_0, R.mipmap.zg_jk_1, R.mipmap.zg_jk_2, R.mipmap.zg_jk_3, R.mipmap.zg_jk_4, R.mipmap.zg_jk_5, R.mipmap.zg_jk_6, R.mipmap.zg_jk_7, R.mipmap.zg_jk_8
                },
                new int[]{R.mipmap.hx_jk_0, R.mipmap.hx_jk_1, R.mipmap.hx_jk_2, R.mipmap.hx_jk_3, R.mipmap.hx_jk_4, R.mipmap.hx_jk_5, R.mipmap.hx_jk_6, R.mipmap.hx_jk_7
                },
                new int[]{R.mipmap.zd_jk_0, R.mipmap.zd_jk_1},
                new int[]{R.mipmap.hq_jk_0, R.mipmap.hq_jk_1, R.mipmap.hq_jk_2}
        };
    }
}
