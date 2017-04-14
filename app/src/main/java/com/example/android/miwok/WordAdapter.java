package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fedea on 12/04/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int backgroundColor;

    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects, int backgroundColor) {
        super(context, 0, objects);
        this.backgroundColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
       }

        Word local_word = getItem(position);

        LinearLayout wordsRow = (LinearLayout) listItemView.findViewById(R.id.words_row);
        wordsRow.setBackgroundResource(backgroundColor);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokWord);
        miwokTextView.setText(local_word.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultWord);
        defaultTextView.setText(local_word.getDefaultTranslation());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        if (local_word.hasImage()) {
            image.setImageResource(local_word.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else
            image.setVisibility(View.GONE);

        return listItemView;
    }
}
