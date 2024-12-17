package com.example.company;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SEARCH_EMPLOYEE extends AppCompatActivity {

    EditText empCodeSearch;
    Button searchButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_employee);

        empCodeSearch = (EditText) findViewById(R.id.emp_code_search);
        searchButton = (Button) findViewById(R.id.search_button);
        backButton = (Button) findViewById(R.id.back_to_menu_button);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code = empCodeSearch.getText().toString();

                if (!code.isEmpty()) {
                    Toast.makeText(SEARCH_EMPLOYEE.this, "Employee Found: Code=" + code, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SEARCH_EMPLOYEE.this, "Employee Not Found", Toast.LENGTH_SHORT).show();
                }
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