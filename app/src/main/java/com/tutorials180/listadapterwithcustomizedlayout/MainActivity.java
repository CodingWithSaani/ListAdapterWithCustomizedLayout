package com.tutorials180.listadapterwithcustomizedlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String [] myData={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
    ,"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
    ,"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    private ListView objectListView;
    private ListAdapter objectListAdapter;

    private ArrayList<MyModelClass> objectArrayListOfModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeObjects();
    }

    private void initializeObjects()
    {
        try
        {
            objectListView=findViewById(R.id.LV);
            objectArrayListOfModel=new ArrayList<>();

            addDataToArrayList();
            objectListAdapter=new ListAdapter(this,objectArrayListOfModel);

            objectListView.setAdapter(objectListAdapter);

        }
        catch (Exception e)
        {
            Toast.makeText(this, "initializeObjects:"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void addDataToArrayList()
    {
        try
        {
            for(int count=0;count<50;count++)
            {
                objectArrayListOfModel.add(new MyModelClass("Name :"+count,R.drawable.ic_weak_days));
            }
        }
        catch (Exception e)
        {
            Toast.makeText(this, "initializeObjects:"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
