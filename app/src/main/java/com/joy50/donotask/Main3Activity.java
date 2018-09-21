package com.joy50.donotask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    Button a;
    EditText b;
    String numsem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        a=(Button)findViewById(R.id.go);
        b=(EditText)findViewById(R.id.nsem);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numsem=String.valueOf(b.getText().toString());
                Intent i=new Intent(Main3Activity.this,Main7Activity.class);
                i.putExtra("SN",numsem);
                startActivity(i);
            }
        });
    }
}
