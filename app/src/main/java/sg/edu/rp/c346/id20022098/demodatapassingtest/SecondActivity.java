package sg.edu.rp.c346.id20022098.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textView1);

        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 0);
        tvAnswer.setText("Integer value received is: " + value);


        char char1 = intentReceived.getCharExtra("value2", 'a');
        tvAnswer.setText("Integer value received is: " + char1);


        double double1 = intentReceived.getDoubleExtra("value3", 0.0);
        tvAnswer.setText("Integer value received is: " + double1);
    }
}