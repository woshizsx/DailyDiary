package sxkeji.net.dailydiary.models;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by zhangshixin on 2015/11/26.
 *
 * @description Codes there always can be better.
 */
public class NetWorkBiz implements INetWorkBiz {
    @Override
    public boolean isNetWorkConnected(Context context) {
        if(context != null){
            ConnectivityManager  mConnectivityManager = (ConnectivityManager)
                    context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            if(mNetworkInfo != null){
                return mNetworkInfo.isAvailable();
            }
        }
        return false;
    }
}
