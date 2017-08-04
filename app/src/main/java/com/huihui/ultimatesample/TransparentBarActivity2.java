package com.huihui.ultimatesample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.huihui.ultimatebar.UltimateBar;


public class TransparentBarActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        UltimateBar ultimateBar = new UltimateBar(this);
        ultimateBar.setTransparentBar(Color.GREEN, 50);
        ((ImageView) findViewById(R.id.image_view))
                .setImageResource(R.drawable.yurisa_3);
    }

/*    @Override
    protected void initBar() {
        setTransparentBar(Color.GREEN, 50);
    }*/
}
