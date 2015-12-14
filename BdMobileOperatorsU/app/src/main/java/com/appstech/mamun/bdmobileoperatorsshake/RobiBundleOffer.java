package com.appstech.mamun.bdmobileoperatorsshake;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class RobiBundleOffer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robi_bundle_offer);
        Button callBtn=(Button) findViewById(R.id.pack1);
        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(Uri.parse("tel:*778*") + Uri.encode("40#")));
                startActivity(intent);
            }
        });
        Button rdpack2=(Button) findViewById(R.id.rdpack2);
        rdpack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rdpack2=new Intent(Intent.ACTION_CALL);
                rdpack2.setData(Uri.parse(Uri.parse("tel:*8666*")+Uri.encode("03#")));
                startActivity(rdpack2);
            }
        });

        Button rdpack3=(Button) findViewById(R.id.rdpack3);
        rdpack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rdpack3=new Intent(Intent.ACTION_CALL);
                rdpack3.setData(Uri.parse(Uri.parse("tel:*8666*") + Uri.encode("12#")));
                startActivity(rdpack3);
            }
        });

        Button rdpack4=(Button) findViewById(R.id.rdpack4);
        rdpack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rdpack4=new Intent(Intent.ACTION_CALL);
                rdpack4.setData(Uri.parse(Uri.parse("tel:*8666*") + Uri.encode("016#")));
                startActivity(rdpack4);
            }
        });
        Button rwpack1=(Button) findViewById(R.id.rwpack1);
        rwpack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rwpack1=new Intent(Intent.ACTION_CALL);
                rwpack1.setData(Uri.parse(Uri.parse("tel:*8666*") + Uri.encode("50#")));
                startActivity(rwpack1);
            }
        });
        Button rwpack2=(Button) findViewById(R.id.rwpack2);
        rwpack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rwpack2=new Intent(Intent.ACTION_CALL);
                rwpack2.setData(Uri.parse(Uri.parse("tel:*8666*") + Uri.encode("008#")));
                startActivity(rwpack2);
            }
        });
        Button rwpack3=(Button) findViewById(R.id.rwpack3);
        rwpack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rwpack3=new Intent(Intent.ACTION_CALL);
                rwpack3.setData(Uri.parse(Uri.parse("tel:*8666*") + Uri.encode("025#")));
                startActivity(rwpack3);
            }
        });
        Button rwpack4=(Button) findViewById(R.id.rwpack4);
        rwpack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rwpack4=new Intent(Intent.ACTION_CALL);
                rwpack4.setData(Uri.parse(Uri.parse("tel:*8666*") + Uri.encode("050#")));
                startActivity(rwpack4);
            }
        });
        Button rmpack1=(Button) findViewById(R.id.rmpack1);
        rmpack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rmpack1=new Intent(Intent.ACTION_CALL);
                rmpack1.setData(Uri.parse(Uri.parse("tel:*8666*") + Uri.encode("500#")));
                startActivity(rmpack1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_robi_bundle_offer, menu);
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
