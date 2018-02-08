package com.dawn.androidspi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;

import com.dawn.aninterface.MyInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        ServiceLoader<MyInterface> loader = ServiceLoader.load(MyInterface.class);
        Iterator<MyInterface> iterator=loader.iterator();
       String string1= iterator.next().display();
       String string2= iterator.next().display();
        ((Button)view).setText(string1+"\n"+string2);
    }
}
