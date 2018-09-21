package com.joy50.donotask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    TextView result;
    String rs,sem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        result=(TextView)findViewById(R.id.point);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            rs = bundle.getString("RS");
            sem=bundle.getString("SN");
        }
        Toast.makeText(getApplicationContext(),rs,Toast.LENGTH_SHORT).show();
        result.setText(rs);
    }
}

