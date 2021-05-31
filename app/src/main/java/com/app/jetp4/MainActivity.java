package com.app.jetp4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.app.jetp4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //此类根据绑定的xml布局文件生成的类
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        user = new User("yangshuai","123456");
        binding.setUser(user);
        binding.setViewModle(new ViewModle(user));
    }

}