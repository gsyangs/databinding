package com.app.jetp4;

/**
 * @author:create by ys
 * 时间:2021/5/27 17
 * 邮箱 894417048@qq.com
 */
public class ViewModle {

    private User user;
    private UserObservable userObservable;

    public ViewModle(User user){
        this.user = user;
    }

    public ViewModle(UserObservable userObservable){
        this.userObservable = userObservable;
    }

    public void changeText(){
        if (user != null){
            user.setUsername("变化咯");
        }
    }

    public void changeObservableText(){
        if (userObservable != null){
            userObservable.setUsername("变化咯");
            userObservable.setPassword("1323243432");
        }
    }

} 