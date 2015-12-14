package com.appstech.mamun.bdmobileoperatorsshake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Airtel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airtel);
        Button airtelfnfb =(Button) findViewById(R.id.airtel_fnf_service);
        airtelfnfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent airtelfnfi = new Intent(Airtel.this, AirtelFnf.class);
                startActivity(airtelfnfi);
            }
        });
        Button airtelcareb =(Button) findViewById(R.id.airtel_history);
       airtelcareb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent airtelcarei = new Intent(Airtel.this, AirtelCustomerCare.class);
                startActivity(airtelcarei);
            }
        });
        Button airtelselfb=(Button) findViewById(R.id.airtel_selfcare_menu);
        airtelselfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent airtelselfi = new Intent(Airtel.this, AirtelSelfCareMenu.class);
                startActivity(airtelselfi);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_airtel, menu);
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
