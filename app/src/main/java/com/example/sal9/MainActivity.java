package com.example.sal9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    TextView TvOut;
    Button BtnOk;
    Button BtnCancel;

    Button BtnSecret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TvOut = (TextView) findViewById(R.id.tvOut);
        BtnOk = (Button) findViewById(R.id.btnOk);
        BtnCancel = (Button) findViewById(R.id.btnCancel);
        BtnSecret = (Button) findViewById(R.id.btnSecret);

        OnClickListener OclBtnOk = new OnClickListener(){
            @Override
            public void onClick(View v) {
                TvOut.setText("Нажата кнопка ОК");
            }
        };

        OnClickListener OclBtnCancel = new OnClickListener() {
            @Override
            public void onClick(View view) {
                TvOut.setText("Нажата кнопка Cancel");
            }
        };

        OnClickListener OclBtnSecret = new OnClickListener() {
            @Override
            public void onClick(View view) {
                TvOut.setText("Я люблю Катю");
            }
        };
        BtnOk.setOnClickListener(OclBtnOk);
        BtnCancel.setOnClickListener(OclBtnCancel);
        BtnSecret.setOnClickListener(OclBtnSecret);
    }
}