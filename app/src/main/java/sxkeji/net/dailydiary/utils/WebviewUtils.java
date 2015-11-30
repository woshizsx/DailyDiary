package sxkeji.net.dailydiary.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import com.yuntu.carmaster.common.webview.WebViewActivity;
import com.yuntu.carmaster.storage.ACache;


/**
 * Created by renbingwu on 2015/11/10.
 */
public class WebviewUtils {
    private Activity activity;
    private String url;
    private String title;
    private String right;

    public WebviewUtils(Activity activity) {
        this.activity = activity;
    }

    public static WebviewUtils bulider(Activity activity) {
        return new WebviewUtils(activity);
    }

    public WebviewUtils setUrl(String url) {
        this.url = url;
        return this;
    }

    public WebviewUtils setTitle(String title) {
        this.title = title;
        return this;
    }

    public WebviewUtils setRight(String right) {
        this.right = right;
        return this;
    }

    public void jump() {
        if (!NetWorkUtils.isNetworkAvailable(activity)) {
            UIUtils.showToastSafe(activity, "网络不可用,请检查网络");
            return;
        }
        Intent intent = new Intent(activity, WebViewActivity.class);
        if (!TextUtils.isEmpty(url)) {
            intent.putExtra(WebViewActivity.LINK_URL, url);
        }
        if (!TextUtils.isEmpty(title)) {
            intent.putExtra(WebViewActivity.TITLE, title);
        }
        if (!TextUtils.isEmpty(right)) {
            intent.putExtra(WebViewActivity.RIGHTSHARE, right);
        }
        activity.startActivity(intent);
    }

}
