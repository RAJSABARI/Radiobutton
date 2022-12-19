package com.rajsabari.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button place=findViewById(R.id.place);
        RadioGroup grp=findViewById(R.id.grp);
        final RadioButton[] item = new RadioButton[1];
        place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedid= grp.getCheckedRadioButtonId();
                item[0] =findViewById(selectedid);
                if(selectedid==-1){
                    Toast.makeText(MainActivity.this, "PLEASE SELECT ", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, item[0].getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}