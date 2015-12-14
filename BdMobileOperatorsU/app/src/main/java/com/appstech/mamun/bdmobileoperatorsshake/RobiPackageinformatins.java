package com.appstech.mamun.bdmobileoperatorsshake;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class RobiPackageinformatins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robi_packageinformatins);

        Button damalsamal22b =(Button) findViewById(R.id.damalsamal22);
        damalsamal22b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent damalsamal2i = new Intent(RobiPackageinformatins.this, RobiDamalSamal.class);
                startActivity(damalsamal2i);
            }
        });
        Button tarunno =(Button) findViewById(R.id.tarunno26);
        tarunno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent raj = new Intent(RobiPackageinformatins.this,RobiTarunno26.class);
                startActivity(raj);
            }
        });

        Button anonnab =(Button) findViewById(R.id.anonna27);
        anonnab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anonnai = new Intent(RobiPackageinformatins.this,RobiAnonna27.class);
                startActivity(anonnai);
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_robi_packageinformatins, menu);
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
