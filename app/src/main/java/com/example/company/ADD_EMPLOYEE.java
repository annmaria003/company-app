package com.example.company;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ADD_EMPLOYEE extends AppCompatActivity {

    EditText empCode, empName, designation, emailId, salary;
    Button submitButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_employee);

        empCode = (EditText) findViewById(R.id.emp_code);
        empName = (EditText) findViewById(R.id.emp_name);
        designation = (EditText) findViewById(R.id.designation);
        emailId = (EditText) findViewById(R.id.email_id);
        salary = (EditText) findViewById(R.id.salary);
        submitButton = (Button) findViewById(R.id.submit_button);
        backButton = (Button) findViewById(R.id.back_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code = empCode.getText().toString();
                String name = empName.getText().toString();
                String desig = designation.getText().toString();
                String email = emailId.getText().toString();
                String sal = salary.getText().toString();

                Toast.makeText(ADD_EMPLOYEE.this, "Employee Added Successfully", Toast.LENGTH_SHORT).show();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MENU.class);
                startActivity(intent);
                finish();
            }
        });
    }
}