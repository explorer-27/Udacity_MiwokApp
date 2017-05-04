package com.example.ashut.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvNumbers, tvColors, tvPhrases, tvFmailyMembers;
        tvNumbers=(TextView)findViewById(R.id.tvNumbers);
        tvFmailyMembers=(TextView)findViewById(R.id.tvFamilyMembers);
        tvColors=(TextView)findViewById(R.id.tvColors);
        tvPhrases=(TextView)findViewById(R.id.tvPhrases);

        tvNumbers.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i);
            }
        });
        tvFmailyMembers.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(i);
            }
        });
        tvColors.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(i);
            }
        });
        tvPhrases.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(i);
            }
        });


    }
}
