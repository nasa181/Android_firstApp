package com.example.nasa181.indiv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;
    Intent it;
    EditText inputdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = ((EditText)findViewById(R.id.editText));
        button = (Button)findViewById((R.id.button));
        textView = (TextView)findViewById(R.id.textView);
        inputdate = (EditText)findViewById(R.id.inputdate);
    }

    public void buttonDown(View v){

        textView.setText("Hello " + editText.getText().toString() );

    }
    public void nextPage(View v){
        it = new Intent(this,CalYearOld.class);
        it.putExtra("data",inputdate.getText().toString());
        startActivity(it);
    }


}
