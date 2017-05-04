package com.example.ashut.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<myWord> word=new ArrayList<myWord>();
        word.add(new myWord("Wetetti","Red",R.drawable.red));
        word.add(new myWord("Chokokki","Green",R.drawable.green));
        word.add(new myWord("Takaakki","Brown",R.drawable.brown));
        word.add(new myWord("Topoppi","Gray",R.drawable.gray));
        word.add(new myWord("Kululli","Black",R.drawable.black));
        word.add(new myWord("Kelelli","White",R.drawable.white));
        word.add(new myWord("Topisse","Dusty Yellow",R.drawable.dustyyellow));
        word.add(new myWord("Chiwiite","Mustard Yellow",R.drawable.mustardyellow));


        WordAdapter itemsAdapter = new WordAdapter(ColorsActivity.this,word);
        ListView listView=(ListView)findViewById(R.id.myList);
        listView.setAdapter(itemsAdapter);

    }

}
