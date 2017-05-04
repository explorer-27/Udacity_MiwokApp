package com.example.ashut.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<myWord> word=new ArrayList<myWord>();

        word.add(new myWord("Lutti","One", R.drawable.one));
        word.add(new myWord("Otiiko","Two",R.drawable.two));
        word.add(new myWord("Tolookosu","Three",R.drawable.three));
        word.add(new myWord("Oyyisa", "Four", R.drawable.four));
        word.add(new myWord("Massokka","Five",R.drawable.five));
        word.add(new myWord("Temmokka","Six",R.drawable.six));
        word.add(new myWord("Kenekaku","Seven",R.drawable.seven));
        word.add(new myWord("Kawinta","Eight",R.drawable.eight));
        word.add(new myWord("Wo'e","Nine",R.drawable.nine));
        word.add(new myWord("Na'accha","Ten",R.drawable.ten));

        WordAdapter itemsAdapter = new WordAdapter(NumbersActivity.this,word);
        ListView listView=(ListView)findViewById(R.id.myList);
        listView.setAdapter(itemsAdapter);

    }
}
