package sg.edu.rp.c346.id20023243.demodatapassingtest;

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

        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();

        int iValue = intentReceived.getIntExtra("value", -1);
        tvAnswer.setText("Integer value is: "+ iValue);

    }
}