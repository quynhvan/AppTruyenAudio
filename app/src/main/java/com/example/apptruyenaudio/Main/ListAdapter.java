package com.example.apptruyenaudio.Main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apptruyenaudio.R;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Truyen> listItems = new ArrayList<>();
    private LayoutInflater inflater;

    public ListAdapter(Context context , ArrayList<Truyen> listItems){
        this. context = context;
        this.listItems = listItems;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Truyen truyen = listItems.get(position);
        if(view == null){
            view = inflater.inflate(R.layout.giao_dien,viewGroup,false);

            TextView tvTitle= view.findViewById(R.id.tv_title);
            ImageView ivImage = view.findViewById(R.id.iv_anh);

            tvTitle.setText(truyen.getTitle());
            ivImage.setImageResource(truyen.getIdImage());
        }
        return view;
    }
}
