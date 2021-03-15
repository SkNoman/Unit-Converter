package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Spinner spinner1,spinner2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1=findViewById(R.id.spinner1);
        spinner2=findViewById(R.id.spinner2);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        button1=findViewById(R.id.btn);


        String[] names = {"Foot","Meter","CM","KM"};
        ArrayAdapter ad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,names);
        spinner1.setAdapter(ad);
        String[] names2 = {"Meter","Foot","KM","CM"};
        ArrayAdapter ad2 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,names2);
        spinner2.setAdapter(ad2);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Double ans ;
                Double value = Double.parseDouble(e1.getText().toString());
                DecimalFormat point = new DecimalFormat("########.####");


                if(spinner1.getSelectedItem().toString() == "Foot" && spinner2.getSelectedItem().toString() == "Meter")
                {
                    ans = value/3.2808;
                    e2.setText(" "+ point.format(ans));
                }
                else if(spinner1.getSelectedItem().toString() == "Meter" && spinner2.getSelectedItem().toString() == "Foot")
                {
                    ans = value*3.281;
                    e2.setText(" "+ point.format(ans));
                }
                else if(spinner1.getSelectedItem().toString() == "Meter" && spinner2.getSelectedItem().toString() == "CM")
                {
                    ans = value*100;
                    e2.setText(" "+ point.format(ans));
                }
                else if(spinner1.getSelectedItem().toString() == "CM" && spinner2.getSelectedItem().toString() == "Meter")
                {
                    ans = value/100;
                    e2.setText(" "+ point.format(ans));
                }
                else if(spinner1.getSelectedItem().toString() == "KM" && spinner2.getSelectedItem().toString() == "Meter")
                {
                    ans = value*1000;
                    e2.setText(" "+ point.format(ans));
                }
                else if(spinner1.getSelectedItem().toString() == "Meter" && spinner2.getSelectedItem().toString() == "KM")
                {
                    ans = value/1000;
                    e2.setText(" "+ point.format(ans));
                }
                else if(spinner1.getSelectedItem().toString() == "Foot" && spinner2.getSelectedItem().toString() == "CM")
                {
                    ans = value*30.48;
                    e2.setText(" "+ point.format(ans));
                }
                else if(spinner1.getSelectedItem().toString() == "CM" && spinner2.getSelectedItem().toString() == "Foot")
                {
                    ans = value/30.48;
                    e2.setText(" "+ point.format(ans));
                }
                else if(spinner1.getSelectedItem().toString() == "Foot" && spinner2.getSelectedItem().toString() == "KM")
                {
                    ans = value/3282;
                    e2.setText(" "+ point.format(ans));
                }
                else if(spinner1.getSelectedItem().toString() == "KM" && spinner2.getSelectedItem().toString() == "Foot")
                {
                    ans = value*3280.84;
                    e2.setText(" "+ point.format(ans));
                }
                else if(spinner1.getSelectedItem().toString() == "CM" && spinner2.getSelectedItem().toString() == "KM")
                {
                    ans = value/100000;
                    e2.setText(" "+ point.format(ans));
                }
                else if(spinner1.getSelectedItem().toString() == "KM" && spinner2.getSelectedItem().toString() == "CM")
                {
                    ans = value*100000;
                    e2.setText(" "+ point.format(ans));
                }
                //starting condition for same item
                else if(spinner1.getSelectedItem().toString() == "Foot" && spinner2.getSelectedItem().toString() == "Foot")
                {
                    e2.setText(" "+value);
                }
                else if(spinner1.getSelectedItem().toString() == "Meter" && spinner2.getSelectedItem().toString() == "Meter")
                {
                    e2.setText(" "+value);
                }
                else if(spinner1.getSelectedItem().toString() == "CM" && spinner2.getSelectedItem().toString() == "CM")
                {
                    e2.setText(" "+value);
                }
                else if(spinner1.getSelectedItem().toString() == "KM" && spinner2.getSelectedItem().toString() == "KM")
                {
                    e2.setText(" "+value);
                }

            }
        });

        if(TextUtils.isEmpty(e1.getText().toString()))
        {
            Toast.makeText(MainActivity.this,"Put Value To Convert",Toast.LENGTH_SHORT).show();
        }





    }
}