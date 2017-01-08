package fr.ducreux.alex.m2tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Calculatrice extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);
    }

    EditText editText = (EditText) findViewById(R.id.nombreA);
    editText.setOnEditorActionListener(new TextView.OnEditorActionListener(){
        @override
                public
    })




    public int addOperation(int a, int b)
    {
        return  a + b;
    }
    public int subtractOperation(int a, int b)
    {
        return a - b;
    }
    public int multiplyOperation(int a, int b)
    {
        return  a * b;
    }
    public  int dividedOperation(int a, int b)
    {

        try {
            return a / b;
        }
        catch (ArithmeticException e){
            //affichage message d'erreur...
            return 0;
        }
    }
}
