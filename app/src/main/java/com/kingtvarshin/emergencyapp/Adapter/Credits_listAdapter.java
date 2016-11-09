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
public class Credits_listAdapter extends BaseAdapter {

    private ArrayList<String> name;
    private int lastPosition=-1;
    private Context mContext;

    public Credits_listAdapter(Context context, ArrayList<String> name) {
        this.mContext = context;
        this.name = name;
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
        View row = inflater.inflate(R.layout.listitem_credits, viewGroup, false);

        TextView nname = (TextView) row.findViewById(R.id.creditnametv);

        nname.setText(name.get(position));


        return row;
    }
}