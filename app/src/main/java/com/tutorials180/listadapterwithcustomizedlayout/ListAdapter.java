package com.tutorials180.listadapterwithcustomizedlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter {

    private Context context;
    private ArrayList<MyModelClass> objectMyModelClassArrayList;

    public ListAdapter(@NonNull Context context,ArrayList<MyModelClass> objectMyModelClassArrayList) {
        super(context, R.layout.single_row,objectMyModelClassArrayList);

        this.context=context;
        this.objectMyModelClassArrayList=objectMyModelClassArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View singleRow= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_row,parent,false);

        TextView textView=singleRow.findViewById(R.id.singleRow_TV);
        ImageView imageView=singleRow.findViewById(R.id.singleRow_IV);

        textView.setText(objectMyModelClassArrayList.get(position).getNameOfDay());
        imageView.setImageResource(objectMyModelClassArrayList.get(position).getReferenceOfImage());

        return singleRow;
    }
}
