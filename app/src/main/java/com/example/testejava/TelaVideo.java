package com.example.testejava;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class TelaVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_video);

        setVideoUri();

    }

    public void setVideoUri() {
        VideoView simpleVideoView = findViewById(R.id.simpleVideoView);

        Button pause = findViewById(R.id.buttonPause);
        Button play = findViewById(R.id.buttonPlay);
        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleVideoView.pause();
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleVideoView.start();
            }
        });
    }


}