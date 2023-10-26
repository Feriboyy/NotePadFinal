package com.example.notepad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


public class TitleAdapter extends ArrayAdapter<NoteModel> {
    Context context;
    TextView titleView;

    // Constructor for the TitleAdapter
    public TitleAdapter(Context context,  List<NoteModel> notes, NoteManager noteManager) {
        super(context, 0, notes);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if (view == null) {

            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item_note, parent, false);
        }
        titleView = view.findViewById(R.id.note_title);
        NoteModel note = getItem(position);
        titleView.setText(note.getTitle());

        return view;
    }


//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        if (convertView == null) {
//
//            // Inflate the layout for a list item if it doesn't exist yet
//            convertView = LayoutInflater.from(getContext())
//                    .inflate(R.layout.list_item_note, parent, false);
//
//        }
//
//        TextView titleView = convertView.findViewById(R.id.note_title);
//
//        NoteModel note = getItem(position);
//        titleView.setText(note.getTitle());
//
//        return convertView;
//    }
}