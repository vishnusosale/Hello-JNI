package com.jni.hello_jni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView)findViewById(R.id.text_view)).setText(getMsgFromJni());
    }


    static {
        System.loadLibrary("hello-android-jni");
    }
    public native String getMsgFromJni();
}
