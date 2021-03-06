package com.example.p7_1_10.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    public P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());

        if (presenter==null){
            presenter=add();
        }
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    public abstract P add();

    protected abstract int getLayoutID();
}
