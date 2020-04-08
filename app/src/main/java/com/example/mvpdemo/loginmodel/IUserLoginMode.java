package com.example.mvpdemo.loginmodel;

import com.example.mvpdemo.loginpresenter.OnUserLoginListener;

public interface IUserLoginMode {
     void handleLogin(String username, String strPwd,
                            OnUserLoginListener bOnUserLoginListener);
}
