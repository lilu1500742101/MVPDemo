package com.example.mvpdemo.loginpresenter;

public interface OnUserLoginListener {
     void onUserLoginSuccess();
     void onUserLoginError(int iErrorCode);
}
