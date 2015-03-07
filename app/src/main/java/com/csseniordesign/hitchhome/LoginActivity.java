package com.csseniordesign.hitchhome;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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

        final Button btnLogin = (Button) findViewById(R.id.btnLogin);
        final Button btnSignUp = (Button) findViewById(R.id.btnSignUp);
        final Button btnSkipShit = (Button) findViewById(R.id.btnSkipShit);
        final TextView lblEmail = (TextView) findViewById(R.id.lblEmailAddress);
        final TextView lblPassword = (TextView) findViewById(R.id.lblPassword);
        final EditText txtEmail = (EditText) findViewById(R.id.txtEmailAddress);
        final EditText txtPassword = (EditText) findViewById(R.id.txtPassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //perform action
                //Hide buttons
                btnLogin.setVisibility(View.INVISIBLE);
                btnSignUp.setVisibility(View.INVISIBLE);
                //Show login text fields
                lblEmail.setVisibility(View.VISIBLE);
                lblPassword.setVisibility(View.VISIBLE);
                txtEmail.setVisibility(View.VISIBLE);
                txtPassword.setVisibility(View.VISIBLE);



            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //perform action
                //Hide Buttons

                //Show signup textfields

            }
        });

        btnSkipShit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //perform action
                //Hide Buttons
                Intent homeIntent = new Intent(LoginActivity.this, HomeActivity.class);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
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
