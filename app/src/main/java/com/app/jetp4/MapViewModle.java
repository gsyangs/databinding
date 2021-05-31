package com.app.jetp4;

import android.text.Editable;

import androidx.databinding.ObservableArrayMap;

/**
 * @author:create by ys
 * 时间:2021/5/31 14
 * 邮箱 894417048@qq.com
 */
public class MapViewModle {

    private ObservableArrayMap<String,String> strMap;


    public MapViewModle(ObservableArrayMap<String,String> strMap){
        this.strMap = strMap;
    }

    public void changeStr(){
        if (strMap != null){
            strMap.put("1","变化11111");
            strMap.put("2","变化22222");
            strMap.put("3","变化33333");
        }
    }


    //点击事件界面传值过来
    public void showStr(Info info){
        System.out.println("String1:" +  info.getInfo().get());
    }

    //事物 edittext修改后发生的事物
    public void changeInfo(Editable editable){
        System.out.println("String2:" + editable.toString());
    }
} 