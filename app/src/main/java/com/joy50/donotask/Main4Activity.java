package com.joy50.donotask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {
    EditText sn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        sn =(EditText)findViewById(R.id.ns);
        Button g1=(Button)findViewById(R.id.go1);
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snval = sn.getText().toString();
                Intent i1 = new Intent(Main4Activity.this,Main5Activity.class);
                i1.putExtra("SN",snval);
                startActivity(i1);
            }
        });
    }
}
