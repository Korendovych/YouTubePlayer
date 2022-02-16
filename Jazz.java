package com.example.youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Jazz extends AppCompatActivity {

    private TextView tvlistaJ;
    private Button btnVolverJ;
  //  private YouTubePlayerView jmYouTubePlayerView;
  //  private YouTubePlayer.OnInitializedListener jmOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);
        getSupportActionBar().hide();

        tvlistaJ=(TextView) findViewById(R.id.tvlistaJ);
        tvlistaJ.append("1. Louis Armstrong - What a wonderful world \n");
        tvlistaJ.append("2. Frank Sinatra - Sway \n");
        tvlistaJ.append("3. Frank Sinatra - Fly Me To The Moon \n");
        tvlistaJ.append("4. Paul Anka - Put Your Head On My Shoulder \n");
        tvlistaJ.append("5. Frank Sinatra - Something Stupid \n");
        tvlistaJ.append("6. Frank Sinatra - New York,New York \n");
        tvlistaJ.append("7. Frank Sinatra - The Best Is Yet To Come \n");
        tvlistaJ.append("8. Frank Sinatra - Cheek To Cheek \n");
        tvlistaJ.append("9. Louis Armstrong and Frank Sinatra - Birth of the Blues \n");
        tvlistaJ.append("10. Gene Kelly and Frank Sinatra - Take Me Out to the Ball Game \n");
        tvlistaJ.append("11. Louis Armstrong - That's Jazz \n");
        tvlistaJ.append("12. Louis Armstrong - When The Saints Go Marching In \n");



        btnVolverJ=(Button) findViewById(R.id.btnVolverJ);

      //  jmYouTubePlayerView=(YouTubePlayerView) findViewById(R.id.youtubePlayJ);

/*
        jmOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {


                youTubePlayer.loadPlaylist("PLsLNjKlM1GbtIueJHnDQXFYlBAJdfrV0s");
                Toast.makeText(getApplicationContext(), "Initializing Success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                Toast.makeText(getApplicationContext(), "Initializing Failed", Toast.LENGTH_SHORT).show();
            }
        };


        jmYouTubePlayerView.initialize(YouTubeConfig.getApiKey(), jmOnInitializedListener);
        Toast.makeText(getApplicationContext(), "Initializing YouTube Player", Toast.LENGTH_SHORT).show();

*/


        btnVolverJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jazz.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}