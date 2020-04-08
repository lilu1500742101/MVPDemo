
package com.example.mvpdemo.loginmodel;

import com.example.mvpdemo.loginpresenter.OnUserLoginListener;

public class UserLoginMode implements IUserLoginMode {
    @Override
    public void handleLogin(String username, String strPwd,
                            OnUserLoginListener bOnUserLoginListener) {
        String s_username = "mvp";
        String s_strPwd ="123456";
        //用户名不存在
        if(!username.equals(s_username)){
            bOnUserLoginListener.onUserLoginError(1);
        } else if(username.equals(s_username) && s_strPwd.equals(strPwd)){
            bOnUserLoginListener.onUserLoginSuccess();
        }else if(username.equals(s_username) && !s_strPwd.equals(strPwd)){
            //密码不正确
            bOnUserLoginListener.onUserLoginError(2);
        }

    }
}
