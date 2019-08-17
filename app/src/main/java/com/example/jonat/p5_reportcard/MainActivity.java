package com.example.jonat.p5_reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText score1 = findViewById(R.id.score_1);
        final EditText score2 = findViewById(R.id.score_2);
        Button btn = findViewById(R.id.bnt);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        ReportCard finalScore = new ReportCard("Estácio", "Jonathan",
                                Integer.parseInt(score1.getText().toString()),
                                Integer.parseInt(score2.getText().toString()), 0);
                        TextView x = findViewById(R.id.textViewXml);
                        x.setText(finalScore.toString());
                    }
                });
    }
}
