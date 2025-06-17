package com.example.adapterapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {

    private Context context;
    private String[] items;

    public MyCustomAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if(view == null)
        {
            //Inflate the layout
            view = LayoutInflater.from(context).inflate(R.layout.my_list_item, viewGroup, false);

            holder = new ViewHolder();
            holder.textView = view.findViewById(R.id.list_item_view);
            view.setTag(holder);
        }
        else //Reuse the existing/recycled view
        {
            holder = (ViewHolder) view.getTag();
        }

        //Set the data to the view
        holder.textView.setText(items[i]);

        return view;
    }

    //ViewHolder class to hold the references of the text views within the item layout

    static class ViewHolder {
        TextView textView;
    }
}
