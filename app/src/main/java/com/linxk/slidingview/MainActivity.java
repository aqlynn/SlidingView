package com.linxk.slidingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.linxk.lib.MySlidingView;


/**
 * Created by linxiaoke on 11/14/18.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MySlidingView mySlidingView = (MySlidingView) findViewById(R.id.my_sliding_view);
        mySlidingView.setSlidingTipListener(new MySlidingView.SlidingTipListener() {
            @Override
            public void onSlidFinish() {
                finish();
            }
        });
    }
}
