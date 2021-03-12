package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;

public class VideoPlayer extends AppCompatActivity {

    PlayerView videoExoPlayer;
    SimpleExoPlayer simpleExoPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);
        videoExoPlayer=findViewById(R.id.vvExoPlayer);
        simpleExoPlayer = new SimpleExoPlayer.Builder(this).build();
        videoExoPlayer.setPlayer(simpleExoPlayer);

        Uri uri = RawResourceDataSource.buildRawResourceUri(R.raw.wegz);
        MediaSource mediaSource = buildMediaSource(uri);
        simpleExoPlayer.prepare(mediaSource, false, false);
        simpleExoPlayer.play();

    }
    private MediaSource buildMediaSource(Uri uri) {
        DataSource.Factory dataSourceFactory =
                new DefaultDataSourceFactory(this, "exoplayer-codelab");
        return new ProgressiveMediaSource.Factory(dataSourceFactory)
                .createMediaSource(uri);
    }

    @Override
    public void onBackPressed() {
        simpleExoPlayer.stop();
        finish();
        super.onBackPressed();
    }
}