package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=findViewById(R.id.togglebtn);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String condition = toggleButton.getText() +" ";
                Toast.makeText(MainActivity.this, ""+condition, Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    Toast.makeText(MainActivity.this, "Friends", Toast.LENGTH_SHORT).show();
                    // Pirates are the best
                    break;
            case R.id.radio_ninjas:
                if (checked)
                    Toast.makeText(MainActivity.this, "Family", Toast.LENGTH_SHORT).show();
                    // Ninjas rule
                    break;
        }
    }
}
