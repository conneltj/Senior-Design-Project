package com.csseniordesign.hitchhome;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by conne_000 on 3/4/2015.
 */
public class HomeActivity extends ActionBarActivity{

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assignBtnEventHandlersHomePage();

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
    }

    public void assignBtnEventHandlersHomePage(){
        ImageButton searchButton = (ImageButton) findViewById(R.id.btnRideSearch);
        ImageButton driverButton = (ImageButton) findViewById(R.id.btnDriver);
        ImageButton accdetailsButton = (ImageButton) findViewById(R.id.btnAccountDetails);
        ImageButton placholderButton = (ImageButton) findViewById(R.id.btnFillerAintNoKiller);

        searchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent SearchRide = new Intent(HomeActivity.this, SearchRide.class);
                startActivity(SearchRide);
            }
        });
        driverButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //perform action
                //Hide buttons

                //Show login text fields

            }
        });
        accdetailsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //perform action
                //Hide buttons

                //Show login text fields

            }
        });
        placholderButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //perform action
                //Hide buttons

                //Show login text fields

            }
        });

    }

}
