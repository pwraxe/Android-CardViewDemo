package com.example.akshay.cardlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button fe,comp,IT,chem,elect,etc,mech,civil;
    View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fe = findViewById(R.id.fe_button);
        comp = findViewById(R.id.computer_button);
        IT = findViewById(R.id.it_button);
        chem = findViewById(R.id.chemical_button);
        elect = findViewById(R.id.electrical_button);
        etc = findViewById(R.id.etc_button);
        mech = findViewById(R.id.mech_button);
        civil = findViewById(R.id.civil_button);
        //showDept(v);

    }

    public void showDept(View v) {

        switch (v.getId())
        {
            case R.id.fe_button:
                Toast.makeText(MainActivity.this,"First year Engineering",Toast.LENGTH_SHORT).show();
                break;
            case R.id.computer_button:
                Toast.makeText(MainActivity.this,"Computer Engineering",Toast.LENGTH_SHORT).show();
                break;
            case R.id.it_button:
                Toast.makeText(MainActivity.this,"IT Engineering",Toast.LENGTH_SHORT).show();
                break;
            case R.id.chemical_button:
                Toast.makeText(MainActivity.this,"Chemical Engineering",Toast.LENGTH_SHORT).show();
                break;
            case R.id.electrical_button:
                Toast.makeText(MainActivity.this,"Electrical Engineering",Toast.LENGTH_SHORT).show();
                break;
            case R.id.etc_button:
                Toast.makeText(MainActivity.this,"E & Tc Engineering",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mech_button:
                Toast.makeText(MainActivity.this,"Mechanical Engineering",Toast.LENGTH_SHORT).show();
                break;
            case R.id.civil_button:
                Toast.makeText(MainActivity.this,"Civil Engineering",Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
