package com.app.jetp4;

import androidx.databinding.ObservableField;

/**
 * @author:create by ys
 * 时间:2021/5/28 16
 * 邮箱 894417048@qq.com
 */
public class UserObservable {

    // databinding 封装的基础类型  可以自动刷新对应字段信息  不在使用 BaseObservable
    private ObservableField<String> username;
    private  ObservableField<String> password;

    public UserObservable(String username, String password) {
        this.username = new ObservableField<String>(username);
        this.password= new ObservableField<String>(password);
    }

    public ObservableField<String> getUsername() {
        return username;
    }

    public ObservableField<String> getPassword() {
        return password;
    }

    // 使用封装类的set 方法改变值  详情可以看set源码 做了更新操作
    public void setUsername(String username){
        this.username.set(username);
    }

    public void setPassword(String password){
        this.password.set(password);
    }
}