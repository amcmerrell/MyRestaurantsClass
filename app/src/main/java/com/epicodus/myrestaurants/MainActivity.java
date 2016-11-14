package com.epicodus.myrestaurants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mFindRestaurantsButton;
    private EditText mLocationEditText;
    private Button mGoToAboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLocationEditText = (EditText) findViewById(R.id.locationEditText);

        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String location = mLocationEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        });

        mGoToAboutButton = (Button) findViewById(R.id.goToAboutButton);
        mGoToAboutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent aboutIntent = new Intent(MainActivity.this, AboutRestaurants.class);
                startActivity(aboutIntent);
            }
        });
    }
}
