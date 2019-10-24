package com.balala.yaofun.homefragmentmvp;

import com.balala.yaofun.base.BasePresenter;
import com.balala.yaofun.bean.result.DayBeans;
import com.balala.yaofun.bean.result.HomeAllBean;
import com.balala.yaofun.bean.result.HomeBannerDean;
import com.balala.yaofun.httpUtils.ResultCallBack;

import java.io.IOException;

public class HomePresenter extends BasePresenter<Homeview> {

    private HomeModel homeModel;

    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }


    // 顶部每日一句
    public void getHomeData() {
        homeModel.HomeDayData(new ResultCallBack<DayBeans>() {
            @Override
            public void onSuccess(DayBeans bean) {

                if (bean != null) {
                    mView.onSuccessHome(bean);
                }
            }

            @Override
            public void onFail(String msg) {
                mView.onFailHome(msg);
            }
        });
    }


    // 首页列表

    public void getHomeallData(String x, String y) {
        homeModel.HomeData(x, y, new ResultCallBack<HomeAllBean>() {

            @Override
            public void onSuccess(HomeAllBean bean) throws IOException {
                if (bean != null) {
                    mView.onSuccessHomeall(bean);
                }

            }

            @Override
            public void onFail(String msg) {
                mView.onFailHomeall(msg);

            }
        });
    }

    //首页banner

    public void getHomeBannerData() {
        homeModel.HomeBannerData(new ResultCallBack<HomeBannerDean>() {
            @Override
            public void onSuccess(HomeBannerDean bean) throws IOException {
                if (bean!=null){
                    mView.onSuccessBannerall(bean);
                }
            }

            @Override
            public void onFail(String msg) {
                mView.onFailBannerall(msg);
            }
        });
    }

}
