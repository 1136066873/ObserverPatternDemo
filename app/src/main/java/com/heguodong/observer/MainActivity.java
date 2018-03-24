package com.heguodong.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 *
 *
 * 珠宝商运送一批钻石，有黄金强盗准备抢劫，珠宝商雇佣了私人保镖，警察局也派人护送，于是当运输车上路的时
 * 候，强盗保镖警察都要观察运输车一举一动，
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView text1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.text1:
                test();
                break;
        }
    }

    private void test() {
        LongMenBiaoJuobserved longMenBiaoJuobserved = new LongMenBiaoJuobserved();

        PoliceObserver policeObserver = new PoliceObserver();
        SecurityObserver securityObserver = new SecurityObserver();
        ThiefObserver thiefObserver = new ThiefObserver();


        longMenBiaoJuobserved.addWatcher(policeObserver);
        longMenBiaoJuobserved.addWatcher(securityObserver);
        longMenBiaoJuobserved.addWatcher(thiefObserver);

        longMenBiaoJuobserved.notifyWatchers();



    }
}
