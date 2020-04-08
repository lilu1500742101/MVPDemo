package com.example.mvpdemo.loginpresenter;

import com.example.mvpdemo.loginmodel.UserLoginMode;
import com.example.mvpdemo.loginmodel.IUserLoginMode;
import com.example.mvpdemo.loginview.IUserLoginView;

public class UserLoginPresenter implements IUserLoginPresenter,OnUserLoginListener{
    IUserLoginMode bUserLoginMode = null;
    IUserLoginView bUserLoginView = null;
    public UserLoginPresenter(IUserLoginView bUserLoginView){
        bUserLoginMode = new UserLoginMode();
        this.bUserLoginView = bUserLoginView;
    }

    @Override
    public void onUserLoginSuccess() {
        bUserLoginView.setSuccessInfo();
    }

    @Override
    public void onUserLoginError(int iErrorCode) {
        bUserLoginView.setErrorInfo(iErrorCode);
    }

    @Override
    public void login(String username, String strPwd) {
        bUserLoginMode.handleLogin(username,strPwd,this);
    }
}
