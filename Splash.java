package com.example.youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    private ImageView imageView1, imageView2, imageView3, imageView4;
    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
    }

    @Override
    protected void onStart(){
        super.onStart();

        sonido = MediaPlayer.create(this, R.raw.sound);
        sonido.start();

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        Animation animacionPelota = AnimationUtils.loadAnimation(Splash.this, R.anim.botar);
        imageView1.startAnimation(animacionPelota);


        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                imageView2 = (ImageView) findViewById(R.id.imageView2);
                Animation animacionPelota2 = AnimationUtils.loadAnimation(Splash.this, R.anim.botar);
                imageView2.startAnimation(animacionPelota2);
            }
        }, 400) ;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                imageView3 = (ImageView) findViewById(R.id.imageView3);
                Animation animacionPelota3 = AnimationUtils.loadAnimation(Splash.this, R.anim.botar);
                imageView3.startAnimation(animacionPelota3);
            }
        }, 200) ;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                imageView4 = (ImageView) findViewById(R.id.imageView4);
                Animation animacionPelota4 = AnimationUtils.loadAnimation(Splash.this, R.anim.botar);
                imageView4.startAnimation(animacionPelota4);
            }
        }, 500) ;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Splash.this.finish();
            }
        }, 4000);

    }
}