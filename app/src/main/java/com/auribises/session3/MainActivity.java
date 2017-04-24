package com.auribises.session3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView;
    EditText editText;
    Button button;
    int num;
    int n;
    int b;
    void init(){

        textView = (TextView) findViewById(R.id.textView);
        editText= (EditText) findViewById(R.id.editText);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id==R.id.button){
            String name = editText.getText().toString().trim();


            Toast.makeText(this,"You Entered: "+num, Toast.LENGTH_LONG).show();
            for(int i=1; i<=num; i++)
            
            textView.setText(n);
        }
    }
}
