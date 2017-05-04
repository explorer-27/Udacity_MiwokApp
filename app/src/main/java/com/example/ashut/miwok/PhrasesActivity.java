package com.example.ashut.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<myPhrases> phrase=new ArrayList<myPhrases>();
        phrase.add(new myPhrases("Minto wiksus ?","Where are you  going ?"));
        phrase.add(new myPhrases("Tinne oyaa'sene ?","What's your name ?"));
        phrase.add(new myPhrases("Oyaaset ....","My name is...."));
        phrase.add(new myPhrases("Michekses ?","How are you feeling ?"));
        phrase.add(new myPhrases("Kuchi Achit.","I'm feeling good."));
        phrase.add(new myPhrases("Eeenes'aa ?","Are you coming ?"));
        phrase.add(new myPhrases("Hee'Eenem.","Yes, I'm coming."));
        phrase.add(new myPhrases("Eenem ","I'm coming"));
        phrase.add(new myPhrases("Yoowutis ","Let's go"));
        phrase.add(new myPhrases("Enni'nem.","Come Here !"));


        phrasesAdapter itemsAdapter = new phrasesAdapter(PhrasesActivity.this,phrase);
        ListView listView=(ListView)findViewById(R.id.myList);
        listView.setAdapter(itemsAdapter);

    }
}
