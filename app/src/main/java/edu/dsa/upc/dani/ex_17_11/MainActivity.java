package edu.dsa.upc.dani.ex_17_11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buto1;


    @Override
    public void onClick(View view) {
        EditText txtent = (EditText) findViewById(R.id.textentrada1);
        String vstring = txtent.getText().toString();
        Intent inb1 = new Intent(this, Activity2.class);
        inb1.putExtra("valor1",vstring);
        startActivityForResult(inb1,100);

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buto1 = (Button) findViewById(R.id.bt1);
        buto1.setOnClickListener(this);
    }

    protected void onActivityResult ( int requestCode , int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if ((requestCode==100)&&(resultCode == Activity.RESULT_OK)){
            Bundle resultsAct = data.getExtras();
            String stresult = resultsAct.getString("valor12");
            TextView txsort = (TextView) findViewById(R.id.textview12);
            txsort.setText(stresult);
            Toast.makeText(this, stresult, Toast.LENGTH_LONG).show();
        }
    }
}
