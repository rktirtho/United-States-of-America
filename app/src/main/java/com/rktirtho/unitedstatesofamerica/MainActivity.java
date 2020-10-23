package com.rktirtho.unitedstatesofamerica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnStates, btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnStates.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_states:
                startActivity(new Intent(MainActivity.this, StatesList.class));
                break;
            case R.id.about:
                startActivity(new Intent(MainActivity.this, About.class));
        }
    }

    private void init(){
        btnStates =  findViewById(R.id.btn_states);
        btnAbout =  findViewById(R.id.about);
    }
}