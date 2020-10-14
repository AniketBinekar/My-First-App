package com.example.firstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class quiz extends AppCompatActivity {
    ListView listviewc;
    TextView t1;
    String laungauge[]={"QUANTITATIVE","LOGICAL RESONING","VERBAL","TECHNICAL MCQ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        listviewc=(ListView)findViewById(R.id.listview25);
        t1=(TextView)findViewById(R.id.textpop);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(quiz.this,android.R.layout.simple_list_item_1,laungauge);
        listviewc.setAdapter(adapter);
        registerForContextMenu(listviewc);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select Action");
        menu.add(0,v.getId(),0,"code");
        menu.add(0,v.getId(),0,"Example");
        menu.add(0,v.getId(),0,"tutorial");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getTitle()=="code")
        {
            Toast.makeText(getApplicationContext(),"Selected code",Toast.LENGTH_SHORT).show();
        }
        else if (item.getTitle()=="Example")
        {
            Toast.makeText(getApplicationContext(),"Selected code",Toast.LENGTH_SHORT).show();
        }
        else if (item.getTitle()=="tutorial")
        {
            Toast.makeText(getApplicationContext(),"Selected code",Toast.LENGTH_SHORT).show();
        }

        else {
            return false;
        }
        return true;
    }
}