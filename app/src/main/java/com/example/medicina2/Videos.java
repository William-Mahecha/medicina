package com.example.medicina2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

public class Videos extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        videoView = findViewById(R.id.video1);
        listView = findViewById(R.id.list_item);

        videoList = new ArrayList<>();
        videoList.add("Cuidados para controlar aislamiento social");
        videoList.add("Aseo en cama");
        videoList.add("Hacer una cama ocupada");
        videoList.add("Pasar de la cama a la silla de ruedas");
        videoList.add("Cambios posturales, prevencion de ulceras por presión");
        videoList.add("Pasar de sentado a pie");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, videoList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" +  R.raw.aislamiento_social));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.aseo_en_cama));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cama_ocupada));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cama_silla_de_ruedas));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cambios_posturales));
                        break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sentado_a_pie));
                        break;
                }
                MediaController mediaController = new MediaController(Videos.this);
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}
