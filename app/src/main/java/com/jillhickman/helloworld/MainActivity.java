package com.jillhickman.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //This method is called when the button is clicked
    public void goToActivity (View view){
        //Goes to the GoodbyeActivity from this, the MainActivity
        Intent intent = new Intent(this, GoodbyeActivity.class);
        startActivity(intent);

    }
}
