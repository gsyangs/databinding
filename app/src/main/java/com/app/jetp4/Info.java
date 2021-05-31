package com.app.jetp4;

import androidx.databinding.ObservableField;

/**
 * @author:create by ys
 * 时间:2021/5/31 15
 * 邮箱 894417048@qq.com
 */
public class Info {

    private ObservableField<String> info;

    public Info(String info) {
        this.info = new ObservableField<>(info);
    }

    public ObservableField<String> getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info.set(info);
    }
}
