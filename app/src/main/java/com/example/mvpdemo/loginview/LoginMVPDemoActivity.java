package com.example.mvpdemo.loginview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvpdemo.R;
import com.example.mvpdemo.loginpresenter.UserLoginPresenter;
import com.example.mvpdemo.loginpresenter.IUserLoginPresenter;

public  class LoginMVPDemoActivity extends AppCompatActivity implements IUserLoginView {
    private EditText etUserName;
    private EditText etPwd;

    IUserLoginPresenter bUserLoginPresenter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_mvpdemo);

        etUserName = (EditText) findViewById(R.id.et_username);
        etPwd = (EditText) findViewById(R.id.et_pwd);

        bUserLoginPresenter = new UserLoginPresenter(this);
    }

    @Override
    public void setSuccessInfo() {
        Toast.makeText(this,"登录成功！",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setErrorInfo(int iErrorCode) {
        if(iErrorCode == 1){
            Toast.makeText(this,"登录失败：用户名不存在或不正确",Toast.LENGTH_SHORT).show();
        }else if(iErrorCode == 2){
            Toast.makeText(this,"登录失败：密码不正确",Toast.LENGTH_SHORT).show();
        }

    }

    public void Login(View v){
        bUserLoginPresenter.login(etUserName.getText().toString(),
                etPwd.getText().toString());
    }
}
