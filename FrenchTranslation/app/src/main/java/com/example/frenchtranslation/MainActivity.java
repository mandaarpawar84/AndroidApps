package com.example.frenchtranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button redBtn, blueBtn, greenBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redBtn = findViewById(R.id.redButton);
        blueBtn = findViewById(R.id.blueButton);
        greenBtn = findViewById(R.id.greenButton);

        redBtn.setOnClickListener(this);
        blueBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewid = v.getId();
        if (viewid == R.id.redButton) {
            playTranslation(R.raw.red);
        }
        else if (viewid == R.id.blueButton) {
            playTranslation(R.raw.purple);
        }
        else if (viewid == R.id.greenButton) {
            playTranslation(R.raw.green);
        }
    }

    public void playTranslation(int id)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), id);
        mediaPlayer.start();
    }
}