package com.example.jason.physicsequationssheetplus;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ForcesActivityStudent extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [] Equations = {"F = ma","W = mg","ƒ = μN","Fg = Gm₁m₂/r²","Fc = kq₁q₂/r²"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_forces,R.id.myapp, Equations));
    }
    protected void onListItemClick (ListView l, View v, int position, long id){
        switch (position){
            case 0:

                break;
            case 1:

                break;

            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
        }

    }
}
