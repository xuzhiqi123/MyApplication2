package com.balala.yaofun.mylandingmvp;

import com.balala.yaofun.base.BaseView;
import com.balala.yaofun.bean.result.LandingBean;

public interface LandingView extends BaseView {
    void onSuccessLanding(LandingBean bean);

    void onErrorLanding(String error);
}
