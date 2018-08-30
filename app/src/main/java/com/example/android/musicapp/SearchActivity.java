package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //this array list will keep all our words
        ArrayList<Word> words = new ArrayList<Word>();
        Word w = new Word("All too well","Taylor Swift");
        words.add(w);
        words.add(new Word("One more night","Maroon 5"));
        words.add(new Word("Remind me","Usher Rymond"));
        words.add(new Word("Storm is over","R.Kelly"));
        words.add(new Word("Slowly","Meddy"));
        words.add(new Word("Champion","Jose Chameleone"));
        words.add(new Word("Gutamiiza","Goodlyfe ft B2C"));


        //use an array adaptor to set the words onto the list view
        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.the_music_list);
        listView.setAdapter(adapter);

    }
}
