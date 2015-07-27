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
        mSpotifyStreamer.setOnClickListener(new ButtonClickListener(mSpotifyStreamer));
        mScoresApp.setOnClickListener(new ButtonClickListener(mScoresApp));
        mLibraryApp.setOnClickListener(new ButtonClickListener(mLibraryApp));
        mBuildItBigger.setOnClickListener(new ButtonClickListener(mBuildItBigger));
        mXYZReader.setOnClickListener(new ButtonClickListener(mXYZReader));
        mCapstone.setOnClickListener(new ButtonClickListener(mCapstone));
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

    // Thanks Christopher Rucinski for helping me improve my reuse of code.
    private class ButtonClickListener implements View.OnClickListener {

        Button button;

        ButtonClickListener(Button button) {
            this.button = button;
        }

        @Override
        public void onClick(View v) {

            String appName = button.getText().toString();
            showAppToast(formatAppName(appName));

        }

    }
}
