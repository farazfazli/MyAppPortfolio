package com.farazfazli.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends Activity {
    @Bind(R.id.spotify_streamer) Button mSpotifyStreamer;
    @Bind(R.id.scores_app) Button mScoresApp;
    @Bind(R.id.library_app) Button mLibraryApp;
    @Bind(R.id.build_it_bigger) Button mBuildItBigger;
    @Bind(R.id.xyz_reader) Button mXYZReader;
    @Bind(R.id.capstone) Button mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = mSpotifyStreamer.getText().toString();
                appName = formatAppName(appName);
                Toast.makeText(MainActivity.this, "This button will launch my " + appName + "!", Toast.LENGTH_SHORT).show();
            }
        });
        mScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = mScoresApp.getText().toString();
                appName = formatAppName(appName);
                Toast.makeText(MainActivity.this, "This button will launch my " + appName + "!", Toast.LENGTH_SHORT).show();
            }
        });
        mLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = mLibraryApp.getText().toString();
                appName = formatAppName(appName);
                Toast.makeText(MainActivity.this, "This button will launch my " + appName + "!", Toast.LENGTH_SHORT).show();
            }
        });
        mBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = mBuildItBigger.getText().toString();
                appName = formatAppName(appName);
                Toast.makeText(MainActivity.this, "This button will launch my " + appName + "!", Toast.LENGTH_SHORT).show();
            }
        });
        mXYZReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = mXYZReader.getText().toString();
                appName = formatAppName(appName);
                Toast.makeText(MainActivity.this, "This button will launch my " + appName + "!", Toast.LENGTH_SHORT).show();
            }
        });
        mCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = mCapstone.getText().toString();
                appName = formatAppName(appName);
                Toast.makeText(MainActivity.this, "This button will launch my " + appName + "!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public String formatAppName(String buttonText){
        if(buttonText.contains(":")){
            buttonText = buttonText.substring(0, buttonText.indexOf(":"));
        }
        if (!buttonText.contains("app")){
            buttonText += " app";
        }
        return buttonText;
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
