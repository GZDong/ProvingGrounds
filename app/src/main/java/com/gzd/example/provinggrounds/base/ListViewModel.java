package com.gzd.example.provinggrounds.base;

import android.content.Context;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import java.util.List;

/**
 * Created by gzd on 2019/5/22 0022
 */
public abstract class ListViewModel<T> extends ViewModel implements IListViewModel<T> {

    public ObservableList<ListItemViewModel<T>> itemViewModel = new ObservableArrayList<>();

    protected Context context;
    protected IListModel model;

    private List<T> data;
}
