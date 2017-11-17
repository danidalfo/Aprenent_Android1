package edu.dsa.upc.dani.ex_17_11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    TextView txview2;
    Button bt2;
    String resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txview2 = (TextView) findViewById(R.id.txtviewA2);
        bt2 = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(this);

        Bundle intentdata = getIntent().getExtras();

        String txtpas = intentdata.getString("valor1");

        txview2.setText(txtpas);


    }

    public void onClick(View v) {
        resultat = txview2.getText().toString();

        resultat = resultat + "des de l'activitat2";

        Intent intres = getIntent();
        intres.putExtra("valor12",resultat);
        setResult(RESULT_OK,intres);

        finish();

    }
}
