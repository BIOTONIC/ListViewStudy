package com.lovejoy.listviewtest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LinkedList<Mandora> mData = null;
    private Context mContext = null;
    private ListView mListView = null;
    private MandoraAdapter mAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mData = new LinkedList<Mandora>();
        // drawable resources can not be named by number
        mData.add(new Mandora("freezy", R.drawable.freezy, 3.6f));
        mData.add(new Mandora("ahoyy", R.drawable.ahoyy,4.8f));
        mData.add(new Mandora("akitabarky",R.drawable.akitabarky,4.0f));
        mData.add(new Mandora("bearnie",R.drawable.bearnie,2.8f));
        mData.add(new Mandora("booky",R.drawable.booky,1.0f));
        mData.add(new Mandora("choco",R.drawable.choco,1.4f));
        mData.add(new Mandora("workaholic",R.drawable.workaholic,2.4f));
        mData.add(new Mandora("king",R.drawable.king,3.2f));
        mData.add(new Mandora("soldier",R.drawable.soldier,2.6f));
        mData.add(new Mandora("huntee",R.drawable.huntee,4.6f));

        mContext = MainActivity.this;
        mListView = (ListView) findViewById(R.id.list_view);
        mAdapter = new MandoraAdapter(mData, mContext);
        mListView.setAdapter(mAdapter);
    }
}
