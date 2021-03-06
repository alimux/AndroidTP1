package fr.ducreux.alex.m2tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculatrice extends AppCompatActivity {


private EditText nombreA, nombreB;
    private TextView displayResultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);
        nombreA = (EditText) findViewById(R.id.nombreA);
        nombreB =(EditText) findViewById(R.id.nombreB);
        displayResultat = (TextView) findViewById(R.id.displayResult);


    }
    public void calculate(char op){
        int a =  Integer.valueOf(nombreA.getText().toString());
        int b = Integer.valueOf(nombreB.getText().toString());
        int result = operation(a, b, op);
        displayResultat.setText(Integer.toString(result));

    }

    public void add(View view) {
        calculate('+');
    }
    public void subtract(View view){
        calculate('-');
    }
    public void multiply(View view){
        calculate('*');
    }
    public void divided(View view){
        calculate('/');
    }



    public int operation(int a, int b, char op){
        int r = 0;
        switch (op){
            case '+' : r =  a + b;
            break;
            case '-' : r = a - b;
            break;
            case '*' : r = a * b;
            break;
            case '/' :
                try {
                r = a / b;
                }
                catch (ArithmeticException e){
                //affichage message d'erreur...
                return 0;
                }
                break;
        }
        return r;

    }

}
