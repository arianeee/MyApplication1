package com.example.wilder.myapplication1;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         // Positionnons un listener sur ce bouton
        EditText simpleEditText3 = (EditText) findViewById(R.id.editTextrose);
        simpleEditText3.setBackgroundColor (Color .MAGENTA);
        CheckBox simpleCheckBox = (CheckBox) findViewById(R.id.mymcheckBox);

        final
        EditText simpleEditText = (EditText) findViewById(R.id.myname);
        //final String editTextValue = simpleEditText.getText().toString();
        final EditText simpleEditText2 = (EditText) findViewById(R.id.myname2);
        

        //if (simpleCheckBox.isChecked()


        final Button button = findViewById(R.id.mybutton);

        simpleCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {




                simpleEditText.setEnabled(b);
                simpleEditText2.setEnabled(b);
                button.setEnabled(b);

                


            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String editTextValue = simpleEditText.getText().toString();
                String editTextValue2 = simpleEditText2.getText().toString();
                if((editTextValue.isEmpty() || editTextValue2.isEmpty()))
                {
                    //String editTextValue = simpleEditText.getText().toString();
                    //String editTextValue2 = simpleEditText2.getText().toString();

                    Toast.makeText(MainActivity.this, "You have to fill your name and last name", Toast.LENGTH_LONG).show();}

                    else {Toast.makeText(MainActivity.this, "congratulation   " + editTextValue+ "  "  +editTextValue2 , Toast.LENGTH_LONG).show();}
                /* Code here executes on main thread after user presses button */
            }
        });



    }


}

