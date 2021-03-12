package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

import java.util.Timer;
import java.util.TimerTask;

public class MusicPlayer extends AppCompatActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {


    SeekBar seekBarWegz;
    ImageView ivPause, ivPlay, ivStop;
    MediaPlayer songWegz;

    int seekBarPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        ivPause = findViewById(R.id.ivPause);
        seekBarWegz = findViewById(R.id.seekBar);
        ivPlay = findViewById(R.id.ivPlay);
        ivStop = findViewById(R.id.ivStop);
        ivPause.setOnClickListener(this);
        ivPlay.setOnClickListener(this);
        ivStop.setOnClickListener(this);
        seekBarWegz.setOnSeekBarChangeListener(this);
//        songWegz = MediaPlayer.create(getBaseContext(), R.raw.wegzson);

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (songWegz != null) {
                    seekBarWegz.setProgress(songWegz.getCurrentPosition());

                }
            }
        }, 0, 500);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.ivPlay:
                if (songWegz == null) {
                    songWegz = MediaPlayer.create(getBaseContext(), R.raw.wegzson);
                    seekBarWegz.setMax(songWegz.getDuration());
                    songWegz.start();

                } else if (!songWegz.isPlaying()) {
                    songWegz.seekTo(seekBarPosition);
                    songWegz.start();
                }
                break;
            case R.id.ivPause:
                songWegz.pause();
                seekBarPosition = songWegz.getCurrentPosition();
                break;
            case R.id.ivStop:
                if (songWegz != null) {
                    seekBarWegz.setProgress(0);
                    songWegz.stop();
                    songWegz = null;
                }
                break;
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        songWegz.seekTo(progress);

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
