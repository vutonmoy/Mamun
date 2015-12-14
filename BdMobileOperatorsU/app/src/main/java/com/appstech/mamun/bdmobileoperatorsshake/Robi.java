package com.appstech.mamun.bdmobileoperatorsshake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Robi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robi);
        Button robibundle=(Button) findViewById(R.id.robi_Bundle_offers);
        robibundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent robibundle = new Intent(Robi.this, RobiBundleOffer.class);
                startActivity(robibundle);
            }
        });

        Button robipackagesb =(Button) findViewById(R.id.robi_packages_information);
        robipackagesb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent robipackagesi = new Intent(Robi.this, RobiPackageinformatins.class);
                startActivity(robipackagesi);
            }
        });
        Button robifnfb =(Button) findViewById(R.id.robi_fnf_service);
        robifnfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent robifnfi = new Intent(Robi.this, RobiFnf.class);
                startActivity(robifnfi);
            }
        });
        Button robicareb =(Button) findViewById(R.id.Robi_history);
        robicareb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent robicarei = new Intent(Robi.this, RobiCustomerCare.class);
                startActivity(robicarei);
            }
        });
        Button robiselfb=(Button) findViewById(R.id.robi_selfcare_menu);
       robiselfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent robiselfi = new Intent(Robi.this, RobiSelfCare.class);
                startActivity(robiselfi);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_robi, menu);
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
