package com.example.saiwei.myxgdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.tencent.android.tpush.XGPushBaseReceiver;
import com.tencent.android.tpush.XGPushClickedResult;
import com.tencent.android.tpush.XGPushManager;
import com.tencent.android.tpush.XGPushRegisterResult;
import com.tencent.android.tpush.XGPushShowedResult;
import com.tencent.android.tpush.XGPushTextMessage;

public class MainActivity extends AppCompatActivity{

    private final String TAG = "chenwei.MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 开启logcat输出，方便debug，发布时请关闭
// XGPushConfig.enableDebug(this, true);
// 如果需要知道注册是否成功，请使用registerPush(getApplicationContext(), XGIOperateCallback)带callback版本
// 如果需要绑定账号，请使用registerPush(getApplicationContext(),account)版本
// 具体可参考详细的开发指南
// 传递的参数为ApplicationContext
        Context context = getApplicationContext();
        XGPushManager.registerPush(context);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        // TODO Auto-generated method stub
        super.onNewIntent(intent);

        Log.i(TAG,"onNewIntent()" +intent.getAction());
        setIntent(intent);
    }
}
