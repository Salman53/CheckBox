package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox1 , checkBox2 , checkBox3;
    Button btnApply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        btnApply = findViewById(R.id.id_btnApply);





    }


    public void onCheckClick(View view){
        int checkId = view.getId();
        switch (checkId){
            case R.id.checkbox1:
                if(((CheckBox)view).isChecked() ) {
                    Toast.makeText(this, "Marshmallow checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Marshmallow unchecked", Toast.LENGTH_SHORT).show();
                }
                return;

            case R.id.checkbox2:
                if(((CheckBox)view).isChecked() ) {
                    Toast.makeText(this, "Nougout checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Nougout unchecked", Toast.LENGTH_SHORT).show();
                }
                return;
            case R.id.checkbox3:
                if(((CheckBox)view).isChecked() ) {
                    Toast.makeText(this, "Oreo checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Oreo unchecked", Toast.LENGTH_SHORT).show();
                }
                return;
        }
    }




}

