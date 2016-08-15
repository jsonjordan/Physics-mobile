package com.example.jason.physicsequationssheetplus;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KinamaticsActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [] Equations = {"v = v₀ + at    ✔","x = x₀ + v₀t + ½at²    ✔","v² = v₀² + 2a(x − x₀)    ✔"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_kinamatics,R.id.myapp, Equations));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(KinamaticsActivity.this, Kinamatics1Activity.class));

                break;
            case 1:
                startActivity(new Intent(KinamaticsActivity.this, Kinamatics2Activity.class));
                break;

            case 2:
                startActivity(new Intent(KinamaticsActivity.this, Kinamatics3Activity.class));
                break;
        }

    }

}
