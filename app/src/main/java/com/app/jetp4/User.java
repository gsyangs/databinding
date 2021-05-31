package com.app.jetp4;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * @author:create by ys
 * 时间:2021/5/24 13
 * 邮箱 894417048@qq.com
 */
public class User extends BaseObservable{

    //如果是 public 修饰符，则可以直接在成员变量上方加上 @Bindable 注解
    // Bindable 用于双向绑定 和notifyPropertyChanged配合使用 更新注解对应的信息
    @Bindable
    public String username;
    //如果是 private 修饰符，则在成员变量的 get 方法上添加 @Bindable 注解 对应的也是password
    private String password;

    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //刷新所有
    public void setUser(String username,String password){
        this.username = username;
        this.password = password;
        notifyChange();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(BR.username);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}