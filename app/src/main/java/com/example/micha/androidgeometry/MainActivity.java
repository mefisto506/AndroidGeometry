package com.example.micha.androidgeometry;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends Activity {
    TextView square;
    TextView rectangle;
    TextView circle;
    TextView triangle;

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        square = (TextView) findViewById(R.id.sqareString);
        rectangle = (TextView) findViewById(R.id.rectangleString);
        circle = (TextView) findViewById(R.id.circleString);
        triangle = (TextView) findViewById(R.id.triangleString);

    }
    public void clickSquare(View v){
        context = getApplicationContext();
        Intent intent = new Intent(context, square.class);
        startActivity(intent);
        Log.d("square" , "you click square");
    }
    public void clickRectangle(View v){
        context = getApplicationContext();
        Intent intent = new Intent(context, rectangle.class);
        startActivity(intent);
        Log.d("rectangle" , "you click rectangle");
    }
    public void clickCircle(View v){
        context = getApplicationContext();
        Intent intent = new Intent(context, circle.class);
        startActivity(intent);
        Log.d("circle" , "you click circle");
    }
    public void clickTriangle(View v){
        context = getApplicationContext();
        Intent intent = new Intent(context, triangle.class);
        startActivity(intent);
        Log.d("triangle" , "you click triangle");
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
