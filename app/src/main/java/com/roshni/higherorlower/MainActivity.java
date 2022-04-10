package com.roshni.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


//hi1
    public void guess(View view){
        EditText number = (EditText) findViewById(R.id.editTextNumber);
        int num = Integer.parseInt(number.getText().toString());
        Button button = (Button) findViewById(R.id.button);
        int n = (int)(Math.random()*(21-1+1)+1);
        if(num>n){
            Toast.makeText(this, "Too high", Toast.LENGTH_SHORT).show();
        }
        else if(num<n){
            Toast.makeText(this, "Too low", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Perfect!! Play Again", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}