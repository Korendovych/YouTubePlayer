package com.example.youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {

    private Button btnPlay;
    private EditText edtRuta;
    private static String ruta;
    private YouTubePlayerView mYouTubePlayerView;
    private YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // getSupportActionBar().hide();


        btnPlay=(Button) findViewById(R.id.btnPlay);
        edtRuta=(EditText) findViewById(R.id.edtRuta);


        mYouTubePlayerView=(YouTubePlayerView) findViewById(R.id.youtubePlay);


        mOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                //Just one video
                //  youTubePlayer.loadVideo("8Bo7TVZAwTw");

                //  youTubePlayer.loadPlaylist("PLsLNjKlM1Gbtk93QxFoT8kdhZ339Dt_7-");
                // youTubePlayer.loadPlaylist("PLsLNjKlM1GbtuXrACpOTJ9-AbuXrlyXiU");
                ruta = edtRuta.getText().toString();
               // youTubePlayer.loadPlaylist(ruta);

                youTubePlayer.loadVideo(ruta);
                Toast.makeText(getApplicationContext(), "Initializing Success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                Toast.makeText(getApplicationContext(), "Initializing Failed", Toast.LENGTH_SHORT).show();
            }
        };


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mYouTubePlayerView.initialize(YouTubeConfig.getApiKey(), mOnInitializedListener);
                Toast.makeText(getApplicationContext(), "Initializing YouTube Player", Toast.LENGTH_SHORT).show();
            }
        });




    }
}