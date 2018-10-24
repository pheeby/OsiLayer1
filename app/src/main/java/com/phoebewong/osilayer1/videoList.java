package com.phoebewong.osilayer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class videoList extends AppCompatActivity {

    ListView videoListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list);

        videoListView = (ListView) findViewById(R.id.videoListView);
        ArrayAdapter<Video> videoAdapter = new ArrayAdapter<Video>(this, android.R.layout.simple_list_item_1,
                VideoDatabase.getVideoArrayList());
        videoListView.setAdapter(videoAdapter);
        videoListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Video clickedVideo = (Video) adapterView.getItemAtPosition(position);
                Intent appInfo = new Intent(videoList.this, videoPlay.class);
                startActivity(appInfo);

            }
        });

    }
}
