package com.example.kashif.pressureulcer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

//public class MainActivity extends ActionBarActivity {
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button xml_whatpu = (Button) findViewById(R.id.button1);
        xml_whatpu.setOnClickListener(new View.OnClickListener() {

       @Override
       public void onClick(View v) {
           // TODO Auto-generated method stub
           startActivity(new Intent("android.intent.action.WhatPU"));

       }
        }
        );
        /////////////
        Button xml_stages = (Button) findViewById(R.id.button2);
        xml_stages.setOnClickListener(new View.OnClickListener() {

                                          @Override
                                          public void onClick(View v) {
         // TODO Auto-generated method stub
        startActivity(new Intent("android.intent.action.StagesPU"));
        }
                  }
        );
        /////////////
        Button xml_risk = (Button) findViewById(R.id.button3);
        xml_risk.setOnClickListener(new View.OnClickListener() {

                                          @Override
                                          public void onClick(View v) {
         // TODO Auto-generated method stub
        startActivity(new Intent("android.intent.action.RiskPU"));
           }
                         }
        );
        /////////////
        Button xml_prevent = (Button) findViewById(R.id.button4);
        xml_prevent.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {
       // TODO Auto-generated method stub
         startActivity(new Intent("android.intent.action.PreventPU"));
              }
                              }
        );
        /////////////
        Button xml_tips= (Button) findViewById(R.id.button5);
        xml_tips.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

         // TODO Auto-generated method stub
        startActivity(new Intent("android.intent.action.TipsPU"));
         }
                    }
        );
        /////////////
        Button xml_contact= (Button) findViewById(R.id.button6);
        xml_contact.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

         // TODO Auto-generated method stub
         startActivity(new Intent("android.intent.action.ContactPU"));
       }
                  }
        );
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
    public void openref(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nlm.nih.gov/medlineplus/ency/article/007071.htm"));
        startActivity(intent);
    }
}
