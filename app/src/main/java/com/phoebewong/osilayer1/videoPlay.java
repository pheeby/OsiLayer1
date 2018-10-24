package com.phoebewong.osilayer1;

import android.os.Bundle;
import android.media.session.PlaybackState;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;
import android.graphics.Bitmap.Config;

public class videoPlay extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_view);
    //    youTubePlayerView.initialize(Config.YOUTUBE_API_KEY, this);

        String YOUTUBE_API_KEY = "AIzaSyAgJa3p3sa4YW0NiCiMlUToUxWt7mGXjCQ";

    }
        @Override
        public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
            if (!wasRestored) {
                player.cueVideo("fhWaJi1Hsfo"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
            }
        }

        @Override
        public void onInitializationFailure(Provider provider, YouTubeInitializationResult errorReason) {
            if (errorReason.isUserRecoverableError()) {
                errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
            } else {
                String error = String.format(getString(R.string.player_error), errorReason.toString());
                Toast.makeText(this, error, Toast.LENGTH_LONG).show();
            }
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == RECOVERY_REQUEST) {
                // Retry initialization if user performed a recovery action
              //  getYouTubePlayerProvider().initialize(Config.YOUTUBE_API_KEY, this);
            }
        }

        protected Provider getYouTubePlayerProvider() {
            return youTubePlayerView;
        }
    }


