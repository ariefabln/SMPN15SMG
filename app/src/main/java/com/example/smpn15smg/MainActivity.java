package com.example.smpn15smg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView simpleImageButtonNilai = (ImageView) findViewById(R.id.simpleImageButtonNilai);
        ImageView simpleImageButtonCalender = (ImageView) findViewById(R.id.simpleImageButtonCalender);
        ImageView simpleImageButtonProfile = (ImageView) findViewById(R.id.simpleImageButtonProfile);
        ImageView simpleImageButtonReport = (ImageView) findViewById(R.id.simpleImageButtonReport);
        ImageView simpleImageButtonRate = (ImageView) findViewById(R.id.simpleImageButtonRate);
        ImageView simpleImageButtonSetting = (ImageView) findViewById(R.id.simpleImageButtonSetting);
        CardView cvAdd = (CardView) findViewById(R.id.cvAdd);

        simpleImageButtonNilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Nilai",Toast.LENGTH_SHORT).show();
                //display the toast on nilai button click
            }
        });

        simpleImageButtonCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Calender", Toast.LENGTH_SHORT).show();
            }
        });

        simpleImageButtonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Profile", Toast.LENGTH_SHORT).show();
            }
        });

        simpleImageButtonReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Report", Toast.LENGTH_SHORT).show();
            }
        });

        simpleImageButtonRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Rate", Toast.LENGTH_SHORT).show();
            }
        });

        simpleImageButtonSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Setting", Toast.LENGTH_SHORT).show();
            }
        });

        cvAdd.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v) {
                        //Add Your action here
            }
        });
    }
}