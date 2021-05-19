package sg.edu.rp.c346.id20023243.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");
        // ^ getStringExtra(name of intent received) is to get value of the intent received from MainActivity

        //shortcut using only one answer activity
        //if (questionSelected.equalsIgnoreCase("q1")) {
            //tvAnswer.setText(questionSelected + " answer is: Queue");
        //}
        //else if(questionSelected.equalsIgnoreCase("q2")) {
        //tvAnswer.setText(questionSelected + " answer is: Gone");
        //}
    }
}