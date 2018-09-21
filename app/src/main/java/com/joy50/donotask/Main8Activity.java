package com.joy50.donotask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {
    TextView result;
    String finr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        result=(TextView)findViewById(R.id.point);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            finr = bundle.getString("SN");
        }
        Toast.makeText(getApplicationContext(),finr,Toast.LENGTH_SHORT).show();
        result.setText(finr);
    }
}
