package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter<T> extends ArrayAdapter<Word> {

    private int mResourceColourId;
    private int mMediaId;

    /**
     * @param position    position of the object we are going to display
     * @param convertView the present view that we are gonna display
     * @param parent      the parent View Group
     * @return the View for the position in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;


        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.layout_items, parent, false);
        }

        //Get the item in the given position
        final Word presentWord = getItem(position);

        //Create an object of text view and map it to the resource id in the layout
        TextView miwokTranslate = (TextView) listItemView.findViewById(R.id.layout_miwok);

        //Display the miwok word in the screen
        miwokTranslate.setText(presentWord.getMiwokTranslation());

        //Set the background colour for the text view
        miwokTranslate.setBackgroundResource(mResourceColourId);

        //Similar for the other view
        TextView englishTranslate = (TextView) listItemView.findViewById(R.id.layout_english);
        englishTranslate.setText(presentWord.getDefaultTranslation());
        englishTranslate.setBackgroundResource(mResourceColourId);


        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        if (presentWord.hasImage()) {
            image.setImageResource(presentWord.getResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }


        return listItemView;
    }

    public WordAdapter(Activity context, ArrayList<Word> arrayList, int resourceIdColour) {
        super(context, 0, arrayList);
        mResourceColourId = resourceIdColour;
    }

}
