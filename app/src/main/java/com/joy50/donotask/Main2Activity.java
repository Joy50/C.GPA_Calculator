package com.joy50.donotask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText n,r,d,l,t;
    String nme,dpt;
    int rol,lvl,trm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        n = (EditText)findViewById(R.id.name);
        r = (EditText)findViewById(R.id.roll);
        d = (EditText)findViewById(R.id.dept);
        l = (EditText)findViewById(R.id.level);
        t = (EditText)findViewById(R.id.term);
        Button g =(Button)findViewById(R.id.go);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nme=n.getText().toString();
                rol=Integer.parseInt(r.getText().toString());
                dpt=d.getText().toString();
                lvl=Integer.parseInt(l.getText().toString());
                trm=Integer.parseInt(t.getText().toString());
                Toast.makeText(getApplicationContext(),"Hi "+nme,Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(i);
            }
        });
    }
}
