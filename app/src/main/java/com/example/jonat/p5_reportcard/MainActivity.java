package com.example.jonat.p5_reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard boletimCompleto = new ReportCard("Estácio", "Jonathan", 6, 7, 0);

        TextView x = findViewById(R.id.textViewXml);

        x.setText(boletimCompleto.toString());

    }
}
