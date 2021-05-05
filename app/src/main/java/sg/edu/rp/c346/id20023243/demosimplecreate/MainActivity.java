 package sg.edu.rp.c346.id20023243.demosimplecreate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btnDisplay;
    EditText etInput;
    TextView tvDisplay;
    ToggleButton tgBtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay = findViewById(R.id.buttonDisplay); //linking xml id to variables
        etInput = findViewById(R.id.editTextInput);
        tvDisplay = findViewById(R.id.textViewDisplay);  // R.id.<id of the variable>
        tgBtn = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {  //listen for click
            @Override
            public void onClick(View v) { //if user got click execute this

                String userInput = etInput.getText().toString();
                if (rgGender.getCheckedRadioButtonId() == R.id.radioButtonGenderMale) {
                    userInput = "He says " + userInput;
                }
                else {
                    userInput = "She says " + userInput;
                }
                tvDisplay.setText(userInput);
                // set value of userInput to variable tvDisplay
                // purpose is so that whatever user type (& the he/she say)
                // will be displayed on tvDisplay
            }
        });

        tgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tgBtn.isChecked()) {
                    etInput.setEnabled(true);
                }
                else{
                    etInput.setEnabled(false);
                }
            }
        });
    }
}