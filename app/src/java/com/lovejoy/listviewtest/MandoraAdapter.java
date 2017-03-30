package com.lovejoy.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by lovejoy on 30/03/2017.
 */
public class MandoraAdapter extends BaseAdapter {
    private LinkedList<Mandora> mData;
    private Context mContext;

    public MandoraAdapter(LinkedList<Mandora> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int pos) {
        return mData.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);

        ImageView icon = (ImageView) convertView.findViewById(R.id.icon);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        RatingBar star = (RatingBar) convertView.findViewById(R.id.star);

        icon.setBackgroundResource(mData.get(pos).getIcon());
        name.setText(mData.get(pos).getName());
        star.setRating(mData.get(pos).getStar());

        return convertView;
    }


}
