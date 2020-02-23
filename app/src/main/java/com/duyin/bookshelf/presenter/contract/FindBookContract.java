package com.duyin.bookshelf.presenter.contract;

import com.edison.mvplib.impl.IPresenter;
import com.edison.mvplib.impl.IView;
import com.duyin.bookshelf.widget.recycler.expandable.bean.RecyclerViewData;

import java.util.List;

public interface FindBookContract {
    interface Presenter extends IPresenter {

        void initData();

    }

    interface View extends IView {

        void upData(List<RecyclerViewData> group);

    }
}
