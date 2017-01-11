package fr.ducreux.alex.m2tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculatrice extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);
    }

    public void ajouter(View view) {
        EditText nombreA = (EditText) findViewById(R.id.nombreA);
        int a =  Integer.valueOf(nombreA.getText().toString());
        System.out.println("nom a : "+a);
        EditText nombreB =(EditText) findViewById(R.id.nombreB);
        int b = Integer.valueOf(nombreB.getText().toString());
        TextView displayResultat = (TextView) findViewById(R.id.displayResult);
        char op = '+';
        int result = operation(a, b, op);
        displayResultat.setText(Integer.toString(result));
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
