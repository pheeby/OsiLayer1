package com.phoebewong.osilayer1;

import android.os.Bundle;
import android.media.session.PlaybackState;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;
import android.graphics.Bitmap.Config;
import android.widget.Button;

public class videoPlay extends YouTubeBaseActivity{

    private static final String TAG = "videoPlay";

    YouTubePlayerView mYoutubePlayerView;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play);
        Log.d(TAG,"OnCreate: Starting.");
        mYoutubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlay);
        btnPlay = (Button) findViewById(R.id.btnPlay);
        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(Provider provider, YouTubePlayer youTubePlayer, boolean b) {
            Log.d(TAG, "onClick: Done initializing");
            //might have something to do with getting it from the arraylist
//            Video video1 = VideoDatabase.getVideoArrayList().get(0);
//            String link = video1.getLink();
//            youTubePlayer.loadVideo(link);
                youTubePlayer.loadVideo("xlLBoVUDLvs");
            }

            @Override
            public void onInitializationFailure(Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            Log.d(TAG, "fail to initialise");
            }
        };

        btnPlay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d(TAG, "OnClick: Initializing Youtube Player.");
                mYoutubePlayerView.initialize("AIzaSyCuSgBfvqtAH41HGrX1lA9u46TpsDOHAp0", mOnInitializedListener);

            }
        });

    }
}


