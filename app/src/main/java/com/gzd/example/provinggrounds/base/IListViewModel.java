package com.gzd.example.provinggrounds.base;

import android.databinding.ObservableList;

import java.util.List;

/**
 * Created by gzd on 2019/5/22 0022
 */
public interface IListViewModel<T> {

    ObservableList<List<ListItemViewModel<T>>> getItemViewModel();


}
