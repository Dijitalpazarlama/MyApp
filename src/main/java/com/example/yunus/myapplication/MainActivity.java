package com.example.yunus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener, EditText.OnEditorActionListener {
    int sayac = 0;
    TextView tv1;
    TextView tv2;
    Button b1;
    Button b2;
    Button b3;
    karakter k = new karakter();
    EditText isim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

        k.saldiriGucu = 100;
        k.kilo = 10;
        k.hareketSayisi = 10;
        tv1.setText(k.toString());
        tv2.setText("oyuna hoşgeldiniz, lütfen bir eylem seçiniz");
        isim = findViewById(R.id.editText);
        isim.setOnEditorActionListener(this);
    }

    @Override
    public boolean onEditorAction(TextView tv, int x, KeyEvent ke){
        tv2.setText("karakterin ismi "+ isim.getText()+" olarak atandı");
        k.isim = (String) isim.getText().toString();
        tv1.setText(k.toString());
        tv1.setVisibility(View.VISIBLE);
        isim.setVisibility(View.INVISIBLE);
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == b1.getId()) {
            tv2.setText(k.savas());
        } else if (view.getId()==b2.getId()) {
            tv2.setText(k.yemek());
        } else if (view.getId()==b3.getId()){
            tv2.setText(k.uyu());
        } tv1.setText(k.toString());
    }
}