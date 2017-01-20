package com.example.ramiro174.primeraplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  b, b2;

              //$("#mitoton").click(function(){})

        b=(Button)   findViewById(R.id.b5);
        b2=(Button) findViewById(R.id.carlos);

        b2.setOnClickListener(this);

        View.OnClickListener micli= new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "hola mundo de android", Toast.LENGTH_SHORT).show();

            }
        };
        b.setOnClickListener(micli);







    }


    public  void accionjuanclick(View miboton){

        Toast.makeText(this, "mi boton", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {


    }
}
