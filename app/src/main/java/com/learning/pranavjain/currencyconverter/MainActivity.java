package com.learning.pranavjain.currencyconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Set EditText ReadOnly
        EditText editText2 = (EditText) findViewById(R.id.printAnswer);
        editText2.setEnabled(false);

        //Floating Button ui
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Converted", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                convert(view);
            }
        });
    }


    public void convert(View view){

        EditText editText1 = (EditText) findViewById(R.id.getInput);
        EditText editText2 = (EditText) findViewById(R.id.printAnswer);

        Toast.makeText(this,"Yo, Sup?",Toast.LENGTH_SHORT).show();
        Log.i("All OK",editText1.getText().toString());

        //Get Input
        int numberInRupees = Integer.parseInt(editText1.getText().toString());
        //Calculate
        int numberInDollars = numberInRupees * 60;
        //Print Output
        editText2.setText(String.valueOf(numberInDollars));



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
