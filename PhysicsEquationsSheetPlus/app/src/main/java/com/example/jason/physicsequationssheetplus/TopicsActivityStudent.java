package com.example.jason.physicsequationssheetplus;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TopicsActivityStudent extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [] topics = {"Offical College Board AP Equation Sheet ✔","Kinamatics ✔","Forces ✔","Momentum and Energy","Work and Power","Rotational Motion","Circuits","Heat","Waves and Optics","Atomic and Nuclear","Relativity"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_topics,R.id.myapp, topics));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){


        switch(position){
            case 0:
                startActivity(new Intent(TopicsActivityStudent.this, EquationSheetActivity.class));
                break;
            case 1:
                startActivity(new Intent(TopicsActivityStudent.this, KinamaticsActivityStudent.class));
                break;
            case 2:
                startActivity(new Intent(TopicsActivityStudent.this, ForcesActivityStudent.class));
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;

        }
    }
}
