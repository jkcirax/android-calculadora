package com.example.joaobandeira.aplicativocalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt1;
    EditText edt2;
    EditText edtResul;
    Button Sub;
    Button Somar;
    Button Mult;
    Button Div;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText)findViewById(R.id.editTextValor1);
        edt2 = (EditText)findViewById(R.id.editText6Valor2);
        edtResul = (EditText)findViewById(R.id.editText7Resultado);
        Somar = (Button)findViewById(R.id.buttonSomar);
        Sub = (Button)findViewById(R.id.button2Subtrair);
        Mult = (Button)findViewById(R.id.button4Dividir);
        Div = (Button)findViewById(R.id.button3Multiplicar);



        Somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double val1;
                Double val2;
                Double resul;
                val1 = Double.parseDouble(edt1.getText().toString());
                val2 = Double.parseDouble(edt2.getText().toString());
                resul = val1+val2;
                edtResul.setText(resul.toString());
            }
        });


        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double val1;
                Double val2;
                Double resul;
                val1 = Double.parseDouble(edt1.getText().toString());
                val2 = Double.parseDouble(edt2.getText().toString());
                resul = val1-val2;
                edtResul.setText(resul.toString());
            }
        });


        Mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double val1;
                Double val2;
                Double resul;
                val1 = Double.parseDouble(edt1.getText().toString());
                val2 = Double.parseDouble(edt2.getText().toString());
                resul = val1*val2;
                edtResul.setText(resul.toString());
            }
        });


        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double val1;
                Double val2;
                Double resul;
                val1 = Double.parseDouble(edt1.getText().toString());
                val2 = Double.parseDouble(edt2.getText().toString());
                resul = val1/val2;
                edtResul.setText(resul.toString());
            }
        });
    }
}
