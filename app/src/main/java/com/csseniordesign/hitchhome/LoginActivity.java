package com.csseniordesign.hitchhome;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.provider.Settings;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class LoginActivity extends ActionBarActivity {

    final Button btnLogin = (Button) findViewById(R.id.btnLogin);
    final Button btnSignUp = (Button) findViewById(R.id.btnSignUp);
    final Button btnSkipShit = (Button) findViewById(R.id.btnSkipShit);
    final TextView lblEmail = (TextView) findViewById(R.id.lblEmailAddress);
    final TextView lblPassword = (TextView) findViewById(R.id.lblPassword);
    final EditText txtEmail = (EditText) findViewById(R.id.txtEmailAddress);
    final EditText txtPassword = (EditText) findViewById(R.id.txtPassword);

    private SQLiteDatabase database;
    private String userID;
    SharedPreferences prefs = this.getSharedPreferences("com.csseniordesign.hitchhome", MODE_PRIVATE);
    SharedPreferences.Editor editor = prefs.edit();

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
        userID = prefs.getString("userID",null);
        if(userID == null){
            return false;
        }
        else {
            return true;
        }


        /*Toast.makeText(this,"You are not logged in, please sign up.", Toast.LENGTH_SHORT);
        //Get login details
        String email = txtEmail.getText.toString();
        String password = txtPassword.getText.toString();
        //Hash password

        //Open or Create database
        database = openOrCreateDatabase("Accounts",MODE_PRIVATE,null);
        //Create query
        Cursor resultSet = database.rawQuery("SELECT userid FROM LoginInfo WHERE email = " + email + " and password = " + password, null );
        //Get results back
        if(resultSet.isNull(0)){
            return false;
        }
        else{
            //Set global user id in local db

        };
        //Logic to attempt retry or to move to home page

        return false;
        */
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