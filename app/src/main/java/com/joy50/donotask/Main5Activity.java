package com.joy50.donotask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    EditText cr,gp;
    String sn ;
    int nfs;
    float cra,gr,tc=0,mgc,sgrpa=0,result;
    String rs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button plus = (Button)findViewById(R.id.add);
        Button sgp = (Button)findViewById(R.id.cheak);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            sn = bundle.getString("SN");
        }
        //Toast.makeText(getApplicationContext(),sn,Toast.LENGTH_SHORT).show();
        nfs=Integer.parseInt(sn);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int counter=0;
                if(counter<=nfs){
                    cr = (EditText)findViewById(R.id.cradit);
                    gp = (EditText)findViewById(R.id.gpa);
                    cra=Float.parseFloat(cr.getText().toString());
                    gr=Float.parseFloat(gp.getText().toString());
                    if(cra>0&&gr>0&&gr<5)
                    {
                        tc=tc+cra;
                        mgc=cra*gr;
                        sgrpa=mgc+sgrpa;
                        result=sgrpa/tc;
                        Toast.makeText(getApplicationContext()," Added..",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Wrong Input",Toast.LENGTH_SHORT).show();
                    }
                }
                counter=counter+1;
                }
        });
        sgp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Main5Activity.this,Main6Activity.class);
                rs=String.valueOf(result);
                i2.putExtra("RS",rs);
                startActivity(i2);
            }
        });
    }
}