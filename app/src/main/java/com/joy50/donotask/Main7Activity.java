package com.joy50.donotask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {
    Button x,z;
    EditText y;
    float g,tc=0,fr;
    String numsem,tcg;
    int sem;
    int s=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        x=(Button)findViewById(R.id.button);
        z=(Button)findViewById(R.id.button2);
        y=(EditText)findViewById(R.id.sgpa);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            numsem = bundle.getString("SN");
        }
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem= Integer.valueOf(numsem);
                if(sem!=s){
                    g=Float.valueOf(y.getText().toString());
                    tc+=g;
                    s++;
                    Toast.makeText(Main7Activity.this,"Added",Toast.LENGTH_SHORT).show();
                }
                else {
                    z.setEnabled(true);
                    Toast.makeText(Main7Activity.this,"Cheak CGPA",Toast.LENGTH_SHORT).show();
                }
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main7Activity.this,Main8Activity.class);
                fr=tc/sem;
                tcg=String.valueOf(fr);
                i.putExtra("SN",tcg);
                startActivity(i);
            }
        });
    }
}
