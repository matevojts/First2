package com.example.matev.first;

import android.content.Intent;
import android.graphics.Color;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button okButton;
    RelativeLayout baseLayout;
    Button alarmButton;
    //@BindView(R.id.helloTextView) TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ButterKnife.bind(this);

        textView = (TextView)findViewById(R.id.helloTextView);
        okButton = (Button)findViewById(R.id.okButton);
        baseLayout = (RelativeLayout)findViewById(R.id.baseLayout) ;
        alarmButton = (Button)findViewById(R.id.openAlarmClockButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(getResources().getString(R.string.ok));
            }
        });

        baseLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseLayout.setBackgroundColor(Color.rgb(randomColor(),randomColor(),randomColor()));
            }
        });

        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alarmIntent = new Intent(AlarmClock.ACTION_SET_ALARM);
                startActivity(alarmIntent);

            }
        });

    }

    public int randomColor (){
        return (int)(Math.random()*256);
    }




    @Override
    protected void onResume() {
        super.onResume();
    }


}
