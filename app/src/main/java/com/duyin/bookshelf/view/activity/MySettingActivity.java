package com.duyin.bookshelf.view.activity;

import android.widget.ImageView;
import android.widget.TextView;

import com.duyin.bookshelf.R;
import com.duyin.bookshelf.base.MBaseActivity;
import com.duyin.bookshelf.help.PrivacyAndUserLienceHelper;
import com.edison.mvplib.impl.IPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * created by edison 2020-02-27
 */
public class MySettingActivity extends MBaseActivity {


    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tv_privacy)
    TextView tvPrivacy;
    @BindView(R.id.tv_license)
    TextView tvLicense;

    @Override
    protected IPresenter initInjector() {
        return null;
    }

    @Override
    protected void onCreateActivity() {
        setContentView(R.layout.activity_my_setting);
        ButterKnife.bind(this);

        ivBack.setOnClickListener(v -> {
            onBackPressed();
        });

        tvPrivacy.setOnClickListener(v -> {
            PrivacyAndUserLienceHelper.INSTANCE.gotoPrivacyActivity(this);
        });

        tvLicense.setOnClickListener(v -> {
            PrivacyAndUserLienceHelper.INSTANCE.gotoUserLicenseActivity(this);
        });
    }

    @Override
    protected void initData() {

    }
}
