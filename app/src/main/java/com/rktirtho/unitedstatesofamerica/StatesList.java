package com.rktirtho.unitedstatesofamerica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StatesList extends AppCompatActivity {
    ListView listView;
    static String[] states = {"Alabama"," Alaska"," Arizona"," Arkansas"," California"," Colorado",
            " Connecticut"," Delaware"," Florida"," Georgia"," Hawaii"," Idaho"," Illinois",
            " Indiana"," Iowa"," Kansas"," Kentucky"," Louisiana"," Maine"," Maryland",
            " Massachusetts"," Michigan"," Minnesota"," Mississippi"," Missouri"," Montana",
            " Nebraska"," Nevada"," New Hampshire"," New Jersey"," New Mexico"," New York",
            " North Carolina"," North Dakota"," Ohio"," Oklahoma"," Oregon"," Pennsylvania",
            " Rhode Island"," South Carolina"," South Dakota"," Tennessee"," Texas"," Utah",
            " Vermont"," Virginia"," Washington"," West Virginia"," Wisconsin"," Wyoming"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states_list);
       init();


        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.model_states_list, R.id.tv_state,states);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(StatesList.this, StateView.class);
                intent.putExtra("id", i);
                startActivity(intent);
            }
        });

    }

    private void init(){

        listView = (ListView) findViewById(R.id.lv_state);
    }
}