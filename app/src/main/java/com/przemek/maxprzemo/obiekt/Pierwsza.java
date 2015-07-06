package com.przemek.maxprzemo.obiekt;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;


public class Pierwsza extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pierwsza);
    }

    public void Rusz(View view)
    {
        String cat = null;
        TextView textview;
        textview = (TextView)findViewById(R.id.text);
//        Oblicz oblicz = new Oblicz(2, 5);
//        textview.setText(oblicz.rozwiąż());
        MemInfo meminfo = new MemInfo();
        textview.setText(meminfo.pobierz());
        Toast.makeText(getApplicationContext(),"itam",Toast.LENGTH_LONG).show();
        Log.e("maxprzemo","Udało się");


    }

}
