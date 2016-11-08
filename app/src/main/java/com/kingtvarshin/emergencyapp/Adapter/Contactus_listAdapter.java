package com.kingtvarshin.emergencyapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.kingtvarshin.emergencyapp.R;

import java.util.ArrayList;

/**
 * Created by lenovo on 05-09-2016.
 */
public class Contactus_listAdapter extends BaseAdapter {

    private ArrayList<String> name;
    private ArrayList<String> post;
    private ArrayList<String> number;
    private int lastPosition=-1;
    private Context mContext;

    public Contactus_listAdapter(Context context, ArrayList<String> name, ArrayList<String> post, ArrayList<String> number) {
        this.mContext = context;
        this.name = name;
        this.post = post;
        this.number = number;
    }

    @Override
    public int getCount() {
        return name.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.listitem_contactus, viewGroup, false);

        TextView nname = (TextView) row.findViewById(R.id.nametv);
        TextView ppost = (TextView) row.findViewById(R.id.posttv);
        TextView nnumber = (TextView) row.findViewById(R.id.numbertv);

        nname.setText(name.get(position));
        ppost.setText(post.get(position));
        nnumber.setText(number.get(position));


        return row;
    }
}