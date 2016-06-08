package com.example.nasa181.indiv;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity_1st extends ActionBarActivity {
    EditText editText;
    Button button;
    TextView textView;
    Intent it;
    EditText inputdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_1st);
        editText = ((EditText)findViewById(R.id.editText));
        button = (Button)findViewById((R.id.button));
        textView = (TextView)findViewById(R.id.textView);
        inputdate = (EditText)findViewById(R.id.inputdate);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_1st, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void buttonDown(){

        textView.setText("Hello " + editText.getText().toString() );

    }
    public void nextPage(){
        it = new Intent(this,CalYearOld.class);
        it.putExtra("data",inputdate.toString());
        startActivity(it);
    }


}
