package com.csseniordesign.hitchhome;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Check if user credentials are stored
        if(userLoggedIn()){
            //May need to create new activity
            Intent homeIntent = new Intent(LoginActivity.this, HomeActivity.class);
            homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(homeIntent);
        }
        else {
            setContentView(R.layout.login);
        }

        final Button loginButton = (Button) findViewById(R.id.btnLogin);
        final Button suButton = (Button) findViewById(R.id.btnSignUp);

        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //perform action
                //Hide buttons
                Intent homeIntent = new Intent(LoginActivity.this, HomeActivity.class);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                //Show login text fields

            }
        });

        suButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //perform action
                //Hide Buttons

                //Show signup textfields

            }
        });


    }


    private boolean userLoggedIn()
    {
        Toast.makeText(this,"You are not logged in, please sign up.", Toast.LENGTH_SHORT);
        return false;
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
