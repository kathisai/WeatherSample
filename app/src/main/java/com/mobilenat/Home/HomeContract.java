package com.mobilenat.Home;


import com.mobilenat.mvp.BasePresenter;
import com.mobilenat.mvp.BaseView;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface HomeContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);


    }

    interface Presenter extends BasePresenter {

        void editTask();


    }
}