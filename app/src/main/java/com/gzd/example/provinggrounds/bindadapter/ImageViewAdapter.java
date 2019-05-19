package com.gzd.example.provinggrounds.bindadapter;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.gzd.example.provinggrounds.BaseApplication;

/**
 * Created by gzd on 2019/5/19 0019
 */
public class ImageViewAdapter {
    @BindingAdapter(value = "url", requireAll = false)
    public static void setImageUrl(ImageView imageView, String url){
        Glide.with(BaseApplication.getContext()).load(url).into(imageView);
    }
}
