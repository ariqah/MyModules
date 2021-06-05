package sg.edu.rp.c346.id20023243.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvModule1, tvModule2, tvModule3, tvModule4, tvModule5, tvModule6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModule1 = findViewById(R.id.textViewModule1);
        tvModule1.setOnClickListener((view) -> {

            Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class); //to pass the following message to ModuleDetailActivity
            intent.putExtra("ModuleCode","C346");
            intent.putExtra("ModuleName","Android Programming");
            intent.putExtra("AcademicYear",2021);
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","E62E");
            startActivity(intent);

        });

        tvModule2 = findViewById(R.id.textViewModule2);
        tvModule2.setOnClickListener((view) -> {

            Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
            intent.putExtra("ModuleCode","C218");
            intent.putExtra("ModuleName","UI/UX Design for Apps");
            intent.putExtra("AcademicYear",2021);
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","W64G");
            startActivity(intent);

        });

        tvModule3 = findViewById(R.id.textViewModule3);
        tvModule3.setOnClickListener((view) -> {

            Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
            intent.putExtra("ModuleCode","C235");
            intent.putExtra("ModuleName","IT Security and Management");
            intent.putExtra("AcademicYear",2021);
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","E65Q");
            startActivity(intent);

        });

        tvModule4 = findViewById(R.id.textViewModule4);
        tvModule4.setOnClickListener((view) -> {

            Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
            intent.putExtra("ModuleCode","G951");
            intent.putExtra("ModuleName","Life Skills III");
            intent.putExtra("AcademicYear",2021);
            intent.putExtra("Semester",1);
            intent.putExtra("ModuleCredit",1);
            intent.putExtra("Venue","HB01");
            startActivity(intent);

        });

        tvModule5 = findViewById(R.id.textViewModule5);
        tvModule5.setOnClickListener((view) -> {

            Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
            intent.putExtra("ModuleCode","C208");
            intent.putExtra("ModuleName","Object-Oriented Programming");
            intent.putExtra("AcademicYear",2020);
            intent.putExtra("Semester",2);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","E37A");
            startActivity(intent);

        });

        tvModule6 = findViewById(R.id.textViewModule6);
        tvModule6.setOnClickListener((view) -> {

            Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
            intent.putExtra("ModuleCode","C227");
            intent.putExtra("ModuleName","Computer System Technologies");
            intent.putExtra("AcademicYear",2020);
            intent.putExtra("Semester",2);
            intent.putExtra("ModuleCredit",4);
            intent.putExtra("Venue","E26C");
            startActivity(intent);

        });

    }
}