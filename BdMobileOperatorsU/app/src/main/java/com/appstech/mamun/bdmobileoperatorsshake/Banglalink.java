package com.appstech.mamun.bdmobileoperatorsshake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Banglalink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banglalink);
        Button banglalinkfnfb =(Button) findViewById(R.id.banglalink_fnf_service);
        banglalinkfnfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent banglalinkfnfi = new Intent(Banglalink.this, BanglalinkFnf.class);
                startActivity(banglalinkfnfi);
            }
        });
        Button banglalinkcareb =(Button) findViewById(R.id.Banglalink_history);
        banglalinkcareb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent banglalinkcarei = new Intent(Banglalink.this,BanglalinkCustomerCare.class);
                startActivity(banglalinkcarei);
            }
        });
        Button blinkb=(Button) findViewById(R.id.banglalink_selfcare_menu);
        blinkb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent blinki = new Intent(Banglalink.this, BanglalinkSelfcare.class);
                startActivity(blinki);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_banglalink, menu);
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
