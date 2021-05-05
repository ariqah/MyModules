package sg.edu.rp.c346.id20023243.practical1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    TextView tvDisplay;
    TextView tvSmart;
    TextView tvName;
    EditText etName;
    RadioGroup rgVoltage;
    ToggleButton tgStandby;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        tvSmart = findViewById(R.id.textViewSmartSwitch);
        tvName = findViewById(R.id.textViewName);
        etName = findViewById(R.id.editTextTextPersonName);
        rgVoltage = findViewById(R.id.radioGroupVoltage);
        tgStandby = findViewById(R.id.toggleButtonStandby);
        btnSave = findViewById(R.id.buttonSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = etName.getText().toString();
                tvDisplay.setText(userInput);
            }
        });

        tgStandby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tgStandby.isChecked()) { //if tgStandby is standby
                    etName.setEnabled(true);
                }
                else {  //if tgStandby is not standby
                    etName.setEnabled(false);
                }
            }
        });



    }

}