package sg.edu.rp.c346.id20023243.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModuleCode, tvModuleName, tvAcademicYear, tvSemester, tvModularCredit, tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModuleCode = findViewById(R.id.textViewModuleCode);
        tvModuleName = findViewById(R.id.textViewModuleName);
        tvAcademicYear = findViewById(R.id.textViewAcademicYear);
        tvSemester = findViewById(R.id.textViewSemester);
        tvModularCredit = findViewById(R.id.textViewModularCredit);
        tvVenue = findViewById(R.id.textViewVenue);

        Intent intentReceived = getIntent();

        String moduleCode = intentReceived.getStringExtra("ModuleCode");
        String moduleName = intentReceived.getStringExtra("ModuleName");
        int academicYear = intentReceived.getIntExtra("AcademicYear",2020); //2020 because that is my first AY
        int sem = intentReceived.getIntExtra("Semester",1);
        int modularCredit = intentReceived.getIntExtra("ModuleCredit",1); //1 because lowest modular credit is 1
        String venue = intentReceived.getStringExtra("Venue");

        tvModuleCode.setText("Module Code: "+moduleCode);
        tvModuleName.setText("Module Name: "+moduleName);
        tvAcademicYear.setText("Academic Year: "+academicYear);
        tvSemester.setText("Semester Number: "+sem);
        tvModularCredit.setText("Module Credit:"+modularCredit);
        tvVenue. setText("Venue: "+venue);

        //back button enhancement
        btnBack = findViewById(R.id.buttonBack);
        btnBack.setOnClickListener((view) -> { finish(); });


    }
}