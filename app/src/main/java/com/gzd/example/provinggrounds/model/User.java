package com.gzd.example.provinggrounds.model;

import android.databinding.Observable;
import android.databinding.ObservableField;

/**
 * Created by gzd on 2019/5/19 0019
 */
public class User{
    private ObservableField<String> name ;
    private ObservableField<Integer> age ;
    private ObservableField<String> picUrl ;
    private ObservableField<String> introduce ;


    public User() {
    }

    public User(String name, int age, String picUrl, String introduce) {

        this.name = new ObservableField<>(name);
        this.age = new ObservableField<>(age);
        this.picUrl = new ObservableField<>(picUrl);
        this.introduce = new ObservableField<>(introduce);

    }

    //set/get方法必须要有，双向判定才会生效
    public ObservableField<String> getName() {
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public ObservableField<Integer> getAge() {
        return age;
    }

    public void setAge(ObservableField<Integer> age) {
        this.age = age;
    }

    public ObservableField<String> getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(ObservableField<String> picUrl) {
        this.picUrl = picUrl;
    }

    public ObservableField<String> getIntroduce() {
        return introduce;
    }

    public void setIntroduce(ObservableField<String> introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name.get() + '\'' +
                ", age=" + age.get() +
                ", picUrl='" + picUrl.get() + '\'' +
                ", introduce='" + introduce.get() + '\'' +
                '}';
    }
}
