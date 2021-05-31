package com.app.jetp4;

import android.os.Bundle;

import com.app.jetp4.databinding.ActivityLoginBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayMap;

public class LoginActivity extends AppCompatActivity {

    private UserObservable userObservable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //此类根据绑定的xml布局文件生成的类
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        userObservable = new UserObservable("1234","bbbbb");
        binding.setUserObservale(userObservable);
        binding.setViewModle(new ViewModle(userObservable));

        ObservableArrayMap<String,String> map = new ObservableArrayMap<>();
        map.put("1","11111");
        map.put("2","22222");
        map.put("3","33333");
        binding.setPeople(map);
        binding.setInfo(new Info("111"));
        binding.setMapViewModle(new MapViewModle(map));
    }
}