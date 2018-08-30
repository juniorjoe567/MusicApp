package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
//        words.add(new Word("eight","munaana"));
//        words.add(new Word("nine","mwenda"));
//        words.add(new Word("ten","ikumi"));



        //use an array adaptor to set the words onto the list view
        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.music_list);
        listView.setAdapter(adapter);

        LinearLayout linearLayout =(LinearLayout)findViewById(R.id.linear);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NowPlayingActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_play:
                //code to run when the play icon is clicked
                Intent intent = new Intent(this, NowPlayingActivity.class);
                startActivity(intent);
                return true;

                //code to run when the sarch icon is clicked
            case R.id.action_search:
                Intent nextActivity = new Intent(this, SearchActivity.class);
                startActivity(nextActivity);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
