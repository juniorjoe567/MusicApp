package com.example.android.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jusutech on 8/7/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;


    //Step 3 starts here

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        Word currentWord = getItem(position);


        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.songTitle);
        miwokTextView.setText(currentWord.getmSongTitle());


        TextView englishTextView = (TextView) listItemView.findViewById(R.id.songArtist);
        englishTextView.setText(currentWord.getmSongArtist());


        return listItemView;
    }
}