package com.appstech.mamun.bdmobileoperatorsshake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Teletalk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teletalk);
        Button teletalkfnfb =(Button) findViewById(R.id.teletalk_fnf_service);
        teletalkfnfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teletalkfnfi = new Intent(Teletalk.this, TeletalkFnf.class);
                startActivity(teletalkfnfi);
            }
        });
        Button teletalkcareb =(Button) findViewById(R.id.teletalk_history);
       teletalkcareb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teletalkcarei = new Intent(Teletalk.this, TeletalkCustomerCare.class);
                startActivity(teletalkcarei);
            }
        });
        Button teleselfb=(Button) findViewById(R.id.teletalk_selfcare_menu);
        teleselfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teleselfi = new Intent(Teletalk.this, TeletalkSelfcare.class);
                startActivity(teleselfi);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_teletalk, menu);
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
