package sxkeji.net.dailydiary.common.activitys;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import sxkeji.net.dailydiary.R;
import sxkeji.net.dailydiary.common.presenters.SplashPresenter;
import sxkeji.net.dailydiary.common.views.ISplashView;


/**
 *
 * Model(业务相关的操作、数据，2个部分：接口、实现)-----> Presenter(根据业务选择调用哪些操作) <-----View(布局里涉及的操作接口)
 *                                                       ↓
 *                                         Activity(布局里操作的具体实现，最终的调用者)
 *
 * Created by zhangshixin on 2015/11/26.
 *
 * @description Codes there always can be better.
 */
public class SplashActivity extends Activity implements ISplashView {
    private SplashPresenter mSplashPresenter;
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSplashPresenter = new SplashPresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mSplashPresenter.doBusiness(this);
    }

    @Override
    public void showProgressDialog() {
        if(mProgressDialog == null){
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setCancelable(true);
            mProgressDialog.setCanceledOnTouchOutside(false);
            mProgressDialog.setMessage("更新数据中...");
        }

        mProgressDialog.show();
    }

    @Override
    public void hideProgressDialog() {
        if(mProgressDialog != null && mProgressDialog.isShowing()){
            mProgressDialog.hide();
        }
    }

    @Override
    public void showNoNetDialog() {
        Toast.makeText(SplashActivity.this,"请检查网络",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void jumpToNextActivity() {
        Toast.makeText(SplashActivity.this,"进入下一个界面",Toast.LENGTH_SHORT).show();
    }
}
