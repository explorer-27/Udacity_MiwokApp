package com.example.ashut.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<myWord> word=new ArrayList<myWord>();
        word.add(new myWord("Epe","Father",R.drawable.father));
        word.add(new myWord("Eta","Mother",R.drawable.mother));
        word.add(new myWord("Angsi","Son",R.drawable.son));
        word.add(new myWord("Tune","Daughter",R.drawable.daughter));
        word.add(new myWord("Taachi","Elder Brother",R.drawable.elderbrother));
        word.add(new myWord("Chalitti","Younger Brother",R.drawable.youngerbrother));
        word.add(new myWord("Tete","Elder Sister",R.drawable.eldersister));
        word.add(new myWord("Kolliti","Younger Sister",R.drawable.youngersister));
        word.add(new myWord("Ama","GrandFather",R.drawable.grandfather));
        word.add(new myWord("Paapa","Grandmother",R.drawable.grandmother));


        WordAdapter itemsAdapter = new WordAdapter(FamilyMembersActivity.this,word);
        ListView listView=(ListView)findViewById(R.id.myList);
        listView.setAdapter(itemsAdapter);

    }
}
