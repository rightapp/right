package com.lemonade.stand.right;

/**
 * Created by navneeeth99 on 24/11/16.
 */

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.NotesHolder> {

    private ArrayList<Notes> mNotes;

    public static class NotesHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mTitleSummary;
        private TextView mContentSummary;

        private static final String NOTE_KEY = "NOTES";

        public NotesHolder(View v) {
            super(v);

            mTitleSummary = (TextView) v.findViewById(R.id.noteTitleSummary);
            mContentSummary = (TextView) v.findViewById(R.id.noteContentSummary);
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Log.d("RecyclerView", "CLICK!");
        }
    }

    public RecyclerAdapter(ArrayList<Notes> notes) {
        mNotes = notes;
    }

    @Override
    public RecyclerAdapter.NotesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new NotesHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.NotesHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mNotes.size();
    }
}
