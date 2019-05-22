package com.gzd.example.provinggrounds.base;

import android.content.Context;
import android.databinding.Bindable;

/**
 * Created by gzd on 2019/5/22 0022
 */
public abstract class ListItemViewModel<T> extends ViewModel{
    protected Context mContext;
    @Bindable
    protected T item;   //item单项绑定

    public ListItemViewModel(Context context, T item){
        mContext = context;
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
        notifyChange();   //databinding 通知改变
    }
}
