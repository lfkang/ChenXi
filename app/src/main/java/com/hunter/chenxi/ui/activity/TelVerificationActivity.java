package com.hunter.chenxi.ui.activity;

import android.os.Bundle;
import android.widget.Button;

import com.hunter.chenxi.R;
import com.hunter.chenxi.base.BaseActivity;

import butterknife.Bind;

public class TelVerificationActivity extends BaseActivity {
    @Bind(R.id.BtnTelNext)
    Button telNext;

    @Override
    public void initContentView() {
        setContentView(R.layout.activity_tel_verify);
    }


    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
