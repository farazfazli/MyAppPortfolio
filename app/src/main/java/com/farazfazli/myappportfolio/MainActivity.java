package com.farazfazli.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
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
    Toast appToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = mSpotifyStreamer.getText().toString();
                showAppToast(formatAppName(appName));
            }
        });
        mScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = mScoresApp.getText().toString();
                showAppToast(formatAppName(appName));
            }
        });
        mLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = mLibraryApp.getText().toString();
                showAppToast(formatAppName(appName));
            }
        });
        mBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = mBuildItBigger.getText().toString();
                showAppToast(formatAppName(appName));
            }
        });
        mXYZReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = mXYZReader.getText().toString();
                showAppToast(formatAppName(appName));
            }
        });
        mCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = mCapstone.getText().toString();
                showAppToast(formatAppName(appName));
            }
        });
    }

    private void showAppToast(String appName) {
        if (appToast != null) {
            appToast.cancel();
        }
        appToast = Toast.makeText(MainActivity.this, appName, Toast.LENGTH_SHORT);
        appToast.show();
    }

    private String formatAppName(String buttonText) {
        if(buttonText.contains(":")){
            buttonText = buttonText.substring(0, buttonText.indexOf(":"));
        }
        if (!buttonText.contains("app")){
            buttonText += " app";
        }
        return getString(R.string.launchText) + buttonText + "!";
    }
}
