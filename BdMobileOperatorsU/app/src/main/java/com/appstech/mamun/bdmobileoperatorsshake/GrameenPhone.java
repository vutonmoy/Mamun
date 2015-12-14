package com.appstech.mamun.bdmobileoperatorsshake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class GrameenPhone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grameen_phone);
        Button gpbundle=(Button) findViewById(R.id.grameenphone_Bundle_offers);
        gpbundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent robundle = new Intent(GrameenPhone.this, GpBundleOffer.class);
                startActivity(robundle);
            }
        });

        Button gpfnf =(Button) findViewById(R.id.grameenphone_fnf_service);
        gpfnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gpfnfi = new Intent(GrameenPhone.this,GpFnf.class);
                startActivity(gpfnfi);
            }
        });

        Button gpcareb =(Button) findViewById(R.id.grameenphone_history);
        gpcareb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gpcarei = new Intent(GrameenPhone.this,GpCustomerCare.class);
                startActivity(gpcarei);
            }
        });
        Button gpselfb=(Button) findViewById(R.id.grameenphone_selfcare_menu);
        gpselfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gpselfi = new Intent(GrameenPhone.this, GpSelfCareMenu.class);
                startActivity(gpselfi);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_grameen_phone, menu);
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
