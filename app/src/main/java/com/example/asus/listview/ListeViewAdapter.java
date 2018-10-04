package com.example.asus.listview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by user_mr on 19/08/2015.
 */
    public class ListeViewAdapter extends BaseAdapter {

    Context c;
    TextView txt;
    ArrayList<Person> list;

    public ListeViewAdapter(Context c, ArrayList<Person> list) {
        super();
        this.c = c;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflator= LayoutInflater.from(c);
        View layout=(View) inflator.inflate(R.layout.person_item, null);
        TextView nom = (TextView)layout.findViewById(R.id.person_item_tv);
        nom.setText(list.get(position).getNom()+list.get(position).getPrenom());
        Log.i(TAG, "getView: "+list.get(position).getNom());
        return layout;
    }
}
