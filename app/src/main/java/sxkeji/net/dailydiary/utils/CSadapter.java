package sxkeji.net.dailydiary.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * com.yuntu.carmaster.utils
 * Created by qiujie on 15/10/29.
 */
public abstract class CSadapter<T> extends BaseAdapter {
    public List<T> list;
    public Context context;

    public CSadapter(List<T> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public abstract View getView(int position, View convertView,
                                 ViewGroup parent);
}
