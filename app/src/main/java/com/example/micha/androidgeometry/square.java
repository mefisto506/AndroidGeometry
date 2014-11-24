package com.example.micha.androidgeometry;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class square extends Activity {

    EditText sideA;
    Button calculate;
    TextView area;
    TextView circuit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        sideA = (EditText) findViewById(R.id.sideA);
        calculate = (Button) findViewById(R.id.calculate);
        area = (TextView) findViewById(R.id.area);
        circuit = (TextView) findViewById(R.id.circuit);
    }

    public void calculate(View v){
        area.setText((Double.parseDouble(sideA.getText().toString()) * (Double.parseDouble(sideA.getText().toString())))+"");
        circuit.setText((Double.parseDouble(sideA.getText().toString()) * 4)+"");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_square, menu);
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
