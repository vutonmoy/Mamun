package com.appstech.mamun.bdmobileoperatorsshake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button gp=(Button) findViewById(R.id.grameenphone);
        gp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gp = new Intent(MainActivity.this, GrameenPhone.class);
                startActivity(gp);
            }
        });
        Button robi=(Button) findViewById(R.id.robi);
        robi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent robi = new Intent(MainActivity.this, Robi.class);
                startActivity(robi);
            }
        });
        Button banglalink=(Button) findViewById(R.id.banglalink);
        banglalink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent banglalink = new Intent(MainActivity.this, Banglalink.class);
                startActivity(banglalink);
            }
        });
        Button citycell=(Button) findViewById(R.id.citycell);
      citycell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent citycell = new Intent(MainActivity.this, Citycell.class);
                startActivity(citycell);
            }
        });
        Button airtel=(Button) findViewById(R.id.airtel);
        airtel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent airtel = new Intent(MainActivity.this, Airtel.class);
                startActivity(airtel);
            }
        });
        Button teletalk=(Button) findViewById(R.id.teletalk);
        teletalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teletalk = new Intent(MainActivity.this, Teletalk.class);
                startActivity(teletalk);
            }
        });
        Button aboutus=(Button) findViewById(R.id.aboutus);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(MainActivity.this, AboutUs.class);
                startActivity(about);
            }
        });
        Button bandb=(Button) findViewById(R.id.broadband);
        bandb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bandi = new Intent(MainActivity.this, BroardBandService.class);
                startActivity(bandi);
            }
        });


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
